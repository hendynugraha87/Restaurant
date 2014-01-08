package com.example.app;

import com.example.app.Makanan_Array_Adapter;
import android.app.Activity;
import android.app.ListActivity;
import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Makanan extends Activity implements OnItemClickListener {

	String [] urutan;
	String [] jenis_makanan;
	int [] pic_menu;
	BaseAdapter adapt;
//	private Animation anim_left;
//	private Animation animright;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.makanan);
		
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
			"10"
		};
		
		jenis_makanan = new String [] {
			"Ayam",
			"Ikan",
			"Udang",
			"Sotong",
			"Bebek",
			"Sayur",
			"Nasi",
			"Sup",
			"Telur",
			"Sambal"
		};
		
		pic_menu = new int [] {
			R.drawable.ayam_bakar,
			R.drawable.ikan_bawal,
			R.drawable.udang_asam_manis,
			R.drawable.sotong_asam_manis,
			R.drawable.bebek_bakar,
			R.drawable.sayur_baby_kailan,
			R.drawable.nasi_biasa,
			R.drawable.sup_ayam,
			R.drawable.telur_rebus,
			R.drawable.sambal_bawang
		};
		
		Bundle g = new Bundle();
		g = getIntent().getExtras();
		final String val = g.getString("meja_yang_dipilih2");
		final String val2 = g.getString("tipe_menu1");
		System.out.println(val + " " + val2);
		
		//setListAdapter(new Makanan_Array_Adapter(this, jenis_makanan));
//		anim_left = AnimationUtils.loadAnimation(this, R.anim.anim_slide_left_to_right);
		final ListView daftar_makanan = (ListView)findViewById(R.id.listview_makanan);
		adapt = new ListViewAdapter(this, urutan, jenis_makanan, pic_menu);
		daftar_makanan.setAdapter(adapt);
