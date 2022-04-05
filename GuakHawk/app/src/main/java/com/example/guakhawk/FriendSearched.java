package com.example.guakhawk;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FriendSearched extends AppCompatActivity {
    ImageButton requestFriendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friend_searched);

        requestFriendButton = (ImageButton) findViewById(R.id.addFriend1);
        requestFriendButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                sendFriendRequest();
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
