package com.cbs.corona;

import android.app.Fragment;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;


/**
 * Created by aditya on 2/4/14.
 */
public class AboutFragment extends Fragment{

    
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_about, container, false);
        getActivity().setTitle("About Corona");
        initFunctions(rootView);
        return rootView;

    }

    public void initFunctions(final View rootView){
       initFonts(rootView);
       hideScroll(rootView);
       setBkgColor(rootView);

    }

     public void initFonts(final View rootView){

        TextView tv_title = (TextView) rootView.findViewById(R.id.tv_about_title);
        Typeface changeFont = Typeface.createFromAsset(getActivity().getAssets(), "TRACK.OTF");
        tv_title.setTypeface(changeFont);
        TextView tv_theme = (TextView) rootView.findViewById(R.id.tv_about_theme);
        tv_theme.setTypeface(changeFont);

    }
    public void hideScroll(final View rootView){

        ScrollView sv_about = (ScrollView) rootView.findViewById(R.id.sv_about);
        sv_about.setVerticalScrollBarEnabled(false);
        sv_about.setHorizontalScrollBarEnabled(false);
    }

    public void setBkgColor(final View rootView){

        TextView tv_title = (TextView) rootView.findViewById(R.id.tv_about_title);
        tv_title.setBackgroundColor(Color.parseColor("#e74c3c"));
        TextView tv_theme = (TextView) rootView.findViewById(R.id.tv_about_theme);
        tv_theme.setBackgroundColor(Color.parseColor("#e74c3c"));

    }


}
