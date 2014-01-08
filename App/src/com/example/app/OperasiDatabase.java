package com.example.app;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class OperasiDatabase extends SQLiteOpenHelper{
	private static final String NAMA_DATABASE = "dbMahasiswa";
	private static final String NAMA_TABLE = "biodata";
	
	public OperasiDatabase(Context context) {
		super(context, NAMA_DATABASE, null, 1);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		createTable(db);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	}
	//method createTable untuk membuat table biodata
	public void createTable(SQLiteDatabase db){
		db.execSQL("CREATE TABLE if not exists "+NAMA_TABLE+" (nim VARCHAR(20) PRIMARY KEY, " +
				"nama varchar(50), alamat TEXT);");
	}

	public Cursor selectBiodata(SQLiteDatabase db, String sql){
		Cursor cursor = db.rawQuery(sql,null);
		return cursor;
	}
	//method insertBiodata untuk mengisikan data ke biodata.
	public void modifyBiodata(SQLiteDatabase db, String[] data){
		String whereClause = "nim=?";
		String[] whereArgs = new String[] {String.valueOf(data[0])};
		db.delete(NAMA_TABLE, whereClause, whereArgs);
		
		ContentValues cv=new ContentValues();
		cv.put("nim", data[0]);
		cv.put("nama", data[1]);
		cv.put("alamat", data[2]);
		db.insert(NAMA_TABLE,null,cv);
	}
	
	//method deleteBiodata untuk mengisikan data ke biodata.
	public void deleteBiodata(SQLiteDatabase db, String nim){
		String whereClause = "nim=?";
		String[] whereArgs = new String[] {String.valueOf(nim)};
		db.delete(NAMA_TABLE, whereClause, whereArgs);
	}
}