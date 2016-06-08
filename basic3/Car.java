package springBasic3;

import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Dependency injection of collections (list, map, set). 
 */
class Car {

	private Set accessorySet;
	private Map colorMap;
	private List<Tire> tireList; 

	public Map getColorMap() {
		return colorMap;
	}
	public void setColorMap(Map colorMap) {
		this.colorMap = colorMap;
	}
	public Set getAccessorySet() {
		return accessorySet;
	}
	public void setAccessorySet(Set accessorySet) {
		this.accessorySet = accessorySet;
	}

	public List<Tire> getTireList() {
		return tireList;
	}
	public void setTireList(List<Tire> tireList) {
		this.tireList = tireList;
	}

	public void getCarInfo()
	{
		for(Tire whl : getTireList())
		{
			whl.getTireInfo();
			System.out.println();
		}

		for(Object key : getColorMap().keySet()) //since no type defined in map declaration, we have to use "Object" as key
		{
			System.out.println("the " +key + "'s color is " + getColorMap().get(key) );
		}

		System.out.println();

		for(Object key : getAccessorySet()) //since no type defined in map declaration, we have to use "Object" as key
		{
			System.out.println("The car has the accessory: " +key );
		}
	}
}
