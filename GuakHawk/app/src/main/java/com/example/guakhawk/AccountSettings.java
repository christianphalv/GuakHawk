package com.example.guakhawk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class AccountSettings extends AppCompatActivity {

    ImageButton back;
    Button change_pw;
    Button notif_settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_settings);

        back = findViewById(R.id.button_back_acct_settings);
        change_pw = findViewById(R.id.button_change_pw);
        notif_settings = findViewById(R.id.button_notification_settings);

        back.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(AccountSettings.this, Account.class);
                        startActivity(i);
                    }
                }
        );
        notif_settings.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(AccountSettings.this, NotificationSettings.class);
                        startActivity(i);
                    }
                }
        );
        change_pw.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(AccountSettings.this, ChangePassword.class);
                        startActivity(i);
                    }
                }
        );
    }
}