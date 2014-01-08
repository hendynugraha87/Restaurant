package com.example.app;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class Hardware_Status extends TabActivity{

	@SuppressWarnings("deprecation")
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phone_main);
        
        TabHost host = getTabHost();
//        TabHost host = (TabHost)findViewById(R.id.tabHost);
        
        TabSpec statusspec = host.newTabSpec("Phone");
        statusspec.setIndicator("Phone",getResources().getDrawable(R.drawable.nphone));
        Intent phoneStatusIntent = new Intent(this, Phone_Status.class);
        statusspec.setContent(phoneStatusIntent);
        
        TabSpec batteryspec = host.newTabSpec("Battery");
        batteryspec.setIndicator("Battery", getResources().getDrawable(R.drawable.nbattery));
        Intent batteryIntent = new Intent(this, Battery_Status.class);
        batteryspec.setContent(batteryIntent);
        
        // Adding all TabSpec to TabHost
        host.addTab(statusspec); 
        host.addTab(batteryspec);
	
	}
}
