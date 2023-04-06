package ro.alex.classicmodels;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClassicmodelsApplicationTests {

	@Test
	void contextLoads() {
		/*
		 * Interfata obj = new Clasa(); 
		 * obj.m1();
		 * ((Clasa)obj).m2();
		 * */
	}
	
	@Test
	void testGetGreeting() {
		ClassicmodelsApplication obj = new ClassicmodelsApplication();
		String name = "joe";
		
		String result = obj.getGreeting(name);
		
		assertEquals("***joe***", result);
		
	}
	
	@Test
	void testGetVAT_expectException() {
	
	}

}
