package com.example.app;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends Activity implements OnClickListener {

	EditText edit_text;
	Button tambah;
	Button hapus;
	
	private ArrayAdapter<String> mAdapter;
	private ArrayList<String> mPresets = new ArrayList<String>();
	ListView list;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tambah = (Button)findViewById(R.id.btn_tambah);
		hapus = (Button)findViewById(R.id.btn_hapus);
		edit_text = (EditText)findViewById(R.id.txt_edit);
		list = (ListView)findViewById(R.id.listview1);
		
		mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mPresets);
		
		list.setAdapter(mAdapter);
		tambah.setOnClickListener(this);
		hapus.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.equals(tambah) && !edit_text.getText().equals("")){
			mAdapter.add(edit_text.getText().toString());
		} else {
			edit_text.setText("");
		}
	}
}
