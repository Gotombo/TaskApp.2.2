package com.example.android22.local;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.android22.models.User;

import java.util.List;

@Dao
public interface UserDao {

//    @Query("SELECT * FROM user")
//    List<User> getAllUsersList();

    @Query("SELECT * FROM user")
    LiveData<List<User>> getAllUsers();

    @Insert
    void addUser(User user);


}
