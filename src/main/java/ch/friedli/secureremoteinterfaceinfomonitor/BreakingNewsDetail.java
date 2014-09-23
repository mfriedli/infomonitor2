package ch.friedli.secureremoteinterfaceinfomonitor;

/**
 *
 * @author mfrie_000
 */
public class BreakingNewsDetail {

    private Integer id;
    private String text;
    private String dateString;
    private String author;
    private boolean isActive;
    private boolean isBlinking;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDateString() {
        return dateString;
    }

    public void setDateString(String dateString) {
        this.dateString = dateString;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean isIsBlinking() {
        return isBlinking;
    }

    public void setIsBlinking(boolean isBlinking) {
        this.isBlinking = isBlinking;
    }

   
}
