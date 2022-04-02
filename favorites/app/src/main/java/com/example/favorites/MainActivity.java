package com.example.favorites;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    Preferences screen as activity_main.xml
//    Button button;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        button = findViewById(R.id.button_save);
//        button.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                AlertDialog.Builder savedAlert = new AlertDialog.Builder(MainActivity.this);
//                savedAlert.setTitle("Your Preferences Have Been Saved!");
//                savedAlert.setMessage("You can now create a new group dining event.\nSetting your dining preferences helps Guac Hawk match you with the best suited restraunts for you!");
//                savedAlert.setPositiveButton("Close", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        Toast.makeText(MainActivity.this, "Yes clicked", Toast.LENGTH_SHORT).show();
//                    }
//                });
//                savedAlert.show();
//            }
//        }
//
//        );



//    Favorites page as activity_main.xml
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

    }

}

