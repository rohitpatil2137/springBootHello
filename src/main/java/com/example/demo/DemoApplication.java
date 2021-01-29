package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {



@RestController
public class HelloWorldController {
	
	@Value("${app.smpt.name}")
	private String smtpName;
	
	// Expose the API as a web service so that this API will be available over http protocol


}
}