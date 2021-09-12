package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvproduct;
    List<Product> products;
    Product product, product01, product02, product03, product04, product05;
    AdapterProduct adapterProduct;

    GridLayout gridLayout;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            rvproduct = findViewById(R.id.rvProduct);

            products = new ArrayList<>();

            product = new Product("android 44", "01234567","android@gmail.com", true);
            product01 = new Product("son", "0331238912", "son@gamil.com", false);
            product02 = new Product("tien", "0331238912", "tien@gamil.com", true);
            product03 = new Product("dat", "09312389", "dat@gamil.com", false);
            product04 = new Product("trung", "0473847577", "trung@gamil.com", true);
            product05 = new Product("nam", "0645645785", "nam@gamil.com", true);

            products.add(product);
            products.add(product01);
            products.add(product02);
            products.add(product03);
            products.add(product04);
            products.add(product05);

            adapterProduct = new AdapterProduct(products);

//            RecyclerView.LayoutManager layoutManager = new
//                    LinearLayoutManager(getBaseContext(),
//                    RecyclerView.HORIZONTAL,false);

            RecyclerView.LayoutManager layoutManager = new
                    GridLayoutManager(getBaseContext(),2,
                    RecyclerView.HORIZONTAL,false);

            rvproduct.setLayoutManager(layoutManager);
            rvproduct.setAdapter(adapterProduct);

            adapterProduct.setProductOnClick(new IProductOnClick() {
                @Override
                public void onNameclick(String name) {
                    Toast.makeText(getBaseContext(),name,Toast.LENGTH_LONG).show();
                }

                @Override
                public void onPhoneclick(Product product) {
                        Toast.makeText(getBaseContext(),product.getNumberphone(),Toast.LENGTH_LONG).show();
                }
            });
        }
    }
