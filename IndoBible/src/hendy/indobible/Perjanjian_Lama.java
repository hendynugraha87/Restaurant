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

public class Perjanjian_Lama extends TabActivity implements OnTabChangeListener{

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
		actionBar.setTitle(R.string.title_perjanjian_lama);
		actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLUE));
		actionBar.setDisplayShowTitleEnabled(true);
		actionBar.show();
		
		host = (TabHost)findViewById(android.R.id.tabhost);
		hrz = (HorizontalScrollView)findViewById(R.id.horizontalscroll);
		
		TabSpec kejadian = host.newTabSpec("Kejadian");
		kejadian.setIndicator("Kejadian", getResources().getDrawable(R.drawable.ic_launcher));
		kejadian.setContent(new Intent(Perjanjian_Lama.this, Kejadian.class));
		
		TabSpec Keluaran = host.newTabSpec("Keluaran");
		Keluaran.setIndicator("Keluaran", getResources().getDrawable(R.drawable.ic_launcher));
		Keluaran.setContent(new Intent(Perjanjian_Lama.this, Keluaran.class));
		
		TabSpec Imamat = host.newTabSpec("Imamat");
		Imamat.setIndicator("Imamat", getResources().getDrawable(R.drawable.ic_launcher));
		Imamat.setContent(new Intent(Perjanjian_Lama.this, Imamat.class));
		
		TabSpec Bilangan = host.newTabSpec("Bilangan");
		Bilangan.setIndicator("Bilangan", getResources().getDrawable(R.drawable.ic_launcher));
		Bilangan.setContent(new Intent(Perjanjian_Lama.this, Bilangan.class));
		
		TabSpec Ulangan = host.newTabSpec("Ulangan");
		Ulangan.setIndicator("Ulangan", getResources().getDrawable(R.drawable.ic_launcher));
		Ulangan.setContent(new Intent(Perjanjian_Lama.this, Ulangan.class));
		
		TabSpec Yosua = host.newTabSpec("Yosua");
		Yosua.setIndicator("Yosua", getResources().getDrawable(R.drawable.ic_launcher));
		Yosua.setContent(new Intent(Perjanjian_Lama.this, Yosua.class));
		
		TabSpec Hakim = host.newTabSpec("Hakim Hakim");
		Hakim.setIndicator("Hakim Hakim", getResources().getDrawable(R.drawable.ic_launcher));
		Hakim.setContent(new Intent(Perjanjian_Lama.this, Hakim_Hakim.class));
		
		TabSpec Rut = host.newTabSpec("Rut");
		Rut.setIndicator("Rut", getResources().getDrawable(R.drawable.ic_launcher));
		Rut.setContent(new Intent(Perjanjian_Lama.this, Rut.class));
		
		TabSpec samuel_satu = host.newTabSpec("1 Samuel");
		samuel_satu.setIndicator("1 Samuel", getResources().getDrawable(R.drawable.ic_launcher));
		samuel_satu.setContent(new Intent(Perjanjian_Lama.this, Satu_Samuel.class));
		
		TabSpec samuel_dua = host.newTabSpec("2 Samuel");
		samuel_dua.setIndicator("2 Samuel", getResources().getDrawable(R.drawable.ic_launcher));
		samuel_dua.setContent(new Intent(Perjanjian_Lama.this, Dua_Samuel.class));
		
		TabSpec raja_satu = host.newTabSpec("1 Raja-Raja");
		raja_satu.setIndicator("1 Raja-Raja", getResources().getDrawable(R.drawable.ic_launcher));
		raja_satu.setContent(new Intent(Perjanjian_Lama.this, Satu_Raja_Raja.class));
		
		TabSpec raja_dua = host.newTabSpec("2 Raja-Raja");
		raja_dua.setIndicator("2 Raja-Raja", getResources().getDrawable(R.drawable.ic_launcher));
		raja_dua.setContent(new Intent(Perjanjian_Lama.this, Dua_Raja_Raja.class));
		
		TabSpec tawarikh_satu = host.newTabSpec("1 Tawarikh");
		tawarikh_satu.setIndicator("1 Tawarikh", getResources().getDrawable(R.drawable.ic_launcher));
		tawarikh_satu.setContent(new Intent(Perjanjian_Lama.this, Satu_Tawarikh.class));
		
		TabSpec tawarikh_dua = host.newTabSpec("2 Tawarikh");
		tawarikh_dua.setIndicator("2 Tawarikh", getResources().getDrawable(R.drawable.ic_launcher));
		tawarikh_dua.setContent(new Intent(Perjanjian_Lama.this, Dua_Tawarikh.class));
		
		TabSpec ezra = host.newTabSpec("Ezra");
		ezra.setIndicator("Ezra", getResources().getDrawable(R.drawable.ic_launcher));
		ezra.setContent(new Intent(Perjanjian_Lama.this, Ezra.class));
		
		TabSpec nehemia = host.newTabSpec("Nehemia");
		nehemia.setIndicator("Nehemia", getResources().getDrawable(R.drawable.ic_launcher));
		nehemia.setContent(new Intent(Perjanjian_Lama.this, Nehemia.class));
		
		TabSpec ester = host.newTabSpec("Ester");
		ester.setIndicator("Ester", getResources().getDrawable(R.drawable.ic_launcher));
		ester.setContent(new Intent(Perjanjian_Lama.this, Ester.class));
		
		TabSpec ayub = host.newTabSpec("Ayub");
		ayub.setIndicator("Ayub", getResources().getDrawable(R.drawable.ic_launcher));
		ayub.setContent(new Intent(Perjanjian_Lama.this, Ayub.class));
		
		TabSpec mazmur = host.newTabSpec("Mazmur");
		mazmur.setIndicator("Mazmur", getResources().getDrawable(R.drawable.ic_launcher));
		mazmur.setContent(new Intent(Perjanjian_Lama.this, Mazmur.class));
		
		TabSpec amsal = host.newTabSpec("Amsal");
		amsal.setIndicator("Amsal", getResources().getDrawable(R.drawable.ic_launcher));
		amsal.setContent(new Intent(Perjanjian_Lama.this, Amsal.class));
		
		TabSpec pengkhotbah = host.newTabSpec("Pengkhotbah");
		pengkhotbah.setIndicator("Pengkhotbah", getResources().getDrawable(R.drawable.ic_launcher));
		pengkhotbah.setContent(new Intent(Perjanjian_Lama.this, Pengkhotbah.class));
		
		TabSpec kidung_agung = host.newTabSpec("Kidung Agung");
		kidung_agung.setIndicator("Kidung Agung", getResources().getDrawable(R.drawable.ic_launcher));
		kidung_agung.setContent(new Intent(Perjanjian_Lama.this, Kidung_Agung.class));
		
		TabSpec yesaya = host.newTabSpec("Yesaya");
		yesaya.setIndicator("Yesaya", getResources().getDrawable(R.drawable.ic_launcher));
		yesaya.setContent(new Intent(Perjanjian_Lama.this, Yesaya.class));
		
		TabSpec yeremia = host.newTabSpec("Yeremia");
		yeremia.setIndicator("Yeremia", getResources().getDrawable(R.drawable.ic_launcher));
		yeremia.setContent(new Intent(Perjanjian_Lama.this, Yeremia.class));
		
		TabSpec ratapan = host.newTabSpec("Ratapan");
		ratapan.setIndicator("Ratapan", getResources().getDrawable(R.drawable.ic_launcher));
		ratapan.setContent(new Intent(Perjanjian_Lama.this, Ratapan.class));
		
		TabSpec yehezkiel = host.newTabSpec("Yehezkiel");
		yehezkiel.setIndicator("Yehezkiel", getResources().getDrawable(R.drawable.ic_launcher));
		yehezkiel.setContent(new Intent(Perjanjian_Lama.this, Yehezkiel.class));
		
		TabSpec daniel = host.newTabSpec("Daniel");
		daniel.setIndicator("Daniel", getResources().getDrawable(R.drawable.ic_launcher));
		daniel.setContent(new Intent(Perjanjian_Lama.this, Daniel.class));
		
		TabSpec hosea = host.newTabSpec("Hosea");
		hosea.setIndicator("Hosea", getResources().getDrawable(R.drawable.ic_launcher));
		hosea.setContent(new Intent(Perjanjian_Lama.this, Hosea.class));
		
		TabSpec yoel = host.newTabSpec("Yoel");
		yoel.setIndicator("Yoel", getResources().getDrawable(R.drawable.ic_launcher));
		yoel.setContent(new Intent(Perjanjian_Lama.this, Yoel.class));
		
		TabSpec amos = host.newTabSpec("Amos");
		amos.setIndicator("Amos", getResources().getDrawable(R.drawable.ic_launcher));
		amos.setContent(new Intent(Perjanjian_Lama.this, Amos.class));
		
		TabSpec obaja = host.newTabSpec("Obaja");
		obaja.setIndicator("Obaja", getResources().getDrawable(R.drawable.ic_launcher));
		obaja.setContent(new Intent(Perjanjian_Lama.this, Obaja.class));
		
		TabSpec yunus = host.newTabSpec("Yunus");
		yunus.setIndicator("Yunus", getResources().getDrawable(R.drawable.ic_launcher));
		yunus.setContent(new Intent(Perjanjian_Lama.this, Yunus.class));
		
		TabSpec mikha = host.newTabSpec("Mika");
		mikha.setIndicator("Mika", getResources().getDrawable(R.drawable.ic_launcher));
		mikha.setContent(new Intent(Perjanjian_Lama.this, Mikha.class));
		
		TabSpec nahum = host.newTabSpec("Nahum");
		nahum.setIndicator("Nahum", getResources().getDrawable(R.drawable.ic_launcher));
		nahum.setContent(new Intent(Perjanjian_Lama.this, Nahum.class));
		
		TabSpec habakuk = host.newTabSpec("Habakuk");
		habakuk.setIndicator("Habakuk", getResources().getDrawable(R.drawable.ic_launcher));
		habakuk.setContent(new Intent(Perjanjian_Lama.this, Habakuk.class));
		
		TabSpec zefanya = host.newTabSpec("Zefanya");
		zefanya.setIndicator("Zefanya", getResources().getDrawable(R.drawable.ic_launcher));
		zefanya.setContent(new Intent(Perjanjian_Lama.this, Zefanya.class));
		
		TabSpec hagai = host.newTabSpec("Hagai");
		hagai.setIndicator("Hagai", getResources().getDrawable(R.drawable.ic_launcher));
		hagai.setContent(new Intent(Perjanjian_Lama.this, Hagai.class));
		
		TabSpec zakharia = host.newTabSpec("Zakharia");
		zakharia.setIndicator("Zakharia", getResources().getDrawable(R.drawable.ic_launcher));
		zakharia.setContent(new Intent(Perjanjian_Lama.this, Zakharia.class));
		
		TabSpec maleakhi = host.newTabSpec("Maleakhi");
		maleakhi.setIndicator("Maleakhi", getResources().getDrawable(R.drawable.ic_launcher));
		maleakhi.setContent(new Intent(Perjanjian_Lama.this, Maleakhi.class));
		
		host.addTab(kejadian);
		host.addTab(Keluaran);
		host.addTab(Imamat);
		host.addTab(Bilangan);
		host.addTab(Ulangan);
		host.addTab(Yosua);
		host.addTab(Hakim);
		host.addTab(Rut);
		host.addTab(samuel_satu);
		host.addTab(samuel_dua);
		host.addTab(raja_satu);
		host.addTab(raja_dua);
		host.addTab(tawarikh_satu);
		host.addTab(tawarikh_dua);
		host.addTab(ezra);
		host.addTab(nehemia);
		host.addTab(ester);
		host.addTab(ayub);
		host.addTab(mazmur);
		host.addTab(amsal);
		host.addTab(pengkhotbah);
		host.addTab(kidung_agung);
		host.addTab(yesaya);
		host.addTab(yeremia);
		host.addTab(ratapan);
		host.addTab(yehezkiel);
		host.addTab(daniel);
		host.addTab(hosea);
		host.addTab(yoel);
		host.addTab(amos);
		host.addTab(obaja);
		host.addTab(yunus);
		host.addTab(mikha);
		host.addTab(nahum);
		host.addTab(habakuk);
		host.addTab(zefanya);
		host.addTab(hagai);
		host.addTab(zakharia);
		host.addTab(maleakhi);
	
		host.setOnTabChangedListener(this);
		host.setCurrentTab(0);
		setContentView(host);
		
	}

	@SuppressWarnings("deprecation")
	@Override
	protected void onChildTitleChanged(Activity childActivity, CharSequence title){
		super.onChildTitleChanged(childActivity, title);
		setTitle(title);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		switch (item.getItemId()) {
		case android.R.id.home:
			Perjanjian_Lama.this.finish();
			break;
		}
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	public void onTabChanged(String tabId) {
		// TODO Auto-generated method stub
		
	}
}
