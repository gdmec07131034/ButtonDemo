package cn.edu.gdmec.s07131034.buttondemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView myTextView;
	EditText myEditText;
	Button myBtn;
	ImageButton myImageBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextView=(TextView) findViewById(R.id.textView1);
        myEditText=(EditText) findViewById(R.id.editText1);
        myTextView.setText("rtrsgsrg");
        myEditText.setText("dgsfdgs");
        myBtn=(Button) findViewById(R.id.button1);
        myBtn.setOnClickListener(buttonlistener);
        
        myImageBtn = (ImageButton) findViewById(R.id.imageView1);
        myImageBtn.setImageResource(R.drawable.ppp);
    }
    
    
    Button.OnClickListener buttonlistener = new Button.OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			myTextView.setText("you have clicked the Button");
			
		}
    	
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