//		daftar_makanan.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, jenis_makanan));
		//daftar_makanan.setTextFilterEnabled(true);
		daftar_makanan.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				// TODO Auto-generated method stub
				if(arg2 == 0){
//					daftar_makanan.startAnimation(anim_left);
					Intent makanan_ayam = new Intent(getApplicationContext(), Makanan_Ayam.class); //buat class dan xml baru untuk makanan_ayam
					Bundle b = new Bundle();
					b.putString("meja_yang_dipilih3", val);
					b.putString("tipe_menu2", val2);
					b.putString("jenis_menu1", jenis_makanan[arg2]);
					makanan_ayam.putExtras(b);
					startActivity(makanan_ayam);									 				//masuk ke aktivity masakan_ayam
				} else if(arg2 == 1){
					Intent makanan_ikan = new Intent(getApplicationContext(), Makanan_Ikan.class); //buat class dan xml baru untuk makanan_ikan
					Bundle b = new Bundle();
					b.putString("meja_yang_dipilih3", val);
					b.putString("tipe_menu2", val2);
					b.putString("jenis_menu1", jenis_makanan[arg2]);
					makanan_ikan.putExtras(b);
					startActivity(makanan_ikan);									 				//masuk ke aktivity masakan_ikan
				} else if(arg2 == 2){
					Intent makanan_udang = new Intent(getApplicationContext(), Makanan_Udang.class); //buat class dan xml baru untuk makanan_udang
					Bundle b = new Bundle();
					b.putString("meja_yang_dipilih3", val);
					b.putString("tipe_menu2", val2);
					b.putString("jenis_menu1", jenis_makanan[arg2]);
					makanan_udang.putExtras(b);
					startActivity(makanan_udang);									  				 //masuk ke aktivity masakan_udang
				} else if(arg2 == 3){
					Intent makanan_sotong = new Intent(getApplicationContext(), Makanan_Sotong.class); //buat class dan xml baru untuk makanan_sotong
					Bundle b = new Bundle();
					b.putString("meja_yang_dipilih3", val);
					b.putString("tipe_menu2", val2);
					b.putString("jenis_menu1", jenis_makanan[arg2]);
					makanan_sotong.putExtras(b);
					startActivity(makanan_sotong);									   					//masuk ke aktivity masakan_sotong
				} else if(arg2 == 4){
					Intent makanan_bebek = new Intent(getApplicationContext(), Makanan_Bebek.class); //buat class dan xml baru untuk makanan_bebek
					Bundle b = new Bundle();
					b.putString("meja_yang_dipilih3", val);
					b.putString("tipe_menu2", val2);
					b.putString("jenis_menu1", jenis_makanan[arg2]);
					makanan_bebek.putExtras(b);
					startActivity(makanan_bebek);									  					//masuk ke aktivity masakan_bebek
				} else if(arg2 == 5){
					Intent makanan_sayur = new Intent(getApplicationContext(), Makanan_Sayur.class); //buat class dan xml baru untuk makanan_sayur
					Bundle b = new Bundle();
					b.putString("meja_yang_dipilih3", val);
					b.putString("tipe_menu2", val2);
					b.putString("jenis_menu1", jenis_makanan[arg2]);
					makanan_sayur.putExtras(b);
					startActivity(makanan_sayur);									  				//masuk ke aktivity masakan_sayur
				} else if(arg2 == 6){ 
					Intent makanan_nasi = new Intent(getApplicationContext(), Makanan_Nasi.class); //buat class dan xml baru untuk makanan_nasi
					Bundle b = new Bundle();
					b.putString("meja_yang_dipilih3", val);
					b.putString("tipe_menu2", val2);
					b.putString("jenis_menu1", jenis_makanan[arg2]);
					makanan_nasi.putExtras(b);
					startActivity(makanan_nasi);									 				//masuk ke aktivity masakan_nasi
				} else if(arg2 == 7){
					Intent makanan_sup = new Intent(getApplicationContext(), Makanan_Sup.class); //buat class dan xml baru untuk makanan_sup
					Bundle b = new Bundle();
					b.putString("meja_yang_dipilih3", val);
					b.putString("tipe_menu2", val2);
					b.putString("jenis_menu1", jenis_makanan[arg2]);
					makanan_sup.putExtras(b);
					startActivity(makanan_sup);									  					//masuk ke aktivity masakan_sup
				} else if(arg2 == 8){
					Intent makanan_telur = new Intent(getApplicationContext(), Makanan_Telur.class); //buat class dan xml baru untuk makanan_telur
					Bundle b = new Bundle();
					b.putString("meja_yang_dipilih3", val);
					b.putString("tipe_menu2", val2);
					b.putString("jenis_menu1", jenis_makanan[arg2]);
					makanan_telur.putExtras(b);
					startActivity(makanan_telur);									 				 //masuk ke aktivity masakan_telur
				} else if(arg2 == 9){
					Intent makanan_sambal = new Intent(getApplicationContext(), Makanan_Sambal.class); //buat class dan xml baru untuk makanan_telur
					Bundle b = new Bundle();
					b.putString("meja_yang_dipilih3", val);
					b.putString("tipe_menu2", val2);
					b.putString("jenis_menu1", jenis_makanan[arg2]);
					makanan_sambal.putExtras(b);
					startActivity(makanan_sambal);									 				 //masuk ke aktivity masakan_telur
				}
			}
		});
	}
	
	public class ListViewAdapter extends BaseAdapter {

		String [] urutan_makanan;
		String [] jns_makanan;
		int [] pic_menu;
		LayoutInflater inflater;
		Context context;
		
		public ListViewAdapter(Context context, String [] urutan, String [] jenis_makanan, int [] pic_menu){
			this.context = context;
			this.urutan_makanan = urutan;
			this.jns_makanan = jenis_makanan;
			this.pic_menu = pic_menu;
		}
		
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return jenis_makanan.length;
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
			
			TextView txt_urutan;
			TextView txt_menu;
			ImageView img_menu;
			ImageView img_arrow;
			
			inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View itemView = inflater.inflate(R.layout.list_menu_makanan, parent, false);
			
			img_menu = (ImageView)itemView.findViewById(R.id.picture_menu_makanan_on_listview);
			txt_urutan = (TextView)itemView.findViewById(R.id.urutan_menu_makanan_listview);
			txt_menu = (TextView)itemView.findViewById(R.id.nama_menu_makanan_listview);
			img_arrow = (ImageView)itemView.findViewById(R.id.arrow_on_listview);
			
			txt_urutan.setText(urutan[position]);
			txt_menu.setText(jenis_makanan[position]);
			img_menu.setImageResource(pic_menu[position]);
			img_arrow.setImageResource(R.drawable.arrow_listview);
			
			return itemView;
		}
		
	}
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
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
	
	//==========================================================================================================	

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			new MenuInflater(this).inflate(R.menu.resta_bagus, menu);
			return(super.onCreateOptionsMenu(menu));
		}

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			// TODO Auto-generated method stub
			
		}
		
	//==========================================================================================================
	
}
