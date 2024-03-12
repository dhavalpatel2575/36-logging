package com.jeku.rest;

import org.slf4j.LoggerFactory;
import org.slf4j.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	
	Logger logger=LoggerFactory.getLogger(DemoRestController.class); 
	

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		logger.info("WElcome controller ....EXecution started");
		String msg="Welcome...............";
		
		logger.info("WElcome controller .... EXecution Ended");
		
		return msg;
	}
}
