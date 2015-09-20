package ch.friedli.infosystem.admin.rest;

import ch.friedli.infosystem.business.impl.ConfigurationLoaderImpl;
import ch.friedli.secureremoteinterfaceinfomonitor.LeagueDetail;
import ch.friedli.secureremoteinterfaceinfomonitor.SeasonDetail;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author mfrie_000
 */
@Stateless
@Path("/")
public class ConfigurationDataService {

    private static final Logger LOGGER = Logger.getLogger(ConfigurationDataService.class.getName());
    private static final String CONFIG_FILE = "c:/infomonitor/config/IHS_CONFIG.xlsx";
    private static final Map<String,String> shortNameMap = new HashMap<>();
    static {          
        shortNameMap.put("NLA", "NLA");
        shortNameMap.put("NLB", "NLB");
        shortNameMap.put("1.", "1. Liga");
        shortNameMap.put("2.", "2. Liga");
        shortNameMap.put("3.", "3. Liga");
        shortNameMap.put("4.", "4. Liga");
        shortNameMap.put("5.", "5. Liga");
        shortNameMap.put("Aktive", "Aktive");
        shortNameMap.put("SK1", "SK1");
        shortNameMap.put("SK2", "SK2");
        shortNameMap.put("SK3", "SK3");
        shortNameMap.put("SK4", "SK4");
        shortNameMap.put("SK5", "SK5");
        shortNameMap.put("Elite", "U18");
        shortNameMap.put("Novizen", "U15");
        shortNameMap.put("Mini", "U12");
        shortNameMap.put("Moskito", "U9");
        shortNameMap.put("Damen", "Damen");
        shortNameMap.put("NM", "NM");        
    }
            
    @EJB
    ConfigurationLoaderImpl configurationLoader;

    @DELETE
    @Path("/deleteLeagueItem/id/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void deleteLeagueItem(@PathParam("id") Integer itemId) {
        this.configurationLoader.deleteLeagueEntityItem(itemId);
    }
    
    @DELETE
    @Path("/deleteSeasonItem/id/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void deleteSeasonItem(@PathParam("id") Integer itemId) {
        this.configurationLoader.deleteSeasonEntityItem(itemId);
    }
    
    @PUT
    @Path("/updateSeasonItem/id/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateSeasonItem(SeasonItem item) {
        LOGGER.log(Level.FINE, "update season called");
        SeasonDetail detail = new SeasonDetail();
        detail.setSeasonId(item.getSeasonId());
        detail.setSeasonName(item.getSeasonName());
        detail.setIsActive(item.isIsActive());
        detail.setId(item.getId());
        this.configurationLoader.updateSeasonEntityItem(detail);
    }
     
    @PUT
    @Path("/updateLeagueItem/id/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateLeagueItem(LeagueItem item) {
        LOGGER.log(Level.FINE, "update league called");
        LeagueDetail detail = new LeagueDetail();
        detail.setLeagueId(item.getLeagueId());
        detail.setLeagueName(item.getLeagueName());
        detail.setLeagueShortName(item.getLeagueShortName());
        detail.setId(item.getId());
        this.configurationLoader.updateLeagueEntityItem(detail);
    }
    
    @POST
    @Path("/addSeasonItem")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addSeasonItem(SeasonItem item) {
        LOGGER.log(Level.FINE, "add season item called");
        SeasonDetail detail = new SeasonDetail();
        detail.setSeasonId(item.getSeasonId());
        detail.setSeasonName(item.getSeasonName());
        detail.setIsActive(item.isIsActive());
        this.configurationLoader.createSeasonEntityItem(detail);
    }
    
    @POST
    @Path("/addLeagueItem")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addLeagueItem(LeagueItem item) {
        LOGGER.log(Level.FINE, "add league item called");
        LeagueDetail detail = new LeagueDetail();
        detail.setLeagueId(item.getLeagueId());
        detail.setLeagueName(item.getLeagueName());
        detail.setLeagueShortName(item.getLeagueShortName());
        this.configurationLoader.createLeagueEntityItem(detail);
    }
    
