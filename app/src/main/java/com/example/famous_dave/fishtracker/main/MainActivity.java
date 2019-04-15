package com.example.famous_dave.fishtracker.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.famous_dave.fishtracker.R;

/**
 * Displays the Main screen.
 */
public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void navigateToSignIn() {

    }

    @Override
    public void navigateToSignUp() {

    }
}
