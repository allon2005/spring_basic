package springBasic8;

/*
 * bean life call back. 
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MakingCar {

	public static void main(String[] args) {

		/*without changing "ApplicationContext" to "AbstractApplicationContext", both afterPropertiesSet() and
		 * destroy() methods in "Car.java" get called and executed.
		 * However, we have to manually shutdown the context. Otherwise, the context and beans not destroyed.
		 */

		ApplicationContext context = new ClassPathXmlApplicationContext("springBasic8/basic8.xml"); 
		Car newCar = (Car)context.getBean("car");
		newCar.getCarInfo();

		newCar = null;
		//((ConfigurableApplicationContext)context).close();  // if this line is commented out, the destroy() in "Car.jar" will not be called ==>the context is not closed!!!!
		((ConfigurableApplicationContext)context).close();  //this is a manual "shutdown" of the context and destroy the bean
		//((AbstractApplicationContext)context).close();  //this also works!
		//can not directly use "context.close()" ==>must cast to "AbstractApplicationContext" or "ConfigurableApplicationContext"




		/*****************************************/

		/*with "AbstractApplicationContext, we can use registerShutDown() to automatically destroy the beans.
		 * 
		 */

		AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("springBasic8/basic8.xml"); 
		context1.registerShutdownHook(); //with this registerShutDownHook(), even no "context1.close()", the bean will be destroyed===>this is automatic "shutDown".
		Car newCar1 = (Car)context1.getBean("car");
		newCar1.getCarInfo();

		newCar1 = null;
		context1.close(); //can directly use "context1.close()".
		
		
		/****************************/
		
		/* xml file was configured to have init and destroy method
		 * 
		 */
		
		AbstractApplicationContext context2 = new ClassPathXmlApplicationContext("springBasic8/basic8a.xml"); 
		context2.registerShutdownHook(); 
		Car1 newCar2 = (Car1)context2.getBean("car1");
		newCar2.getCarInfo();

		newCar2 = null;
		context2.close(); 


	}

}
