package edu.ucsb.cs.cs185.aaronshepard;

import android.app.Activity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class HCI_Proj2Activity extends Activity {
	
	private TextView tv_count_display;
	private Button b_change_count;
	
	private static final String m_button_text = "Click me !";
	private static final String m_output_1 = "You clicked ";
	private static final String m_output_2 = " times.";
	private int m_counter;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //access XML View objects
        tv_count_display = (TextView) findViewById(R.id.tv_count_display);
        b_change_count = (Button) findViewById(R.id.b_change_count);
        
        //set initial text of View
        tv_count_display.setText(m_output_1 + m_counter + m_output_2);
        b_change_count.setText(m_button_text);
        RelativeLayout rl = new RelativeLayout(this);
        //set on click listener to update counter
        b_change_count.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				updateTextView();
				
			}
		});
    }
    
    //update text view with current counter
    public void updateTextView() {
    	m_counter++;
    	tv_count_display.setText(m_output_1 + m_counter + m_output_2);
    }
}