package com.example.uibasedprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class moreaboutmeActicity extends AppCompatActivity {

    CardView meButton;
    CardView educationButton;
    CardView projectsButton;
    CardView clubsButton;
    CardView skillsButton;
    CardView firstappButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moreaboutme);

       meButton = (CardView) findViewById(R.id.meButton);
        educationButton = (CardView) findViewById(R.id.educationButton);
        projectsButton = (CardView) findViewById(R.id.projectsButton);
        clubsButton = (CardView) findViewById(R.id.clubsButton);
        skillsButton = (CardView) findViewById(R.id.skillsButton);
        firstappButton = (CardView) findViewById(R.id.firstappButton);

        meButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveToMeIntent = new Intent(getApplicationContext(), meActivity.class);
                startActivity(moveToMeIntent);
            }
        });

        educationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveToEducationIntent = new Intent(getApplicationContext(), educationActivity.class);
                startActivity(moveToEducationIntent);
            }
        });

        firstappButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveToFirstAppIntent = new Intent(getApplicationContext(), firstappActivity.class);
                startActivity(moveToFirstAppIntent);
            }
        });

        skillsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveToSkillsIntent = new Intent(getApplicationContext(), skillsActivity.class);
                startActivity(moveToSkillsIntent);
            }
        });

        clubsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveToClubsIntent = new Intent(getApplicationContext(), clubsActivity.class);
                startActivity(moveToClubsIntent);
            }
        });

    }
}
