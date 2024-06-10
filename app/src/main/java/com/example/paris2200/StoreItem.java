package com.example.paris2200;

public class StoreItem {
    private String name;
    private String location;
    private int imageResourceId;

    public StoreItem(String name, String location, int imageResourceId) {
        this.name = name;
        this.location = location;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
