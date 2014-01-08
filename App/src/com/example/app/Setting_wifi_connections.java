package com.example.app;

import java.util.List;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class Setting_wifi_connections extends Activity{

	TextView txt;
	WifiManager wifi_mgr;
	WifiReceiver wifi_rcvr;
	List<ScanResult> wifi_list;
	StringBuilder sb = new StringBuilder();
	AlertDialog alert;
	
	public void onCreate(Bundle savedInstanceState) {
        
	   super.onCreate(savedInstanceState);
	   setContentView(R.layout.setting_wifi_connections);    
	   
	   txt = (TextView)findViewById(R.id.text_wifi);
	   
	   // initiate wifi service manager
	   wifi_mgr = (WifiManager)getSystemService(Context.WIFI_SERVICE);
	   
	   // check for wifi is disabled
	   if(wifi_mgr.isWifiEnabled() == false){
		   
		   // showing alert dialog for user
		   alert = new AlertDialog.Builder(this).create();
		   alert.setTitle("Setting Wifi");
		   alert.setMessage("00:10");
		   alert.show();
		   
		   // setting timer for 10 seconds then wifi will be enable by the system
		   new CountDownTimer(10000, 1000) {
			
			@Override
			public void onTick(long millisUntilFinished) {
				// TODO Auto-generated method stub
				alert.setMessage("System will enable your Wifi connection.\n\nOk (" + (millisUntilFinished / 1000 - 1) + ")");
				TextView mymessage = (TextView)alert.findViewById(android.R.id.message);
				mymessage.setGravity(Gravity.CENTER);
			}
			
			@Override
			public void onFinish() {
				// TODO Auto-generated method stub
				alert.dismiss();
			}
		}.start();
		   
		// setting Wifi to enable
		   wifi_mgr.setWifiEnabled(true);
	   }
	   
	   wifi_rcvr = new WifiReceiver();
	   
	   registerReceiver(wifi_rcvr, new IntentFilter(WifiManager.SCAN_RESULTS_AVAILABLE_ACTION));
	   wifi_mgr.startScan();
	   txt.setText("Starting to scan for Wifi connections on your area");
	}
	
	public boolean onCreateOptionsMenu(Menu menu)
	{
		menu.add(0,1,0,"Refresh").setIcon(R.drawable.device_access_network_wifi);
//		Drawable menu_icon = getResources().getDrawable(R.drawable.device_access_network_wifi);
//		menu.getItem(0).setIcon(menu_icon);
		return super.onCreateOptionsMenu(menu);
	}
	
	public boolean onMenuItemSelected(int featuredId, MenuItem item){
		wifi_mgr.startScan();
		txt.setText("Starting to scan...");
		return super.onMenuItemSelected(featuredId, item);
	}
	
	protected void onPause()
	{
		unregisterReceiver(wifi_rcvr);
		super.onPause();
	}
	
	protected void onResume() 
	{
		registerReceiver(wifi_rcvr, new IntentFilter(WifiManager.SCAN_RESULTS_AVAILABLE_ACTION));
		super.onResume();
	}
	
	class WifiReceiver extends BroadcastReceiver {

		@Override
		public void onReceive(Context context, Intent intent) {
			// TODO Auto-generated method stub
			sb = new StringBuilder();
			wifi_list = wifi_mgr.getScanResults();
			sb.append("\n		number of wifi connections : " + wifi_list.size() + "\n\n");
			
			for(int i=0; i<wifi_list.size(); i++){
				sb.append(new Integer(i + 1).toString() + ". ");
				sb.append((wifi_list.get(i)).toString());
				sb.append("\n\n");
			}
			txt.setText(sb);
		}
		
	}
}


