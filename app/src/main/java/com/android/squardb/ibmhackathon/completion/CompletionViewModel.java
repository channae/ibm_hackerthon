package com.android.squardb.ibmhackathon.completion;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

import com.android.squardb.ibmhackathon.data.source.BankRepository;

public class CompletionViewModel extends AndroidViewModel {

    private BankRepository bankRepository;

    public CompletionViewModel(@NonNull Application application) {
        super(application);
    }

    protected void init() {
        bankRepository = new BankRepository();
    }

}
