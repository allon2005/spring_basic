package springBasic8;


/*
 * bean life call back by configuring xml file, not implementing interfaces
 */

class Car1{

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


}

/*implementing InitializingBean and DisposableBean is specialized to spring framework. If this class is not used
 * in spring framework, we will have issue or have to set up all spring framework lib in that environment.
 * 
 * 
 * configuring xml file is more general. No need to implement the interfaces and not limited to spring framework
 */

