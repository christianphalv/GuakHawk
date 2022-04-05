package com.example.guakhawk;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.content.Intent;

import android.os.Bundle;

public class InviteDeclinedActivity extends AppCompatActivity {

    Button returnToMainBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invite_declined);
        returnToMainBtn = (Button) findViewById(R.id.declinedReturnToMain);
        returnToMainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainPage();
            }
        });
    }

    public void openMainPage(){
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);

    }
}