package com.example.guakhawk.ui.createGroupOptions;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.guakhawk.Account;
import com.example.guakhawk.HomePage;
import com.example.guakhawk.R;
import com.example.guakhawk.foodprefandpick.PrefAndPick;
import com.example.guakhawk.foodprefandpick.goButton1;
import com.example.guakhawk.ui.createGroup.CreateGroupFragment;

public class CreateGroupOptionsFragment extends AppCompatActivity {

    Button sendInvitesButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_create_group_options);

        sendInvitesButton = findViewById(R.id.create_group_options_send_button);
        sendInvitesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CreateGroupOptionsFragment.this, HomePage.class);
                startActivity(i);
            }
        });

        Spinner mealsSpinner = (Spinner) findViewById(R.id.create_group_options_meals_spinner);
        ArrayAdapter<CharSequence> mealsAdapter = ArrayAdapter.createFromResource(this,
                R.array.create_group_options_meals_array, android.R.layout.simple_spinner_item);
        mealsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mealsSpinner.setAdapter(mealsAdapter);

        Spinner eventsSpinner = (Spinner) findViewById(R.id.create_group_options_events_spinner);
        ArrayAdapter<CharSequence> eventsAdapter = ArrayAdapter.createFromResource(this,
                R.array.create_group_options_events_array, android.R.layout.simple_spinner_item);
        eventsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        eventsSpinner.setAdapter(eventsAdapter);

        DatePicker datePicker = (DatePicker) findViewById(R.id.create_group_options_date_picker);
        datePicker.setCalendarViewShown(false);

    }
}