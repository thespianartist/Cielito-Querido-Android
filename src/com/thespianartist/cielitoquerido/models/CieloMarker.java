package com.thespianartist.cielitoquerido.models;

import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.LatLng;

public class CieloMarker {
	
	private LatLng position;
	private	BitmapDescriptor icon;
	private	String title;
	private	String snippet;
	

	public LatLng getPosition() {
		return position;
	}

	public void setPosition(LatLng position) {
		this.position = position;
	}

	public BitmapDescriptor getIcon() {
		return icon;
	}

	public void setIcon(BitmapDescriptor bitmapDescriptor) {
		this.icon = bitmapDescriptor;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSnippet() {
		return snippet;
	}

	public void setSnippet(String snippet) {
		this.snippet = snippet;
	}
	

}
