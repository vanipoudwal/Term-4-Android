package com.example.setreslt;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b=(Button)findViewById(R.id.button1);
    	final Intent intent=new Intent(this,Secact.class);
        b.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View arg0) {
			startActivityForResult(intent, 1);
				// TODO Auto-generated method stub
				
			}
		});
    }
@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) 
{
    super.onActivityResult(requestCode, resultCode, data);
   

    if(resultCode==1)           // check result code set in secondActivity that is 1
    {
       
        String str=data.getStringExtra("STR");
       
        TextView tv=(TextView) findViewById(R.id.textView1);
       
        tv.setText(str);
    }
    else
        Log.i("Result", "not Receive");
}




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
