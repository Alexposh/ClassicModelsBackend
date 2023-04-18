package ro.alex.classicmodels.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ro.alex.classicmodels.dao.DaoUser;
import ro.alex.classicmodels.model.User;
import ro.alex.classicmodels.security.config.UserDto;

@RestController
@RequestMapping("/security/users")
public class RestRegister {
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private DaoUser dao;

	@PostMapping(value = "/register") // @RequestMapping(value="/register", method=RequestMethod.POST)
	public Map<String, String> register(@RequestBody UserDto user) {
		User newUser = new User();
		
		newUser.setPassword(passwordEncoder.encode(user.getPassword())); // passwordEncoder.encode(user.getPassword())
		newUser.setIsActive(1); // TODO: if we want to verify users, set to 0
		newUser.setEmail(user.getUsername());
		User resultUser = dao.save(newUser); // check if user already exists - "fail"
		Map<String, String> result = new HashMap<>();
		result.put("STATUS", "OKAY");
		return result;
	}
}
