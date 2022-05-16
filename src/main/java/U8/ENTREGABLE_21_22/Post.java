package U8.ENTREGABLE_21_22;

public class Post {

    private String title;
    private String link;
    private String description;
    private String pubdate;
    private String guild;

    public Post(String title, String link, String description, String pubdate, String guild) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.pubdate = pubdate;
        this.guild = guild;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public String getGuild() {
        return guild;
    }

    public void setGuild(String guild) {
        this.guild = guild;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", description='" + description + '\'' +
                ", pubdate='" + pubdate + '\'' +
                ", guild='" + guild + '\'' +
                '}' + "\n";
    }
}
