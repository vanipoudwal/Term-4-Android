package com.example.movierating;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends Activity implements RatingBar.OnRatingBarChangeListener
{
	EditText moviename;
	EditText year;
	EditText duration;
	EditText review;
	EditText starring;
	EditText director;
	Button save;
	RatingBar rating;
	Spinner mGenres;
	ArrayAdapter<String> madapter;
	String mGenresData[]= {"-Select Genre-","Action","Adult","Adventure","Animation","Biography",
							"Comedy","Crime","Documentary","Drama","Family","Fantasy",
							"Film-Noir","Game Show","History","Horror","Musical","Mystery",
							"News","Reality-TV","Romance","Sci-Fi","Sports","Talk-show","Thriller",
							"War","Western","Other"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       moviename = (EditText)findViewById(R.id.editText1);
       year = (EditText)findViewById(R.id.editText2);
       duration = (EditText)findViewById(R.id.editText3);
       review = (EditText)findViewById(R.id.editText5);
       starring = (EditText)findViewById(R.id.editText4);
       director = (EditText)findViewById(R.id.editText6);
       save = (Button)findViewById(R.id.button1);
       rating = (RatingBar)findViewById(R.id.ratingBar1);
       
       rating.setOnRatingBarChangeListener(this);
       save.setOnClickListener(new OnButtonClick());
       
       mGenres = (Spinner)findViewById(R.id.spinner1);
       madapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,mGenresData);
       madapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       mGenres.setAdapter(madapter);
       director.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			final Intent intent1 = new Intent(MainActivity.this,DirectorName.class);
			intent1.putExtra("ext",director.getText().toString());
			startActivityForResult(intent1,0123456);
		}
	});
    }
    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent Data)
    {
    	super.onActivityResult(requestCode, resultCode, Data);
    	try{
    	if((requestCode==0123456) && (resultCode==Activity.RESULT_OK))
    	{
    		Bundle myResults = Data.getExtras();
    		String str = myResults.getString("STR");
    		director.setText(str);
    	}
    }
    catch(Exception e){
    	director.setText("Oops!- "+requestCode);
    }
    }
    
    public class OnButtonClick implements OnClickListener{
    	@Override
    	public void onClick(View arg0){
    		String str1 = year.getText().toString();
    		String str2 = duration.getText().toString();
    		String str3 = moviename.getText().toString();
    		String str4 = review.getText().toString();
    		String str5 = starring.getText().toString();
    		String str6 = director.getText().toString();
    			
    	if(str3.equalsIgnoreCase(""))
    	    {
    	    	Toast.makeText(MainActivity.this,"Please fill the Movie Name field.",Toast.LENGTH_SHORT).show();
    	    }
    	else if(str2.equalsIgnoreCase(""))
    	    {
    	    	Toast.makeText(MainActivity.this,"Please fill the Duration field.",Toast.LENGTH_SHORT).show();
    	    }
    	else if(str1.equalsIgnoreCase(""))
    	    {
    	    	Toast.makeText(MainActivity.this,"Please fill the Year field.",Toast.LENGTH_SHORT).show();
    	    }
    	else if(mGenres.getSelectedItem().toString().equalsIgnoreCase("-Select Genre-"))
    		{
    			Toast.makeText(MainActivity.this,"Please select a valid Genre",Toast.LENGTH_SHORT).show();
    		}
    	else if(str4.equalsIgnoreCase(""))
    	    {
    	    	Toast.makeText(MainActivity.this,"Please fill the Review field.",Toast.LENGTH_SHORT).show();
    	    }
    	else if(str5.equalsIgnoreCase(""))
    	    {
    	    	Toast.makeText(MainActivity.this,"Please fill the Starring field.",Toast.LENGTH_SHORT).show();
    	    }
    	else if(str6.equalsIgnoreCase(""))
    	    {
    	    	Toast.makeText(MainActivity.this,"Please fill the Director field.",Toast.LENGTH_SHORT).show();
    	    }
    	else
    		{
    			Toast.makeText(MainActivity.this,"Validation successful.",Toast.LENGTH_SHORT).show();
    		}
    	}
    	
    }
    public void onRatingChanged(RatingBar arg0,float arg1,boolean arg2)
    {
    rating.setRating(arg1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
