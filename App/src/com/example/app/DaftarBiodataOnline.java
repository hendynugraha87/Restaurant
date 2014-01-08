package com.example.app;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class DaftarBiodataOnline extends Activity{
	private OperasiInternet oi;
	private Button btnhapus;
	private Button btnedit;
	private Button btnrefresh;
	private String datadipilih="";
	private JSONObject json = null;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftar_employee_online);

        try {
			GetData();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        final AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        
        ((Button)findViewById(R.id.btnedit)).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if(!datadipilih.isEmpty()){
					TampilkanEditBiodata();
            	}	
			}
		});

        ((Button)findViewById(R.id.btnhapus)).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});

        btnhapus = (Button) findViewById(R.id.btnhapus);
        btnhapus.setOnClickListener(new View.OnClickListener() {  
            @Override  
            public void onClick(View v) {
	            	if(!datadipilih.isEmpty()){
	            		dialog.setTitle("Konfirmasi");
	                	dialog.setMessage("Anda yakin akan menghapus data " + datadipilih + " ini ?");
	                	dialog.setNegativeButton("Cancel", null);
	                	dialog.setPositiveButton("Ok", new AlertDialog.OnClickListener() {
	    					public void onClick(DialogInterface dialog, int arg1) {

	    	            		try {
	    	            			hapusdata();
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
	    	            		//nim = "";nama="";alamat="";
	    					}
	    				});
	                	dialog.show();
	            	}
            	}
 
        });
        btnrefresh = (Button) findViewById(R.id.btnrefresh);
        btnrefresh.setOnClickListener(new View.OnClickListener() {  
            @Override  
            public void onClick(View v) {
            	try {
					GetData();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }  
        });
    }
	private JSONObject GetData() throws InterruptedException{
		JSONObject jsontoserver = new JSONObject();
		try {
			jsontoserver.put("status", "ambildata");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		oi = new OperasiInternet(this);
		if(oi.CheckInternetConnection()){
			oi.SetJSON(jsontoserver);
			oi.execute();
			oi.SetOnPostExecuteListener(
					new OperasiInternet.OnPostExecuteListener() {
						@Override
						public void OnPostExecute() {
							try {
								if(!oi.GetText().isEmpty()){
									json = oi.GetJSON();
									TampilkanData(json);
								}
								else
									messageDialog("Tidak ada respon dari server!");
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
			);
		}	
        return json;
	}
	
	private void TampilkanData(JSONObject json){  
		try {
			JSONArray jsonarr = json.getJSONArray("tables");
		
	        TableLayout TL=(TableLayout) findViewById(R.id.tableLayout); 
	        TL.removeAllViews();
	        
	        int jml_baris = jsonarr.length();
	        String[][] data=new String[jml_baris][3];
	        for(int i = 0; i< jml_baris;i++){
	        	JSONObject jobj = jsonarr.getJSONObject(i);
	        	data[i][0] = jobj.getString("nim");
	        	data[i][1] = jobj.getString("nama");
	        	data[i][2] = jobj.getString("alamat");
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
	                    	//nim = chk.getTag().toString();
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
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
	

	private void hapusdata() throws InterruptedException{
		String delimiter = "\\#";
		String[] temp = datadipilih.split(delimiter);
		JSONObject json = new JSONObject();
		try {
			json.put("nim", temp[0] );
			json.put("status", "hapus");
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
									"Gagal menghapus data "+datadipilih);
								}
								else {	
									messageDialog(responsedariserver);
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
					"Gagal menghapus data "+datadipilih);
		}
		datadipilih = "";
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
