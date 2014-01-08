package com.example.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;


public class OperasiInternet extends AsyncTask<String, String, String>{
	//IP address 10.0.2.2 adalah IP local pada PC anda. 
	//Jika server berada di lain PC, maka sesuaikan IP Address server anda
	
	private String URL ="http://10.0.2.2";
	private ProgressDialog pDialog;
	private Context mContext;
	
	private String responsefromserver;
	private JSONObject jsonfromserver = null;
	private JSONObject jsonfromclient = null;
	private boolean postformatjson = false;
	
	//constructor
	public OperasiInternet(Context c){
		mContext = c;
	}
	//buat event handler untuk menandai proses postExecute telah selesai
	public interface OnPostExecuteListener
	{
	    public abstract void OnPostExecute();
	}
	private OnPostExecuteListener onPostExecuteListener = null;
	public void SetOnPostExecuteListener(OnPostExecuteListener l)
	{
		onPostExecuteListener = l;
	}
	
	public boolean CheckInternetConnection() {
	    //status koneksi internet dari connectivity manager
	    ConnectivityManager connectivityManager = (ConnectivityManager) mContext
	            .getSystemService(Context.CONNECTIVITY_SERVICE);
	    if (connectivityManager != null) {
	        NetworkInfo[] networkInfo = connectivityManager.getAllNetworkInfo();
	        if (networkInfo != null) {
	            for (int i = 0; i < networkInfo.length; i++) {
	                if (networkInfo[i].getState() == NetworkInfo.State.CONNECTED) {
	                    return true;
	                }
	            }
	        }
	    }
	    return false;
	}
	
	@Override
    protected void onPreExecute() {
        super.onPreExecute();
        pDialog = new ProgressDialog(mContext);
        pDialog.setMessage("Mohon sabar menunggu, sedang proses koneksi ke internet");
        pDialog.setIndeterminate(false);
        pDialog.setCancelable(true);
        pDialog.show();
    }
	
	@Override
	protected String doInBackground(String... params) {
		responsefromserver = SendToServer(URL+"/coba/biodatajson.php");
		return null;
	}
		
	protected void onPostExecute(String file_url) {
		pDialog.dismiss();
		//raise event 
		onPostExecuteListener.OnPostExecute();
    }
	
	public String SendToServer(String url) {
		//set timeout
		HttpParams params = new BasicHttpParams();
	    HttpConnectionParams.setConnectionTimeout(params, 50000);
	    HttpConnectionParams.setSoTimeout(params, 50000);
	    
		// Eksekusi post ke server
		HttpClient httpclient = new DefaultHttpClient(params);
		HttpPost httppost = new HttpPost(url);
		//httppost.set
		String text="";
		try {
			//baca parameter JSON jika data yg dikirim ke server dalam bentuk JSON
			if(postformatjson){
				// JSON data:
				JSONArray postjson=new JSONArray();
				postjson.put(jsonfromclient);
	
				// post data json
				httppost.setHeader("json",jsonfromclient.toString());
				httppost.getParams().setParameter("jsonpost",postjson);
			}

			HttpResponse response = httpclient.execute(httppost);

			// baca response dari server
			if(response != null)
			{
				InputStream is = response.getEntity().getContent();

				BufferedReader reader = new BufferedReader(new InputStreamReader(is));
				StringBuilder sb = new StringBuilder();

				String line = null;
				try {
					while ((line = reader.readLine()) != null) {
						sb.append(line + "\n");// backslash &#92;
					}
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						is.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				text = sb.toString();
			}
		}catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
		} catch (IOException e) {
    		// TODO Auto-generated catch block
    	}
		return text;
	}
	
	public void SetJSON(JSONObject json){
		postformatjson = true;
		jsonfromclient = json;
	}
	
	public JSONObject GetJSON(){
		try {
			jsonfromserver = new JSONObject(responsefromserver);
		} catch (JSONException e) {
			//Log.e("JSON Parser", "Error parsing data " + e.toString());
		}

		return jsonfromserver;
	}
	public String GetText() throws InterruptedException{
		return responsefromserver;
	}
	
}//end class
