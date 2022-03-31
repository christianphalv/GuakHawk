package com.example.guakhawk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ForgotPasswordActivity extends AppCompatActivity {
    private Button returnToHomeBtn;
    private Button resetPasswordBtn;
    private TextView alertTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        returnToHomeBtn = (Button) findViewById(R.id.returnToMainPage2);
        returnToHomeBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openHomeScreen();
            }
        });
        resetPasswordBtn = (Button) findViewById(R.id.resetPasswordBtn);
        alertTextView = (TextView) findViewById(R.id.AlertTextView);
        resetPasswordBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog.Builder builder = new AlertDialog.Builder(ForgotPasswordActivity.this);
                builder.setCancelable(true);
                builder.setTitle("Reset Password");
                builder.setMessage("Clicking OK will send an email to the specified email account, if an account with that email exists. Click CANCEL if email is incorrect");

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogueInterface, int i){
                        dialogueInterface.cancel();
                    }
                });

                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                        openHomeScreen();
                    }
                });
                builder.show();
            }
        });
    }

    void openHomeScreen(){
        Intent intent = new Intent(this, LoginPageActivity.class);
        startActivity(intent);
    }
}
