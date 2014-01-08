package com.example.mobileprice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

	private DrawerLayout dl;
	private ExpandableListView xl;
	private ActionBarDrawerToggle adt;
	private CharSequence mDrawertitle;
	private List<String> motor;
	private HashMap<String, List<String>> data_motor;
	private ExpandableDrawerAdapter adapt;
	private int lastExpandPosition = -1;
	private MenuItem menuItem;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		loadData();

		mDrawertitle = getActionBar().getTitle();
		getActionBar().setHomeButtonEnabled(true);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		getActionBar().setDisplayShowTitleEnabled(true);
		getActionBar().setNavigationMode(ActionBar.DISPLAY_HOME_AS_UP);
		getActionBar().setBackgroundDrawable(new ColorDrawable(Color.BLUE));
		getActionBar().show();

		dl = (DrawerLayout)findViewById(R.id.drawer_layout);
		xl = (ExpandableListView)findViewById(R.id.left_drawer);
		adt = new ActionBarDrawerToggle(this, dl, R.drawable.ic_drawer, R.string.drawer_open, R.string.drawer_close){
			public void onDrawerClosed(View view) {
				getActionBar().setTitle(mDrawertitle);
				invalidateOptionsMenu();
			}
			public void onDrawerOpened(View drawerView) {
				getActionBar().setTitle("Open Drawer");
				invalidateOptionsMenu();
			}
		};
		dl.setDrawerListener(adt);
		adapt = new ExpandableDrawerAdapter(this, motor, data_motor);
		xl.setAdapter(adapt);
		xl.setOnGroupClickListener(new OnGroupClickListener() {
			@Override
			public boolean onGroupClick(ExpandableListView parent, View v,int groupPosition, long id) {
				return false;
			}
		});
		xl.setOnGroupExpandListener(new OnGroupExpandListener() {
			@Override
			public void onGroupExpand(int groupPosition) {
				if(lastExpandPosition != -1 && groupPosition != lastExpandPosition){
					xl.collapseGroup(lastExpandPosition);
				}
				lastExpandPosition = groupPosition;
			}
		});
		xl.setOnGroupCollapseListener(new OnGroupCollapseListener() {
			@Override
			public void onGroupCollapse(int groupPosition) {}
		});
		xl.setOnChildClickListener(new OnChildClickListener() {
			@Override
			public boolean onChildClick(ExpandableListView parent, View v,int groupPosition, int childPosition, long id) {
				int grup_pos = (int)adapt.getGroupId(groupPosition);
				int child_pos = (int)adapt.getChildId(groupPosition, childPosition);
				Fragment fr = null;
				if(grup_pos == 0){
					switch (child_pos) {
					case 0:
						fr = new AbsoluteRevoCW();
						break;
					case 1:
						fr = new AbsoluteRevoSW();
						break;
					case 2:
						fr = new BeatFICBS();
						break;
					case 3:
						fr = new BeatFICW();
						break;
					case 4:
						fr = new BeatFISW();
						break;
					case 5:
						fr = new CB150RSF();
						break;
					case 6:
						fr = new CBR150R();
						break;
					case 7:
						fr = new CBR150RRE();
						break;
					case 8:
						fr = new CBR250RABSBK();
						break;
					case 9:
						fr = new CBR250RABSRE();
						break;
					case 10:
						fr = new CBR250RSTD();
						break;
					case 11:
						fr = new CBR250STDRE();
						break;
					case 12:
						fr = new CS1();
						break;
					case 13:
						fr = new NewBladeRE();
						break;
					case 14:
						fr = new NewHondaBladeR();
						break;
					case 15:
						fr = new NewHondaBladeS();
						break;
					case 16:
						fr = new NewMegaProCW();
						break;
					case 17:
						fr = new NewMegaProSW();
						break;
					case 18:
						fr = new PCX150();
						break;
					case 19:
						fr = new RevoFit();
						break;
					case 20:
						fr = new ScoopyFI();
						break;
					case 21:
						fr = new SpacyHelmIn();
						break;
					case 22:
						fr = new SupraX125CW();
						break;
					case 23:
						fr = new SupraX125HelmIn();
						break;
					case 24:
						fr = new SupraX125SW();
						break;
					case 25:
						fr = new Tiger();
						break;
					case 26:
						fr = new VarioCBS();
						break;
					case 27:
						fr = new Vario125Techno();
						break;
					case 28:
						fr = new VarioCW();
						break;
					case 29:
						fr = new Verza150CW();
						break;
					case 30:
						fr = new Verza150SW();
						break;
					default:
						break;
					}
				}else if(grup_pos == 1){
					switch (child_pos) {
					case 0:
						fr = new NewScorpioZ();
						break;
					case 1:
						fr = new Byson2013();
						break;
					case 2:
						fr = new NewVixion2013();
						break;
					case 3:
						fr = new Vixion();
						break;
					case 4:
						fr = new NewJupiterMX2013();
						break;
					case 5:
						fr = new JupiterZ1();
						break;
					case 6:
						fr = new JupiterZ();
						break;
					case 7:
						fr = new Force();
						break;
					case 8:
						fr = new MioJSportyTeen();
						break;
					case 9:
						fr = new MioFinoILI();
						break;
					case 10:
						fr = new NewMioFino2013();
						break;
					case 11:
						fr = new XeonRC();
						break;
					case 12:
						fr = new MioGT();
						break;
					case 13:
						fr = new VegaZR();
						break;
					case 14:
						fr = new NewVegaRR();
						break;
					case 15:
						fr = new XRide();
						break;
					case 16:
						fr = new SoulGT();
						break;
					case 17:
						fr = new MioJPoster();
						break;
					case 18:
						fr = new MioJ();
						break;
					case 19:
						fr = new MioFino();
						break;
					case 20:
						fr = new Xeon();
						break;
					case 21:
						fr = new MioSoul();
						break;
					case 22:
						fr = new MioSporty();
						break;
					default:
						break;
					}
				}else if(grup_pos == 2){
					switch (child_pos) {
					case 0:
						fr= new SatriaF150();
						break;
					default:
						break;
					}
				}else if(grup_pos == 3){
					switch (child_pos) {
					case 0:
						fr = new Ninja250R();
						break;
					default:
						break;
					}
				}
				if(fr != null){
					FragmentManager fr_mgr = getFragmentManager();
					fr_mgr.beginTransaction().replace(R.id.content_frame, fr).commit();
					xl.setItemChecked(child_pos, true);
					dl.closeDrawer(xl);
				}else{
					Log.d("Error in here", "Error dalam membuat fragment");
				}
				return false;
			}
		});
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
			finishDialog();
			break;
		case R.id.action_refresh:
			menuItem = item;
			menuItem.setActionView(R.layout.progressbar);
			menuItem.expandActionView();
			LoadTask task = new LoadTask();
			task.execute("Loading");
			break;
		case R.id.action_about:
			aboutMobilePrice();
			break;

		default:
			break;
		}
		return true;
	}

	public void setActionBarTitle(String title){
		getActionBar().setTitle(title);
	}

	private class LoadTask extends AsyncTask<String, Void, String>{

		@Override
		protected String doInBackground(String... params) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return null;
		}

		@Override
		protected void onPostExecute(String result){
			menuItem.collapseActionView();
			menuItem.setActionView(null);
		}
	}

	private void aboutMobilePrice(){
		AlertDialog.Builder f = new AlertDialog.Builder(this, AlertDialog.THEME_HOLO_LIGHT);
		f.setIcon(R.drawable.ic_launcher)
		.setTitle("About Mobile Price")
		.setMessage("Mobile Price adalah aplikasi sederhana guna memberikan informasi terkini mengenai harga - harga motor yang dijual di 4 dealer motor di Indonesia.\nAplikasi ini dikembangkan oleh Hendy Nugraha pada 2 Januari 2014.")
		.setNeutralButton("OK", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});
		AlertDialog h = f.create();
		h.show();
		TextView t = (TextView)h.findViewById(android.R.id.message);
		t.setGravity(Gravity.CENTER);
	}

	private void finishDialog(){
		AlertDialog.Builder g = new AlertDialog.Builder(this, AlertDialog.THEME_HOLO_LIGHT);
		g.setIcon(R.drawable.ic_launcher)
		.setTitle("Perhatian!!")
		.setMessage("Anda yakin ingin keluar dari aplikasi ini ?")
		.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				finish();
			}
		})
		.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});
		AlertDialog k = g.create();
		k.show();
		TextView tv = (TextView)k.findViewById(android.R.id.message);
		tv.setGravity(Gravity.CENTER);
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		adt.syncState();
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		adt.onConfigurationChanged(newConfig);
	}

	public void loadData(){
		motor = new ArrayList<String>();
		data_motor = new HashMap<String, List<String>>();

		motor.add("Honda");
		motor.add("Yamaha");
		motor.add("Suzuki");
		motor.add("Kawasaki");

		List<String> motor_honda = new ArrayList<String>();
		motor_honda.add("Absolute Revo CW");
		motor_honda.add("Absolute Revo SW");
		motor_honda.add("Beat-FI Combi Break System");
		motor_honda.add("Beat-FI CW");
		motor_honda.add("Beat-FI SW");
		motor_honda.add("CB150R Street Fire");
		motor_honda.add("CBR 150R");
		motor_honda.add("CBR 150R Repsol Edition");
		motor_honda.add("CBR 250R (ABS) Black Knight");
		motor_honda.add("CBR 250R (ABS) Repsol Edition");
		motor_honda.add("CBR 250R (STD)");
		motor_honda.add("CBR 250R (STD) Repsol Edition");
		motor_honda.add("City Sport 1");
		motor_honda.add("New Blade Racing Edition");
		motor_honda.add("New Honda Blade R");
		motor_honda.add("New Honda Blade S");
		motor_honda.add("New Mega Pro CW");
		motor_honda.add("New Mega Pro SW");
		motor_honda.add("PCX 150");
		motor_honda.add("Revo Fit");
		motor_honda.add("Scoopy FI");
		motor_honda.add("Spacy Helm in PGM-FI");
		motor_honda.add("Supra X 125 CW");
		motor_honda.add("Supra X 125 Helm in PGM-FI");
		motor_honda.add("Supra X 125 SW");
		motor_honda.add("Tiger");
		motor_honda.add("Vario 125 CBS Idling Stop");
		motor_honda.add("Vario 125 Techno");
		motor_honda.add("Vario CW");
		motor_honda.add("Verza 150 CW");
		motor_honda.add("Verza 150 SW");

		List<String> motor_yamaha = new ArrayList<String>();
		motor_yamaha.add("New Scorpio Z");
		motor_yamaha.add("Byson 2013");
		motor_yamaha.add("New Vixion 2013");
		motor_yamaha.add("Vixion");
		motor_yamaha.add("New Jupiter MX 2013");
		motor_yamaha.add("Jupiter Z1");
		motor_yamaha.add("Jupiter Z");
		motor_yamaha.add("Force");
		motor_yamaha.add("Mio J Sporty & Teen");
		motor_yamaha.add("Mio Fino I Love Indonesia");
		motor_yamaha.add("New Mio Fino 2013");
		motor_yamaha.add("Xeon RC");
		motor_yamaha.add("Mio GT");
		motor_yamaha.add("Vega ZR");
		motor_yamaha.add("New Vega RR");
		motor_yamaha.add("X Ride");
		motor_yamaha.add("Soul GT");
		motor_yamaha.add("Mio J Poster");
		motor_yamaha.add("Mio J");
		motor_yamaha.add("Mio Fino");
		motor_yamaha.add("Xeon");
		motor_yamaha.add("Mio Soul");
		motor_yamaha.add("Mio Sporty");

		List<String> motor_suzuki = new ArrayList<String>();
		motor_suzuki.add("Satria F 150");

		List<String> motor_kawasaki = new ArrayList<String>();
		motor_kawasaki.add("Ninja 250R");

		data_motor.put(motor.get(0), motor_honda);
		data_motor.put(motor.get(1), motor_yamaha);
		data_motor.put(motor.get(2), motor_suzuki);
		data_motor.put(motor.get(3), motor_kawasaki);
	}

	public class ExpandableDrawerAdapter extends BaseExpandableListAdapter{

		private Activity act;
		public final Context _context;
		public List<String> _motor, tempChild;
		public HashMap<String, List<String>> _data_motor;

		public ExpandableDrawerAdapter(Context context, List<String> motor, HashMap<String, List<String>> data_motor){
			this._context = context;
			this._motor = motor;
			this._data_motor = data_motor;
		}

		@Override
		public Object getChild(int groupPosition, int childPosition) {
			return this._data_motor.get(this._motor.get(groupPosition)).get(childPosition);
		}

		@Override
		public long getChildId(int groupPosition, int childPosition) {
			return childPosition;
		}

		@Override
		public View getChildView(int groupPosition, int childPosition,boolean isLastChild, View convertView, ViewGroup parent) {
			final String childText = (String)getChild(groupPosition, childPosition);
			if(convertView == null){
				LayoutInflater inflater = (LayoutInflater)this._context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				convertView = inflater.inflate(R.layout.list_row_data_motor, null);
			}
			TextView a = (TextView)convertView.findViewById(R.id.lblListItem);
			a.setText(childText);
			return convertView;
		}

		@Override
		public int getChildrenCount(int groupPosition) {
			return this._data_motor.get(this._motor.get(groupPosition)).size();
		}

		@Override
		public Object getGroup(int groupPosition) {
			return this._motor.get(groupPosition);
		}

		@Override
		public int getGroupCount() {
			return this._motor.size();
		}

		@Override
		public long getGroupId(int groupPosition) {
			return groupPosition;
		}

		@Override
		public View getGroupView(int groupPosition, boolean isExpanded,View convertView, ViewGroup parent) {
			String headerTitle = (String)getGroup(groupPosition);
			if(convertView==null){
				LayoutInflater inflater = (LayoutInflater)this._context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				convertView = inflater.inflate(R.layout.list_row_group, null);
			}
			if(groupPosition == 0){
				((ImageView)convertView.findViewById(R.id.imageExpandableList)).setBackgroundResource(R.drawable.honda_logo);
				((TextView)convertView.findViewById(R.id.text02)).setText("Motor Honda");
			}else if(groupPosition == 1){
				((ImageView)convertView.findViewById(R.id.imageExpandableList)).setBackgroundResource(R.drawable.yamaha_logo);
				((TextView)convertView.findViewById(R.id.text02)).setText("Motor Yamaha");
			}else if(groupPosition == 2){
				((ImageView)convertView.findViewById(R.id.imageExpandableList)).setBackgroundResource(R.drawable.suzuki_logo);
				((TextView)convertView.findViewById(R.id.text02)).setText("Motor Suzuki");
			}else if(groupPosition == 3){
				((ImageView)convertView.findViewById(R.id.imageExpandableList)).setBackgroundResource(R.drawable.kawasaki_logo);
				((TextView)convertView.findViewById(R.id.text02)).setText("Motor Kawasaki");
			}
			TextView b = (TextView)convertView.findViewById(R.id.text01);
			b.setTypeface(null, Typeface.BOLD);
			b.setText(headerTitle);
			return convertView;
		}

		@Override
		public boolean hasStableIds() {
			return true;
		}

		@Override
		public boolean isChildSelectable(int groupPosition, int childPosition) {
			return true;
		}

	}

}
