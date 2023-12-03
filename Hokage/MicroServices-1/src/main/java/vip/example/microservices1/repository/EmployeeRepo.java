package vip.example.microservices1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vip.example.microservices1.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
