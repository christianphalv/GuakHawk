package com.example.foodprefandpick;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class skipButton extends AppCompatActivity {
    private Button goBtn;
    private Button nextBtn;
    private Button backBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rigazzis);
        goBtn = (Button) findViewById(R.id.goBtnR);
        nextBtn = (Button) findViewById(R.id.nextBtnR);
        backBtn = (Button) findViewById(R.id.goBtnR);
        goBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openGoButton();
            }
        });
        nextBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openNextButton();
            }
        });
        backBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openBackButton();
            }
        });
    }
    public void openGoButton(){
        Intent intent = new Intent(this, goButton2.class);
        startActivity(intent);
    }

    public void openNextButton(){
        Intent intent = new Intent(this, nextButton.class);
        startActivity(intent);
    }
    public void openBackButton(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
