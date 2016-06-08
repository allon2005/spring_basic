package springBasic5;
/*
 * bean Scope: singleton, prototype
 */
public class Car {

	
	private Door frontDoorR; 
	private String Brand;
	

	public String getBrand() {
		return Brand;
	}


	public void setBrand(String brand) {
		Brand = brand;
	}


	public Door getFrontDoorR() {
		return frontDoorR;
	}


	public void setFrontDoorR(Door frontDoorR) {
		this.frontDoorR = frontDoorR;
	}


	public void getCarInfo()
	{
		getFrontDoorR().getDoorInfo();
		System.out.println();
	}

}
