package com.e.carsm.Global.LoginOptions;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.e.carsm.Global.Login.LoginFragment;
import com.e.carsm.R;

public class LoginOptionsFragment extends Fragment {
    TextView type ;
    Button login,subscribe ;
    public LoginOptionsFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_login_options, container, false);
        //Binding view elements
            type= root.findViewById(R.id.test);
            login=root.findViewById(R.id.loginBtn);
            subscribe=root.findViewById(R.id.subscribeBtn);
        //Init and geting user type from shared pref
            SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(getActivity());
            //Get Data from shared pref and inserting it into string
            String userType = settings.getString("userType", "error");
            type.setText(userType);
        //Navigate
            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    navigate();
                }
            });
        return root;
    }

    void navigate()
    {

        LoginFragment myFragment = new LoginFragment();
        AppCompatActivity activity = (AppCompatActivity) getContext();
        activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, myFragment).addToBackStack(null).commit();
    }


}
