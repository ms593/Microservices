package in.mohitit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WelcomeRestController {
	
	@Autowired
	private Environment env;

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String port = env.getProperty("server.port");
		String msg = "Welcome to Mohit IT! (" + port + ")";
		return msg;
	}
	
}
