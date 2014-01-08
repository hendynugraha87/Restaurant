package com.example.app;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class RestaBagus extends Activity implements OnItemClickListener, OnClickListener {
	
//	Button btn_makanan, btn_snack, btn_minuman, btn_jus, btn_kontak, btn_exit;
	
	String [] keterangan;
	String [] jenis_menu;
	int [] pic_menu;
	BaseAdapter adapt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_resta_bagus);
		
		keterangan = new String [] {
			"Menu makanan",
			"Menu minuman",
			"Menu Snack",
			"Menu Jus",
			"Menu Paket Hemat",
			"Menu Tambahan",
			"Biodata Karyawan Resta",
			"Setting koneksi wifi",
			"All information about your tablet"
		};
		
		jenis_menu = new String [] {
			"Makanan",
			"Minuman",
			"Snack",
			"Jus",
			"Paket Hemat",
			"Tambahan",
			"Biodata Karyawan",
			"Wifi Setting",
			"Tablet Status"
		};
		
		pic_menu = new int [] {
			R.drawable.ayam_bakar,
			R.drawable.es_teh,
			R.drawable.krupuk_udang,
			R.drawable.strawberry_jus,
			R.drawable.es_sup_buah,
			R.drawable.krupuk_peyek,
			R.drawable.strawberry_jus,
			R.drawable.device_access_network_wifi,
			R.drawable.tablet_hardware
		};
		
		Bundle g = new Bundle();
		g = getIntent().getExtras();
		final String val = g.getString("meja_yang_dipilih");
		System.out.println(val);
		
		// mendapatkan semua array data dari daftar_meja_resta activity
//		ArrayList<String> meja = getIntent().getStringArrayListExtra("mejaku");
		
		// cara mendapatkan posisi listview yang telah di klik
//		String pos = getIntent().getStringExtra("posisi");
//		String isi_item = getIntent().getStringExtra("nilai");
//		System.out.println(pos + " " + isi_item + " " + meja);
//		System.out.println(isi_item);
		
		final ListView daftar_menu_resta = (ListView)findViewById(R.id.listview_menu_resta);
		adapt = new ListViewAdapter(this, jenis_menu, pic_menu, keterangan);
		daftar_menu_resta.setAdapter(adapt);
		daftar_menu_resta.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				// TODO Auto-generated method stub
				if(arg2 == 0){
//					daftar_makanan.startAnimation(anim_left);
					Intent makanan = new Intent(getApplicationContext(), Makanan.class);
					Bundle a = new Bundle();
					a.putString("meja_yang_dipilih2", val);
					a.putString("tipe_menu1", jenis_menu[arg2]);
					makanan.putExtras(a);
					startActivity(makanan);
				} else if(arg2 == 1){
					Intent minuman = new Intent(getApplicationContext(), Minuman.class);
					Bundle a = new Bundle();
					a.putString("meja_yang_dipilih2", val);
					a.putString("tipe_menu1", jenis_menu[arg2]);
					minuman.putExtras(a);
					startActivity(minuman);
				} else if(arg2 == 2){
					Intent snack = new Intent(getApplicationContext(), Snack.class);
					Bundle a = new Bundle();
					a.putString("meja_yang_dipilih2", val);
					a.putString("tipe_menu1", jenis_menu[arg2]);
					snack.putExtras(a);
					startActivity(snack);
				} else if(arg2 == 3){
					Intent jus = new Intent(getApplicationContext(), Jus.class);
					Bundle a = new Bundle();
					a.putString("meja_yang_dipilih2", val);
					a.putString("tipe_menu1", jenis_menu[arg2]);
					jus.putExtras(a);
					startActivity(jus);
				} else if(arg2 == 4){
					Intent paket_hemat = new Intent(getApplicationContext(), Gallery_Menu_Paket_Active.class);
					startActivity(paket_hemat);
				} else if(arg2 == 5){
					// masuk ke kelas tambahan
				} else if(arg2 == 6){
					Intent biodata_karyawan = new Intent(getApplicationContext(), MenuActivity.class);
					startActivity(biodata_karyawan);
				} else if (arg2 == 7) {
					Intent set_wifi = new Intent(getApplicationContext(), Setting_wifi_connections.class);
					startActivity(set_wifi);
				} else if (arg2 == 8) {
					Intent phone_status = new Intent(getApplicationContext(), Hardware_Status.class);
					startActivity(phone_status);
				}
			}
		});
		
//		btn_makanan = (Button)findViewById(R.id.btn_makanan);
//		btn_snack = (Button)findViewById(R.id.btn_snack);
//		btn_minuman = (Button)findViewById(R.id.btn_minuman);
//		btn_jus = (Button)findViewById(R.id.btn_jus);
//		btn_kontak = (Button)findViewById(R.id.btn_kontak);
//		btn_exit = (Button)findViewById(R.id.btn_exit);
//		
//		btn_makanan.setOnClickListener(this);
//		btn_snack.setOnClickListener(this);
//		btn_minuman.setOnClickListener(this);
//		btn_jus.setOnClickListener(this);
//		btn_kontak.setOnClickListener(this);
//		btn_exit.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
//		switch(v.getId()) {
//		case R.id.btn_makanan:
//			Intent makanan = new Intent(this, Makanan.class);
//			startActivity(makanan);
//			break;
//		case R.id.btn_snack:
//			Intent snack = new Intent(this, Snack.class);
//			startActivity(snack);
//			break;
//		case R.id.btn_minuman:
//			Intent minuman = new Intent(this, Minuman.class);
//			startActivity(minuman);
//			break;
//		case R.id.btn_jus:
//			Intent jus = new Intent(this, Jus.class);
//			startActivity(jus);
//			break;
//		case R.id.btn_kontak:
//			Intent resta = new Intent(this, Kontak.class);
//			startActivity(resta);
//			break;
//		case R.id.btn_exit:
//			Intent ex = new Intent();
//			ex.setAction(Intent.ACTION_MAIN);
//			ex.addCategory(Intent.CATEGORY_HOME);
//			ex.putExtra("Exit", true);
//			startActivity(ex);
//			finish();
////			System.exit(0);
//			break;
//		default:
//			break;
//		}
	}
	
	public class ListViewAdapter extends BaseAdapter {

		String [] ktrngn;
		String [] jns_makanan;
		int [] picture_menu;
		LayoutInflater inflater;
		Context context;
		
		public ListViewAdapter(Context context, String [] jenis_menu, int [] pic_menu, String [] keterangan){
			this.context = context;
			this.jns_makanan = jenis_menu;
			this.picture_menu = pic_menu;
			this.ktrngn = keterangan;
		}
		
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return jenis_menu.length;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			
			TextView txt_keterangan;
			TextView txt_menu;
			ImageView img_menu;
			ImageView img_arrow;
			
			inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View itemView = inflater.inflate(R.layout.list_menu_resta, parent, false);
			
			img_menu = (ImageView)itemView.findViewById(R.id.picture_menu_resta_on_listview);
			txt_menu = (TextView)itemView.findViewById(R.id.nama_menu_resta_listview);
			txt_keterangan = (TextView)itemView.findViewById(R.id.keterangan_menu_resta_listview);
			img_arrow = (ImageView)itemView.findViewById(R.id.arrow_on_listview);
			
			txt_keterangan.setText(keterangan[position]);
			txt_menu.setText(jenis_menu[position]);
			img_menu.setImageResource(pic_menu[position]);
			img_arrow.setImageResource(R.drawable.arrow_listview);
			
			return itemView;
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.resta_bagus, menu);
		return true;
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
	}
}
