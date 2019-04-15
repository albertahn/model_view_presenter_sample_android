package com.example.famous_dave.fishtracker.main;

import android.content.Context;
import android.view.View;

/**
 * Handles actions from the View and updates the UI as needed.
 */
public class MainPresenter implements MainContract.Presenter {
    Context mContext;
    public MainPresenter(Context context){
        mContext = context;
    }

    @Override
    public void handleSignInButtonClick(View view) {

    }

    @Override
    public void handleSignUpButtonClick(View view) {

    }
}
