package com.example.converter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener{
/*EditText Square;
EditText Ropani;
EditText Anna;
EditText Paisa;
EditText Daam;
EditText Bigha;
EditText Katha;
EditText Dhoor;
*/
@Override
public	void onCreate(Bundle savedInstanceState){
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
	/*Square=(EditText)findViewById(R.id.edttxtSqr);
	Ropani=(EditText)findViewById(R.id.edttxtRopani);
	Anna=(EditText)findViewById(R.id.edttxtAnna);
	Paisa=(EditText)findViewById(R.id.edttxtPaisa);
	Daam=(EditText)findViewById(R.id.edttxtDaam);
	Bigha=(EditText)findViewById(R.id.edttxtBigha);
	Katha=(EditText)findViewById(R.id.edttxtKatha);
	Dhoor=(EditText)findViewById(R.id.edttxtDhoor);	*/
	
	
	Button btnsqr=(Button) findViewById(R.id.btnsqrfeet);
	btnsqr.setOnClickListener(this);
	
	Button btnsqrm=(Button) findViewById(R.id.btnsqrmeter);
	btnsqrm.setOnClickListener(this);
	
	Button btnacre=(Button)findViewById(R.id.btnacre);
	btnacre.setOnClickListener(this);
	
	Button btnhect=(Button)findViewById(R.id.btnhectare);
	btnhect.setOnClickListener(this);
	
	/*private OnClickListener onClickl=new OnClickListener(){
				
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
				
		}
	};
	Button btnsqrm=(Button)findViewById(R.id.btnsqrmeter);
	btnsqrm.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v1) {
			// TODO Auto-generated method stub
			setContentView(R.layout.activity_indexsqrm);
		}
	});
	Button btnacre=(Button)findViewById(R.id.btnacre);
	btnacre.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v2) {
			// TODO Auto-generated method stub
			setContentView(R.layout.activity_indexacre);
		}
	});
	
	Button btnhectare=(Button)findViewById(R.id.btnhectare);
	btnhectare.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v3) {
			// TODO Auto-generated method stub
			setContentView(R.layout.activity_indexhect);
		}
	});*/
}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnsqrfeet:
			
			Intent intent= new Intent(MainActivity.this, Secondpage.class);
			intent.putExtra("layout",R.layout.activity_indexsqr);
			
			//Log.e("Test", "layout" + R.layout.activity_indexsqr);
			startActivity(intent);
			break;
	
		case R.id.btnsqrmeter:
			Intent intent1= new Intent(MainActivity.this, Secondpage.class);
			intent1.putExtra("layout",R.layout.activity_indexsqrm);
			
			//Log.e("Test", "layout" + R.layout.activity_indexsqrm);
			startActivity(intent1);
			break;
			
	
		case R.id.btnacre:
			Intent intent2= new Intent(MainActivity.this, Secondpage.class);
			intent2.putExtra("layout",R.layout.activity_indexacre);
			
			//Log.e("Test", "layout" + R.layout.activity_indexsqr);
			startActivity(intent2);
			break;
	
			
		case R.id.btnhectare:
			Intent intent3= new Intent(MainActivity.this, Secondpage.class);
			intent3.putExtra("layout",R.layout.activity_indexhect);
			
			//Log.e("Test", "layout" + R.layout.activity_indexsqr);
			startActivity(intent3);
			break;
		
		default:
			break;
		}
	}

/*public  void main(){
	String cSquare=Square.getText().toString();
	//Log.e("Csquare",cSquare);
	double sqr=Double.parseDouble(cSquare);
	//Log.e("square",sqr + "");
	
	
	
		if(sqr>0){
			//Log.e("Csquare",sqr + "");
			
			double ropani=sqr/5746;
			
			//Log.e("ropan",ropan + "");
			
			//System.out.println("ropani_to_anna" + ropan);
			double ropani_to_anna= ropani-Math.floor(ropani);
			double ropan=ropani-ropani_to_anna;
			int _ropani=(int)ropan;
			Ropani.setText(Integer.toString(_ropani));
			if(ropani_to_anna>0){
			double anna=16*ropani_to_anna;
			double anna_to_paisa=anna-Math.floor(anna);
			double ana=anna-anna_to_paisa;
			int _anna=(int)ana;
			Anna.setText(Integer.toString(_anna));
			if(anna_to_paisa>0){
			double paisa= 4*anna_to_paisa;
			double paisa_to_daam=paisa-Math.floor(paisa);
			double pais=paisa-paisa_to_daam;
			int _paisa=(int)pais;
			Paisa.setText(Integer.toString(_paisa));
			if(paisa_to_daam>0)
			{
				double daam=4*paisa_to_daam;
				int _daam=(int)daam;
				Daam.setText(Integer.toString(_daam));
			}
			}
			}
			double bigha=sqr/72900;
			double bigha_to_katha=bigha-Math.floor(bigha);
			int _bigha=(int)bigha;
			
			Bigha.setText(Integer.toString(_bigha));
				if(bigha_to_katha>0)
				{
					double katha=20*bigha_to_katha;
					double katha_to_dhoor=katha-Math.floor(katha);
					double kath=katha-katha_to_dhoor;
					int _katha=(int)kath;
					Katha.setText(Integer.toString(_katha));
					
					if(katha_to_dhoor>0)
					{
						double dhoor=20*katha_to_dhoor;
						int _dhoor=(int)dhoor;
						Dhoor.setText(Integer.toString(_dhoor));
					}
				}
			}
			
			
			//System.out.println("ropani_to_anna" + ropani_to_anna);
		}
		
	
	

@Override
public void onClick(View v) {
	main();
	String cSquare=Dhoor.getText().toString();
	Log.e("Csquare",cSquare);
}*/
}