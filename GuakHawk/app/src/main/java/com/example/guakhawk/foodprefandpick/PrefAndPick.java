package com.example.guakhawk.foodprefandpick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.guakhawk.R;

public class PrefAndPick extends AppCompatActivity {
    private Button goBtn;
    private Button skipBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pref_def);
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