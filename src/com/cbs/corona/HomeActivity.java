package com.cbs.corona;

import java.util.ArrayList;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;




/**
 * Created by aditya on 2/6/14.
 */
public class HomeActivity extends Activity {

    
        public void onCreate(Bundle savedInstanceState){
                super.onCreate(savedInstanceState);
                setContentView(R.layout.home_activity);
                initFunc();
        }
        
        MainActivity MaObject = new MainActivity();
        NavigationDrawerAdapter nda;
        ListView lv;
        int[] icons = MaObject.icons;
        String[]titles = MaObject.titles;
        ArrayList<Menu> list = new ArrayList<Menu>();
        
        public void createNavList(){
        	for(int i=0;i<icons.length;i++){
        	Menu m = new Menu();
        	m.setIcon(icons[i]);
        	m.setTitle(titles[i]);
        	list.add(m);
        	
        	}
        }
        
        public void listSetup(){
        	
        	nda = new NavigationDrawerAdapter(this, list);
        	lv = (ListView) findViewById(R.id.lv_menu);
        	lv.setAdapter(nda);
        }
        
        public void initFunc(){
        
        	MyLayoutInflater();
            //setSlider();
            //listSetup();
        }
        
        private void setSlider(){
        	/*
        	SlidingMenu menu;
        	menu = new SlidingMenu(this);
        	menu.setMode(SlidingMenu.LEFT);
        	menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        	menu.setFadeDegree(0.5f);
        	menu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
        	menu.setBehindWidth(350);
        	menu.setMenu(R.layout.menu_frame);
        	menu.setShadowWidthRes(R.dimen.shadow_width);
            menu.setShadowDrawable(R.drawable.shadow);
            menu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
        	*/
        	
        }

        private void MyLayoutInflater(){
            Intent intent = getIntent();
            int i = intent.getExtras().getInt("id");
            Fragment fragment = null;
            switch (i)
            {
                case 0:
                    fragment = new AboutFragment();
                    break;
                case 1:
                    fragment = new GalleryFragment();
                    break;
                case 2:
                    fragment = new AssociateFragment();
                    break;
                case 3:
                    fragment = new CouponFragment();
                    break;
                case 4:
                    fragment = new EventFragment();
                    break;
                case 5:
                    fragment = new VenueFragment();
                    break;
                case 6:
                    fragment = new ContactFragment();
                    break;
                case 7:
                    fragment = new DeveloperFragment();
                    break;
                default:
                    break;
            }
            if(fragment!=null){
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.rel_layout, fragment).commit();
            }else{
                Log.e("HomeActivity", "Error in creating view");
            }

        }


}
