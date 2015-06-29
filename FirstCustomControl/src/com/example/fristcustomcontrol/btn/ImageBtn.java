package com.example.fristcustomcontrol.btn;

import com.example.firstcustomcontrol.R;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ImageBtn extends LinearLayout {

	private ImageView imageView;
	
	private TextView textView;
	
	public ImageBtn(Context context) {
		// TODO Auto-generated constructor stub
		super(context,null);
	}
	
	public ImageBtn(Context context,AttributeSet attrs) {
		// TODO Auto-generated constructor stub
		super(context, attrs);
		LayoutInflater inflater = (LayoutInflater)context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		inflater.inflate(R.layout.image_btn_layout, this, true);
		
		imageView = (ImageView)findViewById(R.id.image);
		textView = (TextView)findViewById(R.id.text);
	}
	
	public void setImageResource(int resId) {
		imageView.setImageResource(resId);
		
	}
	
	public void setTextViewText(String text) {
		textView.setText(text);
	}
}
