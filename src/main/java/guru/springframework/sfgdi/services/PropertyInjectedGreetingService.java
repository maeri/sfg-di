package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class PropertyInjectedGreetingService implements GreetingService{

	@Override
	public String sayGreetings() {
		return "PropertyInjectedGreetingService";
	}
}
