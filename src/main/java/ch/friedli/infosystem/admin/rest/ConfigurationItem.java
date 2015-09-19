package ch.friedli.infosystem.admin.rest;

import java.util.LinkedList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="ConfigurationItem")
@XmlAccessorType(XmlAccessType.FIELD)
public class ConfigurationItem {
    @XmlElement
    private List<SeasonItem> seasonItems = new LinkedList<>();
    @XmlElement
    private List<LeagueItem> leagueItems = new LinkedList<>();

    public List<SeasonItem> getSeasonItems() {
        return seasonItems;
    }

    public void addSeasonItem(SeasonItem seasonItem) {
        this.seasonItems.add(seasonItem);
    }

    public List<LeagueItem> getLeagueItems() {
        return leagueItems;
    }

    public void addLeagueItem(LeagueItem leagueItem) {
        this.leagueItems.add(leagueItem);
    }       
}