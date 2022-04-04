package com.example.guakhawk;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ChangePassword extends AppCompatActivity {

    Button change_pass;
    ImageButton back_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        change_pass = findViewById(R.id.button_change_pw_confirm);
        back_button = findViewById(R.id.button_back_acct_settings);

        change_pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder pass_changed_alert = new AlertDialog.Builder(ChangePassword.this);
                pass_changed_alert.setTitle("Password Changed!");
                pass_changed_alert.setPositiveButton("DONE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent pass_changed_done = new Intent(ChangePassword.this, AccountSettings.class);
                        startActivity(pass_changed_done);
                    }
                });
                pass_changed_alert.create().show();
            }
        });

        back_button.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(ChangePassword.this, AccountSettings.class);
                        startActivity(i);
                    }
                }
        );
    }


}