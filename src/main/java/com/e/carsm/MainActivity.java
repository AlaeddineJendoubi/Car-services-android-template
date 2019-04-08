package com.e.carsm;


import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.e.carsm.Global.LoginOptions.LoginOptionsFragment;

public class MainActivity extends AppCompatActivity {

    private Button client,consaissionnaire,ouvrier;
    private int roleSected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor = settings.edit();

        client = findViewById(R.id.clientBtn);
        consaissionnaire = findViewById(R.id.concessionnaireBtn);
        ouvrier=findViewById(R.id.ouvrierBtn);
        selectdRole();


    }

    void  selectdRole ()
    {
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor = settings.edit();

        client.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("userType", "client");
                editor.commit();
                navigate();
            }
        });

        consaissionnaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("userType", "consaissionnaire");
                editor.commit();
                navigate();
            }
        });

        ouvrier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("userType", "ouvrier");
                editor.commit();
                navigate();
            }
        });

    }

    void navigate()
    {

            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new LoginOptionsFragment()).addToBackStack(null).commit();

    }
}
