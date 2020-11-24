package com.example.phoneintnt;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.view.Menu;
import android.view.View;
import android.content.Intent;
import android.net.Uri;
import android.widget.EditText;
import java.util.regex.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText phoneNumber = (EditText)findViewById(R.id.phoneNumber );
        		final Button callButton = (Button) findViewById(R.id.callButton);
        		callButton.setOnClickListener(new Button.OnClickListener() {
        			public void onClick(View v){
        			//	if (validatePhoneNumber(phoneNumber.getText().toString())){
        				Intent CallIntent = new  Intent(Intent.ACTION_CALL,Uri.parse("tel:" + phoneNumber.getText()));
        			//	CallIntent.setLaunchFlags(Intent.NEW_TASK_LAUNCH);
        				startActivity(CallIntent);
        				}
        			//	else{
        			//	Toast.makeText(MainActivity.this, "not valid", Toast.LENGTH_LONG).show();
        			//	}
        				//}
        				});
        				}
        				//public boolean validatePhoneNumber(String number){
        				//Pattern phoneNumber = Pattern.compile("(\\d-)?(\\d{3}-)?\\d{3}\\d{4}");
        				//Matcher matcher = phoneNumber.matcher(number);
        				//return matcher.matches();
        				//}
        				
        		
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
