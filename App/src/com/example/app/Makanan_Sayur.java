package com.example.app;

import com.example.app.R.drawable;

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

public class Makanan_Sayur extends Activity implements OnClickListener{

	String [] urutan_makanan_sayur;
	String [] jenis_menu_sayur;
	String [] price_menu_sayur;
	int [] pic_menu;
	BaseAdapter adapt;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.makanan_ayam);
		
		urutan_makanan_sayur = new String [] {
				"1",
				"2",
				"3",
				"4"
		};
		
		jenis_menu_sayur = new String [] {
				"Sayur Capcai", 
				"Sayur Baby Kailan", 
				"Sayur Tumis Kangkung", 
				"Sayur Lalapan"	
		};
		
		price_menu_sayur = new String [] {
			"3500",
			"4000",
			"4500",
			"3000"
		};
		
		pic_menu = new int [] {
			R.drawable.sayur_capcai_icon,
			R.drawable.sayur_baby_kailan_icon,
			R.drawable.sayur_kangkung_icon,
			R.drawable.sayur_lalapan_icon
		};
		
		Bundle g = new Bundle();
		g = getIntent().getExtras();
		final String val = g.getString("meja_yang_dipilih3");
		final String val2 = g.getString("tipe_menu2");
		final String val3 = g.getString("jenis_menu1");
		System.out.println(val + " " + val2 + " " + val3);
		
		final ListView daftar_menu_sayur = (ListView) findViewById(R.id.listview_menu_ayam);
		adapt = new ListViewAdapter(this, urutan_makanan_sayur, jenis_menu_sayur, price_menu_sayur, pic_menu);
		daftar_menu_sayur.setAdapter(adapt);
