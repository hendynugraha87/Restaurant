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


public class Minuman_Kaleng extends Activity implements OnClickListener{

	String [] urutan_minuman_kaleng;
	String [] jenis_minuman_kaleng;
	String [] price_minuman_kaleng;
	int [] pic_menu;
	BaseAdapter adapt;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.makanan_ayam);
		
		urutan_minuman_kaleng = new String [] {
				"1",
				"2",
				"3",
				"4",
				"5"	
		};
		
		jenis_minuman_kaleng = new String [] {
				"Coca-Cola", 
				"Fanta", 
				"Pepsi", 
				"Sprite", 
				"Seven Up"
		};
		
		price_minuman_kaleng = new String [] {
			"5000",
			"5000",
			"5000",
			"5000",
			"5000"
		};
		
		pic_menu = new int [] {
			R.drawable.coca_cola,
			R.drawable.fanta,
			R.drawable.pepsi,
			R.drawable.sprite,
			R.drawable.seven_up
		};
		
		Bundle g = new Bundle();
		g = getIntent().getExtras();
		final String val = g.getString("meja_yang_dipilih3");
		final String val2 = g.getString("tipe_menu2");
		final String val3 = g.getString("jenis_menu1");
		System.out.println(val + " " + val2 + " " + val3);
		
		final ListView daftar_minuman_kaleng = (ListView) findViewById(R.id.listview_menu_ayam);
		adapt = new ListViewAdapter(this, urutan_minuman_kaleng, jenis_minuman_kaleng, price_minuman_kaleng, pic_menu);
		daftar_minuman_kaleng.setAdapter(adapt);
