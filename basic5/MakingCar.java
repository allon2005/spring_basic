package springBasic5;

/*
 * bean Scope: singleton, prototype
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MakingCar {

	public static void main(String[] args) {

		//"singleton" type test
		ApplicationContext context = new ClassPathXmlApplicationContext("springBasic5/basic5.xml"); 
		Car newCar = (Car)context.getBean("car");
		newCar.getFrontDoorR().setColor("Maroon"); //we can change the property information!!!
		newCar.getCarInfo();
		
		Car newCarA = (Car)context.getBean("car");
		newCarA.getCarInfo(); // since "car" bean is "singleton" scope, a new instance of "Car" bean (newCarA) still return the "old" information. 
		                      //newCarA will have the color "Maroon", which is set by newCar. So, both newCar and newCarA access the same object
		newCar = null;
		newCarA = null;
		
		//"prototype" test
		((ConfigurableApplicationContext)context).close();

		ApplicationContext context1 = new ClassPathXmlApplicationContext("springBasic5/basic5.xml"); 
		
		Car newCar1 = (Car)context1.getBean("car1");
		newCar1.setBrand("BMW"); //we set a property value just for instance newCar1
		System.out.println("newCar1's brand: " + newCar1.getBrand());
		
		Car newCar1A = (Car)context1.getBean("car1");
		newCar1A.getBrand(); // since "car" bean is "prototype" scope, a new instance of "Car" bean (newCar1A) will get a new instance of the bean which has no "brand" property set up. So, it is null . 
		System.out.println("newCar1A's brand: " + newCar1A.getBrand());
		
		newCar1 = null;
		newCar1A = null;
		
		((ConfigurableApplicationContext)context1).close();
		
	}

}
