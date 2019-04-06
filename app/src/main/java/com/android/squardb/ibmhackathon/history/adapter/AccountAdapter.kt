package com.android.squardb.ibmhackathon.history.adapter

import android.content.Context
import com.android.squardb.ibmhackathon.history.viewholder.AccountViewHolder
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.android.squardb.ibmhackathon.R
import com.android.squardb.ibmhackathon.data.Account
import com.android.squardb.ibmhackathon.history.HistoryDataView

/**
 * Adapter that hold list of Account Data
 *
 * @author Vierda Mila
 * @since 1.0
 */
class AccountAdapter (val context: Context, val dataView : HistoryDataView) : RecyclerView.Adapter<AccountViewHolder>() {

    private var accounts = ArrayList<Account>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AccountViewHolder {
        return AccountViewHolder( LayoutInflater.from(parent.context).inflate(R.layout.item_account_detail, null), dataView)
    }

    override fun onBindViewHolder(holder: AccountViewHolder, position: Int) {
        if (accounts.isNotEmpty()) {
            holder.bindData(accounts[position])
        }

    }

    override fun getItemCount(): Int {
        if (accounts.isNotEmpty())
            return accounts.size
        else
            return 0
    }

    fun setRecords(list: ArrayList<Account>) {
        if (accounts.isNotEmpty()) accounts.clear()
        accounts.addAll(list)
    }
}