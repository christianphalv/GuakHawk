package com.example.guakhawk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SearchView;

import com.example.guakhawk.ui.createGroup.CreateGroupFragment;

public class Friends extends AppCompatActivity {
    ImageButton addButton;
    ImageButton friendRequestsButton;

    ImageButton to_friends;
    ImageButton to_home;
    ImageButton to_create_group;

    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friends_home);

        searchView = (SearchView) findViewById(R.id.friendsHomeSearch);

        addButton = (ImageButton) findViewById(R.id.processSearch);
        addButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent (Friends.this, FriendSearched.class));
            }
        });

        friendRequestsButton = (ImageButton) findViewById(R.id.friendRequests);
        friendRequestsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent (Friends.this, FriendRequests.class));
            }
        });

        to_friends = findViewById(R.id.button_friends_page);
        to_friends.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(Friends.this, Friends.class);
                startActivity(i);
            }
        });

        to_home = findViewById(R.id.button_home_page);
        to_home.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(Friends.this, HomePage.class);
                startActivity(i);
            }
        });

        to_create_group = findViewById(R.id.button_new_group);
        to_create_group.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(Friends.this, CreateGroupFragment.class);
                startActivity(i);
            }
        });

    }
}
