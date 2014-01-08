package com.example.app;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IsiBiodata extends Activity{
	private OperasiDatabase oprDatabase = null;
	private SQLiteDatabase db = null;
	private String[] data = null;
	private EditText txtnim;
	private EditText txtnama;
	private EditText txtalamat;
	private Button btnsimpan;
	private static OperasiInternet oi;
	@Override
    public void onCreate(Bundle savedInstanceState) {
		String nim ="";
		String nama ="";
		String alamat ="";
		
        super.onCreate(savedInstanceState);
        setContentView(R.layout.isibiodata);
        
        oprDatabase = new OperasiDatabase(this);  
        db = oprDatabase.getWritableDatabase();  
        oprDatabase.createTable(db);
        
//        Intent sender = new Intent(getApplicationContext(), IsiBiodata.class);
        Intent sender =  getIntent();
        
    	nim = sender.getExtras().getString("nim");
    	nama = sender.getExtras().getString("nama");
    	alamat = sender.getExtras().getString("alamat");
        
        
        txtnim = (EditText) findViewById(R.id.txtnim);
        txtnim.setText(nim);
        txtnama = (EditText) findViewById(R.id.txtnama);
        txtnama.setText(nama);
        txtalamat = (EditText) findViewById(R.id.txtalamat);
        txtalamat.setText(alamat);
        btnsimpan = (Button) findViewById(R.id.btnsimpan);
      
        btnsimpan.setOnClickListener(new View.OnClickListener() {  
            @Override  
            public void onClick(View v) {  
                  try {
					simpandata();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }  
        });  
    }
	private void simpandata() throws InterruptedException{
		data = new String[]{
				txtnim.getText().toString(),
				txtnama.getText().toString(), 
				txtalamat.getText().toString()
		};
		JSONObject json = new JSONObject();
		try {
			json.put("nim", txtnim.getText().toString() );
			json.put("nama", txtnama.getText().toString());
			json.put("alamat", txtalamat.getText().toString());
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
									oprDatabase.modifyBiodata(db, data);
									messageDialog("Tidak ada response dari server\n" +
									"Untuk sementara data disimpan pada memory HP anda");
									clearText();
								}
								else {	
									messageDialog(responsedariserver);
									oprDatabase.deleteBiodata(db, txtnim.getText().toString());
									clearText();
								}
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
			);
		} 
		else {
			oprDatabase.modifyBiodata(db, data);
			messageDialog("Gagal melakukan Koneksi internet \n" +
			"Untuk sementara data disimpan pada memory HP anda");
			
			clearText();
		}
	}

	public void onDestroy() {  
        super.onDestroy();  
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
	
	private void clearText(){
		txtnim.setText("");
		txtnama.setText("");
		txtalamat.setText("");
	}
}
