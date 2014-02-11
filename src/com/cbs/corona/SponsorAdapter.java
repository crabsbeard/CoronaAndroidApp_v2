package com.cbs.corona;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;



public class SponsorAdapter extends BaseAdapter {
    // Constructor
    private Context mContext;
    public SponsorAdapter(Context c){
        mContext = c;
    }

    public Integer[] mThumbIds = {
            R.drawable.gambhir,
            R.drawable.bake_club_big, R.drawable.lens,
    };
    public Integer[] mDetailIds = {
    		R.string.gambhir_details, R.string.bake_club, R.string.lens
    };
    public String[] mTitleIds = {
    	
    		"Gambhir Opticals", "VR Bake Club", "Lens & Light"
    };

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setLayoutParams(new GridView.LayoutParams(180, 180));
        imageView.setPadding(8, 8, 8, 8);
        return imageView;
    }
}