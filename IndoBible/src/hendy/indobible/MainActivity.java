package hendy.indobible;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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

public class MainActivity extends Activity {

	String [] bible;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Resources r = getResources();
		bible = r.getStringArray(R.array.bible);
		
//	    creating Actionbar
		ActionBar actionBar = getActionBar();
		actionBar.setHomeButtonEnabled(true);
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
		actionBar.setTitle(R.string.title_bible);
		actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLUE));
		actionBar.setDisplayShowTitleEnabled(true);
		actionBar.show();
		
		final ListView list_bible = (ListView)findViewById(R.id.listview_bible);
		list_bible.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, bible));
		list_bible.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long arg3) {
				// TODO Auto-generated method stub
				if(pos == 0){
					startActivity(new Intent(MainActivity.this, Perjanjian_Lama.class));
				} else if(pos == 1){
					startActivity(new Intent(MainActivity.this, Perjanjian_Baru.class));
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
			MainActivity.this.finish();
			break;
		}
		return(super.onOptionsItemSelected(item));
	}

}
