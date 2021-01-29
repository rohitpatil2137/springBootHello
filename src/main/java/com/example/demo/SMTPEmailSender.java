package com.example.demo;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("smtpBean")
@Qualifier("smtp")
public class SMTPEmailSender implements IEmailerService{


		private static Log Log=LogFactory.getLog(SMTPEmailSender.class);
		
		public void sendEmail(String emailID, String subject, String mailContent) {
		Log.info("SMTP Mail receiver ID : "+emailID);
		Log.info("SMTP Mail Subject : "+subject);
		Log.info("SMTP Mail Body : "+mailContent);
		Log.warn("This is just a Dummy email sender");
	}
}