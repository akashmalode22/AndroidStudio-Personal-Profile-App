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

public class slideAdapter2 extends PagerAdapter {

    public slideAdapter2 (Context context) {
        this.context = context;
    }

    Context context;
    LayoutInflater inflater;

    public int[] images = {R.drawable.ic_android_green_24dp, R.drawable.unity, R.drawable.ic_ai_24dp};

    public String[] titles = {"Personal App", "Game Development", "Artificial Intelligence"};

    public String[] descriptions = {"Made this app, to show more information about me, but also to showcase my knowledge in Java, and Android Studio in general.\nThis app uses many aspects such as CardViews, ScrollViews, ColorGradients, ViewPagers, and basic animations.\nThe previous page also includes the first ever Android App I ever made!\n(It's a tip calculator app) ", "Developed 2D games in Unity Engine.\nSince I am into games, this is the first software I self-learned to get better at.\nI have made a full-fledged block-breaking game, top-down laser shooter, and currently working on a 2D RPG.", "Currently started to pick up on basic concepts of Artificial Intelligence (getting an AI to beat games with perfect scores) using Python.\nI plan to further develop and possibly specialize in this field."};

    public int[] backgroundcolors = {Color.rgb(53, 142, 146), Color.rgb(110, 138, 95), Color.rgb(97,173,181)};

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
