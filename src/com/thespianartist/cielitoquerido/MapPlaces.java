package com.thespianartist.cielitoquerido;

import java.util.ArrayList;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.thespianartist.cielitoquerido.models.CieloMarker;

	public class MapPlaces {
	
	private ArrayList<MarkerOptions> markersOptions = new  ArrayList<MarkerOptions>();
	private ArrayList <CieloMarker> cielomarkers = new  ArrayList<CieloMarker>();
	
	public 	MarkerOptions torreMapre; 
	public 	MarkerOptions rioLerma; 
	public  MarkerOptions homero; 
	public 	MarkerOptions lasAmericas;
	public 	MarkerOptions insurgentes;
	
	public 	CieloMarker torreMapre_marker; 
	public 	CieloMarker rioLerma_marker; 
	public  CieloMarker homero_marker; 
	public 	CieloMarker lasAmericas_marker;
	public 	CieloMarker insurgentes_marker;

	
	
	public ArrayList<MarkerOptions> getMarkers(){
			 
		torreMapre = new MarkerOptions();
		torreMapre_marker = new CieloMarker();
		
		torreMapre_marker.setPosition(new LatLng(19.426977, -99.161420));
		torreMapre_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		torreMapre_marker.setTitle("Torre Mapre");
		torreMapre_marker.setSnippet("Avenida Generica");
		
		torreMapre.position(torreMapre_marker.getPosition());
		torreMapre.icon(torreMapre_marker.getIcon());
		torreMapre.title(torreMapre_marker.getTitle());
		torreMapre.snippet(torreMapre_marker.getSnippet());
		
		markersOptions.add(torreMapre);
		cielomarkers.add(torreMapre_marker);
		
		
		rioLerma = new MarkerOptions();
		rioLerma_marker = new CieloMarker();
		
		rioLerma_marker.setPosition(new LatLng(19.433964, -99.142688));
		rioLerma_marker.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.ic_launcher));
		rioLerma_marker.setTitle("Rio Lerma");
		rioLerma_marker.setSnippet("Avenida Generica");
		
		rioLerma.position(rioLerma_marker.getPosition());
		rioLerma.icon(rioLerma_marker.getIcon());
		rioLerma.title(rioLerma_marker.getTitle());
		rioLerma.snippet(rioLerma_marker.getSnippet());
		
		markersOptions.add(rioLerma);
		cielomarkers.add(rioLerma_marker);
		
	
		setCielomarkers(cielomarkers);
		return markersOptions;
			
	}
	
	
	public ArrayList<CieloMarker> getCielomarkers() {
		return cielomarkers;
	}

	public void setCielomarkers(ArrayList<CieloMarker> cielomarkers) {
		this.cielomarkers = cielomarkers;
	}
	
	

	
	

}
