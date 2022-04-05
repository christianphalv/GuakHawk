package com.example.guakhawk;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SearchView;

import com.example.guakhawk.ui.createGroup.CreateGroupFragment;

public class FriendSearched extends AppCompatActivity {
    ImageButton requestFriendButton;

    ImageButton to_friends;
    ImageButton to_home;
    ImageButton to_create_group;

    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friend_searched);

        searchView = (SearchView) findViewById(R.id.friendsHomeSearch);

        requestFriendButton = (ImageButton) findViewById(R.id.addFriend1);
        requestFriendButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                sendFriendRequest();
            }
        });

        to_friends = findViewById(R.id.button_friends_page);
        to_friends.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(FriendSearched.this, Friends.class);
                startActivity(i);
            }
        });

        to_home = findViewById(R.id.button_home_page);
        to_home.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(FriendSearched.this, HomePage.class);
                startActivity(i);
            }
        });

        to_create_group = findViewById(R.id.button_new_group);
        to_create_group.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(FriendSearched.this, CreateGroupFragment.class);
                startActivity(i);
            }
        });

    }

    protected void sendFriendRequest(){
        AlertDialog.Builder friendRequestedAlert = new AlertDialog.Builder(FriendSearched.this);
        friendRequestedAlert.setTitle("Friend Request Sent!");
        friendRequestedAlert.setMessage("The user will be added to your friends once the request has been accepted");
        friendRequestedAlert.setNeutralButton("Cancel Request", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                cancelFriendRequest();
            }
        });
        friendRequestedAlert.setPositiveButton("OK", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface i, int which) {
                i.dismiss();
            }
        });
        friendRequestedAlert.create().show();
    }

    protected void cancelFriendRequest(){
        AlertDialog.Builder friendRequestCancelledAlert = new AlertDialog.Builder(FriendSearched.this);
        friendRequestCancelledAlert.setTitle("Friend Request Cancelled");
        friendRequestCancelledAlert.setNeutralButton("Send Again", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                sendFriendRequest();
            }
        });
        friendRequestCancelledAlert.setPositiveButton("OK", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface i, int which) {
                i.dismiss();
            }
        });
        friendRequestCancelledAlert.create().show();
    }
}
