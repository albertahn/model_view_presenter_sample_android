package com.example.famous_dave.fishtracker.main;

/**
 * Defines the contract between the View {@link MainActivity} and the Presenter
 * {@link MainPresenter}
 */

public interface MainContract {
    interface MvpView {
        void navigateToSignIn();

        void navigateToSignUp();
    }
    interface Presenter {
        void handleSignInButtonClick();

        void handleSignUpButtonClick();
    }
}
