package springBasic1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class MakingCar {

	public static void main(String[] args) {
		/*
		 * use the Spring framework BeanFactory to create the bean object using the xml file
		 * basic1.xml provides the configuration metadata to create the bean objects. In more detail, the xml is like
		 * a recipe, which provides the information of each "bean", such as id, class, dependency, dependency mode,
		 *  and many other frame work related configuration information (such as beanpostprocessing, beanFactoryPostProcessing, etc.) 
		 */
		BeanFactory bean = new XmlBeanFactory(new FileSystemResource("src/springBasic1/basic1.xml"));  //have to add "src/..." for full path
		/*use the "bean id" to fetch the object of "Car".  All the beans defined inside the basic1.xml were 
		 instantiated when new XmlBeanFactory(...) was called. Here, we just need to fetch the bean object.
		 */
		Car oldCar = (Car)bean.getBean("car");
		oldCar.getCarInfo();
		bean = null;
		
		/*
		 * 1.ApplicatonContet is more preferred than BeanFactory. BeanFactory is the very very basic factory container. It is lightweight and is used mostly for the purpose of saving resource (such as in mobile applicaiton).
		 * 2.ApplicationContext is a sun-interface of BeanFactory. It supports more functions than BeanFactory
		 * 3.it is better to provide the full path to the xml file!!!
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("springBasic1/basic1.xml");  //no need to add "src/.." for full path
	    Car newCar = (Car)context.getBean("car");
	    newCar.getCarInfo();
	    
	    System.out.println();
	    Car newCar1 = (Car)context.getBean("car1");
	    newCar1.getCarInfo();
	    context = null;
	}

}
