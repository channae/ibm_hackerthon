package com.android.squardb.ibmhackathon.data.source;

import android.arch.lifecycle.LiveData;
import android.content.Context;

import com.android.squardb.ibmhackathon.data.ExchangeRate;
import com.android.squardb.ibmhackathon.data.Transaction;
import com.android.squardb.ibmhackathon.data.User;
import com.android.squardb.ibmhackathon.data.source.local.BankLocalDataSource;

import java.util.List;

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

    public LiveData<User> getUserByUserId(Context context, int userId) {
        return bankLocalDataSource.getUserByUserId(context, userId);
    }

    public void addTransaction(Context context, Transaction transaction) {
        bankLocalDataSource.addTransaction(context, transaction);
    }

    public LiveData<List<Transaction>> getTransactionsByUserId(Context context, int userId) {
        return bankLocalDataSource.getTransactionsByUserId(context, userId);
    }

    public LiveData<List<Transaction>> getTransactionsByUserIdAndDateRange(Context context, int userId, long start, long end) {
        return bankLocalDataSource.getTransactionsByUserIdAndDateRange(context, userId, start, end);
    }

    public void addExchangeRate(Context context, ExchangeRate exchangeRate) {
        bankLocalDataSource.addExchangeRate(context, exchangeRate);
    }


}
