package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

	SetterInjectedController setterInjectedController;

	@BeforeEach
	void setup() {
		setterInjectedController = new SetterInjectedController();
		setterInjectedController.setGreetingService(new GreetingsServiceImpl());
	}

	@Test
	void test() {
		System.out.println(setterInjectedController.getGreetings());
	}

}
