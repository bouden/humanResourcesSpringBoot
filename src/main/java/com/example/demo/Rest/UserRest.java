package com.example.demo.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.RoleRepository;
import com.example.demo.Repository.UserRepository;
import com.example.demo.entity.Role;
import com.example.demo.entity.User;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/user")
public class UserRest {
	@Autowired
	private UserRepository userRepository;
	//@Autowired
	//private RoleRepository roleRepository;
	
	@PostMapping( value = "/adduser")
	public User save( User user) {
		return userRepository.save(user);

	}

	@GetMapping(value = "/listuser")
	public List<User> findAll() {
		return userRepository.findAll();

	}
//	@PostMapping(value = "/addrole")
//	public Role saveRole( Role role) {
//		return roleRepository.save(role);
//
//	}
//	@GetMapping(value = "/listrole")
//	public List<Role> findAllRole() {
//		return roleRepository.findAll();
//
//	}
//
//	@GetMapping(value="/getrole/{role}")
//	public Role findById(@PathVariable String role) {
//		return roleRepository.findById(role).get();
//			
//	}
//	@PostMapping(value = "/addroletouser")
//	public User addRoleTUser( int iduser,String role){
//		User user=userRepository.findById(iduser).get();
//		Role role2=roleRepository.findById(role).get();
//		user.getRoles().add(role2);
//		userRepository.save(user);
//		return user;
//		
//	}

	@GetMapping(value="/getuser/{id}")
	public User findById(@PathVariable int id) {
		return userRepository.findById(id).get();
			
	}
	
}
