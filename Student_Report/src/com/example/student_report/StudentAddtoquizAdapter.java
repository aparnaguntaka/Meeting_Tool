package com.example.student_report;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
public class StudentAddtoquizAdapter extends BaseAdapter{
	String[] result1;
    String [] result;
    Context context;
 int [] imageId;
      private static LayoutInflater inflater=null;
    public StudentAddtoquizAdapter(Student_addtoquiz mainActivity,String[] quizlist, String[] prgmNameList, int[] prgmImages) {
        // TODO Auto-generated constructor stub
    	result1=quizlist;
        result=prgmNameList;
        context=mainActivity;
        imageId=prgmImages;
         inflater = ( LayoutInflater )context.
                 getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return result.length;
    }
 
    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }
 
    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }
 
    public class Holder
    {
    	TextView tv1;
    	TextView tv2;
        ImageView img;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;       
             rowView = inflater.inflate(R.layout.addtoquiz, null);
             holder.tv1=(TextView) rowView.findViewById(R.id.textView1);
             holder.tv2=(TextView) rowView.findViewById(R.id.textView2);
             holder.img=(ImageView) rowView.findViewById(R.id.imageView1);  
         holder.tv1.setText(result1[position]);
         holder.tv2.setText(result[position]);
         holder.img.setImageResource(imageId[position]);        
         rowView.setOnClickListener(new OnClickListener() {        
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "You have been added to "+result[position], Toast.LENGTH_LONG).show();
            }
        }); 
        return rowView;
    }
 
}