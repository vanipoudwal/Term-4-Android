package com.example.setreslt;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Secact extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_secact);
		final Intent intent=new Intent();
		Button btnok=(Button)findViewById(R.id.button1);
		btnok.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				  EditText etText=(EditText) findViewById(R.id.editText1);
	                String str=etText.getText().toString();
	        
	                                
	                intent.putExtra("STR", str);    // set value in intent
	                
	                setResult(1,intent);    // set result here 1 is result code used in when    //we  return multiple result back to main activity
	  
	                finish();    // finishes current activity
				// TODO Auto-generated method stub
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.secact, menu);
		return true;
	}

}
