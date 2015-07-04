package com.example.helloworld;

import java.lang.reflect.Field;

import android.support.v4.app.Fragment;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉顶部标题栏
		setContentView(R.layout.activity_main);
		
		//显示Menu 无效
//		try {
//			 getWindow().addFlags(WindowManager.LayoutParams.class.getField("FLAG_NEEDS_MENU_KEY").getInt(null));
//		} catch (NoSuchFieldException e) {
//			// TODO: handle exception
//			
//		}
//		catch (IllegalAccessException e) {
//			// TODO: handle exception
//		}
		
		//setMenuShowStyle();
		
		Button button1 =  (Button) findViewById(R.id.button_1);
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Toast.makeText(MainActivity.this,"you clicked button1",Toast.LENGTH_SHORT).show();
				
				//back
//				finish();
				
				//貌似返回键回不到MainActivity 是忘删除finish()方法了。
//				Intent intent =  new Intent(MainActivity.this, SecondActivity.class);
//				startActivity(intent);
				
//				Intent intent = new Intent("com.example.helloworld.ACTION_START");
//				intent.addCategory("com.example.helloworld.MY_CATEGORY");
//				startActivity(intent);
//				
//				Intent intent = new Intent(Intent.ACTION_VIEW);
//				intent.setData(Uri.parse("http://www.baidu.com"));
//				startActivity(intent);
				
//				Intent intent = new Intent(Intent.ACTION_CALL);
//				intent.setData(Uri.parse("tel:10086"));
//				startActivity(intent);
				
//				String data = "Hello SecondActivity";
//				Intent intent = new Intent(MainActivity.this,SecondActivity.class);
//				intent.putExtra("extra_data", data);
//				startActivity(intent);
				
				Intent intent  = new Intent(MainActivity.this,SecondActivity.class);
				startActivityForResult(intent, 1);//请求码只要是唯一的就行。
				
			}
		});
		

	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		
		switch (requestCode) {
		case 1:
			if (resultCode == RESULT_OK) {
				String returnData = data.getStringExtra("data_return");
				Log.d("FirstActivity", returnData);
			}
			break;

		default:
			break;
		}
	}
	
	/*
	 * 显示menu无效
	 */
	private void setMenuShowStyle() {
		try {
			ViewConfiguration config = ViewConfiguration.get(this);
			Field menuKeyField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
			if(menuKeyField != null){
				menuKeyField.setAccessible(true);
				menuKeyField.setBoolean(config, true);
				
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			Log.d("LOGTAG", "we cant set sHasPermanentMenuKey");
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		super.onCreateOptionsMenu(menu);
		getMenuInflater().inflate(R.menu.main, menu);
		
		//setMenuShowStyle();
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
	    switch (item.getItemId()) {
		case R.id.add_item:
			Toast.makeText(MainActivity.this, "you click ADD", Toast.LENGTH_SHORT).show();
			break;
		case R.id.remove_item:
			Toast.makeText(MainActivity.this, "you click remove", Toast.LENGTH_SHORT).show();
			break;
		default:
			break;
		}
	    return true;
	}


}
