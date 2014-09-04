package com.example.student_report;

import java.util.ArrayList;
 
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
 
import android.widget.ListView;
 
public class Admin_addtoquiz extends Activity {
 
    ListView lv;
    Context context;
 
    ArrayList prgmName;
    public static int [] prgmImages={R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five};
    public static String [] prgmNameList={"Student 1","Student 2","Student 3","Student 4","Student 5"};
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_addtoquiz);
 
        context=this;
 
        lv=(ListView) findViewById(R.id.listView);
        lv.setAdapter(new AdminAddtoquizAdapter(this, prgmNameList,prgmImages));
 
    }
 
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.admin_addtoquiz, menu);
	    return true;
	}
	
	 public boolean onOptionsItemSelected(MenuItem item) {
		    switch (item.getItemId()) {
		    // action with ID action_refresh was selected
		    case R.id.DONE:
		    	Intent intent = new Intent(this, Admin_page.class);
		    	startActivity(intent);
		      break;
		    default:
		      break;
		    }

		    return true;
		  } 
 
}