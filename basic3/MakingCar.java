package springBasic3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MakingCar {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springBasic3/basic3.xml"); 
		Car newCar = (Car)context.getBean("car");
		newCar.getCarInfo();
		newCar = null;

	}

}
