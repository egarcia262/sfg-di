package guru.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.GreetingServiceImp;

class PropertyInjectedControllerTest {
	PropertyInjectedController controller;

	@BeforeEach
	void setUp() throws Exception {
		controller = new PropertyInjectedController();

        controller.greetingService = new GreetingServiceImp();
	}

	@Test
	void testGetGreeting() {
		System.out.println(controller.getGreeting());
	}

}
