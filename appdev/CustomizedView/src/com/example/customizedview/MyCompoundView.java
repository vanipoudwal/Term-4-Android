package com.example.customizedview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MyCompoundView extends LinearLayout{
EditText eT;
Button Btn;
String str;
public MyCompoundView(Context context, AttributeSet Attr){ 
	super(context, Attr);
	// To retrieve a LayoutInflater for inflating layout resources in this context.
	String service = Context.LAYOUT_INFLATER_SERVICE;
	// Using layout inflater
	LayoutInflater li =(LayoutInflater)getContext().getSystemService(service);
	// Inflating the XML resource
	li.inflate(R.layout.main1, this, true);
	// Get references of the child controls
	eT = (EditText)findViewById(R.id.editText1);
	Btn = (Button)findViewById(R.id.add);
	// Add functionality
	AddUrl();
	}
	private void AddUrl(){ 
		Btn.setOnClickListener(new Button.OnClickListener(){ 
			@Override
			public void onClick(View arg0){ 
			// TODO Auto-generated method stub
			str= eT.getText().toString();
			str="http://www."+str+".com";
			eT.setText(str);
		}
	});
}
}
