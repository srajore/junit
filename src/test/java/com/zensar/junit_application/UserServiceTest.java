package com.zensar.junit_application;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class UserServiceTest {

	@Mock   
	UserRepository userRepository;  
	
	

	@InjectMocks
	UserService userService;  

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testGetUserName() {
	//	Mockito.when(userRepository.findNameById(1)).thenReturn("Sharad");
		
		Mockito.when(userRepository.findNameById(1)).thenReturn("Sharad");
		assertEquals("Sharad", userService.getUserName(1));
	}

	/*
	 * @Test public void testGetUserName() {
	 * 
	 * UserRepository userRepository=Mockito.mock(UserRepository.class);
	 * 
	 * Mockito.when(userRepository.findNameById(1)).thenReturn("Mocked Name");
	 * 
	 * 
	 * UserService userService=new UserService(userRepository);
	 * 
	 * String name=userService.getUserName(1);
	 * 
	 * assertEquals("Mocked Name", name);
	 * 
	 * }
	 */

}
