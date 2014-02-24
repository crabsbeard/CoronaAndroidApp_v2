package com.cbs.corona;

import com.cbs.corona.lib.StaggeredGridView;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

/**
 * Created by aditya on 2/5/14.
 */
public class AssociateFragment extends Fragment{
	View rootView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        this.rootView = inflater.inflate(R.layout.fragment_associates, container, false);
        getActivity().setTitle("Associates");
        gridSetup();
        return rootView;
    }
    
    public void gridSetup()
    {
    	 StaggeredGridView gridView = (StaggeredGridView)rootView.findViewById(R.id.fragment_grid_view);
         gridView.setAdapter(new SponsorAdapter(getActivity()));

         gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View v,
                                     int position, long id) {

                 
                 Intent i = new Intent (getActivity().getApplicationContext(), SponsorDetail.class);
                 i.putExtra("id", position);
                 startActivity(i);
                 //}
             }
         }); }
    }

