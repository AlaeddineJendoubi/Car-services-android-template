package com.e.carsm.Roles.Client.Home.Facture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.e.carsm.R;
import com.e.carsm.Roles.Client.Home.Payment.ClientPaymentEspeceChekOut;
import com.e.carsm.Roles.Client.Home.Payment.ClientPaymentOnline;

public class ClientFactureActivity extends AppCompatActivity {
 private Button paynow,payonligne;
 private int type = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_facture);

        paynow=findViewById(R.id.paynow);
        payonligne=findViewById(R.id.payLign);

        payonligne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = 2;
                navigate();
            }
        });

        paynow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = 1 ;
                navigate();
            }
        });




    }

    void navigate()
    {
        if (type==1)
        {
            Intent inte = new Intent(this, ClientPaymentEspeceChekOut.class);
            startActivity(inte);
        }
        else if(type ==2)
        {
            Intent inte = new Intent(this, ClientPaymentOnline.class);
            startActivity(inte);
        }
        else {
            Toast.makeText(this,"Could not redirect", Toast.LENGTH_SHORT).show();
        }

    }
}
