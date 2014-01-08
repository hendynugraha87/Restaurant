package hendy.indobible;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Keluaran extends Activity{

	String [] kel;
	Kejadian kej;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Resources r = getResources();
		kel = r.getStringArray(R.array.keluaran);
		
		final ListView list_keluaran = (ListView)findViewById(R.id.listview_bible);
		list_keluaran.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, kel));
		list_keluaran.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long arg3) {
				if(pos == 0){
					kej.pesanKejadian("a");
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
					
				}else if(pos == 18){
					
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
					
				}
			}
		});
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			Keluaran.this.finish();
			break;
		}
		return(super.onOptionsItemSelected(item));
	}
	
	@Override
	protected void onResume(){
		setTitle("Keluaran");
		super.onResume();
	}
	
}
