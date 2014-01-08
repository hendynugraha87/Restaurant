package hendy.indobible;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Ulangan extends Activity{

	String [] ul;
	Kejadian k;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ul = getResources().getStringArray(R.array.ulangan);
		final ListView list_ulangan = (ListView)findViewById(R.id.listview_bible);
		list_ulangan.setAdapter(new ArrayAdapter<String>(Ulangan.this, android.R.layout.simple_list_item_1, ul));
		list_ulangan.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos,long arg3) {
				if(pos == 0){
					k.pesanKejadian("ulangan");
				}else if(pos == 1){
					
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
			Ulangan.this.finish();
			break;
		}
		return(super.onOptionsItemSelected(item));
	}
	
	@Override
	protected void onResume(){
		setTitle("Ulangan");
		super.onResume();
	}
	
}
