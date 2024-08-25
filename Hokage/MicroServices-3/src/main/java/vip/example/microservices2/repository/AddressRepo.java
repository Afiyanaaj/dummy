package vip.example.microservices2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vip.example.microservices2.model.Address;

public interface AddressRepo extends JpaRepository<Address, Long> {

}
