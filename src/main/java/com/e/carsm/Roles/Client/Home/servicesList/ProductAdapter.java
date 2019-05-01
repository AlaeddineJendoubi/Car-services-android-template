package com.e.carsm.Roles.Client.Home.servicesList;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.e.carsm.R;
import com.e.carsm.Roles.Client.Home.Facture.ClientFactureActivity;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {


    //this context we will use to inflate the layout
    private Context mCtx;

    //we are storing all the products in a list
    private List<Services> productList;

    //getting the context and product list with constructor
    public ProductAdapter(Context mCtx, List<Services> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.layout_card, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        //getting the product of the specified position
        Services product = productList.get(position);

        //binding the data with the viewholder views
        holder.textViewTitle.setText(product.getService());
        holder.textViewShortDesc.setText(product.getService());
        holder.textViewRating.setText(String.valueOf(product.getPrix()));


    }


    @Override
    public int getItemCount() {
        return productList.size();
    }


    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle, textViewShortDesc, textViewRating, textViewPrice;
        ImageView imageView;
        CardView card;
        public ProductViewHolder(View itemView) {
            super(itemView);
            card = itemView.findViewById(R.id.cardViewClick);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewRating = itemView.findViewById(R.id.textViewRating);

            card.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                navigate();

                }
            });

        }
        public void navigate()
        {
            Intent inte = new Intent(mCtx, ClientFactureActivity.class);
            mCtx.startActivity(inte);
        }
    }
}