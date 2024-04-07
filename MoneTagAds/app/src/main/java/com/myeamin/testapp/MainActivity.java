package com.myeamin.testapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import co.notix.interstitial.NotixInterstitial;
import kotlin.Unit;

public class MainActivity extends AppCompatActivity {


    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Write this code inside the click event.
                App.interstitialLoader.doOnNextAvailable(result -> {
                    if (result != null) {
                        NotixInterstitial.Companion.show(result);
                    }
                    return Unit.INSTANCE;
                });

                //ads কেটে দেওয়ার পর কী ঘটবে সেই কোড এখানে লিখুন...
            }
        });

    }
}