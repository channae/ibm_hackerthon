package com.android.squardb.ibmhackathon.history

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.squardb.ibmhackathon.R

/**
 * List for history transaction.
 * It could be show per week, month, based on date range or all data transactions
 * if user not select any transaction options.
 *
 * @author Vierda Mila
 * @since 1.0
 */
class SearchHistoryFragment : Fragment() {

    var typeOfHistory: String? = null

    companion object {

        val HISTORY_TYPE = "History_Type"

        val WEEK = "Week"
        val MONTH = "Month"
        val RANGE = "Range"
        val ALL = "All"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_search_result, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        typeOfHistory = arguments?.getString(HISTORY_TYPE)

        if (typeOfHistory == null) typeOfHistory = ALL
    }
}