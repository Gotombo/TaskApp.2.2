package com.example.android22;

import android.app.Application;

import androidx.room.Room;

import com.example.android22.local.AppDatabase;
import com.example.android22.utils.Prefs;


public class App extends Application {

    public static Prefs prefs;
    public static AppDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
        database = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class,
                "dataBase")
                .allowMainThreadQueries()
                .build();
        prefs = new Prefs(this);
    }
}
