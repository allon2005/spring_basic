package springBasic2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MakingCar {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springBasic2/basic2.xml"); 
		Car newCar = (Car)context.getBean("car");
		newCar.getCarInfo();
		newCar = null;
		
		((ConfigurableApplicationContext)context).close();

	}

}
