package com.example.fdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button b=(Button)findViewById(R.id.button1);
		b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
			EditText t1=(EditText)findViewById(R.id.editText1);
			String Name=t1.getText().toString();
			try
			{
				String FNAme="MyData.txt";
				FileOutputStream fos= openFileOutput(FNAme,Context.MODE_APPEND);
				fos.write(Name.getBytes());
				fos.close();
			}
			catch(Exception ex)
			{
				
			}
			}
		});
		
	Button bRead=(Button)findViewById(R.id.button2);
	bRead.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) 
		{
			TextView tv=(TextView)findViewById(R.id.textView1);
			try
			{
				String value=null;
			FileInputStream fis=openFileInput("MyData.txt");
			byte data[]=new byte[fis.available()];
			while(fis.read(data)!=-1)
			{
				value=new String(data);
			}
			fis.close();
			tv.setText(value);
			}
			catch(Exception ex)
			{

				
			}
			
		}
	});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
