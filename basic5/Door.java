package springBasic5;

public class Door {
	private String type; //front, back, driver-side, or passenger-side
	private String color;
	private float weight;

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void getDoorInfo()
	{
		System.out.println("this is a [" + getType() + "]");
		System.out.println("the color of the door is :" + getColor());
		System.out.println("the weight of the door is :" + getWeight());
	}


}
