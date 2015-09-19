package ch.friedli.infosystem.admin.rest;

import java.util.LinkedList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="ConfigurationIdsSaveItem")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConfigurationIdsSaveItem {
    @XmlElement
    private String selectedSeasonId;
    @XmlElement
    private List<String> leagueItemIds = new LinkedList<>();

    public String getSelectedSeasonId() {
        return selectedSeasonId;
    }

    public void setSelectedSeasonId(String selectedSeasonId) {
        this.selectedSeasonId = selectedSeasonId;
    }

    public List<String> getLeagueItemIds() {
        return leagueItemIds;
    }

    public void setLeagueItemIds(List<String> leagueItemIds) {
        this.leagueItemIds = leagueItemIds;
    }

   
}