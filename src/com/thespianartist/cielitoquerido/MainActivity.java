package com.thespianartist.cielitoquerido;

import java.util.ArrayList;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.thespianartist.cielitoquerido.adapter.NavigationAdapter;
import com.thespianartist.cielitoquerido.rowmenu.ItemMenu;


public class MainActivity extends FragmentActivity  implements LocationListener{
	

	private DrawerLayout	drawerLayout;
    private ListView	drawerList;
    private ActionBarDrawerToggle drawerToggle;
    private String[]	options;
    private TypedArray	iconos;
    private ArrayList<ItemMenu> itemsMenu;
    private NavigationAdapter	navigationAdapter;
    private LocationManager	locationManager;
	static  LatLng	actualLocation;
	private GoogleMap	map;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		drawerList   = (ListView) findViewById(R.id.left_drawer);
		
		final String close = getResources().getString(R.string.drawer_close);
		final String open = getResources().getString(R.string.drawer_open);
	    
		getActionBar().setTitle(Html.fromHtml("<font color=\"#FFFFFF\">" + close + "</font>"));
		View header = getLayoutInflater().inflate(R.layout.header, null);
		drawerList.addHeaderView(header);
	    
	    iconos = getResources().obtainTypedArray(R.array.navigation_iconos);
		options = getResources().getStringArray(R.array.options);
		itemsMenu = new ArrayList<ItemMenu>();
       
        itemsMenu.add(new ItemMenu(options[0], iconos.getResourceId(0, -1)));
        itemsMenu.add(new ItemMenu(options[1], iconos.getResourceId(1, -1)));
        itemsMenu.add(new ItemMenu(options[2], iconos.getResourceId(2, -1)));
        itemsMenu.add(new ItemMenu(options[3], iconos.getResourceId(3, -1)));

        navigationAdapter = new NavigationAdapter(this, itemsMenu);
        drawerList.setAdapter(navigationAdapter);
	 
	    drawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.drawable.ic_drawer,R.string.drawer_open,R.string.drawer_close){
	        	
				     public void onDrawerClosed(View view) {
				    	 getActionBar().setTitle(Html.fromHtml("<font color=\"#FFFFFF\">" + close + "</font>"));
				                invalidateOptionsMenu(); 
				     }
				     
				     public void onDrawerOpened(View drawerView) {
				    	 getActionBar().setTitle(Html.fromHtml("<font color=\"#FFFFFF\">" + open + "</font>"));
				                invalidateOptionsMenu(); 
				     }
	     };
	     drawerLayout.setDrawerListener(drawerToggle);
	     
	     getActionBar().setDisplayHomeAsUpEnabled(true);
	     getActionBar().setHomeButtonEnabled(true);
	     
	     locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);	     
//	     locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);
	     locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, this);
    
	     Toast.makeText(MainActivity.this, "Toque la sucursal para ver Detalles", Toast.LENGTH_LONG).show();
	
	}
	    
		
		 
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		drawerToggle.onConfigurationChanged(newConfig);
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		drawerToggle.syncState();
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if(drawerToggle.onOptionsItemSelected(item)){
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onLocationChanged(Location location) {
		actualLocation= new LatLng(location.getLatitude(),location.getLongitude());
		
		  map = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
		    if (map!=null){
		    map.getUiSettings().setZoomControlsEnabled(false); 
		    Marker kiel = map.addMarker(new MarkerOptions()
		          .position(actualLocation)
		          .title("Mi Location")
		          .snippet("it works!!")
		          .icon(BitmapDescriptorFactory
		          .fromResource(R.drawable.ic_launcher)));
		  }
	
	}

	@Override
	public void onProviderDisabled(String provider) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onProviderEnabled(String provider) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {
		// TODO Auto-generated method stub
		
	}


}

	
	
