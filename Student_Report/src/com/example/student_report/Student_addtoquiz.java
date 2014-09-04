package com.example.student_report;

import java.util.ArrayList;
 
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
 
import android.widget.ListView;
 
public class Student_addtoquiz extends Activity {
 
    ListView lv;
    Context context;
 
    ArrayList prgmName;
    public static int [] prgmImages={R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five};
    public static String [] prgmNameList={"Shiva Shankar","Rakesh","Rehana","Sirish","Lakshmikanth"};
    public static String[] quizlist={"quiz 1","quiz 2","quiz 3","quiz 4","quiz 5"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_addtoquiz);
 
        context=this;
 
        lv=(ListView) findViewById(R.id.listView);
        lv.setAdapter(new StudentAddtoquizAdapter(this, quizlist,prgmNameList,prgmImages));
 
    }
 
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
 
}