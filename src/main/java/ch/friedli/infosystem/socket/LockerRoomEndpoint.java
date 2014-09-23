package ch.friedli.infosystem.socket;




import ch.friedli.infosystem.business.impl.GameScheduleLoaderImpl;
import ch.friedli.infosystem.message.event.LockerRoomEvent;
import ch.friedli.infosystem.message.event.annotation.WBLockerRoomEvent;
import ch.friedli.secureremoteinterfaceinfomonitor.GameScheduleLoaderRemote;
import ch.friedli.secureremoteinterfaceinfomonitor.LockerRoomDetail;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.enterprise.event.Observes;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 * This is the web socket endpoint for the Raiffeisen Arena info system.
 *
 * @author Michael Friedli
 */
@Singleton
@ServerEndpoint(value="/locckerroomendpoint", encoders={LockerRoomDetailsEncoder.class})
//@Startup
public class LockerRoomEndpoint {

    private static final Logger LOGGER = Logger.getLogger(LockerRoomEndpoint.class.getName());
    private final Set<Session> peers = Collections.synchronizedSet(new HashSet<Session>());

   @EJB
   GameScheduleLoaderImpl gameScheduleLoader;
   
    /**
     * Returns the same message as received from the client.
     * Currently this method is not used since the front end is not sending 
     * any messages to the server (no user interaction).
     * 
     * @param message The message received from the front end
     * @return the same message as received
     */
    @OnMessage
    public String sendEchoReply(String message) {
        LOGGER.log(Level.FINE, "new message from client: {0}", new Object[]{message});
        return message;
    }

    @OnOpen
    public void onOpen(Session peer) {
        LOGGER.log(Level.FINE, "added new session to peers {0}" + new Object[]{peer});
        this.peers.add(peer);
    }

    
    /**
     * Observes any WBLockerRoomEvents and sends a corresponding response to 
     * all connected clients.
     * 
     * @param event The WBLockerRoomEvent this method is observing
     */
    public void onLockerRoomEvent(@Observes @WBLockerRoomEvent LockerRoomEvent event) {
        LOGGER.log(Level.FINE, "LockerRoom Event observed {0}" + new Object[]{event.getTimestamp()});
        for (Session peer : this.peers) {
            try {
                List<LockerRoomDetail> details = this.gameScheduleLoader.loadGameSchedule();                
                peer.getBasicRemote().sendObject(details);
            } catch (Exception ex) {
                LOGGER.log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @OnClose
    public void onClose(Session peer) {
        this.peers.remove(peer);
    }

    @OnError
    public void onError(Throwable t) {
        LOGGER.log(Level.SEVERE, "Websocket exception :{}", t.toString());
    }
}