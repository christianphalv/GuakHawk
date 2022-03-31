package com.example.guakhawk.ui.createGroup;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.guakhawk.R;


public class CreateGroupFragment extends Fragment {

    Button gotoCreateGroupOptionsButton;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_create_group, container, false);

        TextView textView = view.findViewById(R.id.text_create_group);
        textView.setText("This is a create group fragment");

        gotoCreateGroupOptionsButton = view.findViewById(R.id.create_group_next_botton);
        gotoCreateGroupOptionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_navigation_create_group_to_navigation_create_group_options);
            }
        });

        return view;
    }
}