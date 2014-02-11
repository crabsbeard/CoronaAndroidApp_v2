package com.cbs.corona;

import java.util.ArrayList;

import com.cbs.corona.lib.StaggeredGridView;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

/**
 * Created by aditya on 2/5/14.
 */
public class EventFragment extends Fragment{
	
	 StaggeredGridView gv;
	    int[] icons = {R.drawable.star,R.drawable.dj,R.drawable.bob,R.drawable.fash, R.drawable.street, R.drawable.robo, R.drawable.gd, R.drawable.prog, R.drawable.basket, R.drawable.tressure };
	    String[] titles = {"Star Night","DJ Night","Battle of Bands","Fashion Parade", "Street Dance", "Robo Wars", "Group Discussion", "Programming", "Basket Ball", "Quizonomiac"};
	    String[] bgColor = {"#27ae60", "#2980b9", "#27ae60", "#2980b9", "#27ae60", "#2980b9", "#27ae60", "#2980b9","#27ae60", "#2980b9"};
	    ArrayList<Menu> list = new ArrayList<Menu>();

	    EventAdapter ga;
	
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_events, container, false);
        initFunc(rootView);
        return rootView;
	}
    public void initFunc(View rootView){
        //initFonts(rootView);
        createList();
        gridSetup(rootView);
        hideScroll();
        clickListener();
    }
    public void clickListener(){

        gv.setOnItemClickListener(new OnItemClickListener(){

            public void onItemClick(AdapterView<?> parent, View v, int position, long id ){

                Intent i = new Intent(getActivity().getApplicationContext(), HomeActivity.class);
                i.putExtra("id", position);
                startActivity(i);
            }
        });

   }

    public void gridSetup(View rootView){
        ga = new EventAdapter(getActivity().getApplicationContext(),list);
        gv = (StaggeredGridView) rootView.findViewById(R.id.staggered_gv_events);
        gv.setAdapter(ga);

    }

    public void initFonts(View rootView){

        TextView tv_title_corona = (TextView) rootView.findViewById(R.id.tv_title_corona);
        Typeface changeFont = Typeface.createFromAsset(getActivity().getAssets(), "TRACK.OTF");
        tv_title_corona.setTypeface(changeFont);
    }

    public void createList(){
        for(int i=0;i< icons.length;i++)
        {
            Menu m = new Menu();
            m.setIcon(icons[i]);
            m.setColor(bgColor[i]);
            m.setTitle(titles[i]);
            list.add(m);
        }
    }
    public void hideScroll(){


        gv.setVerticalScrollBarEnabled(false);
        gv.setHorizontalScrollBarEnabled(false);
    }


}
