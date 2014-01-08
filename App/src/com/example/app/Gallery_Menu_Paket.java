package com.example.app;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class Gallery_Menu_Paket extends ImageView {

	public Gallery_Menu_Paket(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	public Gallery_Menu_Paket(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	public Gallery_Menu_Paket(Context context, AttributeSet attrs, int defStyle){
		super(context, attrs, defStyle);
	}
	
	@Override
	protected void onMeasure(int widthMeasureSpec,int heightMeasureSpec){
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
		setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
	}
}
