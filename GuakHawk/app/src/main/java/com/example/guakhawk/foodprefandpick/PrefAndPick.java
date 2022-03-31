package com.example.foodprefandpick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button goBtn;
    private Button skipBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goBtn = (Button) findViewById(R.id.goBtn);
        skipBtn = (Button) findViewById(R.id.skipBtn);
        goBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openGoButton();
            }
        });
        skipBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openSkipButton();
            }
        });
    }
    public void openGoButton(){
        Intent intent = new Intent(this,goButton1.class);
        startActivity(intent);
    }

    public void openSkipButton(){
        Intent intent = new Intent(this, skipButton.class);
        startActivity(intent);
    }
}