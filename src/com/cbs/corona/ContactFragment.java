package com.cbs.corona;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by aditya on 2/5/14.
 */
public class ContactFragment extends Fragment {
	View rootView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        this.rootView = inflater.inflate(R.layout.fragment_contact, container, false);
        getActivity().setTitle("Contact Us");
        return rootView;
    }
}