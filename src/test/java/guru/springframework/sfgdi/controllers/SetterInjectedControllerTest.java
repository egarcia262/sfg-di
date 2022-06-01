package guru.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.GreetingServiceImp;

class SetterInjectedControllerTest {
	SetterInjectedController controller; 
	
	@BeforeEach
	void setUp() throws Exception {
		controller = new SetterInjectedController();
		
		controller.setGreetingService(new GreetingServiceImp());
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
