package com.example.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Makanan_Array_Adapter extends ArrayAdapter<String>{
	
	private final Context context;
	private final String[] values;
	
	public Makanan_Array_Adapter(Context context, String[] values){
		super(context, R.layout.list_makanan, values);
		this.context = context;
		this.values = values;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent){
		LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		View rowView = inflater.inflate(R.layout.list_makanan, parent, false);
////		TextView textView = (TextView)rowView.findViewById(R.id.label_makanan);
////		ImageView imageView = (ImageView)rowView.findViewById(R.id.logo_makanan);
////		textView.setText(values[position]);
//		
//		String s = values[position];
//		System.out.println(s);
//		
//		if(s.equals("Ayam")){
//			imageView.setImageResource(R.drawable.ayam);
//		} else if(s.equals("Ikan")){
//			imageView.setImageResource(R.drawable.ikan);
//		} else if(s.equals("Udang")){
//			imageView.setImageResource(R.drawable.udang);
//		} else if(s.equals("Sotong")){
//			imageView.setImageResource(R.drawable.sotong);
//		} else if(s.equals("Bebek")){
//			imageView.setImageResource(R.drawable.bebek);
//		} else if(s.equals("Sayur")){
//			imageView.setImageResource(R.drawable.sayur);
//		} else if(s.equals("Nasi")){
//			imageView.setImageResource(R.drawable.nasi);
//		} else if(s.equals("Sup")){
//			imageView.setImageResource(R.drawable.sup);
//		} else if(s.equals("Telur")){
//			imageView.setImageResource(R.drawable.telur);
//		} else if(s.equals("Sambal")){
//			imageView.setImageResource(R.drawable.sambal);
//		}
		
		return rowView;
		
	}
	
	
	
}
