package com.example.guakhawk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HomePage extends AppCompatActivity {

    ImageButton to_account;
    Button to_events;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        to_account = findViewById(R.id.button_account_page);
        to_account = findViewById(R.id.button_events_view);

        to_account.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(HomePage.this, Account.class);
                        startActivity(i);
                    }
                }
        );

        to_events.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(HomePage.this, UpcomingEvents.class);
                        startActivity(i);
                    }
                }
        );
    }

}