package com.BikkadIT.email;

import java.util.Properties;
import jakarta.mail.*;
import org.springframework.stereotype.Component;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

@Component
public class GmailSender {
		
		boolean flag=false;
		
		public boolean sendEmail(String to, String from, String subject, String text, String filename) {
			Properties properties=new Properties();
			
			properties.put("mail.smtp.auth", true);
			
			properties.put("mail.smtp.starttls.enable", true);
			
			properties.put("mail.smtp.port", "587");
			
			properties.put("mail.smtp.host", "smtp.gmail.com");
			
			String username="pradipmunde92";
			String password="zsrvdektgndawphz";
			
			
			Session session=Session.getInstance(properties,new Authenticator(){
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, password);
				}
				});
			
			try {
				Message message = new MimeMessage(session);
				message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
				message.setFrom(new InternetAddress(from));
				
				message.setSubject(subject);
				message.setText(text);


//
				Transport.send(message);
				
				flag= true;
			}
		     catch (Exception e) {
		    	 e.printStackTrace();
		     }

			
			
			return flag;
			
		}
		
		
		
		

	}



