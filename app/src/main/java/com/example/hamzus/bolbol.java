package com.example.hamzus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.hamzus.ui.main.BolbolFragment;

public class bolbol extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bolbol_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, BolbolFragment.newInstance())
                    .commitNow();
        }
    }
}