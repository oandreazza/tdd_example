package br.com.dojo.controller;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import br.com.dojo.entity.User;
import br.com.dojo.error.ErrorHandle;
import br.com.dojo.fixture.UserFixture;
import br.com.dojo.service.UserService;

public class UserControllerTest {

	private UserController controller;
	private ErrorHandle error = new ErrorHandle();
	private UserService service;

	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
		controller = new UserController(error);
	}
	
	@Test
	public void shouldSetErrorWhenSaveUserAndNameIsNotSet(){
		//Given
		User user = new User();
		
		//When
		controller.add(user);
		
		//Then
		assertEquals("O nome é obrigatório", error.getMessage());
		verify(service,never()).save(any(User.class));
		
	}
	
	@Test
	public void shouldSetErrorWhenSaveAndEmailIsNotSet(){
		//Given
		User user = new User();
		
		//When
		controller.add(user);
		
		//Then
		assertEquals("O nome é obrigatório", error.getMessage());
		
	}
}
