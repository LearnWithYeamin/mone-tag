package com.myeamin.testapp;

import android.app.Application;

import co.notix.interstitial.InterstitialLoader;
import co.notix.interstitial.NotixInterstitial;

public class App extends Application {

    // Declare variable
    static InterstitialLoader interstitialLoader;

    @Override
    public void onCreate() {
        super.onCreate();
        // Load Interstitial Ads
        /* ... */
        interstitialLoader = NotixInterstitial.Companion.createLoader(7322252);
        interstitialLoader.startLoading();
    }
}
