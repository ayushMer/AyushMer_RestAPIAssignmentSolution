package EmployeeManagementSystem.Service;

import java.util.List;
import java.util.Optional;

import EmployeeManagementSystem.Entity.Employee;
import EmployeeManagementSystem.Entity.Roles;
import EmployeeManagementSystem.Entity.User;


public interface EmployeeService {
	public List<Employee> findAll();

	public Optional<Employee> findById(int theId);

	public String save(Employee theEmployee);

	public String updateEmployee(Employee theEmployee);

	public String deleteById(int theId);

	public List<Employee> searchByFirstName(String firstName);

	public List<Employee> sortByFirstName(String sortBy);

	public User saveUser(User user);

	public Roles saveRole(Roles role);

}