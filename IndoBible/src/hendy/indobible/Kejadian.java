package hendy.indobible;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Kejadian extends Activity{
	String [] kej;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Resources r = getResources();
		kej = r.getStringArray(R.array.kejadian);
		final String kej01 = r.getString(R.string.kejadian1_1);
		final String kej02 = r.getString(R.string.kejadian1_2);
		final String kej03 = r.getString(R.string.kejadian1_3);
		final String kej04 = r.getString(R.string.kejadian1_4);
		final String kej05 = r.getString(R.string.kejadian1_5);
		final String kej06 = r.getString(R.string.kejadian1_6);
		final String kej07 = r.getString(R.string.kejadian1_7);
		final String kej08 = r.getString(R.string.kejadian1_8);
		final String kej09 = r.getString(R.string.kejadian1_9);
		final String kej10 = r.getString(R.string.kejadian1_10);
//		final String kej11 = r.
		
		final ListView list_kejadian = (ListView)findViewById(R.id.listview_bible);
		list_kejadian.setAdapter(new ArrayAdapter<String>(Kejadian.this, android.R.layout.simple_list_item_1, kej));
		list_kejadian.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long arg3) {
				if(pos == 0){
					pesanKejadian(kej01 +"\n"+ kej02 + "\n" + kej03 + "\n" + kej04 + "\n" + kej05 + "\n" + kej06 + "\n" + kej07 + "\n" + kej08 + "\n" + kej09 + "\n" + kej10);
				}else if(pos == 1){
					
				}else if(pos == 2){
					
				}else if(pos == 3){
					
				}else if(pos == 4){
					
				}else if(pos == 5){
					
				}else if(pos == 6){
					
				}else if(pos == 7){
					
				}else if(pos == 8){
					
				}else if(pos == 9){
					
				}else if(pos == 10){
					
				}else if(pos == 11){
					
				}else if(pos == 12){
					
				}else if(pos == 13){
					
				}else if(pos == 14){
					
				}else if(pos == 15){
					
				}else if(pos == 16){
					
				}else if(pos == 17){
					
				}else if(pos == 19){
					
				}else if(pos == 20){
					
				}else if(pos == 21){
					
				}else if(pos == 22){
					
				}else if(pos == 23){
					
				}else if(pos == 24){
					
				}else if(pos == 25){
					
				}else if(pos == 26){
					
				}else if(pos == 27){
					
				}else if(pos == 28){
					
				}else if(pos == 29){
					
				}else if(pos == 30){
					
				}else if(pos == 31){
					
				}else if(pos == 32){
					
				}else if(pos == 33){
					
				}else if(pos == 34){
					
				}else if(pos == 35){
					
				}else if(pos == 36){
					
				}else if(pos == 37){
					
				}else if(pos == 38){
					
				}else if(pos == 39){
					
				}else if(pos == 40){
					
				}else if(pos == 41){
					
				}else if(pos == 42){
					
				}else if(pos == 43){
					
				}else if(pos == 44){
					
				}else if(pos == 45){
					
				}else if(pos == 46){
					
				}else if(pos == 47){
					
				}else if(pos == 48){
					
				}else if(pos == 49){
					
				}
			}
		});
		
	}
	
	public void pesanKejadian(String message){
		AlertDialog.Builder alert = new AlertDialog.Builder(Kejadian.this, AlertDialog.THEME_HOLO_DARK);
		alert.setTitle("Kitab Kejadian")
			.setIcon(R.drawable.ic_launcher)
			.setMessage(message)
			.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which) {
					dialog.dismiss();
				}
			}).show();
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			Kejadian.this.finish();
			break;
		}
		return(super.onOptionsItemSelected(item));
	}
	
	@Override
	protected void onResume(){
		setTitle("Kejadian");
		super.onResume();
	}
}