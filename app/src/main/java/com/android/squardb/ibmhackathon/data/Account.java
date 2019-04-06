package com.android.squardb.ibmhackathon.data;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;


@Entity
public class Account {

    @NonNull
    @PrimaryKey
    private int id;
    private int userId;
    private int exchangeRateId;
    private String accountNumber;
    private String ifcsCode;
    private String nickname;
    private String accountType;

    public Account(int id, int userId, int exchangeRateId, String accountNumber, String ifcsCode, String nickname, String accountType) {
        this.id = id;
        this.userId = userId;
        this.exchangeRateId = exchangeRateId;
        this.accountNumber = accountNumber;
        this.ifcsCode = ifcsCode;
        this.nickname = nickname;
        this.accountType = accountType;
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

    public int getExchangeRateId() {
        return exchangeRateId;
    }

    public void setExchangeRateId(int exchangeRateId) {
        this.exchangeRateId = exchangeRateId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIfcsCode() {
        return ifcsCode;
    }

    public void setIfcsCode(String ifcsCode) {
        this.ifcsCode = ifcsCode;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
