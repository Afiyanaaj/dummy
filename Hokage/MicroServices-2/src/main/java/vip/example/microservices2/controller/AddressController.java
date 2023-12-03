package vip.example.microservices2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import vip.example.microservices2.model.Address;
import vip.example.microservices2.response.AddressResponse;
import vip.example.microservices2.services.AddressServices;

@RestController
public class AddressController {

	@Autowired
	AddressServices es;
	
	@PostMapping("/addAdd")
	public ResponseEntity<String> addEmp(@RequestBody Address e){
		if (es.saveEmp(e)!=null) {
			return ResponseEntity.status(HttpStatus.CREATED).body("Created");
		}else {
			return ResponseEntity.status(HttpStatus.CREATED).body("Not Created");
		}
	}
	
	@GetMapping("/getAdd/{Id}")
	public ResponseEntity<AddressResponse> getEmp(@PathVariable("Id") Long Id){
		return ResponseEntity.status(HttpStatus.OK).body(es.getEmployeeResponse(Id));
	}
	
}
