package com.android.squardb.ibmhackathon.data.source.local;

import android.arch.lifecycle.LiveData;
import android.content.Context;

import com.android.squardb.ibmhackathon.data.Account;
import com.android.squardb.ibmhackathon.data.ExchangeRate;
import com.android.squardb.ibmhackathon.data.Transaction;
import com.android.squardb.ibmhackathon.data.User;

import java.util.List;

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

    public LiveData<User> getUserByUserId(Context context, int userId) {
        return BankAppDatabase.getInstance(context).bankDao().getUserByUserId(userId);
    }

    public void addTransaction(Context context, Transaction transaction) {
        BankAppDatabase.getInstance(context).bankDao().addTransaction(transaction);
    }

    public LiveData<List<Transaction>> getTransactionsByUserId(Context context, int userId) {
        return BankAppDatabase.getInstance(context).bankDao().getTransactionsByUserId(userId);
    }

    public LiveData<List<Transaction>> getTransactionsByUserIdAndDateRange(Context context, int userId, long start, long end) {
        return BankAppDatabase.getInstance(context).bankDao().getTransactionsByUserIdAndDateRange(userId, start, end);
    }

    public void addExchangeRate(Context context, ExchangeRate exchangeRate) {
        BankAppDatabase.getInstance(context).bankDao().addExchangeRate(exchangeRate);
    }

    public LiveData<ExchangeRate> getExchangeRateByCountryCode(Context context, String countryCode) {
        return BankAppDatabase.getInstance(context).bankDao().getExchangeRateByCountryCode(countryCode);
    }

    public void addAccount(Context context, Account account) {
        BankAppDatabase.getInstance(context).bankDao().addAccount(account);
    }

    public LiveData<List<Account>> getAccountsByUserId(Context context, int userId) {
        return BankAppDatabase.getInstance(context).bankDao().getAccountsByUserId(userId);
    }

}
