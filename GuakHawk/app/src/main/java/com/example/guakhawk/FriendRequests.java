package com.example.ghfinal;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FriendRequests extends AppCompatActivity {
    ImageButton denyRequestButton;
    ImageButton acceptRequestButton;

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
    }

}
