package com.example.uibasedprofile;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class slideAdapter extends PagerAdapter {

    public slideAdapter (Context context) {
        this.context = context;
    }

    Context context;
    LayoutInflater inflater;

    public int[] images = {R.drawable.sssclub, R.drawable.gamedev, R.drawable.dcsc};

    public String[] titles = {"Space and Satellite Systems", "GameDev", "UCD Tutor"};

    public String[] descriptions = {"Active member of the hardware-interfaces subsystem.\nThe club is developing a CubeSat due to launch by NASA upon completion.", "Member of the Game Dev and Arts club.\nCurrently working on an Indie-RPG game.", "Tutor for \"Programming and Problem Solving,\" an introductory course for programming offered at UC Davis, under the UC Davis Computer Science Club.\nAim to help about 70-80 students throughout the quarter."};

    public int[] backgroundcolors = {Color.rgb(191, 105, 0), Color.rgb(110, 138, 95), Color.rgb(97,173,181)};

    public String[] swipes = {"<-- Swipe Left <--", "--> Swipe Right -->"};

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide,container,false);
        LinearLayout layoutslide = (LinearLayout) view.findViewById(R.id.slideLinearLayout);
        TextView swipetext = (TextView) view.findViewById(R.id.slideswipe);
        ImageView imgslide = (ImageView)  view.findViewById(R.id.slideimg);
        TextView txttitle= (TextView) view.findViewById(R.id.slidetext);
        TextView description = (TextView) view.findViewById(R.id.slidedescription);
        if(position == titles.length-1){
            swipetext.setText(swipes[1]);
        }else{
            swipetext.setText(swipes[0]);
        }
        layoutslide.setBackgroundColor(backgroundcolors[position]);
        imgslide.setImageResource(images[position]);
        txttitle.setText(titles[position]);
        description.setText(descriptions[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }




}
