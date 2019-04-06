package com.android.squardb.ibmhackathon.data.source.local;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Room;
import android.content.Context;

import com.android.squardb.ibmhackathon.data.User;

public class BankLocalDataSource {

    private static final String TAG = "BankLocalDataSource";

    private String DB_NAME = "ibm_hackathon_db";

    private BankAppDatabase bankAppDatabase;

    public BankLocalDataSource(Context context) {
        bankAppDatabase = Room.databaseBuilder(context, BankAppDatabase.class, DB_NAME).allowMainThreadQueries().build();
    }

    public void addUser(User user) {
         bankAppDatabase.bankDao().addUser(user);
    }

    public LiveData<User> getUserByUsername(String username) {
        return bankAppDatabase.bankDao().getUserByUsername(username);
    }

}
