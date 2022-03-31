package com.example.guakhawk;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayUsernameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_username);

        //get the intent that started this activity and extract the string
        Intent intent = getIntent();
        String username = intent.getStringExtra(LoginPageActivity.EXTRA_MESSAGE);

        //Capture the layout's Text View and set the string as its text
        TextView textView = (TextView)findViewById(R.id.textView3);
        textView.setText(username);
    }
}
