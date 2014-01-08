package com.example.app;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MenuActivity extends ListActivity{
	
	AlertDialog alert;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		String [] menu = new String [] {"Biodata Online", "Biodata Offline", "Tambah Karyawan", "Home"};
		
		this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menu));
		
		OperasiInternet intrnt = new OperasiInternet(this);
		if(intrnt.CheckInternetConnection())
		{
			alert = new AlertDialog.Builder(this).create();
			alert.setTitle("Internet Connection");
			alert.setMessage("10");
			alert.show();
			
			new CountDownTimer(10000, 1000) {
				
				@Override
				public void onTick(long millisUntilFinished) {
					// TODO Auto-generated method stub
					alert.setMessage("Your internet connection is already activated.\n\nOk (" + (millisUntilFinished / 1000 - 1) + ")");
					TextView mymessage = (TextView)alert.findViewById(android.R.id.message);
					mymessage.setGravity(Gravity.CENTER);
				}
				
				@Override
				public void onFinish() {
					// TODO Auto-generated method stub
					alert.dismiss();
				}
			}.start();
			
			//Toast.makeText(getApplicationContext(), "Koneksi internet ok", Toast.LENGTH_LONG).show();
		} else {
			Toast.makeText(getApplicationContext(), "Koneksi internet DOWN!!!\nTolong aktifkan koneksi Anda terlebih dahulu", Toast.LENGTH_LONG).show();
		}
		
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int pos, long id)
	{
		super.onListItemClick(l, v, pos, id);
		
		Object obj = this.getListAdapter().getItem(pos);
		String pilihan = obj.toString();
		Intent t = null;
		
		if(pilihan.equalsIgnoreCase("home"))
		{
			finish();
		} else {
			if(pilihan.equalsIgnoreCase("tambah karyawan"))
			{
				t = new Intent(this, IsiBiodata.class);
				//t.putExtra("status", "baru");
			} else if(pilihan.equalsIgnoreCase("biodata online"))
				t = new Intent(this, DaftarBiodataOnline.class);
			 else if(pilihan.equalsIgnoreCase("biodata offline"))
				t = new Intent(this, DaftarBiodataOffline.class);
			startActivity(t);
			}
		}
	}

