package hendy.indobible;

import android.app.ActionBar;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.HorizontalScrollView;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;

public class Perjanjian_Baru extends TabActivity implements OnTabChangeListener{

	TabHost host;
	HorizontalScrollView hrz;
	
	@SuppressWarnings("deprecation")
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_perjanjian_lama);
     
        ActionBar actionBar = getActionBar();
		actionBar.setHomeButtonEnabled(true);
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
		actionBar.setTitle(R.string.title_perjanjian_baru);
		actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLUE));
		actionBar.setDisplayShowTitleEnabled(true);
		actionBar.show();
		
		host = (TabHost)findViewById(android.R.id.tabhost);
		hrz = (HorizontalScrollView)findViewById(R.id.horizontalscroll);
		
		TabSpec matius = host.newTabSpec("Matius");
		matius.setIndicator("Matius", getResources().getDrawable(R.drawable.ic_launcher));
		matius.setContent(new Intent(Perjanjian_Baru.this, Matius.class));
		
		TabSpec markus = host.newTabSpec("Markus");
		markus.setIndicator("Markus", getResources().getDrawable(R.drawable.ic_launcher));
		markus.setContent(new Intent(Perjanjian_Baru.this, Markus.class));
		
		TabSpec lukas = host.newTabSpec("Lukas");
		lukas.setIndicator("Lukas", getResources().getDrawable(R.drawable.ic_launcher));
		lukas.setContent(new Intent(Perjanjian_Baru.this, Lukas.class));
		
		TabSpec yohanes = host.newTabSpec("Yohanes");
		yohanes.setIndicator("Yohanes", getResources().getDrawable(R.drawable.ic_launcher));
		yohanes.setContent(new Intent(Perjanjian_Baru.this, Yohanes.class));
		
		TabSpec kisah_para_rasul = host.newTabSpec("Kisah Para Rasul");
		kisah_para_rasul.setIndicator("Kisah Para Rasul", getResources().getDrawable(R.drawable.ic_launcher));
		kisah_para_rasul.setContent(new Intent(Perjanjian_Baru.this, Kisah_Para_Rasul.class));
		
		TabSpec roma = host.newTabSpec("Roma");
		roma.setIndicator("Roma", getResources().getDrawable(R.drawable.ic_launcher));
		roma.setContent(new Intent(Perjanjian_Baru.this, Roma.class));
		
		TabSpec korintus_satu = host.newTabSpec("1 Korintus");
		korintus_satu.setIndicator("1 Korintus", getResources().getDrawable(R.drawable.ic_launcher));
		korintus_satu.setContent(new Intent(Perjanjian_Baru.this, Satu_Korintus.class));
		
		TabSpec korintus_dua = host.newTabSpec("2 Korintus");
		korintus_dua.setIndicator("2 Korintus", getResources().getDrawable(R.drawable.ic_launcher));
		korintus_dua.setContent(new Intent(Perjanjian_Baru.this, Dua_Korintus.class));
		
		TabSpec galatia = host.newTabSpec("Galatia");
		galatia.setIndicator("Galatia", getResources().getDrawable(R.drawable.ic_launcher));
		galatia.setContent(new Intent(Perjanjian_Baru.this, Galatia.class));
        
		TabSpec efesus = host.newTabSpec("Efesus");
		efesus.setIndicator("Efesus", getResources().getDrawable(R.drawable.ic_launcher));
		efesus.setContent(new Intent(Perjanjian_Baru.this, Efesus.class));
		
		TabSpec filipi = host.newTabSpec("Filipi");
		filipi.setIndicator("Filipi", getResources().getDrawable(R.drawable.ic_launcher));
		filipi.setContent(new Intent(Perjanjian_Baru.this, Filipi.class));
		
		TabSpec kolose = host.newTabSpec("Kolose");
		kolose.setIndicator("Kolose", getResources().getDrawable(R.drawable.ic_launcher));
		kolose.setContent(new Intent(Perjanjian_Baru.this, Kolose.class));
		
		TabSpec tesalonika_satu = host.newTabSpec("1 Tesalonika");
		tesalonika_satu.setIndicator("1 Tesalonika", getResources().getDrawable(R.drawable.ic_launcher));
		tesalonika_satu.setContent(new Intent(Perjanjian_Baru.this, Satu_Tesalonika.class));
		
		TabSpec tesalonika_dua = host.newTabSpec("2 Tesalonika");
		tesalonika_dua.setIndicator("2 Tesalonika", getResources().getDrawable(R.drawable.ic_launcher));
		tesalonika_dua.setContent(new Intent(Perjanjian_Baru.this, Dua_Tesalonika.class));
		
		TabSpec timotius_satu = host.newTabSpec("1 Timotius");
		timotius_satu.setIndicator("1 Timotius", getResources().getDrawable(R.drawable.ic_launcher));
		timotius_satu.setContent(new Intent(Perjanjian_Baru.this, Satu_Timotius.class));
		
		TabSpec timotius_dua = host.newTabSpec("2 Timotius");
		timotius_dua.setIndicator("2 Timotius", getResources().getDrawable(R.drawable.ic_launcher));
		timotius_dua.setContent(new Intent(Perjanjian_Baru.this, Dua_Timotius.class));
		
		TabSpec titus = host.newTabSpec("Titus");
		titus.setIndicator("Titus", getResources().getDrawable(R.drawable.ic_launcher));
		titus.setContent(new Intent(Perjanjian_Baru.this, Titus.class));
		
		TabSpec filemon = host.newTabSpec("Filemon");
		filemon.setIndicator("Filemon", getResources().getDrawable(R.drawable.ic_launcher));
		filemon.setContent(new Intent(Perjanjian_Baru.this, Filemon.class));
		
		TabSpec ibrani = host.newTabSpec("Ibrani");
		ibrani.setIndicator("Ibrani", getResources().getDrawable(R.drawable.ic_launcher));
		ibrani.setContent(new Intent(Perjanjian_Baru.this, Ibrani.class));
		
		TabSpec yakobus = host.newTabSpec("Yakobus");
		yakobus.setIndicator("Yakobus", getResources().getDrawable(R.drawable.ic_launcher));
		yakobus.setContent(new Intent(Perjanjian_Baru.this, Yakobus.class));
		
		TabSpec petrus_satu = host.newTabSpec("1 Petrus");
		petrus_satu.setIndicator("1 Petrus", getResources().getDrawable(R.drawable.ic_launcher));
		petrus_satu.setContent(new Intent(Perjanjian_Baru.this, Satu_Petrus.class));
		
		TabSpec petrus_dua = host.newTabSpec("2 Petrus");
		petrus_dua.setIndicator("2 Petrus", getResources().getDrawable(R.drawable.ic_launcher));
		petrus_dua.setContent(new Intent(Perjanjian_Baru.this, Dua_Petrus.class));
		
		TabSpec yohanes_satu = host.newTabSpec("1 Yohanes");
		yohanes_satu.setIndicator("1 Yohanes", getResources().getDrawable(R.drawable.ic_launcher));
		yohanes_satu.setContent(new Intent(Perjanjian_Baru.this, Satu_Yohanes.class));
		
		TabSpec yohanes_dua = host.newTabSpec("2 Yohanes");
		yohanes_dua.setIndicator("2 Yohanes", getResources().getDrawable(R.drawable.ic_launcher));
		yohanes_dua.setContent(new Intent(Perjanjian_Baru.this, Dua_Yohanes.class));
		
		TabSpec yohanes_tiga = host.newTabSpec("3 Yohanes");
		yohanes_tiga.setIndicator("3 Yohanes", getResources().getDrawable(R.drawable.ic_launcher));
		yohanes_tiga.setContent(new Intent(Perjanjian_Baru.this, Tiga_Yohanes.class));
		
		TabSpec yudas = host.newTabSpec("Yudas");
		yudas.setIndicator("Yudas", getResources().getDrawable(R.drawable.ic_launcher));
		yudas.setContent(new Intent(Perjanjian_Baru.this, Yudas.class));
		
		TabSpec wahyu = host.newTabSpec("Wahyu");
		wahyu.setIndicator("Wahyu", getResources().getDrawable(R.drawable.ic_launcher));
		wahyu.setContent(new Intent(Perjanjian_Baru.this, Wahyu.class));
		
		host.addTab(matius);
		host.addTab(markus);
		host.addTab(lukas);
		host.addTab(yohanes);
		host.addTab(kisah_para_rasul);
		host.addTab(roma);
		host.addTab(korintus_satu);
		host.addTab(korintus_dua);
		host.addTab(galatia);
		host.addTab(efesus);
		host.addTab(filipi);
		host.addTab(kolose);
		host.addTab(tesalonika_satu);
		host.addTab(tesalonika_dua);
		host.addTab(timotius_satu);
		host.addTab(timotius_dua);
		host.addTab(titus);
		host.addTab(filemon);
		host.addTab(ibrani);
		host.addTab(yakobus);
		host.addTab(petrus_satu);
		host.addTab(petrus_dua);
		host.addTab(yohanes_satu);
		host.addTab(yohanes_dua);
		host.addTab(yohanes_tiga);
		host.addTab(yudas);
		host.addTab(wahyu);
		
		host.setOnTabChangedListener(this);
		setContentView(host);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	protected void onChildTitleChanged(Activity childActivity, CharSequence title){
		super.onChildTitleChanged(childActivity, title);
		setTitle(title);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		switch (item.getItemId()) {
		case android.R.id.home:
			Perjanjian_Baru.this.finish();
			break;
		}
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	public void onTabChanged(String tabId) {
		// TODO Auto-generated method stub
		
	}

}
