package ro.alex.classicmodels.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ro.alex.classicmodels.dao.DaoEmployee;
import ro.alex.classicmodels.model.Employee;

@RestController
@RequestMapping("/employees")
@CrossOrigin(value = { "http://localhost:5500/", "http://127.0.0.1:5500/" })
public class EmployeeController {

	@Autowired
	private DaoEmployee dao;
	
	
	@GetMapping("/all")
	public Iterable<Employee> allEmployees(){
		return dao.findAll();
	}
	
	@GetMapping("/by-id/{id}")
	public Employee oneEmployee(@PathVariable("id") int id){
		return dao.findById(id).get();
	}
}
