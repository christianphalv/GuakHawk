package com.example.guakhawk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Account extends AppCompatActivity {

    ImageButton button_back;
    ImageButton account_settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        button_back = findViewById(R.id.button_back);
        account_settings = findViewById(R.id.button_account_settings);
        button_back.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(Account.this, HomePage.class);
                        startActivity(i);
                    }
                }
        );
        account_settings.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(Account.this, AccountSettings.class);
                        startActivity(i);
                    }
                }
        );
    }

}