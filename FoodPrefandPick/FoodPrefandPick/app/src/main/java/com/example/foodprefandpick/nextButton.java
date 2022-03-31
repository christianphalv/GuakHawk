package com.example.foodprefandpick;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class nextButton extends AppCompatActivity {
    private Button finishBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sorry);
        finishBtn = (Button) findViewById(R.id.finishBtnS);
        finishBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openFinishButton();
            }
        });
    }
    public void openFinishButton(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
