package com.andela.fellomation.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.andela.fellomation.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container, new FellowListFragment())
                .commit();
    }
}
