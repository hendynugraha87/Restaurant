package com.example.android_google_map;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends MapActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		MapView mapView = (MapView)findviewbyid(R.id.mapView);
		
		double lat = -7.782939;
		double lon = 110.5000000006;
		
		GeoPoint point = new GeoPoint((int)(lat*1E6),(int)(lon*1E6));
		mapView.getController().animateTo(point);
		mapView.getController().setZoom(15);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
