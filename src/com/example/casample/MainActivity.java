package com.example.casample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends ActionBarActivity {

	TextView output;
	Button btnKm;
	EditText inText;
	double pounds=2.2;
	double miles = 0.62137;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		output = (TextView)findViewById(R.id.textOutput);
		inText = (EditText)findViewById(R.id.editText1);
		btnKm = (Button)findViewById(R.id.btnKmToMl);
	
		OnClickListener btnKmB = new OnClickListener(){
			public void onClick(View v){
				double input = Double.parseDouble(inText.getText().toString());
				double answer = input*miles;
				String KgToPngHere = Double.toString(answer);
				output.setText(KgToPngHere);
			}
		};
		btnKm.setOnClickListener(btnKmB);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
			return true;
	}

	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	

}

