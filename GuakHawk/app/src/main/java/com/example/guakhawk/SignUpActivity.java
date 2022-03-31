package com.example.guakhawk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {
    private Button returnToHomeBtn;
    private Button createAccountBtn;
    private TextView createAccountText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        returnToHomeBtn = (Button) findViewById(R.id.returnToMainPage1);
        returnToHomeBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openHomeScreen();
            }
        });

        createAccountText = (TextView) findViewById(R.id.CreateAccountAlert);
        createAccountBtn = (Button) findViewById(R.id.createAccountBtn);
        createAccountBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                AlertDialog.Builder builder = new AlertDialog.Builder(SignUpActivity.this);

                builder.setCancelable(true);
                builder.setTitle("Finish Creating Account?");
                builder.setMessage("Make sure all fields are correctly filled out, click cancel to continue to edit. Click OK if everything is correct.");

                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i){
                        dialogInterface.cancel();
                    }
                });

                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i){
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
