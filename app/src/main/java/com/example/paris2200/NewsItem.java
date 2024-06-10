package com.example.paris2200;

public class NewsItem {
    private String title;
    private String description;
    private String imageUrl;
    private String link;

    public NewsItem(String title, String description, String imageUrl, String link) {
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getLink() {
        return link;
    }
}
