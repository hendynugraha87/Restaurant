package com.example.app;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;

public class Jus extends Activity implements OnItemClickListener {
	
	String [] urutan_jus;
	String [] jenis_jus;
	String [] price_jus;
	int [] pic_menu;
	BaseAdapter adapt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.makanan_ayam);
		
		urutan_jus = new String [] {
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
		
		jenis_jus = new String [] {
				"Strawberry Juice", 
				"Avocado Juice", 
				"Tomato Juice", 
				"Melon Juice", 
				"Papaya Juice", 
				"Watermellon Juice", 
				"Orange Juice", 
				"Manggo Juice", 
				"Pineapple Juice", 
				"Apple Juice"	
		};
		
		price_jus = new String [] {
			"8000",
			"8000",
			"8000",
			"8000",
			"8000",
			"8000",
			"8000",
			"8000",
			"8000",
			"8000"
		};
		
		pic_menu = new int [] {
			R.drawable.strawberry_jus,
			R.drawable.avocado_jus,
			R.drawable.tomato_jus,
			R.drawable.melon_jus,
			R.drawable.papaya_jus,
			R.drawable.watermelon_jus,
			R.drawable.orange_jus,
			R.drawable.mango_jus,
			R.drawable.pineapple_jus,
			R.drawable.apple_jus
		};
		
		Bundle g = new Bundle();
		g = getIntent().getExtras();
		final String val = g.getString("meja_yang_dipilih2");
		final String val2 = g.getString("tipe_menu1");
		System.out.println(val + " " + val2);
		
		final ListView daftar_jus = (ListView) findViewById(R.id.listview_menu_ayam);
		adapt = new ListViewAdapter(this, urutan_jus, jenis_jus, price_jus, pic_menu);
		daftar_jus.setAdapter(adapt);
//		daftar_jus.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, jenis_jus));
		daftar_jus.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, final int arg2,	long arg3) {
				// TODO Auto-generated method stub
				if(arg2 == 0){
					AlertDialog.Builder alert = new AlertDialog.Builder(Jus.this);
					LayoutInflater factory = LayoutInflater.from(Jus.this);
					final View vw = factory.inflate(R.layout.gambar_makanan_ayam_bakar, null);
					TextView txt = (TextView)vw.findViewById(R.id.ayam_bakar_textView);
					ImageView iv = (ImageView)vw.findViewById(R.id.gmbr_makanan_ayam_bakar);
					iv.setImageResource(R.drawable.strawberry_jus);
					NumberPicker numpicker = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
					numpicker.setMinValue(0);
					numpicker.setMaxValue(5);
					alert.setTitle("Menu : " + jenis_jus[arg2])
						 .setIcon(R.drawable.ic_launcher)
						 .setView(vw)
						 .setMessage("Anda ingin memesan menu " + jenis_jus[arg2] + " ini ?")
						 .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Ya" di tekan, maka Jus yang dipilih akan masuk ke daftar checkout
								NumberPicker num = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
								int many_order = num.getValue();
								Toast.makeText(getApplicationContext(),"Meja Anda : " + val + "\n" + "Tipe : " + val2 + "\n" + "Anda telah memesan menu :" + "\n\n" + "\t" + "- " + jenis_jus[arg2] + " sebanyak " + many_order + " buah." + "\n\n" + "Terima kasih atas pesanan Anda.", Toast.LENGTH_LONG).show();
								dialog.dismiss();
							}
						})
						.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
						
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Tidak" di tekan, maka akan menuju ke aktifitas Jus
								dialog.dismiss();
							}
						});
					AlertDialog a = alert.create();
					a.show();
					TextView txtvw = (TextView)a.findViewById(android.R.id.message);
					txtvw.setGravity(Gravity.CENTER);
				} else if(arg2 == 1){
					AlertDialog.Builder alert = new AlertDialog.Builder(Jus.this);
					LayoutInflater factory = LayoutInflater.from(Jus.this);
					final View vw = factory.inflate(R.layout.gambar_makanan_ayam_bakar, null);
					TextView txt = (TextView)vw.findViewById(R.id.ayam_bakar_textView);
					ImageView iv = (ImageView)vw.findViewById(R.id.gmbr_makanan_ayam_bakar);
					iv.setImageResource(R.drawable.avocado_jus);
					NumberPicker numpicker = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
					numpicker.setMinValue(0);
					numpicker.setMaxValue(5);
					alert.setTitle("Menu : " + jenis_jus[arg2])
						 .setIcon(R.drawable.ic_launcher)
						 .setView(vw)
						 .setMessage("Anda ingin memesan menu " + jenis_jus[arg2] + " ini ?")
						 .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Ya" di tekan, maka Jus yang dipilih akan masuk ke daftar checkout
								NumberPicker num = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
								int many_order = num.getValue();
								Toast.makeText(getApplicationContext(),"Meja Anda : " + val + "\n" + "Tipe : " + val2 + "\n" + "Anda telah memesan menu :" + "\n\n" + "\t" + "- " + jenis_jus[arg2] + " sebanyak " + many_order + " buah." + "\n\n" + "Terima kasih atas pesanan Anda.", Toast.LENGTH_LONG).show();
								dialog.dismiss();
							}
						})
						.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
						
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Tidak" di tekan, maka akan menuju ke aktifitas Jus
								dialog.dismiss();
							}
						});
					AlertDialog a = alert.create();
					a.show();
					TextView txtvw = (TextView)a.findViewById(android.R.id.message);
					txtvw.setGravity(Gravity.CENTER);
				} else if(arg2 == 2){
					AlertDialog.Builder alert = new AlertDialog.Builder(Jus.this);
					LayoutInflater factory = LayoutInflater.from(Jus.this);
					final View vw = factory.inflate(R.layout.gambar_makanan_ayam_bakar, null);
					TextView txt = (TextView)vw.findViewById(R.id.ayam_bakar_textView);
					ImageView iv = (ImageView)vw.findViewById(R.id.gmbr_makanan_ayam_bakar);
					iv.setImageResource(R.drawable.tomato_jus);
					NumberPicker numpicker = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
					numpicker.setMinValue(0);
					numpicker.setMaxValue(5);
					alert.setTitle("Menu : " + jenis_jus[arg2])
						 .setIcon(R.drawable.ic_launcher)
						 .setView(vw)
						 .setMessage("Anda ingin memesan menu " + jenis_jus[arg2] + " ini ?")
						 .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Ya" di tekan, maka Jus yang dipilih akan masuk ke daftar checkout
								NumberPicker num = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
								int many_order = num.getValue();
								Toast.makeText(getApplicationContext(),"Meja Anda : " + val + "\n" + "Tipe : " + val2 + "\n" + "Anda telah memesan menu :" + "\n\n" + "\t" + "- " + jenis_jus[arg2] + " sebanyak " + many_order + " buah." + "\n\n" + "Terima kasih atas pesanan Anda.", Toast.LENGTH_LONG).show();
								dialog.dismiss();
							}
						})
						.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
						
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Tidak" di tekan, maka akan menuju ke aktifitas Jus
								dialog.dismiss();
							}
						});
					AlertDialog a = alert.create();
					a.show();
					TextView txtvw = (TextView)a.findViewById(android.R.id.message);
					txtvw.setGravity(Gravity.CENTER);
				} else if(arg2 == 3){
					AlertDialog.Builder alert = new AlertDialog.Builder(Jus.this);
					LayoutInflater factory = LayoutInflater.from(Jus.this);
					final View vw = factory.inflate(R.layout.gambar_makanan_ayam_bakar, null);
					TextView txt = (TextView)vw.findViewById(R.id.ayam_bakar_textView);
					ImageView iv = (ImageView)vw.findViewById(R.id.gmbr_makanan_ayam_bakar);
					iv.setImageResource(R.drawable.melon_jus);
					NumberPicker numpicker = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
					numpicker.setMinValue(0);
					numpicker.setMaxValue(5);
					alert.setTitle("Menu : " + jenis_jus[arg2])
						 .setIcon(R.drawable.ic_launcher)
						 .setView(vw)
						 .setMessage("Anda ingin memesan menu " + jenis_jus[arg2] + " ini ?")
						 .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Ya" di tekan, maka Jus yang dipilih akan masuk ke daftar checkout
								NumberPicker num = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
								int many_order = num.getValue();
								Toast.makeText(getApplicationContext(),"Meja Anda : " + val + "\n" + "Tipe : " + val2 + "\n" + "Anda telah memesan menu :" + "\n\n" + "\t" + "- " + jenis_jus[arg2] + " sebanyak " + many_order + " buah." + "\n\n" + "Terima kasih atas pesanan Anda.", Toast.LENGTH_LONG).show();
								dialog.dismiss();
							}
						})
						.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
						
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Tidak" di tekan, maka akan menuju ke aktifitas Jus
								dialog.dismiss();
							}
						});
					AlertDialog a = alert.create();
					a.show();
					TextView txtvw = (TextView)a.findViewById(android.R.id.message);
					txtvw.setGravity(Gravity.CENTER);
				} else if(arg2 == 4){
					AlertDialog.Builder alert = new AlertDialog.Builder(Jus.this);
					LayoutInflater factory = LayoutInflater.from(Jus.this);
					final View vw = factory.inflate(R.layout.gambar_makanan_ayam_bakar, null);
					TextView txt = (TextView)vw.findViewById(R.id.ayam_bakar_textView);
					ImageView iv = (ImageView)vw.findViewById(R.id.gmbr_makanan_ayam_bakar);
					iv.setImageResource(R.drawable.papaya_jus);
					NumberPicker numpicker = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
					numpicker.setMinValue(0);
					numpicker.setMaxValue(5);
					alert.setTitle("Menu : " + jenis_jus[arg2])
						 .setIcon(R.drawable.ic_launcher)
						 .setView(vw)
						 .setMessage("Anda ingin memesan menu " + jenis_jus[arg2] + " ini ?")
						 .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Ya" di tekan, maka Jus yang dipilih akan masuk ke daftar checkout
								NumberPicker num = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
								int many_order = num.getValue();
								Toast.makeText(getApplicationContext(),"Meja Anda : " + val + "\n" + "Tipe : " + val2 + "\n" + "Anda telah memesan menu :" + "\n\n" + "\t" + "- " + jenis_jus[arg2] + " sebanyak " + many_order + " buah." + "\n\n" + "Terima kasih atas pesanan Anda.", Toast.LENGTH_LONG).show();
								dialog.dismiss();
							}
						})
						.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
						
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Tidak" di tekan, maka akan menuju ke aktifitas Jus
								dialog.dismiss();
							}
						});
					AlertDialog a = alert.create();
					a.show();
					TextView txtvw = (TextView)a.findViewById(android.R.id.message);
					txtvw.setGravity(Gravity.CENTER);
				} else if(arg2 == 5){
					AlertDialog.Builder alert = new AlertDialog.Builder(Jus.this);
					LayoutInflater factory = LayoutInflater.from(Jus.this);
					final View vw = factory.inflate(R.layout.gambar_makanan_ayam_bakar, null);
					TextView txt = (TextView)vw.findViewById(R.id.ayam_bakar_textView);
					ImageView iv = (ImageView)vw.findViewById(R.id.gmbr_makanan_ayam_bakar);
					iv.setImageResource(R.drawable.watermelon_jus);
					NumberPicker numpicker = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
					numpicker.setMinValue(0);
					numpicker.setMaxValue(5);
					alert.setTitle("Menu : " + jenis_jus[arg2])
						 .setIcon(R.drawable.ic_launcher)
						 .setView(vw)
						 .setMessage("Anda ingin memesan menu " + jenis_jus[arg2] + " ini ?")
						 .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Ya" di tekan, maka Jus yang dipilih akan masuk ke daftar checkout
								NumberPicker num = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
								int many_order = num.getValue();
								Toast.makeText(getApplicationContext(),"Meja Anda : " + val + "\n" + "Tipe : " + val2 + "\n" + "Anda telah memesan menu :" + "\n\n" + "\t" + "- " + jenis_jus[arg2] + " sebanyak " + many_order + " buah." + "\n\n" + "Terima kasih atas pesanan Anda.", Toast.LENGTH_LONG).show();
								dialog.dismiss();
							}
						})
						.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
						
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Tidak" di tekan, maka akan menuju ke aktifitas Jus
								dialog.dismiss();
							}
						});
					AlertDialog a = alert.create();
					a.show();
					TextView txtvw = (TextView)a.findViewById(android.R.id.message);
					txtvw.setGravity(Gravity.CENTER);
				} else if(arg2 == 6){
					AlertDialog.Builder alert = new AlertDialog.Builder(Jus.this);
					LayoutInflater factory = LayoutInflater.from(Jus.this);
					final View vw = factory.inflate(R.layout.gambar_makanan_ayam_bakar, null);
					TextView txt = (TextView)vw.findViewById(R.id.ayam_bakar_textView);
					ImageView iv = (ImageView)vw.findViewById(R.id.gmbr_makanan_ayam_bakar);
					iv.setImageResource(R.drawable.orange_jus);
					NumberPicker numpicker = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
					numpicker.setMinValue(0);
					numpicker.setMaxValue(5);
					alert.setTitle("Menu : " + jenis_jus[arg2])
						 .setIcon(R.drawable.ic_launcher)
						 .setView(vw)
						 .setMessage("Anda ingin memesan menu " + jenis_jus[arg2] + " ini ?")
						 .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Ya" di tekan, maka Jus yang dipilih akan masuk ke daftar checkout
								NumberPicker num = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
								int many_order = num.getValue();
								Toast.makeText(getApplicationContext(),"Meja Anda : " + val + "\n" + "Tipe : " + val2 + "\n" + "Anda telah memesan menu :" + "\n\n" + "\t" + "- " + jenis_jus[arg2] + " sebanyak " + many_order + " buah." + "\n\n" + "Terima kasih atas pesanan Anda.", Toast.LENGTH_LONG).show();
								dialog.dismiss();
							}
						})
						.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
						
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Tidak" di tekan, maka akan menuju ke aktifitas Jus
								dialog.dismiss();
							}
						});
					AlertDialog a = alert.create();
					a.show();
					TextView txtvw = (TextView)a.findViewById(android.R.id.message);
					txtvw.setGravity(Gravity.CENTER);
				} else if(arg2 == 7){
					AlertDialog.Builder alert = new AlertDialog.Builder(Jus.this);
					LayoutInflater factory = LayoutInflater.from(Jus.this);
					final View vw = factory.inflate(R.layout.gambar_makanan_ayam_bakar, null);
					TextView txt = (TextView)vw.findViewById(R.id.ayam_bakar_textView);
					ImageView iv = (ImageView)vw.findViewById(R.id.gmbr_makanan_ayam_bakar);
					iv.setImageResource(R.drawable.mango_jus);
					NumberPicker numpicker = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
					numpicker.setMinValue(0);
					numpicker.setMaxValue(5);
					alert.setTitle("Menu : " + jenis_jus[arg2])
						 .setIcon(R.drawable.ic_launcher)
						 .setView(vw)
						 .setMessage("Anda ingin memesan menu " + jenis_jus[arg2] + " ini ?")
						 .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Ya" di tekan, maka Jus yang dipilih akan masuk ke daftar checkout
								NumberPicker num = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
								int many_order = num.getValue();
								Toast.makeText(getApplicationContext(),"Meja Anda : " + val + "\n" + "Tipe : " + val2 + "\n" + "Anda telah memesan menu :" + "\n\n" + "\t" + "- " + jenis_jus[arg2] + " sebanyak " + many_order + " buah." + "\n\n" + "Terima kasih atas pesanan Anda.", Toast.LENGTH_LONG).show();
								dialog.dismiss();
							}
						})
						.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
						
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Tidak" di tekan, maka akan menuju ke aktifitas Jus
								dialog.dismiss();
							}
						});
					AlertDialog a = alert.create();
					a.show();
					TextView txtvw = (TextView)a.findViewById(android.R.id.message);
					txtvw.setGravity(Gravity.CENTER);
				} else if(arg2 == 8){
					AlertDialog.Builder alert = new AlertDialog.Builder(Jus.this);
					LayoutInflater factory = LayoutInflater.from(Jus.this);
					final View vw = factory.inflate(R.layout.gambar_makanan_ayam_bakar, null);
					TextView txt = (TextView)vw.findViewById(R.id.ayam_bakar_textView);
					ImageView iv = (ImageView)vw.findViewById(R.id.gmbr_makanan_ayam_bakar);
					iv.setImageResource(R.drawable.pineapple_jus);
					NumberPicker numpicker = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
					numpicker.setMinValue(0);
					numpicker.setMaxValue(5);
					alert.setTitle("Menu : " + jenis_jus[arg2])
						 .setIcon(R.drawable.ic_launcher)
						 .setView(vw)
						 .setMessage("Anda ingin memesan menu " + jenis_jus[arg2] + " ini ?")
						 .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Ya" di tekan, maka Jus yang dipilih akan masuk ke daftar checkout
								NumberPicker num = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
								int many_order = num.getValue();
								Toast.makeText(getApplicationContext(),"Meja Anda : " + val + "\n" + "Tipe : " + val2 + "\n" + "Anda telah memesan menu :" + "\n\n" + "\t" + "- " + jenis_jus[arg2] + " sebanyak " + many_order + " buah." + "\n\n" + "Terima kasih atas pesanan Anda.", Toast.LENGTH_LONG).show();
								dialog.dismiss();
							}
						})
						.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
						
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Tidak" di tekan, maka akan menuju ke aktifitas Jus
								dialog.dismiss();
							}
						});
					AlertDialog a = alert.create();
					a.show();
					TextView txtvw = (TextView)a.findViewById(android.R.id.message);
					txtvw.setGravity(Gravity.CENTER);
				} else if(arg2 == 9){
					AlertDialog.Builder alert = new AlertDialog.Builder(Jus.this);
					LayoutInflater factory = LayoutInflater.from(Jus.this);
					final View vw = factory.inflate(R.layout.gambar_makanan_ayam_bakar, null);
					TextView txt = (TextView)vw.findViewById(R.id.ayam_bakar_textView);
					ImageView iv = (ImageView)vw.findViewById(R.id.gmbr_makanan_ayam_bakar);
					iv.setImageResource(R.drawable.apple_jus);
					NumberPicker numpicker = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
					numpicker.setMinValue(0);
					numpicker.setMaxValue(5);
					alert.setTitle("Menu : " + jenis_jus[arg2])
						 .setIcon(R.drawable.ic_launcher)
						 .setView(vw)
						 .setMessage("Anda ingin memesan menu " + jenis_jus[arg2] + " ini ?")
						 .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Ya" di tekan, maka Jus yang dipilih akan masuk ke daftar checkout
								NumberPicker num = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
								int many_order = num.getValue();
								Toast.makeText(getApplicationContext(),"Meja Anda : " + val + "\n" + "Tipe : " + val2 + "\n" + "Anda telah memesan menu :" + "\n\n" + "\t" + "- " + jenis_jus[arg2] + " sebanyak " + many_order + " buah." + "\n\n" + "Terima kasih atas pesanan Anda.", Toast.LENGTH_LONG).show();
								dialog.dismiss();
							}
						})
						.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
						
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Tidak" di tekan, maka akan menuju ke aktifitas Jus
								dialog.dismiss();
							}
						});
					AlertDialog a = alert.create();
					a.show();
					TextView txtvw = (TextView)a.findViewById(android.R.id.message);
					txtvw.setGravity(Gravity.CENTER);
				}
			}
		});
	}
	
	public class ListViewAdapter extends BaseAdapter {

		String [] urutan;
		String [] jns_menu_minuman_jus;
		String [] price_minuman_jus;
		int [] picture_menu;
		LayoutInflater inflater;
		Context context;
		
		public ListViewAdapter(Context context, String [] urutan_jus, String [] jenis_jus, String [] price_jus, int [] pic_menu){
			this.context = context;
			this.urutan = urutan_jus;
			this.jns_menu_minuman_jus = jenis_jus;
			this.price_minuman_jus = price_jus;
			this.picture_menu = pic_menu;
		}
		
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return jenis_jus.length;
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
		public View getView(int pos, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			
			TextView txt_urutan;
			TextView txt_menu;
			TextView txt_price;
			ImageView img_menu;
			ImageView img_arrow;
			
			inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View itemView = inflater.inflate(R.layout.list_makanan, parent, false);
			
			img_menu = (ImageView)itemView.findViewById(R.id.picture_menu_on_listview);
			txt_urutan = (TextView)itemView.findViewById(R.id.urutan_makanan_ayam_listview);
			txt_menu = (TextView)itemView.findViewById(R.id.nama_makanan_ayam_listview);
			txt_price = (TextView)itemView.findViewById(R.id.harga_makanan_ayam_listview);
			img_arrow = (ImageView)itemView.findViewById(R.id.arrow_on_listview);
			
			txt_urutan.setText(urutan_jus[pos]);
			txt_menu.setText(jenis_jus[pos]);
			txt_price.setText(price_jus[pos]);
			img_menu.setImageResource(pic_menu[pos]);
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
		String menu_jus = jenis_jus[position];
		menu.setHeaderTitle(menu_jus);
		menu.add(Menu.NONE, CONTEXT_MENU_TAMBAH, Menu.NONE, "Tambah Menu Snack");
		menu.add(Menu.NONE, CONTEXT_MENU_EDIT, Menu.NONE, "Edit " + menu_jus);
		menu.add(Menu.NONE, CONTEXT_MENU_HAPUS, Menu.NONE, "Hapus " + menu_jus);
	}
	
	@Override
	public boolean onContextItemSelected(MenuItem item)
	{
		AdapterView.AdapterContextMenuInfo menuInfo = (AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
		int position = menuInfo.position;
		String menu_jus = jenis_jus[position];
		switch(item.getItemId())
		{
		case CONTEXT_MENU_TAMBAH:
			{
				Toast.makeText(getApplicationContext(), menu_jus + " berhasil ditambah", Toast.LENGTH_LONG).show();
			}
		break;
		case CONTEXT_MENU_EDIT:
			{
				Toast.makeText(getApplicationContext(), menu_jus + " berhasil di edit", Toast.LENGTH_LONG).show();
			}
		break;
		case CONTEXT_MENU_HAPUS:
			{
				Toast.makeText(getApplicationContext(), "menu " + menu_jus + " berhasil dihapus", Toast.LENGTH_LONG).show();
			}
		break;
		}	
	return super.onContextItemSelected(item);
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