    @GET
    @Path("/leagueItem/id/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getLeagueItemById(@PathParam("id") Integer itemId) {
        LeagueDetail detail = this.configurationLoader.loadLeagueDetailById(itemId);
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("id", detail.getId())
            .add("leagueId", detail.getLeagueId())
            .add("leagueName", detail.getLeagueName()== null ? "" : detail.getLeagueName())
            .add("leagueShortName", detail.getLeagueShortName() == null ?"" : detail.getLeagueShortName());
            
            return builder.build().toString();
    }
    
    @GET
    @Path("/seasonItem/id/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getSeasonItemById(@PathParam("id") Integer itemId) {
        SeasonDetail detail = this.configurationLoader.loadSeasonDetailById(itemId);
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("id", detail.getId())
            .add("seasonId", detail.getSeasonId())
            .add("seasonName", detail.getSeasonName() == null ? "" : detail.getSeasonName())
            .add("isActive", detail.isIsActive());
            
            return builder.build().toString();
    }
    
    @GET
    @Path("/leagueItems")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllLeagueItems() {
        JsonArrayBuilder builder = Json.createArrayBuilder();
        for (LeagueDetail detail : this.configurationLoader.loadAllLeagues()) {
            builder.add(
                    Json.createObjectBuilder()
                    .add("id", detail.getId())
                    .add("leagueId", detail.getLeagueId())
                    .add("leagueName", detail.getLeagueName()== null ? "" : detail.getLeagueName())
                    .add("leagueShortName", detail.getLeagueShortName() == null ? "" : detail.getLeagueShortName())
            );
        }
        JsonArray detailsJson = builder.build();
        return detailsJson.toString();
    }    
   
    @GET
    @Path("/seasonItems")
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllSeasonItems() {
        JsonArrayBuilder builder = Json.createArrayBuilder();
        for (SeasonDetail detail : this.configurationLoader.loadAllSeasons()) {
            builder.add(
                    Json.createObjectBuilder()
                    .add("id", detail.getId())
                    .add("seasonId", detail.getSeasonId())
                    .add("seasonName", detail.getSeasonName()== null ? "" : detail.getSeasonName())
                    .add("isActive", detail.isIsActive())
            );
        }
        JsonArray detailsJson = builder.build();
        return detailsJson.toString();
    }
    
    @GET
    @Path("/configuration")
    @Produces(MediaType.APPLICATION_JSON)
    public String getConfiguration() {
        ConfigurationItem configItem = createConfigFromExcel();     
        
        JsonArrayBuilder builderLeagues = Json.createArrayBuilder();
        for (LeagueItem league : configItem.getLeagueItems()) {
            builderLeagues.add(
                Json.createObjectBuilder()
                        .add("leagueId", league.getLeagueId())
                        .add("leagueName", league.getLeagueName()== null ? "" : league.getLeagueName())
                        .add("leagueShortName", league.getLeagueShortName() == null ? "" : league.getLeagueShortName())
            );
        }  
        
        JsonArrayBuilder builderSeasons = Json.createArrayBuilder();
        for (SeasonItem season : configItem.getSeasonItems()) {
            builderSeasons.add(
                Json.createObjectBuilder()
                        .add("seasonId", season.getSeasonId())
                        .add("seasonName", season.getSeasonName()== null ? "" : season.getSeasonName())
            );
        }  
        
        JsonObjectBuilder builderConfigItem = Json.createObjectBuilder()               
            .add("seasons", builderSeasons)
            .add("leagues", builderLeagues);
        return builderConfigItem.build().toString();               
    }
    
