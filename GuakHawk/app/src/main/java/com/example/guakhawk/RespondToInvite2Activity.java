package com.example.guakhawk;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class RespondToInvite2Activity extends AppCompatActivity {

    Button ChineseBtn;
    Button ItalianBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respond_to_invite2);
        ChineseBtn = (Button) findViewById(R.id.ChineseBtn);
        ItalianBtn = (Button) findViewById(R.id.ItalianBtn);

        ChineseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNextPage();
            }
        });

        ItalianBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNextPage();
            }
        });
    }

    public void openNextPage(){
        Intent intent = new Intent(this, RespondToInvite3Activity.class);
        startActivity(intent);
    }
}