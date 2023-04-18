package ro.alex.classicmodels.controllers;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

	@GetMapping("/one")
	public String test() {
		return "hello";
	}
	
	@GetMapping("/who-am-i")
	public String whoAmI(Principal principal) {
		
		return principal.getName();
	}
	
	
	
}
