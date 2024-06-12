package com.example.paris2200;

import java.util.List;

public class NewsResponse {
    private String status;
    private int totalResults;
    private List<NewsItem> articles;

    public String getStatus() {
        return status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public List<NewsItem> getArticles() {
        return articles;
    }
}
