package com.thespianartist.cielitoquerido.fragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.thespianartist.cielitoquerido.R;
import com.thespianartist.cielitoquerido.data.MapPlaces;
import com.thespianartist.cielitoquerido.utils.MetersAndKilometers;
import com.thespianartist.cielitoquerido.utils.NearestLocation;

	public class MapFragment extends Fragment implements LocationListener{

		private MapView mapView;
		private GoogleMap map;
		private LatLng	nearestLocationPlace;
		private LocationManager	service;
		private String provider;
		private MapPlaces mapPlaces;
		private Location location;
	
		public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
			
			View v = inflater.inflate(R.layout.map_fragment, container, false);
			
			mapView = (MapView) v.findViewById(R.id.mapview);
			mapView.onCreate(savedInstanceState);
	
			map = mapView.getMap();
			map.getUiSettings().setMyLocationButtonEnabled(true);
			map.getUiSettings().setCompassEnabled(true);
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
				
				map.setOnInfoWindowClickListener(new OnInfoWindowClickListener() {
								
					@Override
					public void onInfoWindowClick(final Marker arg0) {
					
						 AlertDialog.Builder alertDialog  = new AlertDialog.Builder(getActivity());
					     alertDialog.setTitle("Ver Alrededores ");
					     alertDialog.setMessage("ÀDesea ver que queda cerca de aqui?");
					        
					     alertDialog.setPositiveButton("Si", new DialogInterface.OnClickListener() {
					            public void onClick(DialogInterface dialog,int which) {
					            	Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("google.streetview:cbll="+
											                    arg0.getPosition().latitude+","+arg0.getPosition().longitude+"&cbp=1,90,,0,1.0&mz=20"));
					            
					            	getActivity().startActivity(i);
					            }
					        });
					 
					        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
					            public void onClick(DialogInterface dialog, int which) {
					            dialog.cancel();
					            }
					        }); 
					 
					        alertDialog.show(); 
					}
					
					
				
					
			    });
				
			}else{
				Toast.makeText(getActivity().getBaseContext(),"Tuvimos un error con tu petici—n, lo sentimos ):", Toast.LENGTH_SHORT).show();
			}
			return v;
		}

		
		@Override
		public void onActivityCreated(Bundle savedInstanceState) {
			super.onActivityCreated(savedInstanceState);
					
			service = (LocationManager) getActivity().getSystemService(Context.LOCATION_SERVICE);
	        boolean enabledGPS = service.isProviderEnabled(LocationManager.GPS_PROVIDER);
	        boolean enabledNW = service.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
	       
	      
	        if (enabledGPS==true){
	        	provider= LocationManager.GPS_PROVIDER;
	        	  location = service.getLastKnownLocation(provider);
			}else if(enabledNW==true){
				provider= LocationManager.NETWORK_PROVIDER;
				  location = service.getLastKnownLocation(provider);
			}else{
				showDialog();
			}
	        onProviderEnabled(provider);
	
	        if (location != null) {
	        		NearestLocation nearestLocation = new NearestLocation();
	        		nearestLocationPlace= nearestLocation.getNearestDistance(location);
	      
	        		setNearestLocationPlace(nearestLocationPlace);
	        		final Dialog dialog = new Dialog(getActivity());
	        		dialog.setContentView(R.layout.found_layout);
	        		dialog.setTitle("Lo mas cercano es :");
	            
	        		TextView sucursalTitulo = (TextView) dialog.findViewById(R.id.sucursal_titulo);
	        		TextView sucursalDistancia = (TextView) dialog.findViewById(R.id.sucursal_distancia);
	        		Button   sucursalButtonOK = (Button) dialog.findViewById(R.id.surcursal_button);
	            
	        		Typeface tf = Typeface.createFromAsset(getActivity().getAssets(), "Pacifico.ttf");
	        		sucursalTitulo.setTypeface(tf);
	        		MetersAndKilometers realDistance= new MetersAndKilometers(NearestLocation.distance);
	        		 
	        		sucursalTitulo.setText(NearestLocation.nearestName);
	        		sucursalDistancia.setText(realDistance.getFormat());
	        		dialog.show(); 
	            
	        		sucursalButtonOK.setOnClickListener(new OnClickListener() {
	        			@Override
						public void onClick(View arg0) {
	        				dialog.cancel();
	        			}
	        		});
	        		
	  
	        }else {
	        		Toast.makeText(getActivity().getBaseContext(), "Lo sentimos, No pudimos obtener tu localizacion ):",Toast.LENGTH_SHORT).show();
	        		Toast.makeText(getActivity().getBaseContext(), "Aun asi puedes ver todas las sucursales en el Mapa",Toast.LENGTH_LONG).show();
	        }

	        if(nearestLocationPlace!=null ){
	        		CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(nearestLocationPlace,15);
	        		map.animateCamera(cameraUpdate);
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
			 if(nearestLocationPlace!=null ){
	        		CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(nearestLocationPlace,15);
	        		map.animateCamera(cameraUpdate);
	        }
			
		}
		
		@Override
		public void onPause() {
			super.onPause();
			mapView.onPause();
		}
		

		@Override
		public void onDetach() {
			super.onDetach();
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
		
		public void showDialog(){
		    AlertDialog.Builder alertDialog  = new AlertDialog.Builder(getActivity());
	        alertDialog.setTitle("Requerimos de su localizacion la cual esta deshabilitada");
	        alertDialog.setMessage("ÀDesea ir a los ajustes para Habilitarlo?");
	        
	        alertDialog.setPositiveButton("Ir a Ajustes :D", new DialogInterface.OnClickListener() {
	            public void onClick(DialogInterface dialog,int which) {
	            	startActivity(new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS));
	            }
	        });
	 
	        alertDialog.setNegativeButton("No, Gracias ):", new DialogInterface.OnClickListener() {
	            public void onClick(DialogInterface dialog, int which) {
	            dialog.cancel();
	            }
	        }); 
	 
	        alertDialog.show(); 
		}
		
		public LatLng getNearestLocationPlace() {
			return nearestLocationPlace;
		}


		public void setNearestLocationPlace(LatLng nearestLocationPlace) {
			this.nearestLocationPlace = nearestLocationPlace;
		}


		@Override
		public void onSaveInstanceState(Bundle outState) {
			super.onSaveInstanceState(outState);
			
		}



		

 }

