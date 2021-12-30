package EmployeeManagementSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import EmployeeManagementSystem.Entity.Roles;


public interface RoleRepository extends JpaRepository<Roles, Integer> {



}