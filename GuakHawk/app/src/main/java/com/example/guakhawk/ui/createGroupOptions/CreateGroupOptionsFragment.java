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
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.guakhawk.Account;
import com.example.guakhawk.Friends;
import com.example.guakhawk.HomePage;
import com.example.guakhawk.R;
import com.example.guakhawk.foodprefandpick.PrefAndPick;
import com.example.guakhawk.foodprefandpick.goButton1;
import com.example.guakhawk.ui.createGroup.CreateGroupFragment;

public class CreateGroupOptionsFragment extends AppCompatActivity {

    Button sendInvitesButton;
    ImageButton gotoHome;
    ImageButton gotoCreateGroup;
    ImageButton gotoFriends;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_create_group_options);

        gotoHome = findViewById(R.id.create_group_options_button_home_page);
        gotoCreateGroup = findViewById(R.id.create_group_options_button_new_group);
        gotoFriends = findViewById(R.id.create_group_options_button_friends_page);

        gotoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CreateGroupOptionsFragment.this, HomePage.class);
                startActivity(i);
            }
        });

        gotoCreateGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CreateGroupOptionsFragment.this, CreateGroupFragment.class);
                startActivity(i);
            }
        });

        gotoFriends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CreateGroupOptionsFragment.this, Friends.class);
                startActivity(i);
            }
        });

        sendInvitesButton = findViewById(R.id.create_group_options_send_button);
        sendInvitesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CreateGroupOptionsFragment.this, "Invites Sent!", Toast.LENGTH_SHORT).show();
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