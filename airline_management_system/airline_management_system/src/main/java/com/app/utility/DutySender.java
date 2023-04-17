package com.app.utility;


import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

public class DutySender {


	public void sendEmail(String to,String otp) {
		
		System.out.println("in TLS EMAIL");
		final String fromEmail = "gokurawat936@gmail.com"; //requires valid gmail id
		final String password = "nqqjtwhodgwfptby"; // correct password for gmail id
		final String toEmail = to; // can be any email id 
		String msgbody="Dear Employee your duty is assigned as { "+otp+" }";
		System.out.println("TLSEmail Start");
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
		props.put("mail.smtp.port", "587"); //TLS Port
		props.put("mail.smtp.auth", "true"); //enable authentication
		props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
		
                //create Authenticator object to pass in Session.getInstance argument
		Authenticator auth = new Authenticator() {
			//override the getPasswordAuthentication method
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		};
		Session session = Session.getInstance(props, auth);
		
		EmailUtil.sendEmail(session, toEmail,"Airline Management System", msgbody);
		
	}

	
}

