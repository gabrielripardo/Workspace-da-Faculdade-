package com.rastrer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.SmsMessage;
import android.util.Log;
import android.widget.Toast;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;



public class IncomingSms extends BroadcastReceiver 
{
	
	// Get the object of SmsManager
	final SmsManager sms = SmsManager.getDefault();
	SQLiteDatabase db;
	
	
	public void onReceive(Context context, Intent intent) 
	{
	
		db=context.openOrCreateDatabase("rastrer.db", Context.MODE_PRIVATE, null);
		
		// Retrieves a map of extended data from the intent.
		final Bundle bundle = intent.getExtras();
		
		

		
		try{
			if (bundle != null) 
			{
				
				final Object[] pdusObj = (Object[]) bundle.get("pdus");
				
				for (int i = 0; i < pdusObj.length; i++) 
				{
					
					SmsMessage currentMessage = SmsMessage.createFromPdu((byte[]) pdusObj[i]);
					String phoneNumber = currentMessage.getDisplayOriginatingAddress();
					
			        String senderNum = phoneNumber;
			        String message = currentMessage.getDisplayMessageBody();
			        
			        if (message.equals("PPP")){ // Filtro de mensagem: Só vai retornar a mensagem se ela vier com PPP
			 
				        Log.i("SmsReceiver", "senderNum: "+ senderNum + "; message: " + message);
				        
				        int duration = Toast.LENGTH_LONG;
						Toast toast = Toast.makeText(context, "senderNum: "+ senderNum + ", message: " + message, duration);
						toast.show();
						
						
						Cursor c=db.rawQuery("SELECT * FROM rastrerDatabase", null);
						
						
						if(c.getCount()==0)
			    		{
							sms.sendTextMessage(phoneNumber, null, "Não Há Referência!", null, null);
			    		
			    		}
						else
						{
							StringBuffer buffer=new StringBuffer();
							c.moveToLast();
							buffer.append("ID: "+c.getString(0)+"\n");
			    			buffer.append("Referencia: "+c.getString(1)+"\n");
			    			buffer.append("Long: "+c.getString(2)+"\n");
			    			buffer.append("Lat: "+c.getString(3)+"\n\n");
			    			
			    			sms.sendTextMessage(phoneNumber, null, buffer.toString(), null, null);
						}
					
			        } 
				}// end for loop
              } // bundle is null

		} 
		catch (Exception e) 
		{
			Log.e("SmsReceiver", "Exception smsReceiver" +e);
			
		}
	}
}