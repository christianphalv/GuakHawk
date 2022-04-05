package com.example.guakhawk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.guakhawk.ui.createGroup.CreateGroupFragment;

public class ViewPreferences extends AppCompatActivity {

    Button back_to_account;
    ImageButton to_friends;
    ImageButton to_home;
    ImageButton to_create_group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_dining_preferences);

        back_to_account = findViewById(R.id.back_to_account);
        to_friends = findViewById(R.id.button_friends_page);
        to_home = findViewById(R.id.button_home_page);
        to_create_group = findViewById(R.id.button_new_group);

        to_friends.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(ViewPreferences.this, Friends.class);
                        startActivity(i);
                    }
                }
        );

        to_home.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(ViewPreferences.this, HomePage.class);
                        startActivity(i);
                    }
                }
        );

        to_create_group.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(ViewPreferences.this, CreateGroupFragment.class);
                        startActivity(i);
                    }
                }
        );

        back_to_account.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(ViewPreferences.this, Account.class);
                        startActivity(i);
                    }
                }
        );

    }

}
