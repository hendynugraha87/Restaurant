package com.example.app;

import android.app.ActionBar;
import android.app.Activity;
import android.app.TabActivity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.HorizontalScrollView;
import android.widget.TabHost;

public class Tab_Makanan extends TabActivity
{
	TabHost host;
	HorizontalScrollView horz_scroll;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_makanan);
        
        ActionBar act_bar = getActionBar();
        act_bar.setBackgroundDrawable(new ColorDrawable(Color.BLUE));
        act_bar.setDisplayHomeAsUpEnabled(true);
        act_bar.setDisplayShowTitleEnabled(true);
        act_bar.setHomeButtonEnabled(true);
        act_bar.show();
        
        host = getTabHost();
        horz_scroll = (HorizontalScrollView)findViewById(R.id.horizontalscroll);
        
        
	}
}
