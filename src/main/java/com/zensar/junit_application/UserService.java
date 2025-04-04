package com.zensar.junit_application;

public class UserService {

	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public String getUserName(int id) {
		return userRepository.findNameById(id);
	}

}
