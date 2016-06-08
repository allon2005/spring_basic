package springBasic4;
/*
 * autowire
 */
public class Car {

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

}
// use setter or constructor to instantiate a class variable.
/*
if we have both constructor and setter in the class, both of them will be executed. The constructor
will always be executed before the setter no matter the order in this class and the order in xml file
in the class ===>so, the final value for "weight" is using the value from the setter!!!
 */