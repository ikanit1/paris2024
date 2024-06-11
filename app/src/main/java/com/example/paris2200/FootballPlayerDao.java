package com.example.paris2200;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface FootballPlayerDao {
    @Query("SELECT * FROM FootballPlayer")
    List<FootballPlayer> getAll();

    @Insert
    void insertAll(FootballPlayer... players);

    @Update
    void update(FootballPlayer player);

    @Delete
    void delete(FootballPlayer player);
}
