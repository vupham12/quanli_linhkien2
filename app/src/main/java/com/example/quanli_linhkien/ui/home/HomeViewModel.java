package com.example.quanli_linhkien.ui.home;

import android.widget.ViewFlipper;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {
    ViewFlipper viewFlipper;
    private MutableLiveData<String> mText;



    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Sản phẩm mới");

    }

    public LiveData<String> getText() {
        return mText;
    }
}