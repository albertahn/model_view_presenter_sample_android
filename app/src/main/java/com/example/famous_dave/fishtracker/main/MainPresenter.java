package com.example.famous_dave.fishtracker.main;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * Handles actions from the View and updates the UI as needed.
 */
public class MainPresenter implements MainContract.Presenter {

    MainContract.MvpView mView;

    public MainPresenter(MainContract.MvpView view){
        mView = view;
    }

    @Override
    public void handleSignInButtonClick(View view) {

        mView.navigateToSignIn();
    }

    @Override
    public void handleSignUpButtonClick(View view) {
        mView.navigateToSignUp();
    }
}
