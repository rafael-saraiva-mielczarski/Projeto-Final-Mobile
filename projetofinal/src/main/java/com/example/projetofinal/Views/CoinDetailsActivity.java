package com.example.projetofinal.Views;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.projetofinal.R;

public class CoinDetailsActivity extends AppCompatActivity {

    TextView nameTv, symbolTv, imageTv, priceTv, mkt_capTv, high24hTv, low24hTv, price_change24hTv, totalSupplyTv, athTv, atlTv;
    String name, symbol;

    Integer image, price, mkt_cap, high24h, low24h, price_change24h, totalSupply, ath, atl;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coin_details);
        btnBack = findViewById(R.id.btn_back);
        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), CoinsRVActivity.class);
            startActivity(intent);
        });


//        nameTv = findViewById(R.id.user_name);
//        symbolTv = findViewById(R.id.user_username);
//        imageTv = findViewById(R.id.user_email);
//        priceTv = findViewById(R.id.user_id);
//        mkt_capTv = findViewById(R.id.user_address);
//
//        Intent intent = getIntent();
//        name = intent.getExtras().getString("Name");
//        username = intent.getExtras().getString("Username");
//        email = intent.getExtras().getString("Email");
//        id = intent.getExtras().getInt("Id");
//        address = intent.getExtras().getString("Address");
//
//        nameTv.setText(name);
//        usernameTv.setText(username);
//        emailTv.setText(email);
//        idTv.setText(id.toString());
//        addressTv.setText(address);
    }
}
