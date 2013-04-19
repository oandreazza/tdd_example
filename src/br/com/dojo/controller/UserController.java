package br.com.dojo.controller;

import br.com.dojo.entity.User;
import br.com.dojo.error.ErrorHandle;

public class UserController {

	private ErrorHandle error;

	public UserController(ErrorHandle error) {
		this.error = error;
	}

	public void add(User user) {
		error.setMessage("O nome é obrigatório");
	}

}
