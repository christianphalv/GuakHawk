package com.example.guakhawk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ViewPreferences extends AppCompatActivity {

    Button back_to_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_dining_preferences);

        back_to_account = findViewById(R.id.back_to_account);

        back_to_account.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent i = new Intent(ViewPreferences.this, Account.class);
                        startActivity(i);
                    }
                }
        );

    }

}
