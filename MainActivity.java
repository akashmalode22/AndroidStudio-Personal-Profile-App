package com.example.uibasedprofile;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Animation uptodown;
    Animation lefttoright;
    Animation righttoleft;
    Animation downtoup;
    Animation uptodowndelay;
    Animation downtoupdelay;
    Animation lefttorightdelay;
    Animation righttoleftdelay;


    ImageView emailImage;
    ImageView githubImage;
    ImageView linkedinImage;
    ImageView ucdImage;
    Button resumeButton;
    Button clubsButton;
    ImageView akashImage;
    TextView name;
    TextView university;
    TextView sophomore;
    TextView major;
    TextView majortext;
    TextView gpa;
    TextView gpatext;
    TextView email;
    TextView github;
    TextView linkedin;
    TextView taptheicons;



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
        akashImage = (ImageView) findViewById(R.id.akashpicture);
        name = (TextView) findViewById(R.id.name);
        university = (TextView) findViewById(R.id.university);
        sophomore = (TextView) findViewById(R.id.sophomore);
        major = (TextView) findViewById(R.id.major);
        majortext = (TextView) findViewById(R.id.majortext);
        gpa = (TextView) findViewById(R.id.gpa);
        gpatext = (TextView) findViewById(R.id.gpatext);
        email = (TextView) findViewById(R.id.email);
        github = (TextView) findViewById(R.id.github);
        linkedin = (TextView) findViewById(R.id.linkedin);
        taptheicons = (TextView) findViewById(R.id.taptheicons);



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
                Intent goToClubsActivity = new Intent(getApplicationContext(), moreaboutmeActicity.class);
                startActivity(goToClubsActivity);
            }
        });



        uptodown = AnimationUtils.loadAnimation(this, R.anim.uptodown);
        lefttoright = AnimationUtils.loadAnimation(this, R.anim.lefttoright);
        righttoleft = AnimationUtils.loadAnimation(this, R.anim.righttoleft);
        downtoup = AnimationUtils.loadAnimation(this, R.anim.downtoup);
        uptodowndelay = AnimationUtils.loadAnimation(this, R.anim.uptodowndelay);
        lefttorightdelay = AnimationUtils.loadAnimation(this, R.anim.lefttorightdelay);
        righttoleftdelay = AnimationUtils.loadAnimation(this, R.anim.righttoleftdelay);
        downtoupdelay = AnimationUtils.loadAnimation(this, R.anim.downtoupdelay);




        akashImage.setAnimation(uptodown);
        name.setAnimation(lefttoright);
        university.setAnimation(righttoleft);
        resumeButton.setAnimation(downtoup);
        ucdImage.setAnimation(uptodown);
        major.setAnimation(lefttoright);
        majortext.setAnimation(righttoleft);
        sophomore.setAnimation(downtoup);
        gpa.setAnimation(lefttoright);
        gpatext.setAnimation(righttoleft);
        emailImage.setAnimation(lefttorightdelay);
        githubImage.setAnimation(lefttorightdelay);
        linkedinImage.setAnimation(lefttorightdelay);
        email.setAnimation(righttoleftdelay);
        github.setAnimation(righttoleftdelay);
        linkedin.setAnimation(righttoleftdelay);
        taptheicons.setAnimation(downtoupdelay);
        clubsButton.setAnimation(uptodowndelay);









    }
}
