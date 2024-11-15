package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.User;
import com.crud.exception.UserNotFoundException;
import com.crud.service.UserService;

@RestController
@RequestMapping("/api/user")
public class User_Controller {
	
	@Autowired
	private UserService userService;

	@GetMapping("/test")
	public String testing() {
		return "Working...";
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable long id) throws UserNotFoundException{
		return ResponseEntity.status(HttpStatus.OK).body(userService.getUserById(id));
	}
	
	@PostMapping
    public ResponseEntity<User> addUserToDb(@RequestBody User user){
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.addUser(user));
	}
	
	@PutMapping
	public ResponseEntity<User> updateUser(@RequestBody User user){
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.updateUser(user));
	}
	
	@GetMapping
	public ResponseEntity<List<User>> getAllUsers(){
		return ResponseEntity.ok(userService.getAllUsers());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUserById(@PathVariable long id){
		return new ResponseEntity<String>(userService.deleteUserById(id),HttpStatus.OK);
	}
	
	@PostMapping("/addListUsers")
	public ResponseEntity<List<User>> addAllUsers(@RequestBody List<User> users){
		return new ResponseEntity<List<User>>(userService.addAllUser(users),HttpStatus.CREATED);
	}
	

	
	
}
