package vip.example.microservices2.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vip.example.microservices2.model.Address;
import vip.example.microservices2.repository.AddressRepo;
import vip.example.microservices2.response.AddressResponse;

@Service
@Transactional
public class AddressServices {

	private final AddressRepo addressRepo;

	@Autowired 
	ModelMapper modelMapper;

	
	public AddressServices(AddressRepo addressRepo) {
		super();
		this.addressRepo = addressRepo;
	}
	
	
	public Address saveEmp(Address employee) {
		return addressRepo.save(employee);
	}
	
	public AddressResponse getEmployeeResponse(Long ID) {
		Address employee = addressRepo.findById(ID).get();
		AddressResponse response = modelMapper.map(employee, AddressResponse.class);
		return response;
	}
	
}
