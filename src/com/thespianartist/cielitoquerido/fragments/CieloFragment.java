package com.thespianartist.cielitoquerido.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.thespianartist.cielitoquerido.R;

public class CieloFragment extends Fragment {
	

     @Override
     public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         
    	 View rootView = inflater.inflate(R.layout.fragment_cielo, container, false);
         return rootView;
     }
     
     @Override
     public void onActivityCreated(Bundle savedInstanceState) {
    	 super.onActivityCreated(savedInstanceState);
    	 TextView textView = (TextView) getActivity().findViewById(R.id.texto_fragmento);
    	 textView.setText("Hola Mundo");
    }
 
}


