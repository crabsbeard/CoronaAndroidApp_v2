package com.cbs.corona;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class GridAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private ArrayList<Menu> list = new ArrayList<Menu>();
    public GridAdapter(Context context, ArrayList<Menu> list){

        this.context = context;
        this.inflater = LayoutInflater.from(this.context);
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        MyViewHolder myViewHolder;
        if(view==null)
        {
            view = inflater.inflate(R.layout.grid_item_layout,null);
            myViewHolder = new MyViewHolder();
            view.setTag(myViewHolder);
        }else{
            myViewHolder = (MyViewHolder) view.getTag();
        }

        myViewHolder.iv_menu_icon = (ImageView) view.findViewById(R.id.iv_menu_icons);
        myViewHolder.iv_menu_icon.setImageResource(list.get(i).getIcon());

        myViewHolder.tv_menu_title = (TextView) view.findViewById(R.id.tv_title);
        myViewHolder.tv_menu_title.setText(list.get(i).getTitle());

        view.setBackgroundColor(Color.parseColor(list.get(i).getColor()));

        return view;
    }

    public static class MyViewHolder{

        ImageView iv_menu_icon;
        TextView tv_menu_title;
		ImageView iv_nav_item;
		TextView tv_nav_item;
    }
}
