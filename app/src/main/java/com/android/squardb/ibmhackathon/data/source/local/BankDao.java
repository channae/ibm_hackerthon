package com.android.squardb.ibmhackathon.data.source.local;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.android.squardb.ibmhackathon.data.Account;
import com.android.squardb.ibmhackathon.data.ExchangeRate;
import com.android.squardb.ibmhackathon.data.Transaction;
import com.android.squardb.ibmhackathon.data.User;

import java.util.List;

@Dao
public interface BankDao {

    // User
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addUser(User user);

    @Query("SELECT * FROM User WHERE username =:username")
    LiveData<User> getUserByUsername(String username);

    @Query("SELECT * FROM User WHERE userId =:userId")
    LiveData<User> getUserByUserId(int userId);

    // Transactions
    @Insert
    void addTransaction(Transaction transaction);

    @Query("SELECT * FROM 'Transaction' WHERE userId =:userId")
    LiveData<List<Transaction>> getTransactionsByUserId(int userId);

    @Query("SELECT * FROM `Transaction` WHERE userId =:userId AND transactionDate BETWEEN :startDate AND :EndDate")
    LiveData<List<Transaction>> getTransactionsByUserIdAndDateRange(int userId, long startDate, long EndDate);


    // Exchange Rate
    @Insert
    void addExchangeRate(ExchangeRate exchangeRate);

    @Query("SELECT * FROM ExchangeRate WHERE countryCode=:countryCode")
    LiveData<ExchangeRate> getExchangeRateByCountryCode(String countryCode);


    // Account
    @Insert
    void addAccount(Account account);

    @Query("SELECT * FROM Account WHERE userId=:userId")
    LiveData<List<Account>> getAccountsByUserId(int userId);

}
