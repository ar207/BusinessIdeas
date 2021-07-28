package com.example.businessideas.ui.online;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OnlineViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public OnlineViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Online fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}