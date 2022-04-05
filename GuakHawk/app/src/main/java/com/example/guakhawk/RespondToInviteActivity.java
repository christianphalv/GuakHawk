package com.example.guakhawk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class RespondToInviteActivity extends AppCompatActivity {
    private Button acceptBtn;
    private Button declineBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respond_to_invite);

        acceptBtn= (Button) findViewById(R.id.acceptInviteBtn);
        declineBtn = (Button) findViewById(R.id.declineInviteBtn);

        acceptBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAcceptInvite();
            }
        });

        declineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDecline();
            }
        });

    }

    public void openAcceptInvite(){
        Intent intent = new Intent(this, RespondToInvite1Activity.class);
        startActivity(intent);
    }

    public void openDecline(){
        Intent intent = new Intent(this, InviteDeclinedActivity.class);
        startActivity(intent);
    }

}