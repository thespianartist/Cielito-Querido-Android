package com.thespianartist.cielitoquerido.utils;

import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;

public class FindSocialClient{

		public Intent findFacebookClient(Context c){
				final String[] facebookApps = {
												"com.facebook.android", 
												"com.facebook.katana"	};
				
				Intent facebookIntent = new Intent();
				facebookIntent.setType("text/plain");
				final PackageManager packageManager = c.getPackageManager();
				List<ResolveInfo> list = packageManager.queryIntentActivities(
			    facebookIntent, PackageManager.MATCH_DEFAULT_ONLY);
				
				for (int i = 0; i < facebookApps.length; i++) {
					for (ResolveInfo resolveInfo : list) {
						String p = resolveInfo.activityInfo.packageName;
						if (p != null && p.startsWith(facebookApps[i])) {
							facebookIntent.setPackage(p);
				 return facebookIntent;
						}
					}
				}
				return null;
			}
		
		
		public Intent findTwitterClient(Context c) {
			
			 final String[] twitterApps = {
											 "com.twitter.android",
											 "com.twidroid", 
											 "com.handmark.tweetcaster", 
											 "com.thedeck.android" };
				
				Intent tweetIntent = new Intent();
				tweetIntent.setType("text/plain");
				final PackageManager packageManager = c.getPackageManager();
				List<ResolveInfo> list = packageManager.queryIntentActivities(
						tweetIntent, PackageManager.MATCH_DEFAULT_ONLY);
				for (int i = 0; i < twitterApps.length; i++) {
					for (ResolveInfo resolveInfo : list) {
						String p = resolveInfo.activityInfo.packageName;
						if (p != null && p.startsWith(twitterApps[i])) {
							tweetIntent.setPackage(p);
							return tweetIntent;
						}
					}
				}
				return null;
			}
 
}
