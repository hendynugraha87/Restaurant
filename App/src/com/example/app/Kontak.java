package com.example.app;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.text.Html;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.NumberPicker;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Kontak extends Activity{
	
	ArrayList<Float> pos = new ArrayList<Float>();
	private int [] galeri_images_ayam;
	private String [] label_ayam;
	private String [] price;
	Boolean isScrooled = false;
	ViewPager vp;
	PagerTitleStrip pts;
	Timer tm;
	int page = 1;
	PagerAdapter adapt;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kontak);
		
		galeri_images_ayam = new int [] {
				0,
				R.drawable.ayam_bakar, 
				R.drawable.ayam_goreng, 
				R.drawable.ayam_kremes, 
				R.drawable.ayam_lombok_ijo, 
				R.drawable.ayam_penyet,
				0
		};
		
		label_ayam = new String [] {
				"",
				"Paket 1",
				"Paket 2",
				"Paket 3",
				"Paket 4",
				"Paket 5",
				""
		};
		
		price = new String [] {
				"",
				"Harga Rp.8000,-",
				"Harga Rp.9000,-",
				"Harga Rp.9500,-",
				"Harga Rp.8500,-",
				"Harga Rp.7500,-",
				""
		};
		
		vp = (ViewPager)findViewById(R.id.view_pager_ayam);
//		Makanan_Ayam_Image_Adapter adptr = new Makanan_Ayam_Image_Adapter(this, galeri_images_ayam, label_ayam);
		adapt = new Makanan_Ayam_Image_Adapter(this, galeri_images_ayam, label_ayam, price);
		vp.setAdapter(adapt);
		vp.setPageMargin(getResources().getDimensionPixelOffset(R.dimen.view_pager_margin));
//		pageSwitcher(1);
		vp.setCurrentItem(1);
		vp.setOnPageChangeListener(new OnPageChangeListener() {
			
			@Override
			public void onPageSelected(int arg0) {
				
				pos.clear();
				
				if(arg0 == 1){
					Toast.makeText(getApplicationContext(), "Paket 1", Toast.LENGTH_SHORT).show();
				} else if(arg0 == 2){
					Toast.makeText(getApplicationContext(), "Paket 2", Toast.LENGTH_SHORT).show();
				} else if(arg0 == 3){
					Toast.makeText(getApplicationContext(), "Paket 3", Toast.LENGTH_SHORT).show();
				} else if(arg0 == 4){
					Toast.makeText(getApplicationContext(), "Paket 4", Toast.LENGTH_SHORT).show();
				} else if(arg0 == 5){
					Toast.makeText(getApplicationContext(), "Paket 5", Toast.LENGTH_SHORT).show();
				}
				
			}
			
			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				try {
				pos.add(arg1);
				if (pos.size() > 0)
                    if (arg0 == galeri_images_ayam.length - 1 & pos.get(0) > pos.get(pos.size() - 1) & isScrooled == true) {
                        try {
                            isScrooled = false;
                            vp.setCurrentItem(1, false);
                        } catch (Exception e) {
                            Log.v("tag", "swipe left" + e.toString());
                        }
                    } else if(arg0 == 0 & pos.get(0) < pos.get(pos.size() - 1) & isScrooled == true) {
                    	try {
                            isScrooled = false;
                            vp.setCurrentItem(galeri_images_ayam.length - 1, false);
                        } catch (Exception e) {
                            Log.v("tag", "swipe right" + e.toString());
                        }
                    } else if(arg0 == 0 & pos.size() == 1 & isScrooled == true){
                    	try {
                            isScrooled = false;
                            vp.setCurrentItem(galeri_images_ayam.length - 1, false);
                        } catch (Exception e) {
                            Log.v("tag", "swipe right " + e.toString());
                        }
                    }
				} catch (Exception e) {
					Log.v("tag", e.toString());
				}
			}
			
			@Override
			public void onPageScrollStateChanged(int arg0) {
				isScrooled = true;
			}
		});
	}
	
	public class Makanan_Ayam_Image_Adapter extends PagerAdapter{

		Context context;
		int galeri_image [];
		String lbl_ayam [];
		String price_menu [];
		LayoutInflater inflater;
		
		public Makanan_Ayam_Image_Adapter(Context context, int [] galeri_images_ayam, String [] label_ayam, String [] price) {
			this.context = context;
			this.galeri_image = galeri_images_ayam;
			this.lbl_ayam = label_ayam;
			this.price_menu = price;
		}
		
		@Override
		public int getCount() {
			return label_ayam.length;
		}

		@Override
		public boolean isViewFromObject(View arg0, Object arg1) {
			return arg0 == ((RelativeLayout)arg1);
		}
		
		@Override
		public Object instantiateItem(ViewGroup container, final int pos){
			TextView txt_desc;
			TextView txt_price;
			ImageView imgvw;
			inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			final View itemView = inflater.inflate(R.layout.viewpager_item, container, false);
			txt_desc = (TextView)itemView.findViewById(R.id.description_menu);
			txt_price = (TextView)itemView.findViewById(R.id.price_menu);
			txt_desc.setText(label_ayam[pos]);
			txt_price.setText(price[pos]);
			final int current_pos = pos;
			imgvw = (ImageView)itemView.findViewById(R.id.menu); 
			int padding = context.getResources().getDimensionPixelSize(R.dimen.padding_medium);
			imgvw.setPadding(padding, padding, padding, padding);
			imgvw.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
			imgvw.setImageResource(galeri_images_ayam[pos]);
			imgvw.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					ImageView i = (ImageView)v;
					if(current_pos == 1){
						AlertDialog.Builder alrt = new AlertDialog.Builder(Kontak.this);
						LayoutInflater factory = LayoutInflater.from(Kontak.this);
						final View vw = factory.inflate(R.layout.gambar_makanan_ayam_bakar, null);
						NumberPicker numpick = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
						numpick.setMinValue(0);
						numpick.setMaxValue(5);
						numpick.setValue(1);
						alrt.setTitle(Html.fromHtml("<font color='#FF7F27'>Menu Resto Bagus</font>"))
							.setIcon(R.drawable.ic_launcher)
							.setCancelable(true)
							.setView(vw)
							.setMessage("Anda ingin memesan menu " + label_ayam[pos] + " ini ?")
							.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									NumberPicker num = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
									int x = num.getValue();
									Toast.makeText(getApplicationContext(), "Anda telah memesan menu " + label_ayam[pos] + "." + "\n" + "Sebanyak " + x + " buah." + "\n" + "Dengan harga satuan : " + price[pos] + "\n" + "Terima kasih.", Toast.LENGTH_LONG).show();
									dialog.dismiss();
								}
							})
							.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									dialog.dismiss();
								}
							});
						AlertDialog a = alrt.create();
						a.show();
						Button b = a.getButton(DialogInterface.BUTTON_POSITIVE);
						b.setBackgroundColor(Color.WHITE);
						Button c = a.getButton(DialogInterface.BUTTON_NEGATIVE);
						c.setBackgroundColor(Color.WHITE);
						TextView mymessage = (TextView)a.findViewById(android.R.id.message);
						mymessage.setGravity(Gravity.CENTER);
