package com.android.squardb.ibmhackathon.data.source.local;

import android.arch.lifecycle.LiveData;
import android.content.Context;

import com.android.squardb.ibmhackathon.data.User;

public class BankLocalDataSource {

    private static final String TAG = "BankLocalDataSource";

    public BankLocalDataSource() {

    }

    public void addUser(Context context, User user) {
        BankAppDatabase.getInstance(context).bankDao().addUser(user);
    }

    public LiveData<User> getUserByUsername(Context context, String username) {
        return BankAppDatabase.getInstance(context).bankDao().getUserByUsername(username);
    }

}
