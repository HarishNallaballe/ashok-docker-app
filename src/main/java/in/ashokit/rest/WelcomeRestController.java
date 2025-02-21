package in.ashokit.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	private Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);

	public WelcomeRestController() {
		logger.info("***** WelcomeRestController :: Constructor *****");
	}

	@GetMapping
	public String welcomeMsg() {
		String msg = "Welcome to Ashok IT - Software Training Institute (HYD) ..!!";
		return msg;
	}
	
	@GetMapping("/greet")
	public String greetMsg() {
		String msg = "Good Morning, Welcome to Ashok IT";
		return msg;
	}
	
	
}
