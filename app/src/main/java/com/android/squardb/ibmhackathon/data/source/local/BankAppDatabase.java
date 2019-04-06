package com.android.squardb.ibmhackathon.data.source.local;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.android.squardb.ibmhackathon.data.Account;
import com.android.squardb.ibmhackathon.data.ExchangeRate;
import com.android.squardb.ibmhackathon.data.Transaction;
import com.android.squardb.ibmhackathon.data.User;


@Database(entities = {User.class, Transaction.class, ExchangeRate.class, Account.class}, version = 1, exportSchema = false)
public abstract class BankAppDatabase extends RoomDatabase {

    public abstract BankDao bankDao();

}
