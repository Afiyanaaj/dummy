package vip.example.microservices1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableFeignClients
public class MicroServices1Application {
	
	@GetMapping("/s1")
	public String getWelcomeString() {
		return "Welcome Microservices Service 1";
	}

	public static void main(String[] args) {
		SpringApplication.run(MicroServices1Application.class, args);
	}

}
