package com.example.myqrcode;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

	private	TextView resultTextView;
	private EditText qrStrEditText;
	private ImageView qrImgImageView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		resultTextView = (TextView)this.findViewById(R.id.tv_scan_result);
		qrStrEditText = (EditText)findViewById(R.id.et_qr_string);
		qrImgImageView =(ImageView)findViewById(R.id.iv_qr_image);
		
		
		Button scanBarCodeButton = (Button)findViewById(R.id.btn_scan_barcode);
		scanBarCodeButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Intent openCameraIntent = new Intent(MainActivity.this,CaptureActivity)
			}
		});
	}
}
