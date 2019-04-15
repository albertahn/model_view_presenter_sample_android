package com.example.famous_dave.fishtracker.main;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.famous_dave.fishtracker.R;
import com.example.famous_dave.fishtracker.databinding.LoginMvpActivityMainBinding;

/**
 * Displays the Main screen.
 */
public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_mvp_activity_main);

        //binding is layout underscored
        LoginMvpActivityMainBinding loginMvpActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.login_mvp_activity_main);


        mPresenter = new MainPresenter(this);
        loginMvpActivityMainBinding.setPresenter(mPresenter);
    }

    @Override
    public void navigateToSignIn() {

        Toast.makeText(this, "signin screen", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, SignInActivity.class);
            startActivity(i);
    }

    @Override
    public void navigateToSignUp() {
        Toast.makeText(this, "navigateToSignUp screen", Toast.LENGTH_SHORT).show();
    }
}
