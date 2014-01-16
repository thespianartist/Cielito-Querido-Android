package com.thespianartist.cielitoquerido.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thespianartist.cielitoquerido.R;

public class AboutMeFragment extends Fragment{
	
	 @Override
     public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         
    	 View rootView = inflater.inflate(R.layout.aboutme_fragment, container, false);
         return rootView;
     }
     

}
