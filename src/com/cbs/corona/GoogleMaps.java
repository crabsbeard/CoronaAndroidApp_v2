package com.cbs.corona;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class GoogleMaps extends Activity {

	// Google Map
	public GoogleMap googleMap;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.maps_google);
		initilizeMap();
	}

		

	/**
	 * function to load map. If map is not created it will create it for you
	 * */
	public void initilizeMap() {
		
		googleMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
		        .getMap();
		LatLng BPIT = new LatLng(28.737323,77.112152);
		Marker hamburg = googleMap.addMarker(new MarkerOptions().position(BPIT)
		        .title("Bhagwan Parshuram Institute of Technology"));
		CameraPosition cameraPosition = new CameraPosition.Builder()
			.target(BPIT)
			.zoom(14)
			.build();
		googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
		
	}
}