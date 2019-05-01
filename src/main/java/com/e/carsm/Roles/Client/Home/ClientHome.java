package com.e.carsm.Roles.Client.Home;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.e.carsm.R;

import com.e.carsm.Roles.Client.Home.servicesList.ProductAdapter;
import com.e.carsm.Roles.Client.Home.servicesList.Services;

import java.util.ArrayList;
import java.util.List;

public class ClientHome extends Fragment {

    List<Services> productList;

    //the recyclerview
    RecyclerView recyclerView;

    Spinner spinner ;
    public ClientHome() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_client_home, container, false);
        spinner=root.findViewById(R.id.carList);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> ada = ArrayAdapter.createFromResource(getActivity(),
                R.array.cars, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        ada.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(ada);
        //getting the recyclerview from xml
        recyclerView =  root.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //initializing the productlist
        productList = new ArrayList<>();


        //adding some items to our list
        productList.add(
                new Services(
                        1,
                        "vidange complète avec filtres ",
                        "235 dt"
                        ));

        productList.add(
                new Services(
                        1,
                        "diagnostique électrique",
                        "180 dt"
                        ));

        productList.add(
                new Services(
                        1,
                        "diagnostique mecanique",
                        "200 dt"));
        productList.add(
                new Services(
                        1,
                        "regler le parallelismee",
                        "100 dt"));

        //creating recyclerview adapter
        ProductAdapter adapter = new ProductAdapter(getActivity(), productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
        return root;
    }





}
