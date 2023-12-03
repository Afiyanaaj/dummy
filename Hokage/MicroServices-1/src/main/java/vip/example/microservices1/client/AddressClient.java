package vip.example.microservices1.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import vip.example.microservices1.Response.AddressResponse;

@FeignClient(value = "jplaceholder", url = "http://localhost:8082")
public interface AddressClient {
	
	@GetMapping("/getAdd/{Id}")
	ResponseEntity<AddressResponse> getAddress(@PathVariable("Id") Long id);

}
