package hendy.indobible;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Dua_Yohanes extends Activity {
	String [] dua_yohanes;
	Kejadian k;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		dua_yohanes = getResources().getStringArray(R.array.dua_yohanes);
		final ListView list = (ListView)findViewById(R.id.listview_bible);
		list.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dua_yohanes));
		list.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				if(arg2==0){
					k.pesanKejadian("");
				}else if(arg2==1){
					
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
			this.finish();
			break;
		}
		return(super.onOptionsItemSelected(item));
	}
	
	@Override
	protected void onResume(){
		setTitle("2 Yohanes");
		super.onResume();
	}
	
}
