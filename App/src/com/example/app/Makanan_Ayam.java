package com.example.app;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Toast;

public class Makanan_Ayam extends Activity {
	
	String [] urutan_makanan_ayam;
	String [] jenis_menu_ayam;
	String [] price_menu_ayam;
//	public ArrayList<MakananAyam> list_data = new ArrayList<Makanan_Ayam.MakananAyam>();
//	public ArrayList<MakananAyam> list_backup_data = new ArrayList<Makanan_Ayam.MakananAyam>();
	String text;
	int [] pic_menu;
	public BaseAdapter adapt;
	EditText search_ayam;
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.makanan_ayam);
		
		urutan_makanan_ayam = new String [] {
				"1",
				"2",
				"3",
				"4",
				"5"
		};
		
		jenis_menu_ayam = new String [] {
				"Ayam Goreng", 
				"Ayam Bakar", 
				"Ayam Lombok Ijo", 
				"Ayam Penyet", 
				"Ayam Kremes"	
		};
		
		price_menu_ayam = new String [] {
				"8000",
				"9000",
				"9500",
				"8500",
				"7500"
		};
		
		pic_menu = new int [] {
				R.drawable.ayam_goreng_icon,
				R.drawable.ayam_bakar_icon,
				R.drawable.ayam_lombok_ijo_icon,
				R.drawable.ayam_penyet_icon,
				R.drawable.ayam_kremes_icon
		};

		Bundle g = new Bundle();
		g = getIntent().getExtras();
		final String val = g.getString("meja_yang_dipilih3");
		final String val2 = g.getString("tipe_menu2");
		final String val3 = g.getString("jenis_menu1");
		System.out.println(val + " " + val2 + " " + val3);
		
		final ListView daftar_menu_ayam = (ListView) findViewById(R.id.listview_menu_ayam);
		daftar_menu_ayam.setTextFilterEnabled(true);
		adapt = new ListViewAdapter(this, urutan_makanan_ayam, jenis_menu_ayam, price_menu_ayam, pic_menu);
		daftar_menu_ayam.setAdapter(adapt);	
		registerForContextMenu(daftar_menu_ayam);
		
		//daftar_menu_ayam.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, jenis_menu_ayam));
		daftar_menu_ayam.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, final int arg2, long arg3) {
				// TODO Auto-generated method stub
				if(arg2 == 0){
					AlertDialog.Builder alert = new AlertDialog.Builder(Makanan_Ayam.this);
					LayoutInflater factory = LayoutInflater.from(Makanan_Ayam.this);
					final View vw = factory.inflate(R.layout.gambar_makanan_ayam_bakar, null);
					TextView txt = (TextView)vw.findViewById(R.id.ayam_bakar_textView);
					ImageView iv = (ImageView)vw.findViewById(R.id.gmbr_makanan_ayam_bakar);
					iv.setImageResource(R.drawable.ayam_goreng);
					NumberPicker numpicker = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
					numpicker.setMinValue(1);
					numpicker.setMaxValue(5);
					numpicker.setValue(1);
					alert.setTitle("Menu : " + jenis_menu_ayam[arg2])
						 .setIcon(R.drawable.ic_launcher)
						 .setView(vw)
						 .setCancelable(true)
						 .setMessage("Anda ingin memesan menu " + jenis_menu_ayam[arg2] + " ini ?")
						 
//--------------------------------------------------------------------------------------------------------------------------------	
//						 List view + Checkbox di dalam alert dialog dengan menggunakan validasi
//						 .setMultiChoiceItems(jenis_menu_ayam, bol_menu_ayam, new DialogInterface.OnMultiChoiceClickListener() {
//							
//							@Override
//							public void onClick(DialogInterface dialog, int arg1, boolean isChecked) {
//								// TODO Auto-generated method stub
//								Toast.makeText(getApplicationContext(), "Anda telah memesan menu " + jenis_menu_ayam[arg1] + "\n" + "Terima kasih atas pesanan Anda.", Toast.LENGTH_LONG).show();
//							}
//						})
//--------------------------------------------------------------------------------------------------------------------------------						 
						 
//--------------------------------------------------------------------------------------------------------------------------------	
//						 List view + Radio Button di dalam alert dialog dengan menggunakan validasi 
//						 .setSingleChoiceItems(jenis_menu_ayam, arg2, new DialogInterface.OnClickListener() {
//							
//							@Override
//							public void onClick(DialogInterface dialog, int which) {
//								// TODO Auto-generated method stub
//								Toast.makeText(getApplicationContext(), "Anda telah memesan menu " + jenis_menu_ayam[arg1] + "\n" + "Terima kasih atas pesanan Anda.", Toast.LENGTH_LONG).show();
//							}
//						})
//--------------------------------------------------------------------------------------------------------------------------------						 
						 
//--------------------------------------------------------------------------------------------------------------------------------
//						 List view di dalam alert dialog dengan menggunakan validasi
//						 .setItems(jenis_menu_ayam, new DialogInterface.OnClickListener() {
//							
//							@Override
//							public void onClick(DialogInterface dialog, int which) {
//								// TODO Auto-generated method stub
//								
//							}
//						})
//--------------------------------------------------------------------------------------------------------------------------------						 
						 
//--------------------------------------------------------------------------------------------------------------------------------	
//						 list view di dalam alert dialog tanpa validasi
//						 .setItems(jenis_menu_ayam, null)
//--------------------------------------------------------------------------------------------------------------------------------
						 
						 .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// Jika tombol "Ya" di tekan, maka Ayam yang dipilih akan masuk ke daftar checkout
									NumberPicker num = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
									int x = num.getValue();
									int hasil = Integer.parseInt(price_menu_ayam[arg2]) * x;
									Toast.makeText(getApplicationContext(), "Meja Anda : " + val + "\n" + "Tipe : " + val2 + "\n" + "Jenis : " + val3 + "\n" + "Anda telah memesan menu :" + "\n\n" + "\t" + "- " + jenis_menu_ayam[arg2] + " sebanyak " + x + " buah." + "\n\n" + "\t" + "- Harga Satuan : Rp." + price_menu_ayam[arg2] + "\n\n" + "\t" + "- Total : Rp." + hasil + "\n\n" + "Terima kasih atas pesanan Anda." + "\n" + Calendar.getInstance().getTime().toLocaleString(), Toast.LENGTH_LONG).show();
									dialog.dismiss();
								}
							})
						.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// Jika tombol "Tidak" di tekan, maka akan menuju ke aktifitas Makanan_Ayam
									dialog.dismiss();							
						}
					});
					AlertDialog a = alert.create();
					a.show();
					TextView mymessage = (TextView)a.findViewById(android.R.id.message);
					mymessage.setGravity(Gravity.CENTER);
				} else if(arg2 == 1){
					AlertDialog.Builder alert = new AlertDialog.Builder(Makanan_Ayam.this);
					LayoutInflater factory = LayoutInflater.from(Makanan_Ayam.this);
					final View vw = factory.inflate(R.layout.gambar_makanan_ayam_bakar, null);
					TextView txt = (TextView)vw.findViewById(R.id.ayam_bakar_textView);
					ImageView iv = (ImageView)vw.findViewById(R.id.gmbr_makanan_ayam_bakar);
					iv.setImageResource(R.drawable.ayam_bakar);
					NumberPicker numpicker = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
					numpicker.setMinValue(1);
					numpicker.setMaxValue(5);	
					numpicker.setValue(1);
					alert.setTitle("Menu : " + jenis_menu_ayam[arg2])
					 .setIcon(R.drawable.ic_launcher)
					 .setView(vw)
					 .setCancelable(true)
					 .setMessage("Anda ingin memesan menu " + jenis_menu_ayam[arg2] + " ini ?")
					 .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Ya" di tekan, maka Ayam yang dipilih akan masuk ke daftar checkout
								NumberPicker num = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
								int many_order = num.getValue();
								int hasil = Integer.parseInt(price_menu_ayam[arg2]) * many_order;
								Toast.makeText(getApplicationContext(),"Meja Anda : " + val + "\n" + "Tipe : " + val2 + "\n" + "Jenis : " + val3 + "\n" + "Anda telah memesan menu :" + "\n\n" + "\t" + "- " + jenis_menu_ayam[arg2] + " sebanyak " + many_order + " buah." + "\n\n" + "\t" + "- Harga Satuan : Rp." + price_menu_ayam[arg2] + "\n\n" + "\t" + "- Total : Rp." + hasil + "\n\n" + "Terima kasih atas pesanan Anda.", Toast.LENGTH_LONG).show();
								dialog.dismiss(); 
							}
						})
					.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Tidak" di tekan, maka akan menuju ke aktifitas Makanan_Ayam
								dialog.dismiss();
					}
				});
				AlertDialog a = alert.create();
				a.show();
				TextView mymessage = (TextView)a.findViewById(android.R.id.message);
				mymessage.setGravity(Gravity.CENTER);
				} else if(arg2 == 2){
					AlertDialog.Builder alert = new AlertDialog.Builder(Makanan_Ayam.this);
					LayoutInflater factory = LayoutInflater.from(Makanan_Ayam.this);
					final View vw = factory.inflate(R.layout.gambar_makanan_ayam_bakar, null);
					TextView txt = (TextView)vw.findViewById(R.id.ayam_bakar_textView);
					ImageView iv = (ImageView)vw.findViewById(R.id.gmbr_makanan_ayam_bakar);
					iv.setImageResource(R.drawable.ayam_lombok_ijo);
					NumberPicker numpicker = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
					numpicker.setMinValue(1);
					numpicker.setMaxValue(5);
					numpicker.setValue(1);
					alert.setTitle("Menu : " + jenis_menu_ayam[arg2])
					 .setIcon(R.drawable.ic_launcher)
					 .setView(vw)
					 .setCancelable(true)
					 .setMessage("Anda ingin memesan menu " + jenis_menu_ayam[arg2] + " ini ?")
					 .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Ya" di tekan, maka Ayam yang dipilih akan masuk ke daftar checkout
								NumberPicker num = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
								int many_order = num.getValue();
								int hasil = Integer.parseInt(price_menu_ayam[arg2]) * many_order;
								Toast.makeText(getApplicationContext(),"Meja Anda : " + val + "\n" + "Tipe : " + val2 + "\n" + "Jenis : " + val3 + "\n" + "Anda telah memesan menu :" + "\n\n" + "\t" + "- " + jenis_menu_ayam[arg2] + " sebanyak " + many_order + " buah." + "\n\n" + "\t" + "- Harga Satuan : Rp." + price_menu_ayam[arg2] + "\n\n" + "\t" + "- Total : Rp." + hasil + "\n\n" + "Terima kasih atas pesanan Anda.", Toast.LENGTH_LONG).show();
								dialog.dismiss(); 
							}
						})
					.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Tidak" di tekan, maka akan menuju ke aktifitas Makanan_Ayam
								dialog.dismiss();
					}
				});
				AlertDialog a = alert.create();
				a.show();
				TextView mymessage = (TextView)a.findViewById(android.R.id.message);
				mymessage.setGravity(Gravity.CENTER);
				} else if(arg2 == 3){
					AlertDialog.Builder alert = new AlertDialog.Builder(Makanan_Ayam.this);
					LayoutInflater factory = LayoutInflater.from(Makanan_Ayam.this);
					final View vw = factory.inflate(R.layout.gambar_makanan_ayam_bakar, null);
					TextView txt = (TextView)vw.findViewById(R.id.ayam_bakar_textView);
					ImageView iv = (ImageView)vw.findViewById(R.id.gmbr_makanan_ayam_bakar);
					iv.setImageResource(R.drawable.ayam_penyet);
					NumberPicker numpicker = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
					numpicker.setMinValue(1);
					numpicker.setMaxValue(5);
					numpicker.setValue(1);
					alert.setTitle(jenis_menu_ayam[arg2])
					 .setIcon(R.drawable.ic_launcher)
					 .setView(vw)
					 .setCancelable(true)
					 .setMessage("Anda ingin memesan menu " + jenis_menu_ayam[arg2] + " ini ?")
					 .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Ya" di tekan, maka Ayam yang dipilih akan masuk ke daftar checkout
								NumberPicker num = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
								int many_order = num.getValue();
								int hasil = Integer.parseInt(price_menu_ayam[arg2]) * many_order;
								Toast.makeText(getApplicationContext(),"Meja Anda : " + val + "\n" + "Tipe : " + val2 + "\n" + "Jenis : " + val3 + "\n" + "Anda telah memesan menu :" + "\n\n" + "\t" + "- " + jenis_menu_ayam[arg2] + " sebanyak " + many_order + " buah." + "\n\n" + "\t" + "- Harga Satuan : Rp." + price_menu_ayam[arg2] + "\n\n" + "\t" + "- Total : Rp." + hasil + "\n\n" + "Terima kasih atas pesanan Anda.", Toast.LENGTH_LONG).show();
								dialog.dismiss(); 
							}
						})
					.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Tidak" di tekan, maka akan menuju ke aktifitas Makanan_Ayam
								dialog.dismiss();
					}
				});
				AlertDialog a = alert.create();
				a.show();
				TextView mymessage = (TextView)a.findViewById(android.R.id.message);
				mymessage.setGravity(Gravity.CENTER);
				} else if(arg2 == 4){
					AlertDialog.Builder alert = new AlertDialog.Builder(Makanan_Ayam.this);
					LayoutInflater factory = LayoutInflater.from(Makanan_Ayam.this);
					final View vw = factory.inflate(R.layout.gambar_makanan_ayam_bakar, null);
					TextView txt = (TextView)vw.findViewById(R.id.ayam_bakar_textView);
					ImageView iv = (ImageView)vw.findViewById(R.id.gmbr_makanan_ayam_bakar);
					iv.setImageResource(R.drawable.ayam_kremes);
					NumberPicker numpicker = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
					numpicker.setMinValue(1);
					numpicker.setMaxValue(5);
					numpicker.setValue(1);
					alert.setTitle("Menu : " + jenis_menu_ayam[arg2])
					 .setIcon(R.drawable.ic_launcher)
					 .setView(vw)
					 .setCancelable(true)
					 .setMessage("Anda ingin memesan menu " + jenis_menu_ayam[arg2] + " ini ?")
					 .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Ya" di tekan, maka Ayam yang dipilih akan masuk ke daftar checkout
								NumberPicker num = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
								int many_order = num.getValue();
								int hasil = Integer.parseInt(price_menu_ayam[arg2]) * many_order;
								Toast.makeText(getApplicationContext(),"Meja Anda : " + val + "\n" + "Tipe : " + val2 + "\n" + "Jenis : " + val3 + "\n" + "Anda telah memesan menu :" + "\n\n" + "\t" + "- " + jenis_menu_ayam[arg2] + " sebanyak " + many_order + " buah." + "\n\n" + "\t" + "- Harga satuan : Rp." + price_menu_ayam[arg2] + "\n\n" + "\t" + "- Total : Rp." + hasil + "\n\n" + "Terima kasih atas pesanan Anda.", Toast.LENGTH_LONG).show();
								dialog.dismiss(); 
							}
						})
					.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface dialog, int which) {
								// Jika tombol "Tidak" di tekan, maka akan menuju ke aktifitas Makanan_Ayam
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
		String [] jns_menu_ayam;
		String [] price_ayam;
		int [] picture_menu;
//		LayoutInflater inflater;
//		Context context;
		private Activity context;
//		private AyamFilter filter_ayam;
		
		public ListViewAdapter(Activity context, String [] urutan_makanan_ayam, String [] jenis_menu_ayam, String [] price_menu_ayam, int [] pic_menu){
			super();
			this.context = context;
			this.urutan = urutan_makanan_ayam;
			this.jns_menu_ayam = jenis_menu_ayam;
			this.price_ayam = price_menu_ayam;
			this.picture_menu = pic_menu;
		}
				
		@Override
		public int getCount() {
//			return list_data.size();
			return jenis_menu_ayam.length;
		}

		@Override
		public Object getItem(int arg0) {
//			return list_data.get(arg0);
			return arg0;
		}

		@Override
		public long getItemId(int arg0) {
			return 0;
		}

		@Override
		public View getView(int pos, View convertView, ViewGroup parent) {
			
			AyamViewHolder holder;
//			inflater = context.getLayoutInflater();
			if(convertView == null){
//				convertView = inflater.inflate(R.layout.list_makanan, null);
				convertView = (ViewGroup)LayoutInflater.from(getApplicationContext()).inflate(R.layout.list_makanan, null);
				holder = new AyamViewHolder();
				holder.img_menu = (ImageView)convertView.findViewById(R.id.picture_menu_on_listview);
				holder.txt_urutan = (TextView)convertView.findViewById(R.id.urutan_makanan_ayam_listview);
				holder.txt_menu = (TextView)convertView.findViewById(R.id.nama_makanan_ayam_listview);
				holder.txt_price = (TextView)convertView.findViewById(R.id.harga_makanan_ayam_listview);
				holder.img_arrow = (ImageView)convertView.findViewById(R.id.arrow_on_listview);
				
				convertView.setTag(holder);
			} else {
				holder = (AyamViewHolder)convertView.getTag();
			}
			
			holder.img_menu.setImageResource(pic_menu[pos]);
			holder.txt_urutan.setText(urutan_makanan_ayam[pos]);
			holder.txt_menu.setText(jenis_menu_ayam[pos]);
			holder.txt_price.setText(price_menu_ayam[pos]);
			holder.img_arrow.setImageResource(R.drawable.arrow_listview);
			
//			TextView txt_urutan;
//			TextView txt_menu;
//			TextView txt_price;
//			ImageView img_menu;
//			ImageView img_arrow;
//			
//			inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//			View itemView = inflater.inflate(R.layout.list_makanan, parent, false);
//			
//			img_menu = (ImageView)itemView.findViewById(R.id.picture_menu_on_listview);
//			txt_urutan = (TextView)itemView.findViewById(R.id.urutan_makanan_ayam_listview);
//			txt_menu = (TextView)itemView.findViewById(R.id.nama_makanan_ayam_listview);
//			txt_price = (TextView)itemView.findViewById(R.id.harga_makanan_ayam_listview);
//			img_arrow = (ImageView)itemView.findViewById(R.id.arrow_on_listview);
//			
//			txt_urutan.setText(urutan_makanan_ayam[pos]);
//			txt_menu.setText(jenis_menu_ayam[pos]);
//			txt_price.setText(price_menu_ayam[pos]);
//			img_menu.setImageResource(pic_menu[pos]);
//			img_arrow.setImageResource(R.drawable.arrow_listview);
			
			return convertView;
		}		
	}
	
	public static class AyamViewHolder {
		public ImageView img_menu;
		public ImageView img_arrow;
		public TextView txt_urutan;
		public TextView txt_menu;
		public TextView txt_price;
	}
	
	public class MakananAyam {
		public int pic_id;
		public String jenis_ayam;
	}
	
	final int CONTEXT_MENU_TAMBAH = 1;
	final int CONTEXT_MENU_EDIT = 2;
	final int CONTEXT_MENU_HAPUS = 3;
	
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
	{
		AdapterContextMenuInfo info = (AdapterContextMenuInfo)menuInfo;
		int position = info.position;
		String menu_ayam = jenis_menu_ayam[position];
		menu.setHeaderTitle(menu_ayam);
		menu.add(Menu.NONE, CONTEXT_MENU_TAMBAH, Menu.NONE, "Tambah Menu Ayam");
		menu.add(Menu.NONE, CONTEXT_MENU_EDIT, Menu.NONE, "Edit " + menu_ayam);
		menu.add(Menu.NONE, CONTEXT_MENU_HAPUS, Menu.NONE, "Hapus " + menu_ayam);
	}
	
	@Override
	public boolean onContextItemSelected(MenuItem item)
	{
		AdapterView.AdapterContextMenuInfo menuInfo = (AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
		int position = menuInfo.position;
		String menu_ayam = jenis_menu_ayam[position];
		switch(item.getItemId())
		{
		case CONTEXT_MENU_TAMBAH:
			{
				Toast.makeText(getApplicationContext(), menu_ayam + " berhasil ditambah", Toast.LENGTH_LONG).show();
			}
		break;
		case CONTEXT_MENU_EDIT:
			{
				Toast.makeText(getApplicationContext(), menu_ayam + " berhasil di edit", Toast.LENGTH_LONG).show();
			}
		break;
		case CONTEXT_MENU_HAPUS:
			{
				Toast.makeText(getApplicationContext(), "menu " + menu_ayam + " berhasil dihapus", Toast.LENGTH_LONG).show();
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


	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
	}

	public boolean onDown(MotionEvent e) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
		// TODO Auto-generated method stub
//		try {
//			if(Math.abs(e1.getY() - e2.getY()) > SWIPE_MAX_OFF_PATH)
//				return false;
//			if(e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY){
//				Toast.makeText(Makanan_Ayam.this, "Left Swipe", Toast.LENGTH_LONG).show();
//			} else if(e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY){
//				Toast.makeText(Makanan_Ayam.this, "Right Swipe", Toast.LENGTH_LONG).show();
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		return false;
	}

	public void onLongPress(MotionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX,float distanceY) {
		// TODO Auto-generated method stub
		return false;
	}

	public void onShowPress(MotionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public boolean onSingleTapUp(MotionEvent e) {
		// TODO Auto-generated method stub
		return false;
	}
}