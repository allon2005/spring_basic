package springBasic8;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/*
 * bean life call back. 
 */


class Car implements InitializingBean, DisposableBean {  // implements two interfaces for bean initialization and destroying

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


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("^^^ car bean was initialized");

	}


	@Override
	public void destroy() throws Exception {
		System.out.println("*** car bean was destroied");

	}


}

/*by implementing InitializingBean and DisposableBean, Spring provide some flow control. We can perform certain
 * actions right after the bean is initialized (but not being returned yet) or after the bean is destroyed.
 * 
 */

