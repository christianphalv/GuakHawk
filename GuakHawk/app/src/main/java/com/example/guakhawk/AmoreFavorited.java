package com.example.guakhawk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AmoreFavorited extends AppCompatActivity {

    Button back_to_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorites_amore);

        back_to_account = findViewById(R.id.back_to_account);

        back_to_account.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(AmoreFavorited.this, Account.class);
                        startActivity(i);
                    }
                }
        );

    }

    // add button to go back to account


}