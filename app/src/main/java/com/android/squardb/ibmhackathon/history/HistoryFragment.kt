package com.android.squardb.ibmhackathon.history

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import com.android.squardb.ibmhackathon.R
import com.android.squardb.ibmhackathon.data.Account
import com.android.squardb.ibmhackathon.history.adapter.AccountAdapter
import com.android.squardb.ibmhackathon.history.viewmodel.HistoryViewModel
import kotlinx.android.synthetic.main.fragment_history.*
import java.text.SimpleDateFormat
import java.util.Date
import kotlin.collections.ArrayList

/**
 * This Fragment shows history screen.
 * User can select their history transaction based on a week, a month or date range.
 *
 * @author Vierda Mila
 * @since 1.0
 */


class HistoryFragment : Fragment(), HistoryDataView {

    var typeOfHistory = SearchHistoryFragment.WEEK
    var accountId = 0
    var listAccount = ArrayList<Account>()

    lateinit var from: Date
    lateinit var to: Date
    private lateinit var adapter: AccountAdapter

    private lateinit var historyViewModel: HistoryViewModel
    private lateinit var loadAccountsLiveData: LiveData<List<Account>>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_history, container, false)

        val context = activity as Context
        adapter = AccountAdapter(activity as Context, this)
        lv_accounts.adapter = adapter as ListAdapter

        historyViewModel = ViewModelProviders.of(this).get(HistoryViewModel::class.java)
        loadAccountsLiveData = historyViewModel.getLoadAccountLiveData()

        historyViewModel.getAccounts()
        observeAccounts()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btn_week.setOnClickListener { _ ->
            typeOfHistory = SearchHistoryFragment.WEEK
            range_container.visibility = View.GONE
        }

        btn_month.setOnClickListener { _ ->
            typeOfHistory = SearchHistoryFragment.MONTH
            range_container.visibility = View.GONE
        }

        btn_range.setOnClickListener { _ ->

            typeOfHistory = SearchHistoryFragment.RANGE
            range_container.visibility = View.VISIBLE
        }

        val act = activity as HistoryActivity

        btn_search.setOnClickListener { _ ->
            act.callSearchResultHistoryFragment(typeOfHistory)
        }

        btn_transfer.setOnClickListener { _ ->
            //TODO
        }

        btn_history.setOnClickListener { _ -> act.callHistoryFragment() }

        val format = SimpleDateFormat("dd/mm/YYYY")
        from = format.parse(edt_from.text.toString())
        to = format.parse(edt_from.text.toString())

    }

    override fun setAccountDetail(accountId: Int, accountDetail: String) {
        this.accountId = accountId
        tv_account_detail.text = accountDetail
    }

    fun observeAccounts() {
        loadAccountsLiveData.observe(this, Observer<List<Account>> { t ->

            if (t!!.isNotEmpty()) {
                if (listAccount.isNotEmpty()) listAccount.clear()
                listAccount.addAll(t)
                adapter.setRecords(listAccount)
                adapter.notifyDataSetChanged()

                //set default value
                val account = listAccount[0]
                tv_account_detail.text = "${account.accountType} (${account?.accountNumber})"
            }

        })
    }
}