package com.user.service.controller;

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

import com.user.service.entities.User;
import com.user.service.services.UserService;

@RestController
@RequestMapping("users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> getAllUsers(){
		return ResponseEntity.status(HttpStatus.OK).body(userService.getAllUsers());
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> getUser(@PathVariable Long id){
		return ResponseEntity.status(HttpStatus.FOUND).body(userService.getUser(id));
	}
	
	@PostMapping	
	public ResponseEntity<User> addUser(@RequestBody User user){
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.addUser(user));
	}
	
	@PutMapping
	public ResponseEntity<User> updateUser(@RequestBody User user){
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.updateUser(user));
	}
	
	@DeleteMapping
	public ResponseEntity<String> deleteUser(@RequestBody User user){
		return ResponseEntity.status(HttpStatus.OK).body(userService.deleteUser(user));
	}
	
	
	
}
