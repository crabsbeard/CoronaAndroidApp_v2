package com.cbs.corona;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;



public class GalleryAdapter extends BaseAdapter {
	
	 private Context mContext;
	    public GalleryAdapter(Context c){
	        mContext = c;
	    }

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
	        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
	        imageView.setLayoutParams(new GridView.LayoutParams(200, 200));

	        return imageView;
	    }


	public Integer[] mThumbIds = {
	        R.drawable.a, R.drawable.b,
	        R.drawable.c, R.drawable.d,
	        R.drawable.e, R.drawable.f,
	        R.drawable.i, R.drawable.j,
	        R.drawable.k, R.drawable.l,
	        R.drawable.m, R.drawable.n,
	        R.drawable.o, R.drawable.p,
	        R.drawable.q, R.drawable.r,
	        R.drawable.s, R.drawable.t,

	        };
	        }