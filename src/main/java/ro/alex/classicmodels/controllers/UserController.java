package ro.alex.classicmodels.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ro.alex.classicmodels.dao.DaoUser;
import ro.alex.classicmodels.model.User;

@RestController
@RequestMapping("/rest/users")
public class UserController {

	@Autowired
	private DaoUser dao;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@PostMapping("/register")
	public User saveUser(@RequestBody User user) {
		String rawPassword = user.getPassword();
		String encodedPassword = passwordEncoder.encode(rawPassword);//user.getPassword();// passwordEncoder.encode(rawPassword); 
		System.out.println("REGISTER RAW = " + rawPassword + " / " + encodedPassword);
		user.setPassword(rawPassword); //
		User userSaved = this.dao.save(user);
		return userSaved;
	}
}
