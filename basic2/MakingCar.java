package springBasic2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class MakingCar {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springBasic2/basic2.xml"); 
	    Car newCar = (Car)context.getBean("car");
	    newCar.getCarInfo();
	    newCar = null;
	    
	}

}
