package com.thespianartist.cielitoquerido.utils;

import java.util.ArrayList;
import java.util.HashMap;

import android.location.Location;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.thespianartist.cielitoquerido.data.MapPlaces;
import com.thespianartist.cielitoquerido.models.CieloMarker;

public class NearestLocation {
	
	
	
	private  ArrayList<CieloMarker>  cieloMarkers = new ArrayList<CieloMarker>();
	private  HashMap<Float, LatLng>  resultsDistance = new HashMap<Float, LatLng>();
	private  HashMap<LatLng, String> resultsName = new HashMap<LatLng, String>();
	private  Float  distances[];

	public 	static Float distance;
	public 	static String nearestName;
	public 	static Marker nearestMarker;
	
	public LatLng getNearestDistance(Location location){
		
		MapPlaces mapPlaces =  new MapPlaces();
		mapPlaces.getMarkers();
		distances = new Float[mapPlaces.getCielomarkers().size()];
	    cieloMarkers = mapPlaces.getCielomarkers();
	    
		for(int i= 0; i < cieloMarkers.size(); i++){
			
			Float distance;
			CieloMarker cieloMarkerAux= cieloMarkers.get(i);
        	Location locationTo = new Location("punto a medir");
        	
        	locationTo.setLongitude(cieloMarkerAux.getPosition().longitude);
        	locationTo.setLatitude(cieloMarkerAux.getPosition().latitude);
        	distance = location.distanceTo(locationTo);   
        	distances[i]= distance;
        	resultsDistance.put(distance, cieloMarkers.get(i).getPosition());
        	resultsName.put(cieloMarkerAux.getPosition(), cieloMarkerAux.getTitle());
		}

		distances = bubbleSort(distances);
		distance = distances[0];
		nearestName = resultsName.get(resultsDistance.get(distances[0]));
		return resultsDistance.get(distances[0]);
	}
	

	public Float[] bubbleSort(Float[] distances2) {
	      boolean swapped = true;
	      int j = 0;
	      float tmp;
	      while (swapped) {
	            swapped = false;
	            j++;
	            for (int i = 0; i < distances2.length - j; i++) {                                       
	                  if (distances2[i] > distances2[i + 1]) {                          
	                        tmp = distances2[i];
	                        distances2[i] = distances2[i + 1];
	                        distances2[i + 1] = tmp;
	                        swapped = true;
	                  }
	            }                
	      }	      
	      return distances2;
	}
		

}
