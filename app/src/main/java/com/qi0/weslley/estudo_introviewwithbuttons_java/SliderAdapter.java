package com.qi0.weslley.estudo_introviewwithbuttons_java;

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

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    public int[] slider_images = {

            R.drawable.group10,
            R.drawable.group11,
            R.drawable.group12
    };

    public String[] slider_heading = {

            "EAT",
            "SLEEP",
            "CODE",
    };

    public String[] slider_desc = {

            "EAT DESC",
            "SLEEP DESC",
            "CODE DESC",
    };

    public int[] slider_background_color = {

            Color.BLACK,
            Color.BLUE,
            Color.RED
    };

    @Override
    public int getCount() {
        return slider_heading.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slider_layout, container,false);

        ImageView sliderImageView = view.findViewById(R.id.sliderImage);
        TextView sliderHeader = view.findViewById(R.id.sliderHeader);
        TextView sliderDesc = view.findViewById(R.id.sliderDesc);

        sliderImageView.setImageResource(slider_images[position]);
        sliderHeader.setText(slider_heading[position]);
        sliderDesc.setText(slider_desc[position]);

        //view.setBackgroundColor(slider_background_color[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
