package com.android.squardb.ibmhackathon.data.source;

import android.arch.lifecycle.LiveData;
import android.content.Context;

import com.android.squardb.ibmhackathon.data.User;
import com.android.squardb.ibmhackathon.data.source.local.BankLocalDataSource;

public class BankRepository {

    private BankLocalDataSource bankLocalDataSource;

    public BankRepository() {
        this.bankLocalDataSource = new BankLocalDataSource();
    }

    public void addUser(Context context, User user) {
        bankLocalDataSource.addUser(context, user);
    }

    public LiveData<User> getUserByUsername(Context context, String username) {
        return bankLocalDataSource.getUserByUsername(context, username);
    }

}
