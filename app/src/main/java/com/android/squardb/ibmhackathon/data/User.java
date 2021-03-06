package com.android.squardb.ibmhackathon.data;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class User {
    @NonNull
    @PrimaryKey
    private int userId;
    private String username;
    private String userPin;

    public User(int userId, String username, String userPin) {
        this.userId = userId;
        this.username = username;
        this.userPin = userPin;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPin() {
        return userPin;
    }

    public void setUserPin(String userPin) {
        this.userPin = userPin;
    }
}
