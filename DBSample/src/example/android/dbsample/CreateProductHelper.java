package example.android.dbsample;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CreateProductHelper extends SQLiteOpenHelper{

	//コンストラクタ定義
	public CreateProductHelper(Context con){
		// SQLiteOpenHelperのコンストラクタ呼び出し
		super(con,"dbsample3",null,1);
	}

	// onCreateメソッド
	@Override
	public void onCreate(SQLiteDatabase db) {
		//SQL文定義
		String sql
		= "create table product3(_id integer primary key autoincrement," +
		  "productid text not null," +
		  "name text not null," +
		  "price integer default 0)";
		//SQL実行
		db.execSQL(sql);
	}
 

	// onUpgradeメソッド
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldversion, int newversion) {
	}
	
}
