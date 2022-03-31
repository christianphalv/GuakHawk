package com.example.guakhawk.ui.createGroupOptions;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.guakhawk.R;

public class CreateGroupOptionsFragment extends Fragment {

    Button sendInvitesButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_create_group_options, container, false);

        TextView textView = view.findViewById(R.id.text_create_group_options);
        textView.setText("This is a create group options fragment");

        sendInvitesButton = view.findViewById(R.id.create_group_options_send_button);
        sendInvitesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_navigation_create_group_options_to_navigation_home);
            }
        });

        Spinner mealsSpinner = (Spinner) view.findViewById(R.id.create_group_options_meals_spinner);
        ArrayAdapter<CharSequence> mealsAdapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.create_group_options_meals_array, android.R.layout.simple_spinner_item);
        mealsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mealsSpinner.setAdapter(mealsAdapter);

        Spinner eventsSpinner = (Spinner) view.findViewById(R.id.create_group_options_events_spinner);
        ArrayAdapter<CharSequence> eventsAdapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.create_group_options_events_array, android.R.layout.simple_spinner_item);
        eventsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        eventsSpinner.setAdapter(eventsAdapter);


        return view;
    }
}