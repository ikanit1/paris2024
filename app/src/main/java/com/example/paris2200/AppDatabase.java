package com.example.paris2200;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {FootballPlayer.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase {
    public abstract FootballPlayerDao footballPlayerDao();
}

