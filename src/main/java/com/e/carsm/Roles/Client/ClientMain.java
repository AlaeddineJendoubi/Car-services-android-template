package com.e.carsm.Roles.Client;

import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.e.carsm.Global.LoginOptions.LoginOptionsFragment;
import com.e.carsm.R;
import com.e.carsm.Roles.Client.Home.ClientHome;

public class ClientMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new ClientHome()).addToBackStack(null).commit();
    }
}
