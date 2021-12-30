package EmployeeManagementSystem.Service;

import org.springframework.beans.factory.annotation.Autowired;
import EmployeeManagementSystem.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import EmployeeManagementSystem.Repository.UserRepository;
import EmployeeManagementSystem.Security.MyUserDetails;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.getUserByUsername(username);
		if (user == null) {
			System.out.println("Could not find user with name as " + username);
			throw new UsernameNotFoundException("User does not exist");
		}
		return new MyUserDetails(user);
	}
}