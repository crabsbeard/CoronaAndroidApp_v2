package com.cbs.corona;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;



public class FullImageActivity extends Activity {

	   int position;

	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        // Set title for the ViewPager
	        setTitle("Gallery");
	        // Get the view from view_pager.xml
	        setContentView(R.layout.full_image);

	        // Retrieve data from MainActivity on item click event
	        Intent p = getIntent();
	        position = p.getExtras().getInt("id");

	        GalleryAdapter imageAdapter = new GalleryAdapter(this);
	        List<ImageView> images = new ArrayList<ImageView>();

	        // Retrieve all the images
	        for (int i = 0; i < imageAdapter.getCount(); i++) {
	            ImageView imageView = new ImageView(this);
	            imageView.setImageResource(imageAdapter.mThumbIds[i]);
	            imageView.setScaleType(ImageView.ScaleType.CENTER);
	            images.add(imageView);
	        }

	        // Set the images into ViewPager
	        ImagePagerAdapter pageradapter = new ImagePagerAdapter(images);
	        ViewPager viewpager = (ViewPager) findViewById(R.id.full_image_view);
	        viewpager.setAdapter(pageradapter);
	        // Show images following the position
	        viewpager.setCurrentItem(position);
	    }
	}
