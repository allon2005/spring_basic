package springBasic2;
/*
 * Dependency injection of object
 */
public class Car {
	
	/* we say that "car" is dependent on "Door" -->this is for object
	 * we inject the "Door" object value through the xml file
	 */
	private Door frontDoor; 
	private Door rearDoor;   


	public Door getFrontDoor() {
		return frontDoor;
	}


	public void setFrontDoor(Door frontDoor) {
		this.frontDoor = frontDoor;
	}


	public Door getRearDoor() {
		return rearDoor;
	}


	public void setRearDoor(Door rearDoor) {
		this.rearDoor = rearDoor;
	}


	public void getCarInfo()
	{
		frontDoor.getDoorInfo();
		rearDoor.getDoorInfo();
	}

}
// use setter or constructor to instantiate a class variable.
/*
if we have both constructor and setter in the class, both of them will be executed. The constructor
will always be executed before the setter no matter the order in this class and the order in xml file
in the class ===>so, the final value for "weight" is using the value from the setter!!!
 */