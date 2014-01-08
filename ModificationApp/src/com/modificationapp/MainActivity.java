package com.modificationapp;

import android.os.Bundle;
import android.app.Activity;
import android.app.ActionBar;
import android.app.AlertDialog;
import android.content.res.Configuration;
//import android.app.Fragment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;


public class MainActivity extends FragmentActivity {
	
	final String[] data = {"Meja 01","Meja 02","Meja 03","Meja 04","Meja 05","Meja 06","Meja 07","Meja 08","Meja 09","Meja 10"};
	final String[] fragment = {"com.modificationapp.AFragmentTab", "com.modificationapp.BFragmentTab", "com.modificationapp.CFragmentTab"};
	private ActionBarDrawerToggle drawertoggle = null;
	private int selection = 0;
	private int old_selection = -1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// array adapter yang berfungsi membaca array string[] data untuk dimasukkan ke dalam listview 
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActionBar().getThemedContext(), android.R.layout.simple_list_item_1, data);
		final DrawerLayout drawer = (DrawerLayout)findViewById(R.id.drawer_layout);
		final ListView list = (ListView)findViewById(R.id.listview_drawer);
		
		// memasukkan data ke dalam listview
		list.setAdapter(adapter);
		drawertoggle = new ActionBarDrawerToggle(this, drawer, R.drawable.ic_drawer, R.string.open, R.string.close);
		drawer.setDrawerListener(drawertoggle);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		getActionBar().setHomeButtonEnabled(true);
		updateContent();
		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, final int pos, long arg3) {
				// TODO Auto-generated method stub
				drawer.setDrawerListener(new DrawerLayout.SimpleDrawerListener() {
					@Override
					public void onDrawerClosed(View drawerView){
						super.onDrawerClosed(drawerView);
						FragmentTransaction tx = getSupportFragmentManager().beginTransaction();
						tx.replace(R.id.main, Fragment.instantiate(MainActivity.this, fragment[pos]));
						tx.commit();
					}
				});
				drawer.closeDrawer(list);
			}
		});
		FragmentTransaction tx = getSupportFragmentManager().beginTransaction();
		tx.replace(R.id.main, Fragment.instantiate(MainActivity.this, fragment[1]));
		tx.commit();
	}
	
//	@Override
//	protected void onStart(){
//		super.onStart();
//		ActionBar action_bar = this.getActionBar();
//		action_bar.setDisplayHomeAsUpEnabled(true);
//	}

	private void updateContent(){
		getActionBar().setTitle(data[selection]);
		if(selection != old_selection){
			FragmentTransaction tx = getSupportFragmentManager().beginTransaction();
			tx.replace(R.id.main, Fragment.instantiate(MainActivity.this, fragment[selection]));
			tx.commit();
			old_selection = selection;
		}
		return;
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.optionsmenu, menu);
		return true;
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState){
		super.onPostCreate(savedInstanceState);
		drawertoggle.syncState();
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig){
		super.onConfigurationChanged(newConfig);
		drawertoggle.onConfigurationChanged(newConfig);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){

		if(drawertoggle.onOptionsItemSelected(item)){
			return true;
		}
		
		switch(item.getItemId()){
		case R.id.save:
			Toast.makeText(getApplicationContext(), "Menu Save ditekan", Toast.LENGTH_LONG).show();
			return true;
		case R.id.help:
			Toast.makeText(getApplicationContext(), "Menu Help ditekan", Toast.LENGTH_LONG).show();
			return true;
		case R.id.edit:
			Toast.makeText(getApplicationContext(), "Menu Edit ditekan", Toast.LENGTH_LONG).show();
			return true;
		case R.id.search:
			Toast.makeText(getApplicationContext(), "Menu Search ditekan", Toast.LENGTH_LONG).show();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

}
