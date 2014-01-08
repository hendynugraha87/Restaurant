package com.example.app;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Gallery_Menu_Paket_Active extends Activity{
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.gallery_menu_paket_active);
	    
	    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.flyin);
	    GridView grid = (GridView)findViewById(R.id.gridview_menu_paket);
	    grid.setAnimation(anim);
	    anim.start();
	    grid.setAdapter(new GalleryAdapter(this));
	    grid.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(), Kontak.class);
				Toast.makeText(Gallery_Menu_Paket_Active.this, "" + arg2, Toast.LENGTH_LONG).show();
				i.putExtra("id", arg2);
				startActivity(i);
			}
		});
	}
}

class GalleryAdapter extends BaseAdapter {

	private List<Item> items = new ArrayList<Item>();
	private LayoutInflater inflater;
	
	public GalleryAdapter(Context context){
		inflater = LayoutInflater.from(context);
		items.add(new Item("Ayam Bakar", R.drawable.ayam_bakar));
		items.add(new Item("Ayam Goreng", R.drawable.ayam_goreng));
		items.add(new Item("Ayam Kremes", R.drawable.ayam_kremes));
		items.add(new Item("Ayam Lombok Ijo", R.drawable.ayam_lombok_ijo));
		items.add(new Item("Ayam Penyet", R.drawable.ayam_penyet));
		items.add(new Item("Bebek Bakar", R.drawable.bebek_bakar));
		items.add(new Item("Bebek Goreng", R.drawable.bebek_goreng));
		items.add(new Item("Ikan Bawal", R.drawable.ikan_bawal));
		items.add(new Item("Ikan Gurame", R.drawable.ikan_gurame));
		items.add(new Item("Ikan Kakap", R.drawable.ikan_kakap));
		items.add(new Item("Ikan Lele", R.drawable.ikan_lele));
		items.add(new Item("Ikan Selar", R.drawable.ikan_selar));
		items.add(new Item("Udang Asam Manis", R.drawable.udang_asam_manis));
		items.add(new Item("Udang Asam Pedas", R.drawable.udang_asam_pedas));
		items.add(new Item("Udang Goreng", R.drawable.udang_goreng));
		items.add(new Item("Sotong Asam Manis", R.drawable.sotong_asam_manis));
		items.add(new Item("Sotong Asam Pedas", R.drawable.sotong_asam_pedas));
		items.add(new Item("Sotong Goreng", R.drawable.sotong_goreng));
		items.add(new Item("Sotong Panggang", R.drawable.sotong_panggang));
		items.add(new Item("Sup Ayam", R.drawable.sup_ayam));
		items.add(new Item("Sup Ikan", R.drawable.sup_ikan));
		items.add(new Item("Sup Seafood", R.drawable.sup_seafood));
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return items.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return items.get(arg0);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return items.get(position).drawableId;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View v = convertView;
		ImageView picture;
		TextView name;
		
		if(v == null){
			v = inflater.inflate(R.layout.grid_item, parent, false);
			v.setTag(R.id.picture, v.findViewById(R.id.picture));
			v.setTag(R.id.label_picture, v.findViewById(R.id.label_picture));
		}
		
		picture = (ImageView)v.getTag(R.id.picture);
		name = (TextView)v.getTag(R.id.label_picture);
		
		Item item = (Item)getItem(position);
		
		picture.setImageResource(item.drawableId);
		name.setText(item.name);
		
		return v;
	}
	
	private class Item {
		final String name;
		final int drawableId;
		
		Item(String name, int drawableId){
			this.name = name;
			this.drawableId = drawableId;
		}
	}
	
}
