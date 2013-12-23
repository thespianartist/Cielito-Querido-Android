package com.thespianartist.cielitoquerido.adapter;

import java.util.ArrayList;

import com.thespianartist.cielitoquerido.R;
import com.thespianartist.cielitoquerido.rowmenu.ItemMenu;

import android.app.Activity;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class NavigationAdapter extends BaseAdapter{

	private Activity activity;
			ArrayList<ItemMenu> arrayItem;
			
	
	public NavigationAdapter(Activity activity, ArrayList<ItemMenu> listArray){
		super();
		this.activity = activity;
		this.arrayItem = listArray;
		
	}
		
	@Override
	public int getCount() {
		return arrayItem.size();
	}

	@Override
	public Object getItem(int arg0) {
		return arrayItem.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		return arg0;
	}
	
	public static class Fila{
		TextView titulo_item;
		ImageView icono;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		Fila view;
		LayoutInflater inflator = activity.getLayoutInflater();
//		Typeface tf = Typeface.createFromAsset(activity.getAssets(), "BadScript-Regular.ttf");
	
		
		if(convertView == null ){
			view = new Fila();
			ItemMenu item = arrayItem.get(position);
			convertView = inflator.inflate(R.layout.drawer_list_item, null);
			
			//Para el titulo
			
			view.titulo_item = (TextView) convertView.findViewById(R.id.title_item);
//			view.titulo_item.setTypeface(tf);
			view.titulo_item.setText(item.getTitulo());
			
			//Para la imagen
			
			view.icono = (ImageView) convertView.findViewById(R.id.icon);
			view.icono.setImageResource(item.getIcono());
			
			convertView.setTag(view);	
		}else{
			
			view = (Fila) convertView.getTag();
		}
		
		return convertView;
	}
	
	

}
