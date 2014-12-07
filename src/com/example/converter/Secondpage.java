package com.example.converter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Secondpage extends Activity implements OnClickListener{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		Bundle bundle = getIntent().getExtras();
		final int iLayout = bundle.getInt("layout");
		
		Log.e("Test", iLayout + "");
		setContentView(iLayout);
		Button btnsqrhect=(Button)findViewById(R.id.btnsqrHectare);
		btnsqrhect.setOnClickListener(this);
	}
	

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btnsqrHectare:
			
			Intent intent= new Intent(Secondpage.this, Thirdpage.class);
			intent.putExtra("layout",R.layout.activity_hectare);
			
			//Log.e("Test", "layout" + R.layout.activity_indexsqr);
			startActivity(intent);
			break;
		case R.id.btnsqrAcre:
			
			Intent intent1= new Intent(Secondpage.this, Thirdpage.class);
			intent1.putExtra("layout",R.layout.activity_acre);
			
			//Log.e("Test", "layout" + R.layout.activity_indexsqr);
			startActivity(intent1);
			break;
		case R.id.btnsqrBigha:
			
			Intent intent2= new Intent(Secondpage.this, Thirdpage.class);
			intent2.putExtra("layout",R.layout.activity_bigha);
			
			//Log.e("Test", "layout" + R.layout.activity_indexsqr);
			startActivity(intent2);
			break;
		case R.id.btnsqrSqrMeter:
			
			Intent intent3= new Intent(Secondpage.this, Thirdpage.class);
			intent3.putExtra("layout",R.layout.activity_sqrm);
			
			//Log.e("Test", "layout" + R.layout.activity_indexsqr);
			startActivity(intent3);
			break;
		case R.id.btnsqrRopani:
			
			Intent intent4= new Intent(Secondpage.this, Thirdpage.class);
			intent4.putExtra("layout",R.layout.activity_ropani);
			
			//Log.e("Test", "layout" + R.layout.activity_indexsqr);
			startActivity(intent4);
			break;
		case R.id.btnsqrmRopani:
			
	  		Intent intent5= new Intent(Secondpage.this, Thirdpage.class);
			intent5.putExtra("layout",R.layout.activity_ropani);
			
			//Log.e("Test", "layout" + R.layout.activity_indexsqr);
			startActivity(intent5);
			break;
		case R.id.btnsqrmBigha:
			
			Intent intent6= new Intent(Secondpage.this, Thirdpage.class);
			intent6.putExtra("layout",R.layout.activity_bigha);
			
			//Log.e("Test", "layout" + R.layout.activity_indexsqr);
			startActivity(intent6);
			break;
		case R.id.btnsqrmSqr:
			
			Intent intent7= new Intent(Secondpage.this, Thirdpage.class);
			intent7.putExtra("layout",R.layout.activity_sqr);
			
			//Log.e("Test", "layout" + R.layout.activity_indexsqr);
			startActivity(intent7);
			break;
		case R.id.btnsqrmAcre:
			
			Intent intent8= new Intent(Secondpage.this, Thirdpage.class);
			intent8.putExtra("layout",R.layout.activity_acre);
			
			//Log.e("Test", "layout" + R.layout.activity_indexsqr);
			startActivity(intent8);
			break;
		case R.id.btnsqrmHectare:
			
			Intent intent9= new Intent(Secondpage.this, Thirdpage.class);
			intent9.putExtra("layout",R.layout.activity_hectare);
			
			//Log.e("Test", "layout" + R.layout.activity_indexsqr);
			startActivity(intent9);
			break;
		case R.id.btnacreRopani:
			
			Intent intent10= new Intent(Secondpage.this, Thirdpage.class);
			intent10.putExtra("layout",R.layout.activity_ropani);
			
			//Log.e("Test", "layout" + R.layout.activity_indexsqr);
			startActivity(intent10);
			break;
		case R.id.btnacreBigha:
			
			Intent intent11= new Intent(Secondpage.this, Thirdpage.class);
			intent11.putExtra("layout",R.layout.activity_bigha);
			
			//Log.e("Test", "layout" + R.layout.activity_indexsqr);
			startActivity(intent11);
			break;
		case R.id.btnacreSqr:
			
			Intent intent12= new Intent(Secondpage.this, Thirdpage.class);
			intent12.putExtra("layout",R.layout.activity_sqr);
			
			//Log.e("Test", "layout" + R.layout.activity_indexsqr);
			startActivity(intent12);
			break;
		case R.id.btnacreSqrMeter:
			
			Intent intent13= new Intent(Secondpage.this, Thirdpage.class);
			intent13.putExtra("layout",R.layout.activity_sqrm);
			
			//Log.e("Test", "layout" + R.layout.activity_indexsqr);
			startActivity(intent13);
			break;
		case R.id.btnacreHectare:
			
			Intent intent14= new Intent(Secondpage.this, Thirdpage.class);
			intent14.putExtra("layout",R.layout.activity_hectare);
			
			//Log.e("Test", "layout" + R.layout.activity_indexsqr);
			startActivity(intent14);
			break;
		case R.id.btnhectRopani:
			
			Intent intent15= new Intent(Secondpage.this, Thirdpage.class);
			intent15.putExtra("layout",R.layout.activity_ropani);
			
			//Log.e("Test", "layout" + R.layout.activity_indexsqr);
			startActivity(intent15);
			break;
		case R.id.btnhectBigha:
			
			Intent intent16= new Intent(Secondpage.this, Thirdpage.class);
			intent16.putExtra("layout",R.layout.activity_bigha);
			
			//Log.e("Test", "layout" + R.layout.activity_indexsqr);
			startActivity(intent16);
			break;
		case R.id.btnhectSqr:
			
			Intent intent17= new Intent(Secondpage.this, Thirdpage.class);
			intent17.putExtra("layout",R.layout.activity_sqr);
			
			//Log.e("Test", "layout" + R.layout.activity_indexsqr);
			startActivity(intent17);
			break;
		case R.id.btnhectSqrMeter:
			
			Intent intent18= new Intent(Secondpage.this, Thirdpage.class);
			intent18.putExtra("layout",R.layout.activity_sqrm);
			
			//Log.e("Test", "layout" + R.layout.activity_indexsqr);
			startActivity(intent18);
			break;
		case R.id.btnhectAcre:
			
			Intent intent19= new Intent(Secondpage.this, Thirdpage.class);
			intent19.putExtra("layout",R.layout.activity_acre);
			
			//Log.e("Test", "layout" + R.layout.activity_indexsqr);
			startActivity(intent19);
			break;
		default:
			break;
	}	
	}
	}

