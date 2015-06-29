package com.example.firstcustomcontrol;

import com.example.fristcustomcontrol.btn.ImageBtn;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends Activity implements OnClickListener {

	private ImageBtn btn_one;
	private ImageBtn btn_two;
	private ImageBtn btn_three;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
 
		btn_one = (ImageBtn)findViewById(R.id.image_btn_one);
		btn_one.setOnClickListener(this);
		btn_two = (ImageBtn)findViewById(R.id.image_btn_two);
		btn_two.setOnClickListener(this);
		btn_three= (ImageBtn)findViewById(R.id.image_btn_three);
		btn_three.setOnClickListener(this);
	}
	
	public void init() {

		  btn_one.setImageResource(R.drawable.f000);
	        btn_one.setTextViewText("Ñ©»¨");
	        btn_two.setImageResource(R.drawable.f000);
	        btn_two.setTextViewText("×£¸£");
	        btn_three.setImageResource(R.drawable.f001);
	        btn_three.setTextViewText("OK");
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.image_btn_one:
			Toast.makeText(MainActivity.this, "Ñ©»¨", Toast.LENGTH_SHORT).show();
			break;
		case R.id.image_btn_two:
			Toast.makeText(MainActivity.this,"×£¸£",Toast.LENGTH_SHORT).show();
		case R.id.image_btn_three:
            Toast.makeText(MainActivity.this, "Äúµã»÷ÁËOK", Toast.LENGTH_SHORT).show();
            break;
		
		default:
			break;
		}
	}
	
 

 

}
