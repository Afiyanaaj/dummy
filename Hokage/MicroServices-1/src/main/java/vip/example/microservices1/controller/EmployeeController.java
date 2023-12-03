package vip.example.microservices1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import vip.example.microservices1.Response.AddressResponse;
import vip.example.microservices1.Response.EmployeeResponse;
import vip.example.microservices1.client.AddressClient;
import vip.example.microservices1.model.Employee;
import vip.example.microservices1.services.EmployeeServices;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeServices es;
	@Autowired
	AddressClient addressClient;
	
	@PostMapping("/addEmp")
	public ResponseEntity<String> addEmp(@RequestBody Employee e){
		if (es.saveEmp(e)!=null) {
			return ResponseEntity.status(HttpStatus.CREATED).body("Created");
		}else {
			return ResponseEntity.status(HttpStatus.CREATED).body("Not Created");
		}
	}
	
	@GetMapping("/getEmp/{Id}")
	public ResponseEntity<EmployeeResponse> getEmp(@PathVariable("Id") Long Id){
		 ResponseEntity<AddressResponse> addressResponse = addressClient.getAddress(Id);
	        EmployeeResponse employeeResponse = es.getEmployeeResponse(Id); 
	        employeeResponse.setAddressResponse(addressResponse.getBody());
	       return ResponseEntity.status(HttpStatus.OK).body(employeeResponse);
	}
}
