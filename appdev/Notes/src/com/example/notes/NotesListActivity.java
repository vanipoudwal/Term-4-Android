package com.example.notes;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class NotesListActivity extends ListActivity {
	
	ListView mNotesList;
	Button mNewNote;
	Button mNewNote1;
	final static String NOTES = "Notes.txt";
	List<String> mNData = new ArrayList<String>();
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		checkForFile();
	}
	public void onResume(){
		
	}
}
