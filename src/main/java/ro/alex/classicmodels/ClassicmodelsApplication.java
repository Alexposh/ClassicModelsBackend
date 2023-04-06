package ro.alex.classicmodels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@ComponentScan(basePackages={"ro.alex.classicmodels.controllers", "ro.alex.classicmodels.security.config", 
		"ro.alex.classicmodels.security.service"
		})
@EntityScan(basePackages={"ro.alex.classicmodels.model"})

public class ClassicmodelsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassicmodelsApplication.class, args);
	}

	public String getGreeting(String name) {
		return "***" + name + "***";
	}
	

	
}
 