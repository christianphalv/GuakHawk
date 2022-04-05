package com.example.guakhawk.foodprefandpick;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.guakhawk.HomePage;
import com.example.guakhawk.R;

public class goButton2 extends AppCompatActivity {
    private Button okBtnR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.allsetr);
        okBtnR = (Button) findViewById(R.id.okBtnR);
        okBtnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOkRButton();
            }
        });
    }
        public void openOkRButton(){
            Intent intent = new Intent(this, HomePage.class);
            startActivity(intent);
    }
}
