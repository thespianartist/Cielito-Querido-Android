package com.thespianartist.cielitoquerido.adapters;

import java.util.ArrayList;

import android.app.Activity;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.thespianartist.cielitoquerido.R;
import com.thespianartist.cielitoquerido.models.ItemMenu;

public class NavigationAdapter extends BaseAdapter{

	private Activity activity;
	private	ArrayList<ItemMenu> arrayItem;
			
	
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
	
	public static class Holder{
		TextView titulo_item;
		ImageView icono;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		Holder holder;
		LayoutInflater inflator = activity.getLayoutInflater();
		Typeface tf = Typeface.createFromAsset(activity.getAssets(), "Pacifico.ttf");
	
		
		if(convertView == null ){
			holder = new Holder();
			ItemMenu item = arrayItem.get(position);
			convertView = inflator.inflate(R.layout.drawer_list_item, null);
			
			//Para el titulo
			
			holder.titulo_item = (TextView) convertView.findViewById(R.id.title_item);
			holder.titulo_item.setTypeface(tf);
			holder.titulo_item.setText(item.getTitulo());
			
			//Para la imagen
			
			holder.icono = (ImageView) convertView.findViewById(R.id.icon);
			holder.icono.setImageResource(item.getIcono());
			convertView.setTag(holder);	
			
		}else{
			holder = (Holder) convertView.getTag();
		}
		return convertView;
	}
	
	

}
