package springBasic7;

/*
 * access applicationContext in other class than "MakingCar.java"
 */

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


class Car implements ApplicationContextAware {

	private Door frontDoorR; 
	private Door rearDoorR;   

	private Door frontDoorL; 
	private Door rearDoorL; 
	
	private ApplicationContext context = null;


	public ApplicationContext getContext() {
		return context;
	}

/*  we already have an overide method for this, no need for this
	public void setContext(ApplicationContext context) {
		this.context = context;
	}
*/

	public Door getFrontDoorR() {
		return frontDoorR;
	}


	public void setFrontDoorR(Door frontDoorR) {
		this.frontDoorR = frontDoorR;
	}


	public Door getRearDoorR() {
		return rearDoorR;
	}


	public void setRearDoorR(Door rearDoorR) {
		this.rearDoorR = rearDoorR;
	}


	public Door getFrontDoorL() {
		return frontDoorL;
	}


	public void setFrontDoorL(Door frontDoorL) {
		this.frontDoorL = frontDoorL;
	}


	public Door getRearDoorL() {
		return rearDoorL;
	}


	public void setRearDoorL(Door rearDoorL) {
		this.rearDoorL = rearDoorL;
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;  //so, this is a setter for "context" variable. During BeanFactory initialization, the context itself will be injected into "Car.java"
	}

	public void getCarInfo()
	{
		getFrontDoorR().getDoorInfo();
		System.out.println();
		getRearDoorR().getDoorInfo();
		System.out.println();
		getFrontDoorL().getDoorInfo();
		System.out.println();
		getRearDoorL().getDoorInfo();
		System.out.println();
	}

}

// see more on: http://stackoverflow.com/questions/21553120/how-does-applicationcontextaware-work-in-spring
