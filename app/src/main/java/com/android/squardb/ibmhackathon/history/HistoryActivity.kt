package com.android.squardb.ibmhackathon.history

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.android.squardb.ibmhackathon.R

/**
 * Activity that holds HistoryFragment and SearchHistroyFragment
 *
 * @author Vierda Mila
 * @since 1.0
 */
class HistoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)
        callHistoryFragment()
    }

    fun callHistoryFragment() {
        val fragment = HistoryFragment()
        val fragmentTransaction = supportFragmentManager?.beginTransaction()
        fragmentTransaction?.replace(R.id.fragment_history_placeholder, fragment as Fragment)
        fragmentTransaction?.commit()
    }

     fun callSearchResultHistoryFragment(historyType:String) {
        val fragment = SearchHistoryFragment()
        val bundle = Bundle()
        val fragmentTransaction = supportFragmentManager?.beginTransaction()
        bundle.putString(SearchHistoryFragment.HISTORY_TYPE, historyType)
        fragment.arguments = bundle
        fragmentTransaction?.addToBackStack(null)
        fragmentTransaction?.replace(R.id.fragment_history_placeholder, fragment as Fragment)
        fragmentTransaction?.commit()
    }
}