package com.example.guakhawk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Friends extends AppCompatActivity {
    ImageButton addButton;
    ImageButton friendRequestsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friends_home);

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

    }
}
