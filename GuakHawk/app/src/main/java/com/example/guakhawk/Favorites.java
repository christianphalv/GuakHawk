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

public class Favorites extends AppCompatActivity {
    ImageButton plusButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plusButton = (ImageButton) findViewById(R.id.add_amore);
        plusButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder favoriteAlert = new AlertDialog.Builder(MainActivity.this);
                favoriteAlert.setTitle("Amore Added to Favorites!");
                favoriteAlert.setPositiveButton("Done", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent amore_favorited = new Intent (MainActivity.this, AmoreFavorited.class);
                        startActivity(amore_favorited);
                    }
                });
                favoriteAlert.create().show();
            }
        });
        // add button to go back to account

    }

}
