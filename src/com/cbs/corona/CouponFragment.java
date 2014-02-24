package com.cbs.corona;

import java.util.ArrayList;

import com.cbs.corona.lib.StaggeredGridView;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

/**
 * Created by aditya on 2/5/14.
 */
public class CouponFragment extends Fragment{
	
	View rootView;
	
	public Integer[] mDetailIds = {
    		R.string.gambhir_coupon, R.string.apsara_coupon
    };
    public String[] mTitleIds = {
    	
    		"Gambhir Opticals", "Apsara Bakers", 
    };
    
    ArrayList<Menu> list = new ArrayList<Menu>();
    StaggeredGridView gv;
    //CouponAdapter ga;
	
	@Override
	  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        this.rootView = inflater.inflate(R.layout.fragment_coupon, container, false);
        getActivity().setTitle("Coupons");
        createList();
        gridSetup();
        return rootView;
	}
	
	  public void createList(){
	        for(int i=0;i< mDetailIds.length;i++)
	        {
	            Menu m = new Menu();
	            m.setDetail(mDetailIds[i]);
	            m.setTitle(mTitleIds[i]);
	            this.list.add(m);
	        }
	    }
	   public void gridSetup(){
	       
	        gv = (StaggeredGridView)rootView.findViewById(R.id.gridView);
	        gv.setAdapter(new CouponAdapter(rootView.getContext(), list));

	    }
	
	  
}
