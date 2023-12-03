package vip.example.microservices1.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vip.example.microservices1.Response.EmployeeResponse;
import vip.example.microservices1.model.Employee;
import vip.example.microservices1.repository.EmployeeRepo;


@Service
@Transactional
public class EmployeeServices {

	
	private final EmployeeRepo employeeRepo;
	
	@Autowired 
	ModelMapper modelMapper;

	public EmployeeServices(EmployeeRepo employeeRepo) {
		super();
		this.employeeRepo = employeeRepo;
	}
	
	public Employee saveEmp(Employee employee) {
		return employeeRepo.save(employee);
	}
	
	public EmployeeResponse getEmployeeResponse(Long ID) {
		Employee employee = employeeRepo.findById(ID).get();
		EmployeeResponse response = modelMapper.map(employee, EmployeeResponse.class);
		return response;
	}
}
