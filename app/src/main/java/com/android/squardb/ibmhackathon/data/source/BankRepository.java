package com.android.squardb.ibmhackathon.data.source;

import android.arch.lifecycle.LiveData;

import com.android.squardb.ibmhackathon.data.User;
import com.android.squardb.ibmhackathon.data.source.local.BankLocalDataSource;

public class BankRepository {

    BankLocalDataSource bankLocalDataSource;

    public BankRepository(BankLocalDataSource bankLocalDataSource) {
        this.bankLocalDataSource = bankLocalDataSource;
    }

    public void addUser(User user) {
        bankLocalDataSource.addUser(user);
    }

    public LiveData<User> getUserByUsername(String username) {
        return bankLocalDataSource.getUserByUsername(username);
    }

}
