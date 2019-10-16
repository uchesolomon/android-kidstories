package com.project.android_kidstories.Api.Responses.loginRegister;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LoginViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public LoginViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Logging  you in ...");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
