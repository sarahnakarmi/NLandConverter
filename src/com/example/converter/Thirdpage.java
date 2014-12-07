package com.example.converter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class Thirdpage extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		Bundle bundle = getIntent().getExtras();
		final int iLayout = bundle.getInt("layout");
		
		Log.e("Test", iLayout + "");
		setContentView(iLayout);
	}

}
