package com.apex.springrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apex.springrestapi.service.UserService;
import com.apex.springrestapi.entity.User;

@RestController
//@RequestMapping("/users")
public class UserController {

	@GetMapping("/string")
	public String getString() {
		return " Hi, I am in postman";
	}

	@Autowired
	UserService userService;

	@PostMapping(path = "/adduser",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> addUser(@RequestBody User user) {
		System.out.println("==== inside user controller add user()=====");
		System.out.println(user);
		try {
		User createdUser = this.userService.addUser(user);
		return new ResponseEntity<User>(createdUser,HttpStatus.CREATED);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
			
		}
	}	

	// restrive all users
	@GetMapping(path = "/users")
	public ResponseEntity<List<User>> getUsers(@RequestBody List<User> users) {

		try {
		List<User> listOfUSers= (List<User>) this.userService.getUsers();
		return new ResponseEntity<List<User>>(listOfUSers,HttpStatus.FOUND);
		
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}

	// get user from userId Email
	@GetMapping(path = "/users/{email}")
	public ResponseEntity<User> getUser(@RequestBody User user,@PathVariable String email) {

		try {
			User result = this.userService.getUser(email);
			System.out.println(result);
			return new ResponseEntity<User>(result, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}

	// delete user
	@DeleteMapping(path = "/users/{email}")
	public void deleteUser(@PathVariable(value = "email") String email) {
		this.userService.deleteUser(email);
	}

	// update User
	@PutMapping(path = "/users/{email}")
	public ResponseEntity<User> updateUser(@PathVariable String email, @RequestBody User user) {
		try {
			User existUser = this.userService.getUser(email);
			existUser.setFirstName(user.getFirstName());
			existUser.setLastName(user.getLastName());
			existUser.setMiddleName(user.getMiddleName());
			User updatedUser = userService.updateUser(existUser);
			return new ResponseEntity<User>(updatedUser, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
	}
	
}
