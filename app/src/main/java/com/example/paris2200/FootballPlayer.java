package com.example.paris2200;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class FootballPlayer {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "country")
    public String country;

    @ColumnInfo(name = "position")
    public String position;

    @ColumnInfo(name = "age")
    public int age;

    @ColumnInfo(name = "imageUrl")
    public String imageUrl;

    public FootballPlayer(String name, String country, String position, int age, String imageUrl) {
        this.name = name;
        this.country = country;
        this.position = position;
        this.age = age;
        this.imageUrl = imageUrl;
    }

    // Getter methods
    public String getImageUrl() {
        return imageUrl;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }
}
