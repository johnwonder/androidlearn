package com.example.listviewfreshdemo;

import java.util.ArrayList;

import com.example.listviewfreshdemo.RefleshListView.IRefleshListener;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class MainActivity extends Activity implements IRefleshListener {

	ArrayList<ApkEntity> apk_list;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
 
		setData();
		
		showList(apk_list);
	}
	
	MyAdapter adapter;
	RefleshListView listView;
	private void showList(ArrayList<ApkEntity> apk_list) {
		if(adapter == null){
		
			listView = (RefleshListView)findViewById(R.id.listview);
			listView.setInterface(this);
			adapter = new MyAdapter(this, apk_list);
			listView.setAdapter(adapter);
		}else{
			
			adapter.onDateChange(apk_list);
		}
	}
	
	private void setData() {
		apk_list = new ArrayList<ApkEntity>();
		for (int i = 0; i < 10; i++) {
			ApkEntity entity = new ApkEntity();
			entity.setName("默认数据");
			entity.setDes("这是一个神奇的应用");
			entity.setInfo("50w用户");
			apk_list.add(entity);
		}
	}
	
	private void setRefreshData() {
		for (int i = 0; i < 2; i++) {
			ApkEntity entity = new ApkEntity();
			entity.setDes("这是个神奇的应用");
			entity.setName("刷新数据");
			entity.setInfo("50w用户");
			apk_list.add(0,entity);
		}
	}
	
	@Override
	public void onReflesh() {
		// TODO Auto-generated method stub
		Handler handler = new Handler();
		handler.postDelayed(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				//获取最新数据
				setRefreshData();
				
				//通知界面展示
				showList(apk_list);
				
				//通知listView刷新数据完毕。
				listView.refleshComplete();
			}
		}, 2000);
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

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

}
