package com.example.test;


import android.os.Bundle;
import android.app.Activity;

import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button sButton = (Button) findViewById(R.id.button1);
        sButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // --- find the text view --
                TextView txtView = (TextView) findViewById(R.id.textView1);
                // -- change text size --
                txtView.setTextSize(54);
                Toast.makeText(MainActivity.this, "welcome", Toast.LENGTH_LONG).show();
             
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
