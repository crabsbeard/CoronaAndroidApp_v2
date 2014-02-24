package com.cbs.corona;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;


public class DeveloperFragment extends Fragment{
    GridView gv_icon;
    int[] icons = {R.drawable.facebook_link, R.drawable.google_link};
    View rootView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        this.rootView = inflater.inflate(R.layout.fragment_developer, container, false);
        getActivity().setTitle("Developer");
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
        gv_icon.setOnItemClickListener(new OnItemClickListener() {
        	
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                // Sending image id to FullScreenActivity
            	switch (position){
            	case 0:
            	Intent facebook_intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/dev.aditya22"));
            	startActivity(facebook_intent);
            	break;
            	case 1:
            	
            		Intent google_intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://plus.google.com/u/0/110984311381236482216"));
                	startActivity(google_intent);
                	break;
                	
                default:
                	break;
            	}
            }
        });
    
    }

    public void initFont(){

        TextView tv_title = (TextView) rootView.findViewById(R.id.tv_about_dev);
        Typeface changeFont = Typeface.createFromAsset(getActivity().getAssets(), "TRACK.OTF");
        tv_title.setTypeface(changeFont);
        TextView tv_theme = (TextView) rootView.findViewById(R.id.tv_aditya);
        tv_theme.setTypeface(changeFont);


    }
}

