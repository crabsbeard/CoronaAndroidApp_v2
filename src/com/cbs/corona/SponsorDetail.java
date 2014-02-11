package com.cbs.corona;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SponsorDetail extends Activity{
	//Context mContext;
	//int[] image_holder = {R.drawable.gambhir, R.drawable.bake_club_big, R.drawable.lens};
	
	//String[] title_holder = {"Gambhir Opticals", "VR Bake Club", "Lens & Light"};
	//int[] content_holder = {R.string.gambhir_details, R.string.bake_club, R.string.lens};
	SponsorAdapter s_adapter;
	Intent p;
	int position;
	public void onCreateView(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.detail_sponsor);
		initFunc();
	}

	public void initFunc(){
		
		initVars();
		showDetail();
		
	}
	
	public void initVars(){
		this.s_adapter = new SponsorAdapter(this);
		this.p = getIntent();
	    position = p.getExtras().getInt("id");
	}
	
	public void showDetail(){
		
		ImageView iv_sponsor = (ImageView) findViewById(R.id.iv_sponsor_det);
		TextView tv_title_sponsor = (TextView) findViewById(R.id.tv_title_sponsor);
		TextView tv_sponsor_detail = (TextView) findViewById(R.id.tv_sponsor_detail);
        iv_sponsor.setImageResource(s_adapter.mThumbIds[position]);
        tv_title_sponsor.setText(s_adapter.mTitleIds[position]);
        tv_sponsor_detail.setText(s_adapter.mDetailIds[position]); 
        //iv_sponsor.setImageResource(R.drawable.aditya);
        //tv_title_sponsor.setText(R.id.tv_about_dev);
        //tv_sponsor_detail.setText(R.id.tv_corona_details); 
		
	}
	
}
