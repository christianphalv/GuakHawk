package com.example.guakhawk;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class LoginPageActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.loginpage.USERNAME";
    private Button forgotPasswordBtn;
    private Button signUpBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        forgotPasswordBtn = (Button) findViewById(R.id.forgotPasswordBtn);
        signUpBtn = (Button) findViewById(R.id.signUpBtn);
        forgotPasswordBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openForgotPasswordActivity();
            }
        });
        signUpBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openSignUpActivity();
            }
        });
    }

    public void sendUsername(View view){
        Intent intent = new Intent(this, HomePage.class);
        EditText editText = (EditText) findViewById(R.id.username);
        String username = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, username);
        startActivity(intent);
    }

    public void openForgotPasswordActivity(){
        Intent intent = new Intent(this, ForgotPasswordActivity.class);
        startActivity(intent);
    }

    public void openSignUpActivity(){
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }

}