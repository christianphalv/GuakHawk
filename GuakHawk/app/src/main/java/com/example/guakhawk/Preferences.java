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

public class Preferences extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preferences);

        button = findViewById(R.id.button_save);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder savedAlert = new AlertDialog.Builder(Preferences.this);
                savedAlert.setTitle("Your Preferences Have Been Saved!");
                savedAlert.setMessage("You can now create a new group dining event.\nSetting your dining preferences helps Guac Hawk match you with the best suited restraunts for you!");
                savedAlert.setPositiveButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(Preferences.this, "Yes clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                savedAlert.show();
            }
        }

        );


        // add button to go back to account


    }

}

