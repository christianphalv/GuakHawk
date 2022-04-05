package com.example.guakhawk;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class RespondToInvite1Activity extends AppCompatActivity {

    Button ChipotleBtn;
    Button ShuangChangBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respond_to_invite1);
        ChipotleBtn = (Button) findViewById(R.id.ChipotleBtn);
        ShuangChangBtn = (Button) findViewById(R.id.ShaungChangeBtn);

        ChipotleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNextPage();
            }
        });

        ShuangChangBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNextPage();
            }
        });
    }

    public void openNextPage(){
        Intent intent = new Intent(this, RespondToInvite2Activity.class);
        startActivity(intent);
    }
}