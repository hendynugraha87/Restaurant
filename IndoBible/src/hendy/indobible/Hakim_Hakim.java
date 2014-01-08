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

public class Hakim_Hakim extends Activity {

	String [] hk;
	Kejadian k;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		hk = getResources().getStringArray(R.array.hakim_hakim);
		final ListView list_hakim_hakim = (ListView)findViewById(R.id.listview_bible);
		list_hakim_hakim.setAdapter(new ArrayAdapter<String>(Hakim_Hakim.this, android.R.layout.simple_list_item_1,hk));
		list_hakim_hakim.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				if(arg2 == 0){
					k.pesanKejadian("Hakim - Hakim");
				}else if(arg2 == 1){
					
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
			Hakim_Hakim.this.finish();
			break;
		}
		return(super.onOptionsItemSelected(item));
	}
	
	@Override
	protected void onResume(){
		setTitle("Hakim-Hakim");
		super.onResume();
	}
	
}
