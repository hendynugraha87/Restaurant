//package com.example.app;
//
//import android.app.AlertDialog;
//import android.content.ContentValues;
//import android.content.Context;
//import android.database.Cursor;
//import android.database.SQLException;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteDatabase.CursorFactory;
//import android.database.sqlite.SQLiteOpenHelper;
//import android.database.sqlite.SQLiteException;
//import android.widget.Toast;
//
//public class dbase_resta extends SQLiteOpenHelper {
//
//	private static final String NAMA_DATABASE = "resta_bagus";
//	private static final String NAMA_TABLE = "employees";
//	
//	public dbase_resta(Context context) {
//		super(context, NAMA_DATABASE, null, 1);
//	}
//
//	@Override
//	public void onCreate(SQLiteDatabase db) {
//		createTable(db);
//	}
//
//	@Override
//	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//	}
//	
//	//method createTable untuk membuat table biodata
//	public void createTable(SQLiteDatabase db){
//		db.execSQL("CREATE TABLE " + NAMA_TABLE + " (nik VARCHAR PRIMARY KEY, nama VARCHAR, password VARCHAR, umur VARCHAR, alamat TEXT, mobile TEXT);");
//	}
//
//	public Cursor selectBiodata(SQLiteDatabase db, String sql){
//		Cursor cursor = db.rawQuery(sql,null);
//		return cursor;
//	}
//	
//	//method insertBiodata untuk mengisikan data ke biodata.
//	public void modifyBiodata(SQLiteDatabase db, String[] data){
//		String whereClause = "nik=?";
//		String[] whereArgs = new String[] {String.valueOf(data[0])};
//		db.delete(NAMA_TABLE, whereClause, whereArgs);
//		
//		ContentValues cv=new ContentValues();
//		cv.put("nik", data[0]);
//		cv.put("nama", data[1]);
//		cv.put("password", data[2]);
//		cv.put("age", data[3]);
//		cv.put("umur", data[4]);
//		cv.put("alamat", data[5]);
//		cv.put("mobile", data[6]);
//		db.insert(NAMA_TABLE,null,cv);
//	}
//	
//	//method deleteBiodata untuk mengisikan data ke biodata.
//	public void deleteBiodata(SQLiteDatabase db, String nim){
//		String whereClause = "nik=?";
//		String[] whereArgs = new String[] {String.valueOf(nim)};
//		db.delete(NAMA_TABLE, whereClause, whereArgs);
//	}
//	
////	public SQLiteDatabase db;
////	public String db_Path = "data/data/com.example.app/databases/";
////	public static final String NAMA_DATABASE = "hendy";
////	public static final int db_version = 1;
////	public static Context current_context;
////	
////	// create table employees
////	static final String table_employees = "employees";
////
////	
////	// 	syntax create, delete, select, update table in here -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////		
////		private static final String tabel_employees = "CREATE TABLE IF NOT EXISTS employees (col_employee_id INTEGER PRIMARY KEY AUTOINCREMENT, col_employee_name TEXT NOT NULL, col_employee_password VARCHAR(20) NOT NULL, col_employee_age INTEGER, col_employee_address VARCHAR(150), col_employee_mobile INTEGER);";
////		static final String delete_tabel_employee = "DROP TABLE IF EXISTS ";
////	
////	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
////	
////	public dbase_resta(Context context){
////		super(context, db_Name, null, db_version);
////
////	}
////
////	@Override
////	public void onCreate(SQLiteDatabase db) {
////
////	}
////	
////	public void createTable(SQLiteDatabase db)
////	{
////
////		try{
////		db.execSQL(tabel_employees);
////		} catch (SQLiteException e) {
////			e.printStackTrace();
////		}
////	}
////
////	@Override
////	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
////	{
//////		db.execSQL(delete_tabel_employee + table_employees);
//////		onCreate(db);
////	}
////	
////	public Cursor select_employees(SQLiteDatabase db, String sql)
////	{
////		Cursor c = db.rawQuery(sql, null);
////		return c;
////	}
////	
////	public void modify_employee(SQLiteDatabase db, String[] data)
////	{
////		String whereClause = "col_employee_id=?";
////		String [] whereArgs = new String [] {String.valueOf(data[0])};
////		db.delete(table_employees, whereClause, whereArgs);
////		
////		ContentValues cv = new ContentValues();
////		cv.put("col_employee_id", data[0]);
////		cv.put("col_employee_name", data[1]);
////		cv.put("col_employee_password", data[2]);
////		cv.put("col_employee_age", data[3]);
////		cv.put("col_employee_address", data[4]);
////		cv.put("col_employee_mobile", data[5]);
////		
////		db.insert(table_employees, null, cv);
////	}
////	
////	public void delete_employee(SQLiteDatabase db, String col_employee_id)
////	{
////		String whereClause = "col_employee_id=?";
////		String [] whereArgs = new String [] {String.valueOf(col_employee_id)};
////		db.delete(table_employees, whereClause, whereArgs);
////	}
//
//}