    @POST
    @Path("/importConfiguration")
    @Consumes(MediaType.APPLICATION_JSON)
    public void importConfiguration(ConfigurationIdsSaveItem item) {
        LOGGER.log(Level.FINE, "import configuration called");
        ConfigurationItem config = createConfigFromExcel();
        Map<String, LeagueItem> leagueIdLeagueMap = new HashMap<>();
        for (LeagueItem league : config.getLeagueItems()) {
            leagueIdLeagueMap.put(league.getLeagueId().toString(), league);
        }
        Map<String, SeasonItem> seasonIdSeasonMap = new HashMap<>();
        for (SeasonItem season : config.getSeasonItems()) {
            seasonIdSeasonMap.put(season.getSeasonId().toString(), season);
        }
        
        // clear old sesons and leagues
        this.configurationLoader.deleteAllSeasonEntities();
        this.configurationLoader.deleteAllLeagueEntities();
       
        // import new season - only 1 active item expected
        if (seasonIdSeasonMap.containsKey(item.getSelectedSeasonId())) {
            SeasonItem seasonItem = seasonIdSeasonMap.get(item.getSelectedSeasonId());
            SeasonDetail detail = new SeasonDetail();
            detail.setSeasonId(seasonItem.getSeasonId());
            detail.setSeasonName(seasonItem.getSeasonName());
            detail.setIsActive(true);
            this.configurationLoader.createSeasonEntityItem(detail);
        }
       
        // import new leagues
        for (String leagueId : item.getLeagueItemIds()) {
            if (leagueIdLeagueMap.containsKey(leagueId)) {
                LeagueItem league = leagueIdLeagueMap.get(leagueId);                
                LeagueDetail leagueDetail = new LeagueDetail(); 
                leagueDetail.setLeagueId(league.getLeagueId());
                leagueDetail.setLeagueName(league.getLeagueName());
                leagueDetail.setLeagueShortName(league.getLeagueShortName());
                this.configurationLoader.createLeagueEntityItem(leagueDetail);
             }
        }
    }
    
    private ConfigurationItem createConfigFromExcel() {
        
        ConfigurationItem configItem = new ConfigurationItem();
        try (InputStream excelFileToRead = new FileInputStream(CONFIG_FILE)) {              
            XSSFWorkbook wb = new XSSFWorkbook(excelFileToRead);
            XSSFSheet sheet= wb.getSheet("Saisons");
            XSSFRow row; 
            Iterator rows = sheet.rowIterator();
            rows.next(); // skip header row
            while (rows.hasNext()) {
                row=(XSSFRow) rows.next();
                String seasonId = row.getCell(0).getStringCellValue();
                String seasonName = row.getCell(1).getStringCellValue();  
                SeasonItem item = new SeasonItem();
                item.setSeasonId(Integer.parseInt(seasonId));
                item.setSeasonName(seasonName);
                configItem.addSeasonItem(item);
            }   
            sheet= wb.getSheet("Liga");
            rows = sheet.rowIterator();
            rows.next(); // skip header row
            while (rows.hasNext()) {
                row=(XSSFRow) rows.next();
                String leagueId = row.getCell(0).getStringCellValue();
                String leagueName = row.getCell(1).getStringCellValue();
                // check if IHS Schnittstellen Excel contains league short name
                // otherwise to hard-coded best guess mapping
                String shortName = "";
                if (row.getCell(2) != null) {
                    shortName = row.getCell(2).getStringCellValue(); 
                } else {                    
                    String[] parts = leagueName.split(" ");
                    for (String part : parts) {
                        if (shortNameMap.containsKey(part)) {
                            shortName = shortNameMap.get(part);
                        }
                    }                
                }
                LeagueItem item = new LeagueItem();
                item.setLeagueId(Integer.parseInt(leagueId));
                item.setLeagueName(leagueName);                
                item.setLeagueShortName(shortName);
                configItem.addLeagueItem(item);
            }  
            
        } catch (Exception ex) {
            Logger.getLogger(ConfigurationDataService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return configItem;
    }
}
