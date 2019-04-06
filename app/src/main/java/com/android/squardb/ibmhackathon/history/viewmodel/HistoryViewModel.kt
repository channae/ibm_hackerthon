package com.android.squardb.ibmhackathon.history.viewmodel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.MutableLiveData
import com.android.squardb.ibmhackathon.data.Account

/**
 * View Model for History Screen
 *
 * @author Greenwave Systems Inc
 * @since 1.0
 */
class HistoryViewModel(application: Application) : AndroidViewModel(application) {

    private var loadAccountLiveData: MutableLiveData<List<Account>> = MutableLiveData()


    fun getLoadAccountLiveData(): MutableLiveData<List<Account>> {
        return loadAccountLiveData
    }

    fun getAccounts() {

    }
}