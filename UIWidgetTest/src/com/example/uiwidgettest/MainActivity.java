package com.example.uiwidgettest;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends  Activity {

	private Button button;
	
	private EditText editText;
	
	private ProgressBar progressBar;
	
	private ImageView imageView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		button = (Button) findViewById(R.id.button);
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//String inputText = editText.getText().toString();
//				Toast.makeText(MainActivity.this, inputText, Toast.LENGTH_SHORT).show();
				
//				if(progressBar.getVisibility() == View.GONE){
//					
//					progressBar.setVisibility(View.VISIBLE);
//				}
//				else{
//					
//					progressBar.setVisibility(View.GONE);
//				}
				
//				int progress = progressBar.getProgress();
//				progress = progress +10;
//				progressBar.setProgress(progress);
				
//				AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
//				dialog.setTitle("This is Dialog");
//				dialog.setMessage("Something important");
//				dialog.setCancelable(false);
//				dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//					
//					@Override
//					public void onClick(DialogInterface dialog, int which) {
//						// TODO Auto-generated method stub
//						
//					}
//				});
//				
//				dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//					
//					@Override
//					public void onClick(DialogInterface dialog, int which) {
//						// TODO Auto-generated method stub
//						
//					}
//				});
//				dialog.show();
				
				ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
				progressDialog.setTitle("This is ProgressDialog");
				progressDialog.setMessage("Loading...");
				progressDialog.setCancelable(true);
				progressDialog.show();
			}
		});
		
		editText = (EditText) findViewById(R.id.edit_text);
		 
		progressBar = (ProgressBar) findViewById(R.id.progress_bar);
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
