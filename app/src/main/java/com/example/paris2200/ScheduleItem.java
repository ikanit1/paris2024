// ScheduleItem.java
package com.example.paris2200;

public class ScheduleItem {
    private String eventName;
    private String date;
    private String time;

    public ScheduleItem(String eventName, String date, String time) {
        this.eventName = eventName;
        this.date = date;
        this.time = time;
    }

    public String getEventName() {
        return eventName;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
}
