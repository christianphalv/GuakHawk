package com.example.guakhawk;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import com.example.guakhawk.foodprefandpick.PrefAndPick;

public class RespondToInvite3Activity extends AppCompatActivity {

    Button KFCBtn;
    Button McDonaldsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respond_to_invite3);
        KFCBtn = (Button) findViewById(R.id.KFCBtn);
        McDonaldsButton = (Button) findViewById(R.id.McDonaldsBtn);

        McDonaldsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNextPage();
            }
        });

        KFCBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNextPage();
            }
        });
    }

    public void openNextPage(){
        Intent intent = new Intent(this, PrefAndPick.class);
        startActivity(intent);
    }
}