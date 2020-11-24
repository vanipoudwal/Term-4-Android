package com.example.intnt;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.net.Uri;
import android.content.Intent;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent DialIntent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:5551212"));
        		/** Use NEW_TASK_LAUNCH to launch the Dialer Activity */
        		//DialIntent.setLaunchFlags(Intent.NEW_TASK_LAUNCH );
        		/** Finally start the Activity */
        		startActivity(DialIntent);
        		
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
