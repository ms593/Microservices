package in.mohitit.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="Welcome-MS")
public interface WelcomeFeignClient {
	
	@GetMapping("/welcome")
	public String invokeWelcomeMsg();

}
