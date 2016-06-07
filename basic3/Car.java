package springBasic3;

import java.util.List;

/*
 * Dependency injection of collections (list, map, set). Use "list" as example
 */
public class Car {

	
	private List<Wheel> wheelList; 

	public List<Wheel> getWheelList() {
		return wheelList;
	}

	public void setWheelList(List<Wheel> wheelList) {
		this.wheelList = wheelList;
	}
	

	public void getCarInfo()
	{
		for (Wheel whl : getWheelList())
		{
			whl.getWheelInfo();
			System.out.println();
		}
		
		
		
	}

}
