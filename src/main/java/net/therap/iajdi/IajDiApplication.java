package net.therap.iajdi;

import net.therap.iajdi.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IajDiApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(IajDiApplication.class, args);

		System.out.println("DI_Assignment-------------------------");
		PetController petController=(PetController) context.getBean("petController");
		System.out.println(petController.whichPetIsTheBest());

		System.out.println("Primary ______________________________");
		MyController controller=(MyController) context
				.getBean("myController") ;
		controller.sayHellow();
		System.out.println("Constructor __________________________");
		ConstructorInjectedController constructorInjectedController
				= (ConstructorInjectedController) context
				.getBean("constructorInjectedController");
		constructorInjectedController.sayGreeting();
		System.out.println("Property _____________________________");
		PropertyInjectedController propertyInjectedController
				= (PropertyInjectedController) context
				.getBean("propertyInjectedController");
		propertyInjectedController.sayGreeting();
		System.out.println("Setter _______________________________");
		SetterInjectedController setterInjectedController
				= (SetterInjectedController) context
				.getBean("setterInjectedController");
		setterInjectedController.sayGreeting();
		System.out.println("Spring Profile _______________________");
		I18nController i18nController=(I18nController) context.getBean("i18nController");
		i18nController.sayGreeting();
		System.out.println("Exiting_______________________________");
	}
}