package com.example.guakhawk;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.guakhawk.ui.createGroup.CreateGroupFragment;


public class Preferences extends AppCompatActivity {

    Button button;
    ImageButton to_friends;
    ImageButton to_home;
    ImageButton to_create_group;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preferences);

        button = findViewById(R.id.button_save);
        to_friends = findViewById(R.id.button_friends_page);
        to_home = findViewById(R.id.button_home_page);
        to_create_group = findViewById(R.id.button_new_group);

        to_friends.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(Preferences.this, Friends.class);
                        startActivity(i);
                    }
                }
        );

        to_home.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(Preferences.this, HomePage.class);
                        startActivity(i);
                    }
                }
        );

        to_create_group.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(Preferences.this, CreateGroupFragment.class);
                        startActivity(i);
                    }
                }
        );
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder savedAlert = new AlertDialog.Builder(Preferences.this);
                savedAlert.setTitle("Your Preferences Have Been Saved!");
                savedAlert.setMessage("You can now create a new group dining event.\nSetting your dining preferences helps Guac Hawk match you with the best suited restraunts for you!");
                savedAlert.setPositiveButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(Preferences.this, ViewPreferences.class);
                        startActivity(i);
                    }
                });
                savedAlert.show();
            }

        }

        );


        // add button to go back to account


    }

}

