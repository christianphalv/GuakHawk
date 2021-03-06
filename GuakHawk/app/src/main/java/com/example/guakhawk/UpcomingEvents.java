package com.example.guakhawk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.guakhawk.ui.createGroup.CreateGroupFragment;

public class UpcomingEvents extends AppCompatActivity {

    ImageButton to_account;

    ImageButton to_friends;
    ImageButton to_home;
    ImageButton to_create_group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming_events);

        to_account = findViewById(R.id.imgButton_account);

        to_account.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(UpcomingEvents.this, Account.class);
                        startActivity(i);
                    }
                }
        );

        to_friends = findViewById(R.id.button_friends_page);
        to_friends.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(UpcomingEvents.this, Friends.class);
                startActivity(i);
            }
        });

        to_home = findViewById(R.id.button_home_page);
        to_home.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(UpcomingEvents.this, HomePage.class);
                startActivity(i);
            }
        });

        to_create_group = findViewById(R.id.button_new_group);
        to_create_group.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(UpcomingEvents.this, CreateGroupFragment.class);
                startActivity(i);
            }
        });

    }
}