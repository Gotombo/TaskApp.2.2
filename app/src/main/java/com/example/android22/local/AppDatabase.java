package com.example.android22.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.android22.models.User;


@Database(entities = {User.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase {

    public abstract UserDao userDao();

}
