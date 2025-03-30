package in.mohitit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import in.mohitit.feign.WelcomeFeignClient;

@RestController
public class GreetRestController {
	@Autowired
	private WelcomeFeignClient welcomeFeignClient;

	@GetMapping("/greet")
	public String getGreetMsg() {
		
		String greetMsg ="GoodMorning!";
		
		String welcomeMsg = welcomeFeignClient.invokeWelcomeMsg();
		
		return greetMsg + "," + welcomeMsg;
	}
}