//						mymessage.setBackgroundColor(Color.GRAY);
					} else if(current_pos == 2){
						AlertDialog.Builder alrt = new AlertDialog.Builder(Kontak.this);
						LayoutInflater factory = LayoutInflater.from(Kontak.this);
						final View vw = factory.inflate(R.layout.gambar_makanan_ayam_bakar, null);
						NumberPicker numpick = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
						numpick.setMinValue(0);
						numpick.setMaxValue(5);
						numpick.setValue(1);
						alrt.setTitle(Html.fromHtml("<font color='#FF7F27'>Menu Resto Bagus</font>"))
							.setIcon(R.drawable.ic_launcher)
							.setCancelable(true)
							.setView(vw)
							.setMessage("Anda ingin memesan " + label_ayam[pos] + " ini ?")
							.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									NumberPicker num = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
									int x = num.getValue();
									Toast.makeText(getApplicationContext(), "Anda telah memesan menu " + label_ayam[pos] + "." + "\n" + "Sebanyak " + x + " buah." + "\n" + "Dengan harga satuan : " + price[pos] + "\n" + "Terima kasih.", Toast.LENGTH_LONG).show();
									dialog.dismiss();
								}
							})
							.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									dialog.dismiss();
								}
							});
						AlertDialog a = alrt.create();
						a.show();
						TextView mymessage = (TextView)a.findViewById(android.R.id.message);
						mymessage.setGravity(Gravity.CENTER);
					} else if(current_pos == 3){
						AlertDialog.Builder alrt = new AlertDialog.Builder(Kontak.this);
						LayoutInflater factory = LayoutInflater.from(Kontak.this);
						final View vw = factory.inflate(R.layout.gambar_makanan_ayam_bakar, null);
						NumberPicker numpick = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
						numpick.setMinValue(0);
						numpick.setMaxValue(5);
						numpick.setValue(1);
						alrt.setTitle("Menu Resto Bagus")
							.setIcon(R.drawable.ic_launcher)
							.setCancelable(true)
							.setView(vw)
							.setMessage("Anda ingin memesan menu " + label_ayam[pos] + " ini ?")
							.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									NumberPicker num = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
									int x = num.getValue();
									Toast.makeText(getApplicationContext(), "Anda telah memesan menu " + label_ayam[pos] + "." + "\n" + "Sebanyak " + x + " buah." + "\n" + "Dengan harga satuan : " + price[pos] + "\n" + "Terima kasih.", Toast.LENGTH_LONG).show();
									dialog.dismiss();
								}
							})
							.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									dialog.dismiss();
								}
							});
						AlertDialog a = alrt.create();
						a.show();
						TextView mymessage = (TextView)a.findViewById(android.R.id.message);
						mymessage.setGravity(Gravity.CENTER);
					} else if(current_pos == 4){
						AlertDialog.Builder alrt = new AlertDialog.Builder(Kontak.this);
						LayoutInflater factory = LayoutInflater.from(Kontak.this);
						final View vw = factory.inflate(R.layout.gambar_makanan_ayam_bakar, null);
						NumberPicker numpick = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
						numpick.setMinValue(0);
						numpick.setMaxValue(5);
						numpick.setValue(1);
						alrt.setTitle("Menu Resto Bagus")
							.setIcon(R.drawable.ic_launcher)
							.setCancelable(true)
							.setView(vw)
							.setMessage("Anda ingin memesan menu " + label_ayam[pos] + " ini ?")
							.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									NumberPicker num = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
									int x = num.getValue();
									Toast.makeText(getApplicationContext(), "Anda telah memesan menu " + label_ayam[pos] + "." + "\n" + "Sebanyak " + x + " buah." + "\n" + "Dengan harga satuan : " + price[pos] + "\n" + "Terima kasih.", Toast.LENGTH_LONG).show();
								}
							})
							.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									dialog.dismiss();
								}
							});
						AlertDialog a = alrt.create();
						a.show();
						TextView mymessage = (TextView)a.findViewById(android.R.id.message);
						mymessage.setGravity(Gravity.CENTER);
					} else if(current_pos == 5){
						AlertDialog.Builder alrt = new AlertDialog.Builder(Kontak.this);
						LayoutInflater factory = LayoutInflater.from(Kontak.this);
						final View vw = factory.inflate(R.layout.gambar_makanan_ayam_bakar, null);
						NumberPicker numpick = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
						numpick.setMinValue(0);
						numpick.setMaxValue(5);
						numpick.setValue(1);
						alrt.setTitle("Menu Resto Bagus")
							.setIcon(R.drawable.ic_launcher)
							.setCancelable(true)
							.setView(vw)
							.setMessage("Anda ingin memesan menu " + label_ayam[pos] + " ini ?")
							.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									NumberPicker num = (NumberPicker)vw.findViewById(R.id.menu_num_picker);
									int x = num.getValue();
									Toast.makeText(getApplicationContext(), "Anda telah memesan menu " + label_ayam[pos] + "." + "\n" + "Sebanyak " + x + " buah." + "\n" + "Dengan harga satuan : " + price[pos] + "\n" + "Terima kasih.", Toast.LENGTH_LONG).show();
									dialog.dismiss();
								}
							})
							.setNegativeButton("Batal", new DialogInterface.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									dialog.dismiss();
								}
							});
						AlertDialog a = alrt.create();
						a.show();
						TextView mymessage = (TextView)a.findViewById(android.R.id.message);
						mymessage.setGravity(Gravity.CENTER);
					}
				}
			});
			((ViewPager) container).addView(itemView, 0);
			return itemView;
		}
		
		@Override
	    public void destroyItem(ViewGroup container, int position, Object object) {
	      ((ViewPager) container).removeView((RelativeLayout) object);
	    }
		
		public CharSequence getPageTitle (int position) {
	        return label_ayam[position];
	    }
	}
	
	// delay timer pada perpindahan dari satu image ke image yang lain sekitar 3,5 detik
	public void pageSwitcher(int seconds){
		tm = new Timer();
		tm.scheduleAtFixedRate(new RemindTask(), 0, seconds * 3500);
	}

	// thread yang berjalan dibelakang layar yang berfungsi scroll image
	class RemindTask extends TimerTask {

		@Override
		public void run() {
			runOnUiThread(new Runnable() {
				
				@Override
				public void run() {
					if(page > 5){
						tm.cancel();
					} else {
						vp.setCurrentItem(page++);
					}
				}
			});
		}
	}
}
