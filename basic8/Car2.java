package springBasic8;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/*
 * bean life call back by configuring xml file and implementing interfaces
 */

class Car2 implements InitializingBean, DisposableBean{

	private Door frontDoorR; 
	private Door rearDoorR;   

	private Door frontDoorL; 
	private Door rearDoorL; 

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


	
	public void customInit() throws Exception {
		System.out.println("^^^ car1 bean was initialized");

	}


	
	public void customDestroy() throws Exception {
		System.out.println("*** car1 bean was destroied");

	}


	@Override
	public void destroy() throws Exception {
		System.out.println("*** car1 bean was destroied by interface");
		
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("^^^ car2 bean was initialized by interface");
		
	}


}

/* *
 *!!!we can have both "implementing InitializingBean and DisposableBean interfaces and "xml configuration" for init/shutdown
 * The interface mechanism will take priority and will run first, then the xml configured methods. 

*/

