package ro.alex.classicmodels.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secured/test")
public class TestController {

	@GetMapping("/one")
	public String test() {
		return "hello";
	}
	
}
