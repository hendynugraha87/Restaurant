package hendy.indonesiabible;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.SearchManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;
import android.widget.SearchView.OnQueryTextListener;
import android.widget.TextView;

public class MainActivity extends Activity {

	public DrawerLayout dl;
	public ExpandableListView xl;
	private ListView lv;
	public ActionBarDrawerToggle adt;
	public List<String> alkitab;
	public HashMap<String, List<String>> data_alkitab;
	public CharSequence title;
	private int lastExpandPosition = -1;
	private MenuItem menuItem;
	private ExpandableDrawerAdapter adapt;
	private String [] lagu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		loadData();
		
		lagu = new String [] {
			"Kidung Jemaat",
			"Gita Bakti"
		};

		title = getActionBar().getTitle();
		getActionBar().setHomeButtonEnabled(true);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		getActionBar().setDisplayShowTitleEnabled(true);
		getActionBar().setNavigationMode(ActionBar.DISPLAY_HOME_AS_UP);
		getActionBar().setBackgroundDrawable(new ColorDrawable(Color.BLUE));
		getActionBar().show();

		dl = (DrawerLayout)findViewById(R.id.drawer_layout);
		adt = new ActionBarDrawerToggle(this, dl, R.drawable.ic_drawer, R.string.drawer_open, R.string.drawer_close){
			public void onDrawerClosed(View view) {
				getActionBar().setTitle(title);
				invalidateOptionsMenu();
			}
			public void onDrawerOpened(View drawerView) {
				getActionBar().setTitle("Open Drawer");
				invalidateOptionsMenu();
			}
		};
		adt.setDrawerIndicatorEnabled(false);
		dl.setDrawerListener(adt);
		xl = (ExpandableListView)findViewById(R.id.left_drawer);
		lv = (ListView)findViewById(R.id.right_drawer);
		adapt = new ExpandableDrawerAdapter(this, alkitab, data_alkitab);
		lv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lagu));
		xl.setAdapter(adapt);
		xl.setTextFilterEnabled(true);
		xl.setOnGroupClickListener(new OnGroupClickListener() {
			@Override
			public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
				return false;
			}
		});

		xl.setOnGroupExpandListener(new OnGroupExpandListener() {
			@Override
			public void onGroupExpand(int groupPosition) {
				if (lastExpandPosition != -1 && groupPosition != lastExpandPosition) {
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
			public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
				int grup_pos = (int)adapt.getGroupId(groupPosition);
				int child_pos = (int)adapt.getChildId(groupPosition, childPosition);
				Fragment frag = null;
				if(grup_pos == 0){
					switch (child_pos) {
					case 0:
						frag = new KejadianFragment();
						break;
					case 1:
						frag = new KeluaranFragment();
						break;
					case 2:
						frag = new ImamatFragment();
						break;
					case 3:
						frag = new BilanganFragment();
						break;
					case 4:
						frag = new UlanganFragment();
						break;
					case 5:
						frag = new YosuaFragment();
						break;
					case 6:
						frag = new HakimFragment();
						break;
					case 7:
						frag = new RutFragment();
						break;
					case 8:
						frag = new SatuSamuelFragment();
						break;
					case 9:
						frag = new DuaSamuelFragment();
						break;
					case 10:
						frag = new SatuRajaFragment();
						break;
					case 11:
						frag = new DuaRajaFragment();
						break;
					case 12:
						frag = new SatuTawarikhFragment();
						break;
					case 13:
						frag = new DuaTawarikhFragment();
						break;
					case 14:
						frag = new EzraFragment();
						break;
					case 15:
						frag = new NehemiaFragment();
						break;
					case 16:
						frag = new EsterFragment();
						break;
					case 17:
						frag = new AyubFragment();
						break;
					case 18:
						frag = new MazmurFragment();
						break;
					case 19:
						frag = new AmsalFragment();
						break;
					case 20:
						frag = new PengkhotbahFragment();
						break;
					case 21:
						frag = new KidungAgungFragment();
						break;
					case 22:
						frag = new YesayaFragment();
						break;
					case 23:
						frag = new YeremiaFragment();
						break;
					case 24:
						frag = new RatapanFragment();
						break;
					case 25:
						frag = new YehezkielFragment();
						break;
					case 26:
						frag = new DanielFragment();
						break;
					case 27:
						frag = new HoseaFragment();
						break;
					case 28:
						frag = new YoelFragment();
						break;
					case 29:
						frag = new AmosFragment();
						break;
					case 30:
						frag = new ObajaFragment();
						break;
					case 31:
						frag = new YunusFragment();
						break;
					case 32:
						frag = new MikhaFragment();
						break;
					case 33:
						frag = new NahumFragment();
						break;
					case 34:
						frag = new HabakukFragment();
						break;
					case 35:
						frag = new ZefanyaFragment();
						break;
					case 36:
						frag = new HagaiFragment();
						break;
					case 37:
						frag = new ZakhariaFragment();
						break;
					case 38:
						frag = new MaleakhiFragment();
						break;
					default:
						break;
					}
				} else if(grup_pos == 1){
					switch (child_pos) {
					case 0:
						frag = new MatiusFragment();
						break;
					case 1:
						frag=  new MarkusFragment();
						break;
					case 2:
						frag=  new LukasFragment();
						break;
					case 3:
						frag=  new YohanesFragment();
						break;
					case 4:
						frag=  new KisahFragment();
						break;
					case 5:
						frag=  new RomaFragment();
						break;
					case 6:
						frag=  new SatuKorintusFragment();
						break;
					case 7:
						frag=  new DuaKorintusFragment();
						break;
					case 8:
						frag=  new GalatiaFragment();
						break;
					case 9:
						frag=  new EfesusFragment();
						break;
					case 10:
						frag=  new FilipiFragment();
						break;
					case 11:
						frag=  new KoloseFragment();
						break;
					case 12:
						frag=  new SatuTesalonikaFragment();
						break;
					case 13:
						frag=  new DuaTesalonikaFragment();
						break;
					case 14:
						frag=  new SatuTimotiusFragment();
						break;
					case 15:
						frag=  new DuaTimotiusFragment();
						break;
					case 16:
						frag=  new TitusFragment();
						break;
					case 17:
						frag=  new FilemonFragment();
						break;
					case 18:
						frag=  new IbraniFragment();
						break;
					case 19:
						frag=  new YakobusFragment();
						break;
					case 20:
						frag=  new SatuPetrusFragment();
						break;
					case 21:
						frag=  new DuaPetrusFragment();
						break;
					case 22:
						frag=  new SatuYohanesFragment();
						break;
					case 23:
						frag=  new DuaYohanesFragment();
						break;
					case 24:
						frag=  new TigaYohanesFragment();
						break;
					case 25:
						frag=  new YudasFragment();
						break;
					case 26:
						frag=  new WahyuFragment();
						break;
					default:
						break;
					}
				}
				if(frag != null){
					FragmentManager frag_mgr = getFragmentManager();
					frag_mgr.beginTransaction().replace(R.id.content_frame, frag).commit();
					xl.setItemChecked(child_pos, true);
					dl.closeDrawer(xl);
				} else {
					Log.d("Error in here", "Error dalam membuat fragment");
				}
				return false;
			}
		});
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long arg3) {
				displayView(pos);				
			}
		});
	}

	public void loadData(){

		alkitab = new ArrayList<String>();
		data_alkitab = new HashMap<String, List<String>>();

		alkitab.add("Perjanjian Lama");
		alkitab.add("Perjanjian Baru");

		List<String> kitab_perjanjian_lama = new ArrayList<String>();
		kitab_perjanjian_lama.add("Kejadian");
		kitab_perjanjian_lama.add("Keluaran");
		kitab_perjanjian_lama.add("Imamat");
		kitab_perjanjian_lama.add("Bilangan");
		kitab_perjanjian_lama.add("Ulangan");
		kitab_perjanjian_lama.add("Yosua");
		kitab_perjanjian_lama.add("Hakim-Hakim");
		kitab_perjanjian_lama.add("Rut");
		kitab_perjanjian_lama.add("1 Samuel");
		kitab_perjanjian_lama.add("2 Samuel");
		kitab_perjanjian_lama.add("1 Raja-Raja");
		kitab_perjanjian_lama.add("2 Raja-Raja");
		kitab_perjanjian_lama.add("1 Tawarikh");
		kitab_perjanjian_lama.add("2 Tawarikh");
		kitab_perjanjian_lama.add("Ezra");
		kitab_perjanjian_lama.add("Nehemia");
		kitab_perjanjian_lama.add("Ester");
		kitab_perjanjian_lama.add("Ayub");
		kitab_perjanjian_lama.add("Mazmur");
		kitab_perjanjian_lama.add("Amsal");
		kitab_perjanjian_lama.add("Pengkhotbah");
		kitab_perjanjian_lama.add("Kidung Agung");
		kitab_perjanjian_lama.add("Yesaya");
		kitab_perjanjian_lama.add("Yeremia");
		kitab_perjanjian_lama.add("Ratapan");
		kitab_perjanjian_lama.add("Yehezkiel");
		kitab_perjanjian_lama.add("Daniel");
		kitab_perjanjian_lama.add("Hosea");
		kitab_perjanjian_lama.add("Yoel");
		kitab_perjanjian_lama.add("Amos");
		kitab_perjanjian_lama.add("Obaja");
		kitab_perjanjian_lama.add("Yunus");
		kitab_perjanjian_lama.add("Mikha");
		kitab_perjanjian_lama.add("Nahum");
		kitab_perjanjian_lama.add("Habakuk");
		kitab_perjanjian_lama.add("Zefanya");
		kitab_perjanjian_lama.add("Hagai");
		kitab_perjanjian_lama.add("Zakharia");
		kitab_perjanjian_lama.add("Maleakhi");

		List<String> kitab_perjanjian_baru = new ArrayList<String>();
		kitab_perjanjian_baru.add("Matius");
		kitab_perjanjian_baru.add("Markus");
		kitab_perjanjian_baru.add("Lukas");
		kitab_perjanjian_baru.add("Yohanes");
		kitab_perjanjian_baru.add("Kisah Para Rasul");
		kitab_perjanjian_baru.add("Roma");
		kitab_perjanjian_baru.add("1 Korintus");
		kitab_perjanjian_baru.add("2 Korintus");
		kitab_perjanjian_baru.add("Galatia");
		kitab_perjanjian_baru.add("Efesus");
		kitab_perjanjian_baru.add("Filipi");
		kitab_perjanjian_baru.add("Kolose");
		kitab_perjanjian_baru.add("1 Tesalonika");
		kitab_perjanjian_baru.add("2 Tesalonika");
		kitab_perjanjian_baru.add("1 Timotius");
		kitab_perjanjian_baru.add("2 Timotius");
		kitab_perjanjian_baru.add("Titus");
		kitab_perjanjian_baru.add("Filemon");
		kitab_perjanjian_baru.add("Ibrani");
		kitab_perjanjian_baru.add("Yakobus");
		kitab_perjanjian_baru.add("1 Petrus");
		kitab_perjanjian_baru.add("2 Petrus");
		kitab_perjanjian_baru.add("1 Yohanes");
		kitab_perjanjian_baru.add("2 Yohanes");
		kitab_perjanjian_baru.add("3 Yohanes");
		kitab_perjanjian_baru.add("Yudas");
		kitab_perjanjian_baru.add("Wahyu");

		data_alkitab.put(alkitab.get(0), kitab_perjanjian_lama);
		data_alkitab.put(alkitab.get(1), kitab_perjanjian_baru);
	}
	
	private void displayView(int position){
		Fragment f = null;
		switch (position) {
		case 0:
			f = new KidungJemaatFragment();
			break;
		case 1:
			f = new GitaBaktiFragment();
			break;
		default:
			break;
		}
		if(f != null){
			FragmentManager frag_mgr = getFragmentManager();
			frag_mgr.beginTransaction().replace(R.id.content_frame, f).commit();
			dl.closeDrawer(xl);
		} else {
			Log.d("Error in here", "Error dalam membuat fragment");
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		SearchView srch = (SearchView)menu.findItem(R.id.action_search).getActionView();
		srch.setOnQueryTextListener(new OnQueryTextListener() {
			@Override
			public boolean onQueryTextSubmit(String query) { 
				return false; 
			}

			@Override
			public boolean onQueryTextChange(String newText) {
				if (TextUtils.isEmpty(newText)) {
					xl.setFilterText(newText);
				}else{
					xl.setFilterText(newText.toString().toLowerCase());
				}
				return true;
			}
		});
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			finishDialog();
			break;
		case R.id.action_refresh:
			menuItem = item;
			menuItem.setActionView(R.layout.progressbar);
			menuItem.expandActionView();
			LoadTask task = new LoadTask();
			task.execute("test");
			break;
		case R.id.action_left_drawer:
			if(dl.isDrawerOpen(lv)){
				dl.closeDrawer(lv);
			}
			dl.openDrawer(xl);
			break;
		case R.id.action_right_drawer:
			if(dl.isDrawerOpen(xl)){
				dl.closeDrawer(xl);
			}
			dl.openDrawer(lv);
			break;
		case R.id.action_about:
			aboutIndonesiaBible();
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
	    protected void onPostExecute(String result) {
	      menuItem.collapseActionView();
	      menuItem.setActionView(null);
	    }
	}
	
	private void aboutIndonesiaBible(){
		AlertDialog.Builder a = new AlertDialog.Builder(this, AlertDialog.THEME_HOLO_DARK);
		a.setIcon(R.drawable.ic_launcher)
		.setTitle("About Indonesia Bible")
		.setMessage("Indonesia Bible dikembangkan oleh Hendy Nugraha pada Desember 2013.\nTerdapat 5 fasilitas yang diberikan yaitu :\n - Kitab Perjanjian Lama,\n - Kitab Perjanjian Baru,\n - Kidung Jemaat,\n - Gita Bakti,\n - Renungan Harian.\n")
		.setNeutralButton("OK", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});
		AlertDialog b = a.create();
		b.show();
		TextView t = (TextView)b.findViewById(android.R.id.message);
		t.setGravity(Gravity.CENTER);
	}
	
	private void finishDialog(){
		AlertDialog.Builder al = new AlertDialog.Builder(this, AlertDialog.THEME_HOLO_DARK);
		al.setIcon(R.drawable.ic_launcher)
		.setTitle("Perhatian")
		.setMessage("Anda yakin ingin keluar ?")
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
		AlertDialog c = al.create();
		c.show();
		TextView tv = (TextView)c.findViewById(android.R.id.message);
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

	public class ExpandableDrawerAdapter extends BaseExpandableListAdapter implements Filterable{

		public Activity act;
		public final Context _context;
		public List<String> _alkitab, tempchild;
		public HashMap<String, List<String>> _data_alkitab;

		public ExpandableDrawerAdapter(Context context, List<String> alkitab, HashMap<String, List<String>> data_alkitab){
			this._context = context;
			this._alkitab = alkitab;
			this._data_alkitab = data_alkitab;
		}

		@Override
		public Object getChild(int groupPosition, int childPosition) {
			return this._data_alkitab.get(this._alkitab.get(groupPosition)).get(childPosition);
		}

		@Override
		public long getChildId(int groupPosition, int childPosition) {
			return childPosition;
		}

		@Override
		public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
			final String childText = (String)getChild(groupPosition, childPosition);
			if(convertView == null){
				LayoutInflater inflater = (LayoutInflater)this._context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				convertView = inflater.inflate(R.layout.list_row_data_alkitab, null);
			}
			TextView a = (TextView)convertView.findViewById(R.id.lblListItem);
			a.setText(childText);
			return convertView;
		}

		@Override
		public int getChildrenCount(int groupPosition) {
			return this._data_alkitab.get(this._alkitab.get(groupPosition)).size();
		}

		@Override
		public Object getGroup(int groupPosition) {
			return this._alkitab.get(groupPosition);
		}

		@Override
		public int getGroupCount() {
			return this._alkitab.size();
		}

		@Override
		public long getGroupId(int groupPosition) {
			return groupPosition;
		}

		@Override
		public View getGroupView(int groupPosition, boolean isExpanded,	View convertView, ViewGroup parent) {
			String headerTitle = (String)getGroup(groupPosition);
			if(convertView == null){			
				LayoutInflater inflater = (LayoutInflater)this._context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				convertView = inflater.inflate(R.layout.list_row_group, null);
			}	
			TextView b = (TextView)convertView.findViewById(R.id.lblListHeader);
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

		@Override
		public Filter getFilter() {
			return null;
		}
				
	}
}
