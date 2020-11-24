package com.example.themedemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 Button sButton = (Button) findViewById(R.id.button_s);
	        Button lButton = (Button) findViewById(R.id.button_l);
	        
	        // -- register click event with first button ---
	        sButton.setOnClickListener(new View.OnClickListener() {
	           public void onClick(View v) {
	               // --- find the text view --
	               TextView txtView = (TextView) findViewById(R.id.text_id);
	               // -- change text size --
	               txtView.setTextSize(20);
	           }
	        });
	        
	        // -- register click event with second button ---
	        lButton.setOnClickListener(new View.OnClickListener() {
	           public void onClick(View v) {
	               // --- find the text view --
	               TextView txtView = (TextView) findViewById(R.id.text_id);
	               // -- change text size --
	               txtView.setTextSize(24);
	           }
	        });
	    }

	    @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        getMenuInflater().inflate(R.menu.main, menu);
	        return true;
	    }
	    
	}
