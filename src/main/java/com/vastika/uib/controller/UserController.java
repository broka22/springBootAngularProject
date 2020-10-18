package com.vastika.uib.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.vastika.uib.model.User;
import com.vastika.uib.service.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping
	public void saveUser(@RequestBody User user) {
		userService.saveUser(user);
	}

	@PutMapping
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}

	@DeleteMapping(value = "/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
	}

	@GetMapping(value = "/{id}")
	public User getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}

	@GetMapping
	public List<User> getAllUser() {
		return userService.getAllUser();
	}

}
