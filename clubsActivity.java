package com.example.uibasedprofile;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class clubsActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private slideAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        adapter = new slideAdapter(this);
        viewPager.setAdapter(adapter);
    }


}
