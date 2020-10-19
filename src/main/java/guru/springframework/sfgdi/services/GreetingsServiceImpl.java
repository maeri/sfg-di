package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingsServiceImpl implements GreetingService {

	@Override
	public String sayGreetings() {
		return "Hello world!";
	}
}
