package com.example.guakhawk;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.guakhawk.ui.createGroup.CreateGroupFragment;

public class FriendRequests extends AppCompatActivity {
    ImageButton denyRequestButton;
    ImageButton acceptRequestButton;

    ImageButton to_friends;
    ImageButton to_home;
    ImageButton to_create_group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friend_request);

        denyRequestButton = (ImageButton) findViewById(R.id.requestDeny1);
        denyRequestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder deniedAlert = new AlertDialog.Builder(FriendRequests.this);
                deniedAlert.setTitle("Friend Request Declined");
                deniedAlert.setPositiveButton("Done", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface i, int which) {
                        i.dismiss();
                    }
                });
                deniedAlert.create().show();
            }
        });

        acceptRequestButton = (ImageButton) findViewById(R.id.requestAccept2);
        acceptRequestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder acceptedAlert = new AlertDialog.Builder(FriendRequests.this);
                acceptedAlert.setTitle("Friend Request Accepted!");
                acceptedAlert.setPositiveButton("Done", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface i, int which) {
                        i.dismiss();
                    }
                });
                acceptedAlert.create().show();
            }
        });

        to_friends = findViewById(R.id.button_friends_page);
        to_friends.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(FriendRequests.this, Friends.class);
                startActivity(i);
            }
        });

        to_home = findViewById(R.id.button_home_page);
        to_home.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(FriendRequests.this, HomePage.class);
                startActivity(i);
            }
        });

        to_create_group = findViewById(R.id.button_new_group);
        to_create_group.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(FriendRequests.this, CreateGroupFragment.class);
                startActivity(i);
            }
        });

    }

}
