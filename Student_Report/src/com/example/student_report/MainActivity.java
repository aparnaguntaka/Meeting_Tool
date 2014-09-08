package com.example.student_report;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		
	}
	
	public void nextpage(View view)
    {
		EditText tv1=(EditText) findViewById(R.id.editText1);
		String str= tv1.getText().toString();
		System.out.println("str-----"+str);
		if(str.equalsIgnoreCase("student"))
    	{
			Intent intent = new Intent(this, Student_addtoquiz.class);
    	startActivity(intent);
    	}
		else
		{
			Intent intent = new Intent(this, Create_quiz.class);
	    	startActivity(intent);
		}
    	
    }
    

	

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

}
