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

public class Imamat extends Activity{

	String [] imm;
	Kejadian kej;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		imm = getResources().getStringArray(R.array.imamat);
		final ListView list_imamat = (ListView)findViewById(R.id.listview_bible);
		list_imamat.setAdapter(new ArrayAdapter<String>(Imamat.this, android.R.layout.simple_list_item_1, imm));
		list_imamat.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long arg3) {
				if(pos == 0){
					kej.pesanKejadian("imamat");
				}else if(pos == 1){
					
				}
			}
		});
	}
	
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			Imamat.this.finish();
			break;
		}
		return(super.onOptionsItemSelected(item));
	}
	
	@Override
	protected void onResume(){
		setTitle("Imamat");
		super.onResume();
	}
	
}
