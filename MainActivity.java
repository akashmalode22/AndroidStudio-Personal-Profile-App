package com.example.uibasedprofile;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView emailImage;
    ImageView githubImage;
    ImageView linkedinImage;
    ImageView ucdImage;
    Button resumeButton;
    Button clubsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailImage = (ImageView) findViewById(R.id.emailPicture);
        githubImage = (ImageView) findViewById(R.id.githubPicture);
        linkedinImage = (ImageView) findViewById(R.id.linkedinPicture);
        ucdImage = (ImageView) findViewById(R.id.ucdImage);
        resumeButton = (Button) findViewById(R.id.resumeButton);
        clubsButton = (Button) findViewById(R.id.clubsButton);

        emailImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("plain/text");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"aamalode@ucdavis.edu"});
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Sent from your app!");
                startActivity(emailIntent);
            }
        });

        githubImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri githubURL = Uri.parse("https://github.com/akashmalode22");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, githubURL);
                startActivity(launchBrowser);
            }
        });

        linkedinImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri linkedinURL = Uri.parse("https://www.linkedin.com/in/akashmalode/");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, linkedinURL);
                startActivity(launchBrowser);
            }
        });

        ucdImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri ucdURL = Uri.parse("https://www.ucdavis.edu/");
                Intent launchBrowser = new Intent (Intent.ACTION_VIEW, ucdURL);
                startActivity(launchBrowser);
            }
        });

        resumeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri resumeURL = Uri.parse("https://drive.google.com/file/d/1LZhuf0W6a505HxVwAYpYwjVufgVcKIxf/view?usp=sharing");
                Intent launchBrowser = new Intent (Intent.ACTION_VIEW, resumeURL);
                startActivity(launchBrowser);
            }
        });

        clubsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToClubsActivity = new Intent(getApplicationContext(), clubsActivity.class);
                startActivity(goToClubsActivity);
            }
        });

    }
}
