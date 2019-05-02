package edu.fundup.services.implementation;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


public class main {
	 public static final String ACCOUNT_SID = "AC45ca2c01d6346c642cdec7ef811fddd7";
	  public static final String AUTH_TOKEN = "b04f28a2ab2942adc1df83abd83353fb";
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

		    Message message = Message.creator(new PhoneNumber("+13344215880"),
		        new PhoneNumber("+21651988249"), 
		        "This is the ship that made the Kessel Run in fourteen parsecs?").create();

		    System.out.println(message.getSid());
		  }
		/*tsst t = new tsst();
	t.parseFromJSONResponse(t.sendRequest("https://dog.ceo/api/breeds/list/all"));
		Twilio.init(username, password);*/

	}


