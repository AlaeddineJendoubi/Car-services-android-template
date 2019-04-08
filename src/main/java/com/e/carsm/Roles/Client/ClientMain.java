package com.e.carsm.Roles.Client;

import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.e.carsm.R;

public class ClientMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
    }
}
