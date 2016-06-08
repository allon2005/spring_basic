package springBasic4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MakingCar {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springBasic4/basic4.xml"); 
		Car newCar = (Car)context.getBean("car");
		newCar.getCarInfo();
		
		CarA newCarA = (CarA)context.getBean("carA");
		newCarA.getCarInfo();
		
		CarB newCarB = (CarB)context.getBean("carB");
		newCarB.getCarInfo();
		
		newCar = null;
		newCarA = null;
		newCarB = null;
		((ConfigurableApplicationContext)context).close();
 
	}

}

/*
"Car","CarA" and "CarB" are three public classes. They share the same xml configuratin file. The bean factory will initiate
all the beans in the configuration file no matter where they are from.
*/
