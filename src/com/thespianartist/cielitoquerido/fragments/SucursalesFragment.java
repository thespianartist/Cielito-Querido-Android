package com.thespianartist.cielitoquerido.fragments;

import com.thespianartist.cielitoquerido.R;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SucursalesFragment extends Fragment {
	
	private WebView web_view;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.sucursales_fragment, null);
		web_view = (WebView) view.findViewById(R.id.sucursal_web);
		return view;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		web_view.loadUrl("http://cielitoquerido.com.mx/sucursales/");
		web_view.setWebViewClient(new WebViewClient(){
			@Override
		    public boolean shouldOverrideUrlLoading(WebView view, String url) {
		        view.loadUrl(url);
		        return true;
		    }			
		});
		
	    ActionBar actionBar = getActivity().getActionBar();
	    actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
	}
	


}


