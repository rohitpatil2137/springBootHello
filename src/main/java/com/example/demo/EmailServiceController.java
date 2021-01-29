package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.ibm.hellodemo.emailer.DummyEmailSender;
//import com.ibm.hellodemo.emailer.IEmailerService;

@RestController
public class EmailServiceController {
	
	IEmailerService emailService1 = new DummyEmailSender();
	
	// Don't create any object with specific type, let Spring create it. 
	@Autowired
	IEmailerService emailService = new DummyEmailSender();
	
	@Autowired  //at setter method
	public void setEmailService(IEmailerService emailService) {
		this.emailService1 = emailService;
	}
	
	@RequestMapping("/sendEmail")
	public String email() {
		
		emailService1.sendEmail("stevejob@apple.com", "Launching of new Apple-Mobile model","Body of the content");
		return "Email Send";
	}

	public IEmailerService getEmailService() {
		return emailService1;
	}
}
