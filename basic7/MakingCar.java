package springBasic7;

/*
 * access applicationContext in other class than "MakingCar.java"
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MakingCar {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springBasic7/basic7.xml"); 
		Car newCar = (Car)context.getBean("car");
		newCar.getCarInfo();
		
		/*
		 * so, we can access the context in the "Car.java" to generate new instance of "door"!!!
		 */

		Door fdr = (Door)newCar.getContext().getBean("frontDoorR");
		fdr.getDoorInfo();

		newCar = null;
		fdr = null;

		((ConfigurableApplicationContext)context).close();

	}

}
