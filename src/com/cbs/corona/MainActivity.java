package com.cbs.corona;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

import java.util.ArrayList;

public class MainActivity extends Activity {

    GridView gv;
    int[] icons = {R.drawable.ic_about,R.drawable.ic_gallery,R.drawable.ic_associates,R.drawable.ic_coupons, R.drawable.ic_events, R.drawable.ic_venue, R.drawable.ic_contact, R.drawable.ic_dev};
    String[] titles = {"About us","Gallery","Associates","Coupons", "Events", "Venue", "Contact us", "About Developer"};
    String[] bgColor = {"#2ecc71", "#3498db","#9b59b6", "#34495e", "#16a085", "#e74c3c", "#2980b9", "#34495e"};
    ArrayList<Menu> list = new ArrayList<Menu>();

    GridAdapter ga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Corona-The Carnival");
        setContentView(R.layout.activity_main);
        initFunc();
    }

    public void initFunc(){
        initFonts();
        createList();
        gridSetup();
        hideScroll();
        clickListener();
    }
    public void clickListener(){

        gv.setOnItemClickListener(new OnItemClickListener(){

            public void onItemClick(AdapterView<?> parent, View v, int position, long id ){
            	
            	if(position==3){
            		v.setEnabled(false);
            	}
            	else{
                Intent i = new Intent(getApplicationContext(), HomeActivity.class);
                i.putExtra("id", position);
                startActivity(i);
            	}
            }
        });

   }

    public void gridSetup(){
        ga = new GridAdapter(this,list);
        gv = (GridView) findViewById(R.id.gridView);
        gv.setAdapter(ga);

    }

    public void initFonts(){

        TextView tv_title_corona = (TextView) findViewById(R.id.tv_title_corona);
        Typeface changeFont = Typeface.createFromAsset(getAssets(), "TRACK.OTF");
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
