package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

	PropertyInjectedController propertyInjectedController;

	@BeforeEach
	void setup() {
		propertyInjectedController = new PropertyInjectedController();
		propertyInjectedController.greetingService = new GreetingsServiceImpl();
	}

	@Test
	void test() {
		System.out.println(propertyInjectedController.getGreetings());
	}
}
