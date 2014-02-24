package com.cbs.corona;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by aditya on 2/5/14.
 */
public class VenueFragment extends Fragment{

	
	// Google Map
		View rootView;
		

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
	        this.rootView = inflater.inflate(R.layout.fragment_venue, container, false);
	        getActivity().setTitle("Venue");
	        clickListener();
			return rootView;
		}
		
		public void clickListener(){
			Button b_map = (Button) rootView.findViewById(R.id.button1);
			b_map.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					Intent i = new Intent (getActivity().getApplicationContext(), GoogleMaps.class);
					startActivity(i);
					
				}
			});
		}

}

	
