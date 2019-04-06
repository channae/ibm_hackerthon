package com.android.squardb.ibmhackathon.data.source.local.action;

import com.android.squardb.ibmhackathon.data.User;

public interface OnGetUserListener extends OnErrorDatabaseListener {
    void onSuccessGetUser(User user);
}
