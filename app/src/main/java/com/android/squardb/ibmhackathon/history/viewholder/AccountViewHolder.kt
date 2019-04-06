package com.android.squardb.ibmhackathon.history.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View
import com.android.squardb.ibmhackathon.data.Account
import com.android.squardb.ibmhackathon.history.HistoryDataView
import kotlinx.android.synthetic.main.item_account_detail.view.*

/**
 * Holder for account type and account number
 *
 * @author Vierda Mila
 * @since 1.0
 */
class AccountViewHolder (val view: View, val dataView:HistoryDataView) : RecyclerView.ViewHolder(view) {

    fun bindData(account: Account) {
        val text = "${account.accountType} (${account?.accountNumber})"
        view.account.text = text

        view.account.setOnClickListener { _ ->
            dataView.setAccountDetail(account.id,text)
        }

    }
}