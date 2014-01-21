package com.thespianartist.cielitoquerido;

import java.util.ArrayList;

import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.thespianartist.cielitoquerido.adapters.NavigationAdapter;
import com.thespianartist.cielitoquerido.fragments.AboutMeFragment;
import com.thespianartist.cielitoquerido.fragments.MapFragment;
import com.thespianartist.cielitoquerido.fragments.SucursalesFragment;
import com.thespianartist.cielitoquerido.models.ItemMenu;
import com.thespianartist.cielitoquerido.utils.RedesOptionItem;


public class MainActivity extends FragmentActivity {
	
	private DrawerLayout	drawerLayout;
    private ListView	drawerList;
    private ActionBarDrawerToggle	drawerToggle;
    private String[]	options;
    private TypedArray	iconos;
    private ArrayList<ItemMenu>	itemsMenu;
    private NavigationAdapter	navigationAdapter;
	private String	close;
	private View	header;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
     	//Only setup my NavigationDrawer 
		setNavigtionDrawer();
		
		Fragment fragment = new MapFragment();
	    FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.frame_container, fragment).commit();  
     	drawerLayout.closeDrawer(drawerList);
	
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


    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            selectItem(position);
        }
    }
   
    
	private void selectItem(int position) {
	     	Fragment fragment = null;
	     	FragmentManager fragmentManager = getSupportFragmentManager();
	     
	     		switch (position) {
			
	     			case 0:
	     				drawerLayout.closeDrawer(drawerList);
	     			break;
				
	     			case 1:
		                 fragment = new MapFragment();
		                 getActionBar().setTitle(Html.fromHtml("<font color=\"#FFFFFF\">" + "Cerca de ti" + "</font>"));
	     			break;
				
	     			case 2:
	     					fragment = new SucursalesFragment();
	     					getActionBar().setTitle(Html.fromHtml("<font color=\"#FFFFFF\">" + "Sucursales" + "</font>"));
	     			break;
				
	     			case 3:
	     				 RedesOptionItem redesShow = new  RedesOptionItem(MainActivity.this);
	     				 redesShow.viewSocialWindow();
	     				 getActionBar().setTitle(Html.fromHtml("<font color=\"#FFFFFF\">" + "Redes Sociales" + "</font>"));
	     			break;
	     		
	     			case 4:
	     					fragment = new AboutMeFragment();
	     				getActionBar().setTitle(Html.fromHtml("<font color=\"#FFFFFF\">" + "Acerca de" + "</font>"));
	     			break;
	     		
	     			default:
	     					Toast.makeText(this, "Algo salio mal, lo siento ):", Toast.LENGTH_SHORT).show();
	     			break;
	     		}
	     		if (fragment != null) {
	                    fragmentManager = getSupportFragmentManager();    
	                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
	                    fragmentTransaction.replace(R.id.frame_container, fragment);
	                    fragmentTransaction.commit();
	             }
	     		
	     		drawerList.setItemChecked(position, true);
	     		drawerLayout.closeDrawer(drawerList);	     		
		}
	
		public void setNavigtionDrawer(){
			
			drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
			drawerList   = (ListView) findViewById(R.id.left_drawer);
			drawerList.setOnItemClickListener(new DrawerItemClickListener());

			close = getResources().getString(R.string.drawer_close);
			
			
			getActionBar().setTitle(Html.fromHtml("<font color=\"#FFFFFF\">" + close + "</font>"));
			header = getLayoutInflater().inflate(R.layout.header, null);
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
//					    	 getActionBar().setTitle(Html.fromHtml("<font color=\"#FFFFFF\">" + close + "</font>"));
					                invalidateOptionsMenu(); 
					     }
					     
					     public void onDrawerOpened(View drawerView) {
//					    	 getActionBar().setTitle(Html.fromHtml("<font color=\"#FFFFFF\">" + open + "</font>"));
					                invalidateOptionsMenu(); 
					     }
		     };
		     drawerLayout.setDrawerListener(drawerToggle); 
		     getActionBar().setDisplayHomeAsUpEnabled(true);
		     getActionBar().setHomeButtonEnabled(true);   
		}
			
}
	
	
