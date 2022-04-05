package com.example.guakhawk;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.guakhawk.ui.createGroup.CreateGroupFragment;

public class Favorites extends AppCompatActivity {
    ImageButton plusButton;
    ImageButton to_friends;
    ImageButton to_home;
    ImageButton to_create_group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorites_list);

        plusButton = (ImageButton) findViewById(R.id.add_amore);
        to_friends = findViewById(R.id.button_friends_page);
        to_home = findViewById(R.id.button_home_page);
        to_create_group = findViewById(R.id.button_new_group);
        to_friends.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(Favorites.this, Friends.class);
                        startActivity(i);
                    }
                }
        );

        to_home.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(Favorites.this, HomePage.class);
                        startActivity(i);
                    }
                }
        );

        to_create_group.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(Favorites.this, CreateGroupFragment.class);
                        startActivity(i);
                    }
                }
        );

        plusButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder favoriteAlert = new AlertDialog.Builder(Favorites.this);
                favoriteAlert.setTitle("Amore Added to Favorites!");
                favoriteAlert.setPositiveButton("Done", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent amore_favorited = new Intent (Favorites.this, AmoreFavorited.class);
                        startActivity(amore_favorited);
                    }
                });
                favoriteAlert.create().show();
            }
        });
        // add button to go back to account

    }

}
