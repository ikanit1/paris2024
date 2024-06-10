package com.example.paris2200;

public class VenueItem {
    private String eventName;
    private String venue;
    private String date;
    private String time;
    private int imageResource;

    public VenueItem(String eventName, String venue, String date, String time, int imageResource) {
        this.eventName = eventName;
        this.venue = venue;
        this.date = date;
        this.time = time;
        this.imageResource = imageResource;
    }

    // Getters
    public String getEventName() { return eventName; }
    public String getVenue() { return venue; }
    public String getDate() { return date; }
    public String getTime() { return time; }
    public int getImageResource() { return imageResource; }
}
