package com.android.squardb.ibmhackathon.data.source.local;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.android.squardb.ibmhackathon.data.Account;
import com.android.squardb.ibmhackathon.data.ExchangeRate;
import com.android.squardb.ibmhackathon.data.Transaction;
import com.android.squardb.ibmhackathon.data.User;


@Database(entities = {User.class, Transaction.class, ExchangeRate.class, Account.class}, version = 1, exportSchema = false)
public abstract class BankAppDatabase extends RoomDatabase {

    private static String DB_NAME = "ibm_hackathon_db";
    private static volatile BankAppDatabase instance;

    public static synchronized BankAppDatabase getInstance(Context context) {
        if (instance == null) {
            instance = create(context);
        }
        return instance;
    }

    public BankAppDatabase() {}

    private static BankAppDatabase create(final Context context) {
        return Room.databaseBuilder(context, BankAppDatabase.class, DB_NAME).allowMainThreadQueries().build();
    }

    public abstract BankDao bankDao();

}
