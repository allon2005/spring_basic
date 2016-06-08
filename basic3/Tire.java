package springBasic3;

class Tire {

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

	public void getTireInfo()
	{
		System.out.println("The tire brand is: " + getBrand());
		System.out.println("The tire size is: " + getSize());
		System.out.println("The tire serial number is: " + getSerialNum());
	}

}

