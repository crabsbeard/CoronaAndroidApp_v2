package com.cbs.corona;

import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;


public class DeveloperFragment extends Fragment{
    GridView gv_icon;
    int[] icons = {R.drawable.facebook_link, R.drawable.google_link};
    View rootView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        this.rootView = inflater.inflate(R.layout.fragment_developer, container, false);
        initFunc();
        return rootView;
    }
    public void initFunc(){
        initFont();
        gridSetup();
    }
    public void gridSetup(){
        gv_icon = (GridView) rootView.findViewById(R.id.gridView_icons);
        gv_icon.setAdapter(new IconAdapter(getActivity()));
    }

    public void initFont(){

        TextView tv_title = (TextView) rootView.findViewById(R.id.tv_about_dev);
        Typeface changeFont = Typeface.createFromAsset(getActivity().getAssets(), "TRACK.OTF");
        tv_title.setTypeface(changeFont);
        TextView tv_theme = (TextView) rootView.findViewById(R.id.tv_aditya);
        tv_theme.setTypeface(changeFont);


    }
}

