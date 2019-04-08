package com.e.carsm.Global.Login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.e.carsm.R;
import com.e.carsm.Roles.Client.ClientMain;

public class LoginFragment extends Fragment {
Button login;
String userType;
    public LoginFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_login, container, false);
        //Binding viw elements
        login = root.findViewById(R.id.loginBtn);

        //Init and geting user type from shared pref
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(getActivity());
        //Get Data from shared pref and inserting it into string
         userType = settings.getString("userType", "error");


        navigate();


        return root ;
    }
    void navigate()
    {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (userType.equals("client"))
                {
                    Intent intent = new Intent(getContext(), ClientMain.class);
                    startActivity(intent);
                }
                else if (userType.equals("consaissionnaire"))
                {
                    Toast.makeText(getActivity(),"Option pas encore disponible pour les consaissionnaires", Toast.LENGTH_SHORT).show();
                }

                else if (userType.equals("ouvrier"))
                {
                    Toast.makeText(getActivity(),"Option pas encore disponible pour les ouvriers", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
