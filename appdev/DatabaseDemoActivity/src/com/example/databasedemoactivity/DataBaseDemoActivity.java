package com.example.databasedemoactivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DataBaseDemoActivity extends Activity {
SQLiteDatabase db;
Button btninsert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_base_demo);
        btninsert=(Button)findViewById(R.id.button1);
        try
        {
        	db=openOrCreateDatabase("StudentDB", SQLiteDatabase.CREATE_IF_NECESSARY, null);
        	db.execSQL("Create Table Temp(id integer,name text)");
        }catch(SQLException e){}
        btninsert.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				EditText eid=(EditText)findViewById(R.id.editText1);
				EditText ename=(EditText)findViewById(R.id.editText2);
				ContentValues values=new ContentValues();
				values.put("id", eid.getText().toString());
				values.put("name", ename.getText().toString());
				if((db.insert("temp", null, values))!=-1)
				{
					Toast.makeText(DataBaseDemoActivity.this, "record succ", 2000).show();					
				}
				else
				{
					Toast.makeText(DataBaseDemoActivity.this, "record not succ", 2000).show();
						}
				eid.setText("");
				ename.setText("");
				Cursor c=db.rawQuery("select * from temp", null);
				c.moveToFirst();
				while(!c.isAfterLast())
				{
					Toast.makeText(DataBaseDemoActivity.this, c.getString(0)+" "+c.getString(1),1000).show();
					c.moveToNext();
									}
				c.close();
				// TODO Auto-generated method stub
				
			}
		});
    }
      
@Override
protected void onStop()
{
	db.close();
	super.onStop();
	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.data_base_demo, menu);
        return true;
    }
    
}
