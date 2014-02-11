package com.cbs.corona;


import com.cbs.corona.lib.StaggeredGridView;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.GridView;

/**
 * Created by aditya on 2/5/14.
 */
public class GalleryFragment extends Fragment{
	
	
	
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_gallery, container, false);
        gridSetup(rootView);
        return rootView;
	}
	
	public void gridSetup(View rootView){
        StaggeredGridView gridView = (StaggeredGridView)rootView.findViewById(R.id.staggered_grid_view);
        gridView.setAdapter(new GalleryAdapter(getActivity()));
        
        gridView.setOnItemClickListener(new OnItemClickListener() {
        	
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                // Sending image id to FullScreenActivity
                Intent i = new Intent (getActivity().getApplicationContext(), FullImageActivity.class);
                // passing array index
                i.putExtra("id", position);
                startActivity(i);
            }
        });


        
    }
}
