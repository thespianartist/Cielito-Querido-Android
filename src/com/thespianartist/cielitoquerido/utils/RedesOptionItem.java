package com.thespianartist.cielitoquerido.utils;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import com.thespianartist.cielitoquerido.R;

public class RedesOptionItem{
	
	private  FindSocialClient findSocialClient;
	
		private Context context;

		public RedesOptionItem(Context contextApp){
			this.context = contextApp;
		}
	
		
		public void viewSocialWindow(){
		
		final Dialog dialog = new Dialog(context);
 		dialog.setContentView(R.layout.dialog_social);
        dialog.setTitle("Seleccione Alguna (:");
        ImageButton buttonFacebook = (ImageButton) dialog.findViewById(R.id.facebook_image);
        ImageButton  buttonTwitter = (ImageButton ) dialog.findViewById(R.id.twitter_image);
        dialog.show(); 
        
        findSocialClient = new FindSocialClient();
 	
        buttonFacebook.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				dialog.cancel();
				Intent i = findSocialClient.findFacebookClient(context);
				i = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/138844906133446"));
				context.startActivity(i);
			}
		});
        
        buttonTwitter.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				dialog.cancel();
				Intent i = findSocialClient.findTwitterClient(context);
				i = new Intent(Intent.ACTION_VIEW, Uri.parse("twitter://user?user_id=166581699"));
				context.startActivity(i);
			}
		});

	}


	 
	
}