//		daftar_minuman_kaleng.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, jenis_minuman_kaleng));
		daftar_minuman_kaleng.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, final int arg2,long arg3) {
				// TODO Auto-generated method stub
				if(arg2 == 0){
					AlertDialog.Builder alert = new AlertDialog.Builder(Minuman_Kaleng.this);
					LayoutInflater factory = LayoutInflater.from(Minuman_Kaleng.this);
					final View vw = factory.inflate(R.layout.gambar_makanan_ayam_bakar, null);
					TextView txt = (TextView)vw.findViewById(R.id.ayam_bakar_textView);
					ImageView iv = (ImageView)vw.findViewById(R.id.gmbr_makanan_ayam_bakar);
					iv.setImageResource(R.drawable.coca_cola);
					NumberPicker numpicker = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
					numpicker.setMinValue(0);
					numpicker.setMaxValue(5);
					numpicker.setValue(1);
					alert.setTitle("Menu : " + jenis_minuman_kaleng[arg2])
						 .setIcon(R.drawable.ic_launcher)
						 .setView(vw)
						 .setMessage("Anda ingin memesan menu " + jenis_minuman_kaleng[arg2] + " ini ?")
						 .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Ya" di tekan, maka Minuman Kaleng yang dipilih akan masuk ke daftar checkout
								NumberPicker num = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
								int many_order = num.getValue();
								Toast.makeText(getApplicationContext(),"Meja Anda : " + val + "\n" + "Tipe : " + val2 + "\n" + "Jenis : " + val3 + "\n" + "Anda telah memesan menu :" + "\n\n" + "\t" + "- " + jenis_minuman_kaleng[arg2] + " sebanyak " + many_order + " buah." + "\n\n" + "Terima kasih atas pesanan Anda.", Toast.LENGTH_LONG).show();
								dialog.dismiss();
							}
						});
					alert.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// Jika tombol "Tidak" di tekan, maka akan menuju ke aktifitas Minuman_Kaleng
							dialog.dismiss();
						}
					});
					AlertDialog a = alert.create();
					a.show();
					TextView textvw = (TextView)a.findViewById(android.R.id.message);
					textvw.setGravity(Gravity.CENTER);
				} else if(arg2 == 1){
					AlertDialog.Builder alert = new AlertDialog.Builder(Minuman_Kaleng.this);
					LayoutInflater factory = LayoutInflater.from(Minuman_Kaleng.this);
					final View vw = factory.inflate(R.layout.gambar_makanan_ayam_bakar, null);
					TextView txt = (TextView)vw.findViewById(R.id.ayam_bakar_textView);
					ImageView iv = (ImageView)vw.findViewById(R.id.gmbr_makanan_ayam_bakar);
					iv.setImageResource(R.drawable.fanta);
					NumberPicker numpicker = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
					numpicker.setMinValue(0);
					numpicker.setMaxValue(5);
					numpicker.setValue(1);
					alert.setTitle("Menu : " + jenis_minuman_kaleng[arg2])
						 .setIcon(R.drawable.ic_launcher)
						 .setView(vw)
						 .setMessage("Anda ingin memesan menu " + jenis_minuman_kaleng[arg2] + " ini ?")
						 .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Ya" di tekan, maka Minuman Kaleng yang dipilih akan masuk ke daftar checkout
								NumberPicker num = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
								int many_order = num.getValue();
								Toast.makeText(getApplicationContext(),"Meja Anda : " + val + "\n" + "Tipe : " + val2 + "\n" + "Jenis : " + val3 + "\n" + "Anda telah memesan menu :" + "\n\n" + "\t" + "- " + jenis_minuman_kaleng[arg2] + " sebanyak " + many_order + " buah." + "\n\n" + "Terima kasih atas pesanan Anda.", Toast.LENGTH_LONG).show();
								dialog.dismiss();
							}
						});
					alert.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// Jika tombol "Tidak" di tekan, maka akan menuju ke aktifitas Minuman_Kaleng
							dialog.dismiss();
						}
					});
					AlertDialog a = alert.create();
					a.show();
					TextView textvw = (TextView)a.findViewById(android.R.id.message);
					textvw.setGravity(Gravity.CENTER);
				} else if(arg2 == 2){
					AlertDialog.Builder alert = new AlertDialog.Builder(Minuman_Kaleng.this);
					LayoutInflater factory = LayoutInflater.from(Minuman_Kaleng.this);
					final View vw = factory.inflate(R.layout.gambar_makanan_ayam_bakar, null);
					TextView txt = (TextView)vw.findViewById(R.id.ayam_bakar_textView);
					ImageView iv = (ImageView)vw.findViewById(R.id.gmbr_makanan_ayam_bakar);
					iv.setImageResource(R.drawable.pepsi);
					NumberPicker numpicker = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
					numpicker.setMinValue(0);
					numpicker.setMaxValue(5);
					numpicker.setValue(1);
					alert.setTitle("Menu : " + jenis_minuman_kaleng[arg2])
						 .setIcon(R.drawable.ic_launcher)
						 .setView(vw)
						 .setMessage("Anda ingin memesan menu " + jenis_minuman_kaleng[arg2] + " ini ?")
						 .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Ya" di tekan, maka Minuman Kaleng yang dipilih akan masuk ke daftar checkout
								NumberPicker num = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
								int many_order = num.getValue();
								Toast.makeText(getApplicationContext(),"Meja Anda : " + val + "\n" + "Tipe : " + val2 + "\n" + "Jenis : " + val3 + "\n" + "Anda telah memesan menu :" + "\n\n" + "\t" + "- " + jenis_minuman_kaleng[arg2] + " sebanyak " + many_order + " buah." + "\n\n" + "Terima kasih atas pesanan Anda.", Toast.LENGTH_LONG).show();
								dialog.dismiss();
							}
						});
					alert.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// Jika tombol "Tidak" di tekan, maka akan menuju ke aktifitas Minuman_Kaleng
							dialog.dismiss();
						}
					});
					AlertDialog a = alert.create();
					a.show();
					TextView textvw = (TextView)a.findViewById(android.R.id.message);
					textvw.setGravity(Gravity.CENTER);
				} else if(arg2 == 3){
					AlertDialog.Builder alert = new AlertDialog.Builder(Minuman_Kaleng.this);
					LayoutInflater factory = LayoutInflater.from(Minuman_Kaleng.this);
					final View vw = factory.inflate(R.layout.gambar_makanan_ayam_bakar, null);
					TextView txt = (TextView)vw.findViewById(R.id.ayam_bakar_textView);
					ImageView iv = (ImageView)vw.findViewById(R.id.gmbr_makanan_ayam_bakar);
					iv.setImageResource(R.drawable.sprite);
					NumberPicker numpicker = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
					numpicker.setMinValue(0);
					numpicker.setMaxValue(5);
					numpicker.setValue(1);
					alert.setTitle("Menu : " + jenis_minuman_kaleng[arg2])
						 .setIcon(R.drawable.ic_launcher)
						 .setView(vw)
						 .setMessage("Anda ingin memesan menu " + jenis_minuman_kaleng[arg2] + " ini ?")
						 .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Ya" di tekan, maka Minuman Kaleng yang dipilih akan masuk ke daftar checkout
								NumberPicker num = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
								int many_order = num.getValue();
								Toast.makeText(getApplicationContext(),"Meja Anda : " + val + "\n" + "Tipe : " + val2 + "\n" + "Jenis : " + val3 + "\n" + "Anda telah memesan menu :" + "\n\n" + "\t" + "- " + jenis_minuman_kaleng[arg2] + " sebanyak " + many_order + " buah." + "\n\n" + "Terima kasih atas pesanan Anda.", Toast.LENGTH_LONG).show();
								dialog.dismiss();
							}
						});
					alert.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// Jika tombol "Tidak" di tekan, maka akan menuju ke aktifitas Minuman_Kaleng
							dialog.dismiss();
						}
					});
					AlertDialog a = alert.create();
					a.show();
					TextView textvw = (TextView)a.findViewById(android.R.id.message);
					textvw.setGravity(Gravity.CENTER);
				} else if(arg2 == 4){
					AlertDialog.Builder alert = new AlertDialog.Builder(Minuman_Kaleng.this);
					LayoutInflater factory = LayoutInflater.from(Minuman_Kaleng.this);
					final View vw = factory.inflate(R.layout.gambar_makanan_ayam_bakar, null);
					TextView txt = (TextView)vw.findViewById(R.id.ayam_bakar_textView);
					ImageView iv = (ImageView)vw.findViewById(R.id.gmbr_makanan_ayam_bakar);
					iv.setImageResource(R.drawable.seven_up);
					NumberPicker numpicker = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
					numpicker.setMinValue(0);
					numpicker.setMaxValue(5);
					numpicker.setValue(1);
					alert.setTitle("Menu : " + jenis_minuman_kaleng[arg2])
						 .setIcon(R.drawable.ic_launcher)
						 .setView(vw)
						 .setMessage("Anda ingin memesan menu " + jenis_minuman_kaleng[arg2] + " ini ?")
						 .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Ya" di tekan, maka Minuman Kaleng yang dipilih akan masuk ke daftar checkout
								NumberPicker num = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
								int many_order = num.getValue();
								Toast.makeText(getApplicationContext(),"Meja Anda : " + val + "\n" + "Tipe : " + val2 + "\n" + "Jenis : " + val3 + "\n" + "Anda telah memesan menu :" + "\n\n" + "\t" + "- " + jenis_minuman_kaleng[arg2] + " sebanyak " + many_order + " buah." + "\n\n" + "Terima kasih atas pesanan Anda.", Toast.LENGTH_LONG).show();
								dialog.dismiss();
							}
						});
					alert.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							// Jika tombol "Tidak" di tekan, maka akan menuju ke aktifitas Minuman_Kaleng
							dialog.dismiss();
						}
					});
					AlertDialog a = alert.create();
					a.show();
					TextView textvw = (TextView)a.findViewById(android.R.id.message);
					textvw.setGravity(Gravity.CENTER);
				}
			}
		});
	}
	
	public class ListViewAdapter extends BaseAdapter {

		String [] urutan;
		String [] jns_menu_minuman_kaleng;
		String [] price_minuman_kaleng;
		int [] picture_menu;
		LayoutInflater inflater;
		Context context;
		
		public ListViewAdapter(Context context, String [] urutan_minuman_kaleng, String [] jenis_minuman_kaleng, String [] price_minuman_kaleng, int [] pic_menu){
			this.context = context;
			this.urutan = urutan_minuman_kaleng;
			this.jns_menu_minuman_kaleng = jenis_minuman_kaleng;
			this.price_minuman_kaleng = price_minuman_kaleng;
			this.picture_menu = pic_menu;
		}
		
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return jenis_minuman_kaleng.length;
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
			
			txt_urutan.setText(urutan_minuman_kaleng[pos]);
			txt_menu.setText(jenis_minuman_kaleng[pos]);
			txt_price.setText(price_minuman_kaleng[pos]);
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
		String menu_minuman_kaleng = jenis_minuman_kaleng[position];
		menu.setHeaderTitle(menu_minuman_kaleng);
		menu.add(Menu.NONE, CONTEXT_MENU_TAMBAH, Menu.NONE, "Tambah Menu Minuman Kaleng");
		menu.add(Menu.NONE, CONTEXT_MENU_EDIT, Menu.NONE, "Edit " + menu_minuman_kaleng);
		menu.add(Menu.NONE, CONTEXT_MENU_HAPUS, Menu.NONE, "Hapus " + menu_minuman_kaleng);
	}
	
	@Override
	public boolean onContextItemSelected(MenuItem item)
	{
		AdapterView.AdapterContextMenuInfo menuInfo = (AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
		int position = menuInfo.position;
		String menu_minuman_kaleng = jenis_minuman_kaleng[position];
		switch(item.getItemId())
		{
		case CONTEXT_MENU_TAMBAH:
			{
				Toast.makeText(getApplicationContext(), menu_minuman_kaleng + " berhasil ditambah", Toast.LENGTH_LONG).show();
			}
		break;
		case CONTEXT_MENU_EDIT:
			{
				Toast.makeText(getApplicationContext(), menu_minuman_kaleng + " berhasil di edit", Toast.LENGTH_LONG).show();
			}
		break;
		case CONTEXT_MENU_HAPUS:
			{
				Toast.makeText(getApplicationContext(), "menu " + menu_minuman_kaleng + " berhasil dihapus", Toast.LENGTH_LONG).show();
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