//		daftar_menu_sayur.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, jenis_menu_sayur));
		daftar_menu_sayur.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, final int arg2,	long arg3) {
				// TODO Auto-generated method stub
				if(arg2 == 0){
					AlertDialog.Builder alert = new AlertDialog.Builder(Makanan_Sayur.this);
					LayoutInflater factory = LayoutInflater.from(Makanan_Sayur.this);
					final View vw = factory.inflate(R.layout.gambar_makanan_ayam_bakar, null);
					TextView txt = (TextView)vw.findViewById(R.id.ayam_bakar_textView);
					ImageView iv = (ImageView)vw.findViewById(R.id.gmbr_makanan_ayam_bakar);
					iv.setImageResource(R.drawable.sayur_capcai);
					NumberPicker numpicker = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
					numpicker.setMinValue(1);
					numpicker.setMaxValue(5);
					numpicker.setValue(1);
					alert.setTitle("Menu : " + jenis_menu_sayur[arg2])
						 .setIcon(R.drawable.ic_launcher)
						 .setView(vw)
						 .setMessage("Anda ingin memesan menu " + jenis_menu_sayur[arg2] + " ini ?")
						 .setPositiveButton("ya", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Ya" di tekan, maka Sayur yang dipilih akan masuk ke daftar checkout
								NumberPicker num = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
								int many_order = num.getValue();
								int hasil = Integer.parseInt(price_menu_sayur[arg2]) * many_order;
								Toast.makeText(getApplicationContext(), "Anda telah memesan menu :" + "\n\n" + "\t" + "- " + jenis_menu_sayur[arg2] + " sebanyak " + many_order + " buah." + "\n\n" + "\t" + "- Harga satuan : Rp." + price_menu_sayur[arg2] + "\n\n" + "\t" + "- Total : Rp." + hasil + "\n\n" + "Terima kasih atas pesanan Anda.", Toast.LENGTH_LONG).show();
								dialog.dismiss();
							}
						});
					alert.setNegativeButton("batal", new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// Jika tombol "Tidak" di tekan, maka akan menuju ke aktifitas Makanan_Sayur
							dialog.dismiss();
						}
					});
					AlertDialog a = alert.create();
					a.show();
					TextView mymessage = (TextView)a.findViewById(android.R.id.message); 
					mymessage.setGravity(Gravity.CENTER);
				} else if(arg2 == 1){
					AlertDialog.Builder alert = new AlertDialog.Builder(Makanan_Sayur.this);
					LayoutInflater factory = LayoutInflater.from(Makanan_Sayur.this);
					final View vw = factory.inflate(R.layout.gambar_makanan_ayam_bakar, null);
					TextView txt = (TextView)vw.findViewById(R.id.ayam_bakar_textView);
					ImageView iv = (ImageView)vw.findViewById(R.id.gmbr_makanan_ayam_bakar);
					iv.setImageResource(R.drawable.sayur_baby_kailan);
					NumberPicker numpicker = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
					numpicker.setMinValue(1);
					numpicker.setMaxValue(5);
					numpicker.setValue(1);
					alert.setTitle("Menu : " + jenis_menu_sayur[arg2])
						 .setIcon(R.drawable.ic_launcher)
						 .setView(vw)
						 .setMessage("Anda ingin memesan menu " + jenis_menu_sayur[arg2] + " ini ?")
						 .setPositiveButton("ya", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Ya" di tekan, maka Sayur yang dipilih akan masuk ke daftar checkout
								NumberPicker num = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
								int many_order = num.getValue();
								int hasil = Integer.parseInt(price_menu_sayur[arg2]) * many_order;
								Toast.makeText(getApplicationContext(),"Meja Anda : " + val + "\n" + "Tipe : " + val2 + "\n" + "Jenis : " + val3 + "\n" + "Anda telah memesan menu :" + "\n\n" + "\t" + "- " + jenis_menu_sayur[arg2] + " sebanyak " + many_order + " buah." + "\n\n" + "\t" + "- Harga satuan : Rp." + price_menu_sayur[arg2] + "\n\n" + "\t" + "- Total : Rp." + hasil + "\n\n" + "Terima kasih atas pesanan Anda.", Toast.LENGTH_LONG).show();
								dialog.dismiss();
							}
						});
					alert.setNegativeButton("batal", new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// Jika tombol "Tidak" di tekan, maka akan menuju ke aktifitas Makanan_Sayur
							dialog.dismiss();
						}
					});
					AlertDialog a = alert.create();
					a.show();
					TextView mymessage = (TextView)a.findViewById(android.R.id.message); 
					mymessage.setGravity(Gravity.CENTER);
				} else if(arg2 == 2){
					AlertDialog.Builder alert = new AlertDialog.Builder(Makanan_Sayur.this);
					LayoutInflater factory = LayoutInflater.from(Makanan_Sayur.this);
					final View vw = factory.inflate(R.layout.gambar_makanan_ayam_bakar, null);
					TextView txt = (TextView)vw.findViewById(R.id.ayam_bakar_textView);
					ImageView iv = (ImageView)vw.findViewById(R.id.gmbr_makanan_ayam_bakar);
					iv.setImageResource(R.drawable.sayur_kangkung);
					NumberPicker numpicker = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
					numpicker.setMinValue(1);
					numpicker.setMaxValue(5);
					numpicker.setValue(1);
					alert.setTitle("Menu : " + jenis_menu_sayur[arg2])
						 .setIcon(R.drawable.ic_launcher)
						 .setView(vw)
						 .setMessage("Anda ingin memesan menu " + jenis_menu_sayur[arg2] + " ini ?")
						 .setPositiveButton("ya", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Ya" di tekan, maka Sayur yang dipilih akan masuk ke daftar checkout
								NumberPicker num = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
								int many_order = num.getValue();
								int hasil = Integer.parseInt(price_menu_sayur[arg2]) * many_order;
								Toast.makeText(getApplicationContext(),"Meja Anda : " + val + "\n" + "Tipe : " + val2 + "\n" + "Jenis : " + val3 + "\n" + "Anda telah memesan menu :" + "\n\n" + "\t" + "- " + jenis_menu_sayur[arg2] + " sebanyak " + many_order + " buah." + "\n\n" + "\t" + "- Harga satuan : Rp." + price_menu_sayur[arg2] + "\n\n" + "\t" + "- Total : Rp." + hasil + "\n\n" + "Terima kasih atas pesanan Anda.", Toast.LENGTH_LONG).show();
								dialog.dismiss();
							}
						});
					alert.setNegativeButton("batal", new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// Jika tombol "Tidak" di tekan, maka akan menuju ke aktifitas Makanan_Sayur
							dialog.dismiss();
						}
					});
					AlertDialog a = alert.create();
					a.show();
					TextView mymessage = (TextView)a.findViewById(android.R.id.message); 
					mymessage.setGravity(Gravity.CENTER);
				} else if(arg2 == 3){
					AlertDialog.Builder alert = new AlertDialog.Builder(Makanan_Sayur.this);
					LayoutInflater factory = LayoutInflater.from(Makanan_Sayur.this);
					final View vw = factory.inflate(R.layout.gambar_makanan_ayam_bakar, null);
					TextView txt = (TextView)vw.findViewById(R.id.ayam_bakar_textView);
					ImageView iv = (ImageView)vw.findViewById(R.id.gmbr_makanan_ayam_bakar);
					iv.setImageResource(R.drawable.sayur_lalapan);
					NumberPicker numpicker = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
					numpicker.setMinValue(1);
					numpicker.setMaxValue(5);
					numpicker.setValue(1);
					alert.setTitle("Menu : " + jenis_menu_sayur[arg2])
						 .setIcon(R.drawable.ic_launcher)
						 .setView(vw)
						 .setMessage("Anda ingin memesan menu " + jenis_menu_sayur[arg2] + " ini ?")
						 .setPositiveButton("ya", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Ya" di tekan, maka Sayur yang dipilih akan masuk ke daftar checkout
								NumberPicker num = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
								int many_order = num.getValue();
								int hasil = Integer.parseInt(price_menu_sayur[arg2]) * many_order;
								Toast.makeText(getApplicationContext(),"Meja Anda : " + val + "\n" + "Tipe : " + val2 + "\n" + "Jenis : " + val3 + "\n" + "Anda telah memesan menu :" + "\n\n" + "\t" + "- " + jenis_menu_sayur[arg2] + " sebanyak " + many_order + " buah." + "\n\n" + "\t" + "- Harga satuan : Rp." + price_menu_sayur[arg2] + "\n\n" + "\t" + "- Total : Rp." + hasil + "\n\n" + "Terima kasih atas pesanan Anda.", Toast.LENGTH_LONG).show();
								dialog.dismiss();
							}
						});
					alert.setNegativeButton("batal", new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// Jika tombol "Tidak" di tekan, maka akan menuju ke aktifitas Makanan_Sayur
							dialog.dismiss();
						}
					});
					AlertDialog a = alert.create();
					a.show();
					TextView mymessage = (TextView)a.findViewById(android.R.id.message); 
					mymessage.setGravity(Gravity.CENTER);
				}
			}
		});
	}
	
	public class ListViewAdapter extends BaseAdapter {

		String [] urutan;
		String [] jns_menu_sayur;
		String [] price_sayur;
		int [] picture_menu;
		LayoutInflater inflater;
		Context context;
		
		public ListViewAdapter(Context context, String [] urutan_makanan_sayur, String [] jenis_menu_sayur, String [] price_menu_sayur, int [] pic_menu){
			this.context = context;
			this.urutan = urutan_makanan_sayur;
			this.jns_menu_sayur = jenis_menu_sayur;
			this.price_sayur = price_menu_sayur;
			this.picture_menu = pic_menu;
		}
		
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return jenis_menu_sayur.length;
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
			
			txt_urutan.setText(urutan_makanan_sayur[pos]);
			txt_menu.setText(jenis_menu_sayur[pos]);
			txt_price.setText(price_menu_sayur[pos]);
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
		String menu_sayur = jenis_menu_sayur[position];
		menu.setHeaderTitle(menu_sayur);
		menu.add(Menu.NONE, CONTEXT_MENU_TAMBAH, Menu.NONE, "Tambah Menu Sayur");
		menu.add(Menu.NONE, CONTEXT_MENU_EDIT, Menu.NONE, "Edit " + menu_sayur);
		menu.add(Menu.NONE, CONTEXT_MENU_HAPUS, Menu.NONE, "Hapus " + menu_sayur);
	}
	
	@Override
	public boolean onContextItemSelected(MenuItem item)
	{
		AdapterView.AdapterContextMenuInfo menuInfo = (AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
		int position = menuInfo.position;
		String menu_sayur = jenis_menu_sayur[position];
		switch(item.getItemId())
		{
		case CONTEXT_MENU_TAMBAH:
			{
				Toast.makeText(getApplicationContext(), menu_sayur + " berhasil ditambah", Toast.LENGTH_LONG).show();
			}
		break;
		case CONTEXT_MENU_EDIT:
			{
				Toast.makeText(getApplicationContext(), menu_sayur + " berhasil di edit", Toast.LENGTH_LONG).show();
			}
		break;
		case CONTEXT_MENU_HAPUS:
			{
				Toast.makeText(getApplicationContext(), "menu " + menu_sayur + " berhasil dihapus", Toast.LENGTH_LONG).show();
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
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
