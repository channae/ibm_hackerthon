package com.android.squardb.ibmhackathon.data;

import java.util.Date;

public class Transaction {
    private int id;
    private int userId;
    private int sourceAccountId;
    private int destinationAccountId;
    private Date transactionDate;
    private double amount;
    private double exchangeRate;

    public Transaction(int id, int userId, int sourceAccountId, int destinationAccountId, Date transactionDate, double amount, double exchangeRate) {
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

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
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



/*

{ id : 1, users_id : 1, source_account_id : 1, destination_account_id : 1, transaction_date : "01-04-2019 9.30 AM",
amount : 2000, fee : 0, exchange_rate : 51.10 } ,

 */