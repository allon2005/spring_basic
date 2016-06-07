package springBasic3;

class Wheel {
	private String brand;
	private String size;
	private int serialNum;
	
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	public void getWheelInfo()
	{
		System.out.println("The wheel brand is: " + getBrand());
		System.out.println("The wheel size is: " + getSize());
		System.out.println("The wheel serial number is: " + getSerialNum());
	}

}
