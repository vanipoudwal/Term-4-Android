package com.example.movierating;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class DirectorName extends Activity {
	AutoCompleteTextView mDirectorName;
	Button mFinshButton;
	static final String mDirectorNameData[] = {
		"David Lynch","Martin Scorsese","Joel and Ethan Coen",
		"Steven Soderbergh","Terrence Malick","Abbas Kiarostami",
		"Errol Morris","Hayao Miyazaki","David Cronenberg",
		"Terence Davies","Lukas Moodysson","Lynne Ramsay","Bela Tarr",
		"Wong Kar-wai", "Pedro Almodovar","Todd Haynes","Quentin Tarantino",
		"Tsai Ming-Liang","Aki Kaurismaki","Michael Winterbottom",
		"Paul Thomas Anderson","Michael Haneke","Walter Salles",
		"Alexander Payne","Spike Jonze","Aleksandr Sokurov",
		"Ang Lee","Michael Moore","Wes Anderson","Takeshi Kitano",
		"Richard Linklater","Gaspar No","Pavel Pawlikowski",
		"David O Russell","Larry and Andy Wachowski","David Fincher",
		"Steven Speilsberg","George Lucas","Karan Ahuja","David Fincher"
	};
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.directorname);
		mFinshButton = (Button)findViewById(R.id.button1);
		mDirectorName = (AutoCompleteTextView)findViewById(R.id.autoComp1);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.list_item,mDirectorNameData);
		mDirectorName.setAdapter(adapter);
		Intent intent1 = getIntent();
		String str=intent1.getStringExtra("ext");
		mDirectorName.setText(str);
		mFinshButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				final Intent intent = new Intent(DirectorName.this,MainActivity.class);
				Bundle mBundle = new Bundle();
				mBundle.putString("STR",mDirectorName.getText().toString());
				intent.putExtras(mBundle);
				setResult(Activity.RESULT_OK,intent);
				finish();
			}
		});
	}
}
	
