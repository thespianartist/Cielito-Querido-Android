package com.thespianartist.cielitoquerido.fragments;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.thespianartist.cielitoquerido.MapPlaces;
import com.thespianartist.cielitoquerido.R;
import com.thespianartist.cielitoquerido.models.CieloMarker;

	public class MapFragment extends Fragment implements LocationListener {

		private MapView mapView;
		private GoogleMap map;
		private LatLng	actualLocation;
		private LocationManager	service;
		private String provider;
		private Float howLong;
		private MapPlaces mapPlaces;
		private CieloMarker  cieloMarker;
		

		public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
			
			View v = inflater.inflate(R.layout.map_fragment, container, false);
			
			mapView = (MapView) v.findViewById(R.id.mapview);
			mapView.onCreate(savedInstanceState);
			
			map = mapView.getMap();
			map.getUiSettings().setMyLocationButtonEnabled(false);
			map.getUiSettings().setCompassEnabled(false);
			map.getUiSettings().setZoomControlsEnabled(false);
			map.setMyLocationEnabled(true);
					
			try {
				MapsInitializer.initialize(this.getActivity());
			}catch (GooglePlayServicesNotAvailableException e) {
				e.printStackTrace();
			}
			
			mapPlaces = new MapPlaces();
			
			if(mapPlaces.getMarkers() != null){
				for(MarkerOptions marker: mapPlaces.getMarkers()){
					map.addMarker(marker);
				}
			}else{
				Toast.makeText(getActivity().getBaseContext(),"No se pudieron agregar los lugares en el mapa", Toast.LENGTH_SHORT).show();
			}
			return v;
		}

		@Override
		public void onActivityCreated(Bundle savedInstanceState) {
			super.onActivityCreated(savedInstanceState);
			
			Location location;
			
			service = (LocationManager) getActivity().getSystemService(Context.LOCATION_SERVICE);
	        boolean enabledGPS = service.isProviderEnabled(LocationManager.GPS_PROVIDER);
	      
	        if (!enabledGPS){
	        	provider= LocationManager.NETWORK_PROVIDER;
			}else{
				provider= LocationManager.GPS_PROVIDER;
			}
	
	        location = service.getLastKnownLocation(provider);
	        
	        if (location != null) {
	        	cieloMarker= new CieloMarker();
	        	Location locationTo = new Location("punto a medir");
	        	
	        	onLocationChanged(location);
	        	cieloMarker = mapPlaces.getCielomarkers().get(0);
	        	
	        	locationTo.setLongitude(cieloMarker.getPosition().longitude);
	        	locationTo.setLatitude(cieloMarker.getPosition().latitude);
	        	
	        	howLong = location.distanceTo(locationTo);
	        	
	        	Toast.makeText(getActivity().getBaseContext(),"distancia en metros"+ howLong.toString(),Toast.LENGTH_SHORT).show();
	          
	        }else {
	        	Toast.makeText(getActivity().getBaseContext(), "No pudimos obtener tu localizacion",Toast.LENGTH_SHORT).show();
	        }
	        
	        if(actualLocation!=null ){
	        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(cieloMarker.getPosition(),16);
			map.animateCamera(cameraUpdate);
	        }else{
	        	Toast.makeText(getActivity().getBaseContext(), "Active los datos o GPS",Toast.LENGTH_SHORT).show();
	        }
		
		}

		@Override
		public void onResume() {
			super.onResume();
			mapView.onResume();
		}
 
		@Override
		public void onDestroy() {
			super.onDestroy();
			mapView.onDestroy();
		}
 
		@Override
		public void onLowMemory() {
			super.onLowMemory();
			mapView.onLowMemory();
		}

		@Override
		public void onLocationChanged(Location location) {
			 double lat =  location.getLatitude();
		     double lng = location.getLongitude();
		     actualLocation= new LatLng(lat, lng);
		}
		
		@Override
		public void onPause() {
			super.onPause();
			mapView.onPause();
			service.removeUpdates(this);
		}


		@Override
		public void onProviderDisabled(String arg0) {
		
			
		}


		@Override
		public void onProviderEnabled(String arg0) {
			
			
		}


		@Override
		public void onStatusChanged(String arg0, int arg1, Bundle arg2) {
			
			
		}
		
		
 }

