package com.example.draw;

import android.os.Bundle;
import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;

import android.view.Menu;

public class MainActivity extends Activity {
    DrawView drawView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
requestWindowFeature(Window.FEATURE_NO_TITLE);

drawView = new DrawView(this);
setContentView(drawView);
drawView.requestFocus();
}


	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
