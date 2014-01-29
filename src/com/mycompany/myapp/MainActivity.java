package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.view.View.*;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
	Button btn;
	Button btn2; 
	LinearLayout ll;
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		OnClickListener ocl = new OnClickListener(){

			@Override
			public void onClick(View p1)
			{
				switch(p1.getId()){
					case R.id.button:
						Toast.makeText(getBaseContext(), "btn1", Toast.LENGTH_LONG).show();	
						break;

					case R.id.button2:

						Button newButton = new Button(getBaseContext() 	);
						newButton.setText(R.string.hello);
						ll.addView(newButton);
						break;
				}
				// TODO: Implement this method
				
			}
			
			
		};
		btn =(Button) findViewById(R.id.button);
		btn2 = (Button) findViewById(R.id.button2);
		btn.setOnClickListener(ocl);
		btn2.setOnClickListener(ocl);
		ll = (LinearLayout) findViewById(R.id.ll);
		
		
    }
}
