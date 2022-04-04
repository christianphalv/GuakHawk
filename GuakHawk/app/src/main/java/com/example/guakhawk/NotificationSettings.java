package com.example.guakhawk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class NotificationSettings extends AppCompatActivity {

    ImageButton back_to_acct_settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_settings);

        back_to_acct_settings = findViewById(R.id.button_back_acct_settings);

        back_to_acct_settings.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(NotificationSettings.this, AccountSettings.class);
                        startActivity(i);
                    }
                }
        );

    }

}