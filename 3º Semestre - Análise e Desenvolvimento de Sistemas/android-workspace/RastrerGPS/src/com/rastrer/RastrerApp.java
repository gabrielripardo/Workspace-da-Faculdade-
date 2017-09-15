package com.rastrer;

import com.rastrer.R;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class RastrerApp extends Activity implements OnClickListener, LocationListener
{
	EditText editID,editName,editLong,editLat;
	Button btnAdd,btnDelete,btnModify,btnView,btnViewAll,btnShowInfo;
	SQLiteDatabase db;
	private LocationManager locationManager;
	
	
	/** Called when the activity is first created. */
    @Override
    
    
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.main);
        
        // Ajustando os labels para os campos
        editID=(EditText)findViewById(R.id.editID);
        editName=(EditText)findViewById(R.id.editName);
        editLong=(EditText)findViewById(R.id.editLong);
        editLat=(EditText)findViewById(R.id.editLat);
        
        
        // Mapeando os botões
        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnDelete=(Button)findViewById(R.id.btnDelete);
        btnModify=(Button)findViewById(R.id.btnModify);
        btnView=(Button)findViewById(R.id.btnView);
        btnViewAll=(Button)findViewById(R.id.btnViewAll);
        btnShowInfo=(Button)findViewById(R.id.btnShowInfo);
        
        
        //Ativando os eventos para os botões
        btnAdd.setOnClickListener(this);
        btnDelete.setOnClickListener(this);
        btnModify.setOnClickListener(this);
        btnView.setOnClickListener(this);
        btnViewAll.setOnClickListener(this);
        btnShowInfo.setOnClickListener(this);
        
        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
		
		/*
		  Parameters :
		     First(provider)    :  the name of the provider with which to register 
		     Second(minTime)    :  the minimum time interval for notifications, in milliseconds. This field is only used as a hint to conserve power, and actual time between location updates may be greater or lesser than this value. 
		     Third(minDistance) :  the minimum distance interval for notifications, in meters 
		     Fourth(listener)   :  a {#link LocationListener} whose onLocationChanged(Location) method will be called for each location update 
        */
		
		locationManager.requestLocationUpdates( LocationManager.GPS_PROVIDER,
												3000,   // 3 sec
												10, this);
        
        
        
        db=openOrCreateDatabase("rastrer.db", Context.MODE_PRIVATE, null);
		db.execSQL("CREATE TABLE IF NOT EXISTS rastrerDatabase(ID VARCHAR,name VARCHAR,long VARCHAR,lat VARCHAR);");
    }
    
    @Override
    
	public void onLocationChanged(Location location) 
    {
		   
		String str = "Latitude: "+location.getLatitude()+" \nLongitude: "+location.getLongitude();
		Toast.makeText(getBaseContext(), str, Toast.LENGTH_LONG).show();
		
		Cursor c=db.rawQuery("SELECT * FROM rastrerDatabase WHERE lat='"+location.getLatitude()+"'", null);
		
				
		if(c.moveToFirst())
		{
			editName.setText(c.getString(1));
			editLong.setText(c.getString(2));
			editLat.setText(c.getString(3));
		}
		else
		{
			Cursor c2=db.rawQuery("SELECT * FROM rastrerDatabase", null);
			
			
			db.execSQL("INSERT INTO rastrerDatabase VALUES('"+(c2.getCount()+1)+"','REF_GPS','"+location.getLatitude()+ "','"+location.getLongitude()+"');");
    		showMessage("Sucesso", "Registro Adicionado");
			clearText();
		}
		
	}

	@Override
	public void onProviderDisabled(String provider) 
	{
		
		/******** Called when User off Gps *********/
		
		Toast.makeText(getBaseContext(), "Gps turned off ", Toast.LENGTH_LONG).show();
	}

	@Override
	public void onProviderEnabled(String provider) 
	{
		
		/******** Called when User on Gps  *********/
		
		Toast.makeText(getBaseContext(), "Gps turned on ", Toast.LENGTH_LONG).show();
	}

	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) 
	{
		// TODO Auto-generated method stub
		
	}
    
    
    
    public void onClick(View view)
    {
    	if(view==btnAdd)
    	{
    		if(editID.getText().toString().trim().length()==0||
    		   editName.getText().toString().trim().length()==0||
    		   editLat.getText().toString().trim().length()==0||
    		   editLong.getText().toString().trim().length()==0)
    		{
    			showMessage("Erro", "Entre com todos os valores");
    			return;
    		}
    		db.execSQL("INSERT INTO rastrerDatabase VALUES('"+editID.getText()+"','" +editName.getText()+ "','"+editLat.getText()+ "','"+editLong.getText()+"');");
    		showMessage("Sucesso", "Registro Adicionado");
    		clearText();
    	}
    	if(view==btnDelete)
    	{
    		if(editID.getText().toString().trim().length()==0)
    		{
    			showMessage("Erro", "Entre com o ID");
    			return;
    		}
    		Cursor c=db.rawQuery("SELECT * FROM rastrerDatabase WHERE ID='"+editID.getText()+"'", null);
    		if(c.moveToFirst())
    		{
    			db.execSQL("DELETE FROM rastrerDatabase WHERE ID='"+editID.getText()+"'");
    			showMessage("Success", "Record Deleted");
    		}
    		else
    		{
    			showMessage("Erro", "ID Inválido");
    		}
    		clearText();
    	}
    	if(view==btnModify)
    	{
    		if(editID.getText().toString().trim().length()==0)
    		{
    			showMessage("Erro", "Entre com o ID");
    			return;
    		}
    		Cursor c=db.rawQuery("SELECT * FROM rastrerDatabase WHERE ID='"+editID.getText()+"'", null);
    		if(c.moveToFirst())
    		{
    			db.execSQL("UPDATE rastrerDatabase SET name='"+editName.getText()+"',long='"+editLong.getText()+
    					"',lat='"+editLat.getText()+ "' WHERE ID='"+editID.getText()+"'");
    			
    			showMessage("Sucesso", "Registro Modificado");
    		}
    		else
    		{
    			showMessage("Erro", "ID Inválido");
    		}
    		clearText();
    	}
    	if(view==btnView)
    	{
    		if(editID.getText().toString().trim().length()==0)
    		{
    			showMessage("Erro", "Entre com o ID");
    			return;
    		}
    		Cursor c=db.rawQuery("SELECT * FROM rastrerDatabase WHERE ID='"+editID.getText()+"'", null);
    		if(c.moveToFirst())
    		{
    			editName.setText(c.getString(1));
    			editLong.setText(c.getString(2));
    			editLat.setText(c.getString(3));
    		}
    		else
    		{
    			showMessage("Error", "ID inválido");
    			clearText();
    		}
    	}
    	if(view==btnViewAll)
    	{
    		Cursor c=db.rawQuery("SELECT * FROM rastrerDatabase", null);
    		if(c.getCount()==0)
    		{
    			showMessage("Erro", "Registro Não Encontrado");
    			return;
    		}
    		StringBuffer buffer=new StringBuffer();
    		while(c.moveToNext())
    		{
    			buffer.append("ID: "+c.getString(0)+"\n");
    			buffer.append("REF:: "+c.getString(1)+"\n");
    			buffer.append("Long: "+c.getString(2)+"\n");
    			buffer.append("Lat: "+c.getString(3)+"\n\n");
    		}
    		showMessage("Aplicação Rastrer", buffer.toString());
    	}
    	if(view==btnShowInfo)
    	{
			showMessage("Aplicação Rastrer", "JK");
    	}
    }
    
    
   
    
    public void showMessage(String title,String message)
    {
    	Builder builder=new Builder(this);
    	builder.setCancelable(true);
    	builder.setTitle(title);
    	builder.setMessage(message);
    	builder.show();
	}
    
    public void clearText()
    {
    	editID.setText("");
    	editName.setText("");
    	editLong.setText("");
    	editLat.setText("");
    	editID.requestFocus();
    }
}