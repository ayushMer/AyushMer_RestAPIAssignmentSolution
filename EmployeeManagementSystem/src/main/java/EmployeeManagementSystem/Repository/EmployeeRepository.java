package EmployeeManagementSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import EmployeeManagementSystem.Entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	List<Employee> findByFirstNameContainsAllIgnoreCase(String firstName);

	List<Employee> findAllByOrderByFirstNameAsc();
}
