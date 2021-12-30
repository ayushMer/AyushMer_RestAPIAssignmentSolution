package EmployeeManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import EmployeeManagementSystem.Entity.User;



public interface UserRepository extends JpaRepository<User, Long> {
	@Query("SELECT u from User u where u.username = ?1")
	public User getUserByUsername(String username);
}