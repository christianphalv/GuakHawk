package com.example.guakhawk.foodprefandpick;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.guakhawk.HomePage;
import com.example.guakhawk.R;

public class goButton1 extends AppCompatActivity {
    private Button okBtnM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.allsetm);
        okBtnM = (Button) findViewById(R.id.okBtnM);
        okBtnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOkMButton();
            }
        });
    }
    public void openOkMButton(){
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }
}
