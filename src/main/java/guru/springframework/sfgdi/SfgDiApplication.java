package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.I18nController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		//beans in context are reffered through the camelCase names
//		MyController myController = (MyController) ctx.getBean("myController");
//		System.out.println(myController.sayHello());

//		System.out.println("--------------------------------");
//
//		PropertyInjectedController propertyInjectedController  = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
//
//		System.out.println(propertyInjectedController.getGreetings());
	}

}
