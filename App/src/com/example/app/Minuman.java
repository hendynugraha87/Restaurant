package com.example.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Minuman extends Activity implements OnItemClickListener {
	
	String [] jenis_minuman = {"Minuman Dingin", "Minuman Hangat", "Minuman Kaleng"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.minuman);
		
		Bundle g = new Bundle();
		g = getIntent().getExtras();
		final String val = g.getString("meja_yang_dipilih2");
		final String val2 = g.getString("tipe_menu1");
		System.out.println(val + " " + val2);
		
		ListView daftar_minuman = (ListView) findViewById(R.id.listview_minuman);
		daftar_minuman.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, jenis_minuman));
		daftar_minuman.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				if(arg2 == 0){
					Intent minuman_dingin = new Intent(getApplicationContext(), Minuman_Dingin.class);	//buat class dan xml baru untuk minuman_dingin
					Bundle b = new Bundle();
					b.putString("meja_yang_dipilih3", val);
					b.putString("tipe_menu2", val2);
					b.putString("jenis_menu1", jenis_minuman[arg2]);
					minuman_dingin.putExtras(b);
					startActivity(minuman_dingin);														//masuk ke aktivity minuman_dingin
				} else if(arg2 == 1) {
					Intent minuman_hangat = new Intent(getApplicationContext(), Minuman_Hangat.class);	//buat class dan xml baru untuk minuman_hangat
					Bundle b = new Bundle();
					b.putString("meja_yang_dipilih3", val);
					b.putString("tipe_menu2", val2);
					b.putString("jenis_menu1", jenis_minuman[arg2]);
					minuman_hangat.putExtras(b);
					startActivity(minuman_hangat);														//masuk ke aktivity minuman_hangat
				} else if(arg2 == 2){
					Intent minuman_kaleng = new Intent(getApplicationContext(), Minuman_Kaleng.class);	//buat class dan xml baru untuk minuman_kaleng
					Bundle b = new Bundle();
					b.putString("meja_yang_dipilih3", val);
					b.putString("tipe_menu2", val2);
					b.putString("jenis_menu1", jenis_minuman[arg2]);
					minuman_kaleng.putExtras(b);
					startActivity(minuman_kaleng);														//masuk ke aktivity minuman_kaleng
				}
			}
		});
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		new MenuInflater(this).inflate(R.menu.resta_bagus, menu);
		return(super.onCreateOptionsMenu(menu));
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if(item.getItemId() == R.id.home){
			setContentView(R.layout.activity_resta_bagus);
		}
		else if(item.getItemId() == R.id.table_list){
			setContentView(R.layout.daftar_meja_resta);
		}
		else if (item.getItemId() == R.id.exit){
			Runtime.getRuntime().exit(0);
		}
		return(super.onOptionsItemSelected(item));
	}
	
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
	}

}
