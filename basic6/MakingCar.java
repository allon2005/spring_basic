package springBasic6;

/*
 * Bean definition inheritance and override
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MakingCar {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springBasic6/basic6.xml"); 
		Car newCar = (Car)context.getBean("car");
		newCar.getCarInfo();
		
		Car subCar = (Car)context.getBean("subCar1");
		subCar.getCarInfo();
		
		Car subCar1 = (Car)context.getBean("subCar2");
		subCar1.getCarInfo();

	
		((ConfigurableApplicationContext)context).close();

	}

}
