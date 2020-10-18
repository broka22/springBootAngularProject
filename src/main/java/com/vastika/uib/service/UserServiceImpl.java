package com.vastika.uib.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vastika.uib.model.User;
import com.vastika.uib.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
	}

	@Override
	public void updateUser(User user) {
		userRepository.save(user);
	}

	@Override
	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}

	@Override
	public User getUserById(int id) {
		return userRepository.findById(id).get();
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

}
