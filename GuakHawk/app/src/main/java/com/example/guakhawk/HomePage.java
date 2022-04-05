package com.example.guakhawk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.guakhawk.foodprefandpick.PrefAndPick;
import com.example.guakhawk.ui.createGroup.CreateGroupFragment;

public class HomePage extends AppCompatActivity {

    ImageButton to_account;
    Button to_events;
    ImageButton to_friends;
    ImageButton to_home;
    ImageButton to_create_group;
    Button pending_requests;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        to_account = findViewById(R.id.button_account_page);
        to_events = findViewById(R.id.button_events_view);
        to_friends = findViewById(R.id.button_friends_page);
        to_home = findViewById(R.id.button_home_page);
        to_create_group = findViewById(R.id.button_new_group);
        pending_requests = findViewById(R.id.pending_requests_button);

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

        to_friends.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(HomePage.this, Friends.class);
                        startActivity(i);
                    }
                }
        );

        to_home.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(HomePage.this, HomePage.class);
                        startActivity(i);
                    }
                }
        );

        to_create_group.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(HomePage.this, CreateGroupFragment.class);
                        startActivity(i);
                    }
                }
        );

        pending_requests.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(HomePage.this, PrefAndPick.class);
                        startActivity(i);
                    }
                }
        );
    }

}