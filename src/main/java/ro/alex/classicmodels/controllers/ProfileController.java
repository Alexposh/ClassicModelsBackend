package ro.alex.classicmodels.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ro.alex.classicmodels.dao.DaoEmployee;
import ro.alex.classicmodels.dao.DaoUser;
import ro.alex.classicmodels.model.Employee;
import ro.alex.classicmodels.model.User;

@RequestMapping("/rest/profile")
@RestController
public class ProfileController {

	
	@Autowired
	private DaoEmployee daoEmployee;
	
	@Autowired
	private DaoUser daoUser;
	
	@GetMapping("/my-profile")
	public Employee whoAmIAsEmployee(Principal principal) {
		String email = principal.getName();
		User theUser = daoUser.findByEmail(email).get();
		Employee employeeProfile = daoEmployee.findById(theUser.getId()).get();
		return employeeProfile;
	}
}
