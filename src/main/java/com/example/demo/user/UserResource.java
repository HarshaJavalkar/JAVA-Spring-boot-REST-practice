package com.example.demo.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.validation.Valid;

@RestController
public class UserResource {
	@Autowired
	private UserDaoService service;

	@GetMapping("/users")
	public List<User> retriveAllUsers() {
		return service.findAll();
//		return null;
	}

	@GetMapping("/users/{id}")
	public User retriveUser(@PathVariable int id) {
	User user =	service.findOne(id);
	if(user == null) {
		
	throw new UserNotFoundException("id-"+id);
		
	}
	return user;
	}

	@PostMapping("/users")
	public ResponseEntity<Object> saveUser(@Valid @RequestBody User user) {
		User savedUser = service.save(user);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId())
				.toUri();	
		return ResponseEntity.created(location).build();
	}
}
