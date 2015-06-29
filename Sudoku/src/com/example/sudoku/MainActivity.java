package com.example.sudoku;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener{
	
	 private static final String TAG = "Sudoku";
	 private static final int EDIT_ID = Menu.FIRST+2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		View continueButton =  this.findViewById(R.id.continue_button);
	    continueButton.setOnClickListener(this);
	    View newButton = this.findViewById(R.id.new_button);
	    newButton.setOnClickListener(this);
	    View aboutButton = this.findViewById(R.id.about_button);
	    aboutButton.setOnClickListener(this);
	    View exitButton = this.findViewById(R.id.exit_button);
	    exitButton.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch (arg0.getId()) {
		case R.id.about_button:
			Intent i = new Intent(this,About.class);
			startActivity(i);
			break;
		case R.id.new_button:
			openNewGameDialog();
		case R.id.exit_button:
			finish();
		default:
			break;
		}
	}
	
	private void openNewGameDialog(){
		
		new AlertDialog.Builder(this)
			.setTitle(R.string.new_game_label)
			.setItems(R.array.difficulty, 
			new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface arg0, int arg1) {
					// TODO Auto-generated method stub
					startGame(arg1);					
				}
			})
			.show();
	}
	
	private void startGame(int i){
		
		Log.d(TAG, "clicked on" + i);
		//
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		
		menu.add(Menu.NONE, EDIT_ID, Menu.NONE, "Edit Prefs")
        .setAlphabeticShortcut('e');
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == EDIT_ID) {
			startActivity(new Intent(this,EditPreferencesHC.class));
			return true;
		}
		return super.onOptionsItemSelected(item);
	}


}
