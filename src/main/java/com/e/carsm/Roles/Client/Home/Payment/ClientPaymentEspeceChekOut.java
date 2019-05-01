package com.e.carsm.Roles.Client.Home.Payment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.e.carsm.R;
import com.e.carsm.Roles.Client.Home.Location.ClientLocation;

public class ClientPaymentEspeceChekOut extends AppCompatActivity {
        private Button goToMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_payment_espece_chek_out);
        goToMap=findViewById(R.id.localisation);
        goToMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigate();
            }
        });

    }
    void navigate()
    {
        Intent inte = new Intent(this, ClientLocation.class);
        startActivity(inte);
    }
}
