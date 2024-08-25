package vip.example.microservices2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MicroServices2Application {

	@GetMapping("/s2")
	public String getWelcomeString() {
		return "Welcome Microservices Service 2";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MicroServices2Application.class, args);
	}

}
