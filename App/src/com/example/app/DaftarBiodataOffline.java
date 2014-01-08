package com.example.app;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class DaftarBiodataOffline extends Activity{
	private OperasiInternet oi;
	private OperasiDatabase oprDatabase = null;
	private SQLiteDatabase db = null;
    private Cursor dbCursor = null;  
	private Button btnupload;
	private Button btnedit;
	private Button btnrefresh;
	private String datadipilih="";
	private String nim="";
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftar_employee_offline);
        
        oprDatabase = new OperasiDatabase(this);  
        db = oprDatabase.getWritableDatabase();  
        oprDatabase.createTable(db);
        TampilkanData();
        
        btnrefresh = (Button) findViewById(R.id.btnrefresh);
        btnrefresh.setOnClickListener(new View.OnClickListener() {  
            @Override  
            public void onClick(View v) {
            	TampilkanData();
            }  
        });
        
        btnedit = (Button) findViewById(R.id.btnedit);
        btnedit.setOnClickListener(new View.OnClickListener() {  
            @Override  
            public void onClick(View v) {  
            	if(!datadipilih.isEmpty()){
                    TampilkanEditBiodata();
            	}
            }  
        });
        
        btnupload = (Button) findViewById(R.id.btnupload);
        btnupload.setOnClickListener(new View.OnClickListener() {  
            @Override  
            public void onClick(View v) {
            	try {
            		if(!datadipilih.isEmpty()){
            			uploaddata();
                	}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }  
        });  
       
    }
	
	
	private void TampilkanData(){  
        TableLayout TL=(TableLayout) findViewById(R.id.tableLayout); 
        TL.removeAllViews();
  
		dbCursor = oprDatabase.selectBiodata(db, "SELECT * FROM biodata");  
        dbCursor.moveToFirst();  
        int jml_baris=dbCursor.getCount();  
        
        if(jml_baris == 0) return;
        
        int kol_nim=dbCursor.getColumnIndex("nim");  
        int kol_nama=dbCursor.getColumnIndex("nama");  
        int kol_alamat=dbCursor.getColumnIndex("alamat");  
        int indeks=1;  
        String[][] data=new String[jml_baris][3];  
          
        data[0][0]=dbCursor.getString(kol_nim);  
        data[0][1]=dbCursor.getString(kol_nama);  
        data[0][2]=dbCursor.getString(kol_alamat);  
          
        if(dbCursor!=null){  
            while(dbCursor.moveToNext()){  
                data[indeks][0]=dbCursor.getString(kol_nim);  
                data[indeks][1]=dbCursor.getString(kol_nama);  
                data[indeks][2]=dbCursor.getString(kol_alamat);  
                indeks++;  
            }  
        }  
          
        TableLayout.LayoutParams ParameterTableLayout=new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT);
        for(int awal=0; awal<jml_baris;awal++){  
            TableRow TR=new TableRow(this);  
            TR.setBackgroundColor(Color.BLACK);  
            TR.setLayoutParams(ParameterTableLayout);  
            TableRow.LayoutParams ParameterTableRow=new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT);  
            ParameterTableRow.setMargins(1,1,1,1);
            
            final CheckBox chk = new CheckBox(this);
            chk.setTag(data[awal][0]+"#"+data[awal][1]+"#"+data[awal][2]);
            TR.addView(chk,ParameterTableRow );
            chk.setOnClickListener(new OnClickListener() {  
                @Override  
                public void onClick(View v) {  
                    if(chk.isChecked())
                    	datadipilih = chk.getTag().toString();
                    else 
                    	datadipilih = "";
                }  
              });  
            
        	for(int kolom = 0;kolom < 3; kolom++){
                TextView TV=new TextView(this);
                TV.setText(data[awal][kolom]);  
                TV.setTextColor(Color.BLACK);  
                TV.setPadding(1, 4, 1, 4);  
                TV.setGravity(Gravity.LEFT);  
                TV.setBackgroundColor(Color.WHITE);  
                TR.addView(TV,ParameterTableRow );  
            }  
            TL.addView(TR);  
        }  
          
    }  
	private void TampilkanEditBiodata(){
		String delimiter = "\\#";
		String[] temp = datadipilih.split(delimiter);
		Intent intentIsiBiodata = new Intent(this, IsiBiodata.class);
		intentIsiBiodata.putExtra("nim", temp[0]);
		intentIsiBiodata.putExtra("nama", temp[1]);
		intentIsiBiodata.putExtra("alamat", temp[2]);
		startActivity(intentIsiBiodata);
		datadipilih = "";
	}

	private void uploaddata() throws InterruptedException{
		String delimiter = "\\#";
		String[] temp = datadipilih.split(delimiter);
		nim = temp[0];
		JSONObject json = new JSONObject();
		try {
			json.put("nim", temp[0] );
			json.put("nama", temp[1]);
			json.put("alamat", temp[2]);
			json.put("status", "modifikasi");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		oi = new OperasiInternet(this);
		if(oi.CheckInternetConnection()){
			oi.SetJSON(json);
			oi.execute();
			oi.SetOnPostExecuteListener(
					new OperasiInternet.OnPostExecuteListener() {
						@Override
						public void OnPostExecute() {
							try {
								String responsedariserver = oi.GetText();
								if(responsedariserver.isEmpty()){
									messageDialog("Tidak ada response dari server\n" +
									"Proses Upload Data tidak bisa dilanjutkan");
								}
								else {	
									messageDialog(responsedariserver);
									oprDatabase.deleteBiodata(db, nim);
								}
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
			);
		} 
		else {
			messageDialog("Gagal melakukan Koneksi internet \n" +
			"Proses Upload Data tidak bisa dilanjutkan");
		}
		datadipilih = "";
	}
	public void onDestroy() {  
        super.onDestroy();  
        dbCursor.close();  
        db.close();  
    }
	private void messageDialog(String message){
		AlertDialog alertDialog = new AlertDialog.Builder(this).create();
		alertDialog.setTitle("Alert Dialog");
		alertDialog.setMessage(message);
		alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
		        public void onClick(DialogInterface dialog, int which) {
		        }
		});
		alertDialog.show();
	}
}
