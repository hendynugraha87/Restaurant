package com.example.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Daftar_Meja_Resta extends Activity implements OnItemClickListener {
	
	private ArrayList<String> results = new ArrayList<String>();
	//private String tableName = dbase_resta.table_name;
	private SQLiteDatabase new_db;
	
	
	String [] urutan;
	String [] meja_resta;
	BaseAdapter adapt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.daftar_meja_resta);
		
		urutan = new String [] {
			"1",
			"2",
			"3",
			"4",
			"5",
			"6",
			"7",
			"8",
			"9",
			"10",
			"11",
			"12",
			"13",
			"14",
			"15"
		};
		
		meja_resta = new String [] {
			"Meja 01",
			"Meja 02",
			"Meja 03",
			"Meja 04",
			"Meja 05",
			"Meja 06",
			"Meja 07",
			"Meja 08",
			"Meja 09",
			"Meja 10",
			"Meja 11",
			"Meja 12",
			"Meja 13",
			"Meja 14",
			"Meja 15"
		};
		
//		ActionBar bar_action = getActionBar();
//		EditText search = (EditText)bar_action.getCustomView().findViewById(R.id.search_meja);
//		search.setOnEditorActionListener(new OnEditorActionListener() {
//			
//			@Override
//			public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
//				// TODO Auto-generated method stub
//				Toast.makeText(getApplicationContext(), "Search triggered", Toast.LENGTH_SHORT);
//				return false;
//			}
//		});
//		bar_action.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM|ActionBar.DISPLAY_SHOW_HOME);
		
		final ListView daftar_meja = (ListView)findViewById(R.id.listview_daftar_meja);
		adapt = new ListViewAdapter(this,urutan,meja_resta);
		daftar_meja.setAdapter(adapt);
		registerForContextMenu(daftar_meja);
//		daftar_meja.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, meja_resta));
		daftar_meja.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				// TODO Auto-generated method stub
				if(arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 4 || arg2 == 5 || arg2 == 6 || arg2 == 7 || arg2 == 8 || arg2 == 9 || arg2 == 10 || arg2 == 11 || arg2 == 12 || arg2 == 13 || arg2 == 14 ||arg2 == 15){				
					
					Bundle  b = new Bundle();
					b.putString("meja_yang_dipilih", meja_resta[arg2]);
					
					// mengirim semua array data
//					Collection l = Arrays.asList(meja_resta);
//					results.addAll(l);
					
					// intent untuk masuk ke aktivity selanjutnya
					Intent menu = new Intent(Daftar_Meja_Resta.this, RestaBagus.class);
					
					// mengirim hanya posisi dari item yang telah di klik pada listview
//					menu.putExtra("posisi", String.valueOf(arg2 + 1));
					
					// mengirim semua array data
//					menu.putStringArrayListExtra("mejaku", results);
					
					// mengirimkan nilai dari listview contoh Meja 05
//					menu.putExtra("nilai", meja_resta[arg2]);
					menu.putExtras(b);
					startActivity(menu);
				}
			}
		});
	}
	
	public class ListViewAdapter extends BaseAdapter {

		String [] urutan;
		String [] meja;
		LayoutInflater inflater;
		Context context;
		
		public ListViewAdapter(Context context, String [] urutan, String [] meja_resta){
			this.context = context;
			this.urutan = urutan;
			this.meja = meja_resta;
		}
		
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return meja_resta.length;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			
			TextView txt_urutan;
			TextView txt_menu;
			ImageView img_menu;
			ImageView img_arrow;
			
			inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View itemView = inflater.inflate(R.layout.list_meja, parent, false);
			
			img_menu = (ImageView)itemView.findViewById(R.id.picture_meja_on_listview);
			txt_urutan = (TextView)itemView.findViewById(R.id.urutan_meja_listview);
			txt_menu = (TextView)itemView.findViewById(R.id.nama_meja_listview);
			img_arrow = (ImageView)itemView.findViewById(R.id.arrow_on_listview);
			
			txt_urutan.setText(urutan[position]);
			txt_menu.setText(meja_resta[position]);
			img_menu.setImageResource(R.drawable.table_icon);
			img_arrow.setImageResource(R.drawable.arrow_listview);
			
			return itemView;
		}
	}
	
	final int CONTEXT_MENU_TAMBAH = 1;
	final int CONTEXT_MENU_EDIT = 2;
	final int CONTEXT_MENU_HAPUS = 3;
	
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
	{
		AdapterContextMenuInfo info = (AdapterContextMenuInfo)menuInfo;
		int position = info.position;
		String meja = meja_resta[position];
		menu.setHeaderTitle(meja);
		menu.add(Menu.NONE, CONTEXT_MENU_TAMBAH, Menu.NONE, "Tambah Meja");
		menu.add(Menu.NONE, CONTEXT_MENU_EDIT, Menu.NONE, "Edit " + meja);
		menu.add(Menu.NONE, CONTEXT_MENU_HAPUS, Menu.NONE, "Hapus " + meja);
	}
	
	@Override
	public boolean onContextItemSelected(MenuItem item)
	{
		AdapterView.AdapterContextMenuInfo menuInfo = (AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
		int position = menuInfo.position;
		String meja = meja_resta[position];
		
		switch(item.getItemId())
		{
		case CONTEXT_MENU_TAMBAH:
			{
				Toast.makeText(getApplicationContext(), "Tambah menu context", Toast.LENGTH_LONG).show();
			}
		break;
		case CONTEXT_MENU_EDIT:
			{
				Toast.makeText(getApplicationContext(), "Edit menu context", Toast.LENGTH_LONG).show();
			}
		break;
		case CONTEXT_MENU_HAPUS:
			{
				Toast.makeText(getApplicationContext(), "Hapus menu context", Toast.LENGTH_LONG).show();
			}
		break;
		}
		
	return super.onContextItemSelected(item);
		
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
			finish();
		}
		return(super.onOptionsItemSelected(item));
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
	}

}
