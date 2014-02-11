package com.cbs.corona;

import java.util.ArrayList;

import com.cbs.corona.GridAdapter.MyViewHolder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class NavigationDrawerAdapter extends BaseAdapter{
	
	private Context context;
    private LayoutInflater inflater;
    private ArrayList<Menu> list = new ArrayList<Menu>();
    public NavigationDrawerAdapter(Context context, ArrayList<Menu> list){

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
	public long getItemId(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int i, View view, ViewGroup viewGroup) {
		 MyViewHolder myViewHolder;
	        
		 if(view==null)
	        {
	            view = inflater.inflate(R.layout.navigation_menu_item,null);
	            myViewHolder = new MyViewHolder();
	            view.setTag(myViewHolder);
	        }else{
	            myViewHolder = (MyViewHolder) view.getTag();
	        }

	        myViewHolder.iv_nav_item = (ImageView) view.findViewById(R.id.iv_nav_item);
	        myViewHolder.iv_nav_item.setImageResource(list.get(i).getIcon());

	        myViewHolder.tv_nav_item = (TextView) view.findViewById(R.id.tv_nav_item);
	        myViewHolder.tv_nav_item.setText(list.get(i).getTitle());

	        return view;
	    }
	}


