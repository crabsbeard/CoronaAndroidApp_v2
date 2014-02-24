package com.cbs.corona;

import java.util.ArrayList;

import com.cbs.corona.GridAdapter.MyViewHolder;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CouponAdapter extends BaseAdapter{
	
		Context mContext;
	    private Context context;
	    private LayoutInflater inflater;
	    private ArrayList<Menu> list = new ArrayList<Menu>();
	    public CouponAdapter(Context context, ArrayList<Menu> list){

	        this.context = context;
	        this.inflater = LayoutInflater.from(this.context);
	        this.list = list;
	    }
	  
	 

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int i) {
		// TODO Auto-generated method stub
		return list.get(i);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int i, View view, ViewGroup viewGroup) {
		 MyViewHolder myViewHolder;
	        if(view==null)
	        {
	            view = inflater.inflate(R.layout.coupon_item,null);
	            myViewHolder = new MyViewHolder();
	            view.setTag(myViewHolder);
	        }else{
	            myViewHolder = (MyViewHolder) view.getTag();
	        }

	        myViewHolder.tv_nav_item = (TextView) view.findViewById(R.id.coupon_title);
	        myViewHolder.tv_nav_item.setText(list.get(i).getTitle());
	        
	        myViewHolder.tv_menu_title = (TextView) view.findViewById(R.id.coupon_detail);
	        myViewHolder.tv_menu_title.setText(list.get(i).getDetail());
	        return view;
	    }

	    public static class MyViewHolder{

	        ImageView iv_menu_icon;
	        TextView tv_menu_title;
			ImageView iv_nav_item;
			TextView tv_nav_item;
	    }
}