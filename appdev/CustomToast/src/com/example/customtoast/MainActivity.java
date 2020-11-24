package com.example.customtoast;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.Gravity;


public class MainActivity extends Activity {
	private Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button = (Button) findViewById(R.id.buttonToast);
		 
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				LayoutInflater inflater = getLayoutInflater();
				 
				View layout = inflater.inflate(R.layout.custom_toast,
				  (ViewGroup) findViewById(R.id.custom_toast_layout_id));
 
				// set a dummy image
				ImageView image = (ImageView) layout.findViewById(R.id.image);
				image.setImageResource(R.drawable.ic_launcher);
 
				// set a message
				TextView text = (TextView) layout.findViewById(R.id.text);
				text.setText("Button is clicked!");
 
				// Toast...
				Toast toast = new Toast(getApplicationContext());
				toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
				toast.setDuration(Toast.LENGTH_LONG);
				toast.setView(layout);
				toast.show();
	
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
