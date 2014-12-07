package com.example.converter;

import android.provider.Settings.System;
import android.app.*;
import android.content.Intent;
import android.os.*;

public class SplashActivity extends Activity {
	private static int SPLASH_TIME_OUT=3000;
	@Override
	public void onCreate(Bundle savedInstanseState)
	{
		super.onCreate(savedInstanseState);
		setContentView(R.layout.activity_layout);
		new Handler().postDelayed(new Runnable(){
			@Override
			public void run()
			{
				Intent i=new Intent(SplashActivity.this,MainActivity.class);
				startActivity(i);
				finish();
			}
			
		},SPLASH_TIME_OUT);
		
	}
	

	
}
