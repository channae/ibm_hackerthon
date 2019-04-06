package com.android.squardb.ibmhackathon.data;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class Transaction {
    @NonNull
    @PrimaryKey
    private int id;
    private int userId;
    private int sourceAccountId;
    private int destinationAccountId;
    private long transactionDate;
    private double amount;
    private double exchangeRate;

    public Transaction(int id, int userId, int sourceAccountId, int destinationAccountId, long transactionDate, double amount, double exchangeRate) {
        this.id = id;
        this.userId = userId;
        this.sourceAccountId = sourceAccountId;
        this.destinationAccountId = destinationAccountId;
        this.transactionDate = transactionDate;
        this.amount = amount;
        this.exchangeRate = exchangeRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getSourceAccountId() {
        return sourceAccountId;
    }

    public void setSourceAccountId(int sourceAccountId) {
        this.sourceAccountId = sourceAccountId;
    }

    public int getDestinationAccountId() {
        return destinationAccountId;
    }

    public void setDestinationAccountId(int destinationAccountId) {
        this.destinationAccountId = destinationAccountId;
    }

    public long getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(long transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}

