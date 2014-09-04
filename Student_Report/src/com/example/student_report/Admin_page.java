package com.example.student_report;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class Admin_page extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.admin_page);

		
	}

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.admin_page, menu);
	    return true;
	}
	
	 public boolean onOptionsItemSelected(MenuItem item) {
		    switch (item.getItemId()) {
		    // action with ID action_refresh was selected
		    case R.id.playpause:
		    	
		      break;
		    default:
		      break;
		    }

		    return true;
		  } 
 



}
