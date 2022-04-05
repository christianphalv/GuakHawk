package com.example.guakhawk.ui.createGroup;

import android.content.Intent;
import android.os.Bundle;

//import androidx.appcompat.widget.SearchView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.SearchView;

import com.example.guakhawk.Account;
import com.example.guakhawk.Friends;
import com.example.guakhawk.HomePage;
import com.example.guakhawk.R;
import com.example.guakhawk.ui.createGroupOptions.CreateGroupOptionsFragment;

import java.util.ArrayList;
import java.util.List;


public class CreateGroupFragment extends AppCompatActivity {

    Button gotoCreateGroupOptionsButton;
    ImageButton gotoHome;
    ImageButton gotoCreateGroup;
    ImageButton gotoFriends;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_create_group);

        gotoHome = findViewById(R.id.create_group_button_home_page);
        gotoCreateGroup = findViewById(R.id.create_group_button_new_group);
        gotoFriends = findViewById(R.id.create_group_button_friends_page);

        gotoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CreateGroupFragment.this, HomePage.class);
                startActivity(i);
            }
        });

        gotoCreateGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CreateGroupFragment.this, CreateGroupFragment.class);
                startActivity(i);
            }
        });

        gotoFriends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CreateGroupFragment.this, Friends.class);
                startActivity(i);
            }
        });

        gotoCreateGroupOptionsButton = findViewById(R.id.create_group_next_botton);
        gotoCreateGroupOptionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CreateGroupFragment.this, CreateGroupOptionsFragment.class);
                startActivity(i);
            }
        });

        List<String> inviteesList = new ArrayList<>();
        ArrayAdapter<String> inviteesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, inviteesList);
        ListView inviteesListView = findViewById(R.id.create_group_invitees_list);



        List<String> friendsList = new ArrayList<>();
        friendsList.add("Anushka Angamuthu");
        friendsList.add("Calvin Hoffmann");
        friendsList.add("Christian Halvorson");
        friendsList.add("Conor Hogan");
        friendsList.add("Jonathan Amos");
        friendsList.add("Maryam Masood");
        ArrayAdapter<String> friendsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, friendsList);
        SearchView friendsSearch = findViewById(R.id.create_group_friends_search);
        ListView friendsListView = findViewById(R.id.create_group_friends_list);

        List<String> emptyList = new ArrayList<>();
        ArrayAdapter<String> emptyAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, emptyList);

        inviteesListView.setAdapter(emptyAdapter);
        friendsListView.setAdapter(friendsAdapter);

        friendsSearch.setIconified(false);

        friendsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String invited = (String) adapterView.getItemAtPosition(i);
                inviteesList.add(invited);
            }
        });

        friendsSearch.setOnSearchClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inviteesListView.setAdapter(emptyAdapter);
                friendsListView.setAdapter(friendsAdapter);
            }
        });

        friendsSearch.setOnCloseListener(new SearchView.OnCloseListener() {
            @Override
            public boolean onClose() {
                inviteesListView.setAdapter(inviteesAdapter);
                friendsListView.setAdapter(emptyAdapter);
                return false;
            }
        });

        friendsSearch.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if (friendsList.contains(query)) {
                    friendsAdapter.getFilter().filter(query);
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                friendsAdapter.getFilter().filter(newText);
                return false;
            }
        });
    }
}