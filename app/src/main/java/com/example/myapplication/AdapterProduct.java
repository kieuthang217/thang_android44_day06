package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterProduct extends RecyclerView.Adapter<AdapterProduct.Viewhoder> {

    List<Product> productList;
    IProductOnClick iProductOnClick;

    public AdapterProduct(List<Product> productList) {
        this.productList = productList;
    }

    public void setProductOnClick(IProductOnClick iProductOnClick) {
        this.iProductOnClick = iProductOnClick;
    }

    @Override
    public AdapterProduct.Viewhoder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.item_product,parent,false);

        Viewhoder vh = new Viewhoder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder( AdapterProduct.Viewhoder holder, int position) {
        holder.tvName.setText(productList.get(position).getName());
        holder.tvPhone.setText(productList.get(position).getNumberphone());

        holder.tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iProductOnClick.onNameclick(productList.get(position).getName());
            }
        });
        holder.tvPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iProductOnClick.onPhoneclick(productList.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    public class Viewhoder extends RecyclerView.ViewHolder {
        TextView tvName, tvPhone;
        public Viewhoder( View itemView) {
            super(itemView);

            tvName=itemView.findViewById(R.id.tvName);
            tvPhone=itemView.findViewById(R.id.tvPhone);
        }
    }
}
