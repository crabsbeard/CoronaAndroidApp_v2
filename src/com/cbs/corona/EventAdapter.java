package com.cbs.corona;

import java.util.ArrayList;

import com.cbs.corona.GridAdapter.MyViewHolder;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class EventAdapter extends BaseAdapter {

	
	private Context context;
    private LayoutInflater inflater;
    private ArrayList<Menu> list = new ArrayList<Menu>();
    public EventAdapter(Context context, ArrayList<Menu> list){

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
            view = inflater.inflate(R.layout.event_item,null);
            myViewHolder = new MyViewHolder();
            view.setTag(myViewHolder);
        }else{
            myViewHolder = (MyViewHolder) view.getTag();
        }

        myViewHolder.iv_menu_icon = (ImageView) view.findViewById(R.id.iv_event_icons);
        myViewHolder.iv_menu_icon.setImageResource(list.get(i).getIcon());

        myViewHolder.tv_menu_title = (TextView) view.findViewById(R.id.tv_event_text);
        myViewHolder.tv_menu_title.setText(list.get(i).getTitle());

        view.setBackgroundColor(Color.parseColor(list.get(i).getColor()));

        return view;
    }
}
