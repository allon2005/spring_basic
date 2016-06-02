package springBasic1;
/*
 *Dependency injection of primitives 
 */
public class Car {
	/* we can say that "car" is dependent on "weight" -->this is for primitive
	 * we inject the "weight" value through the xml file
	 */
	private int weight;   // use setter for injection; 
	private String type; //The rest use constructor for injection
	private String brand; 
	private String color;	
	private float price; 

	public Car(String type)
	{
		System.out.println("this is the car type constructor " + this.toString());
		this.type = type;
	}

	public Car(String type, String brand, String color)
	{
		System.out.println("this is the car type/brand/color constructor " + this.toString());
		this.type = type;
		this.brand = brand;
		this.color = color;
	}

	public Car(String type, String brand, float price) 
	{
		System.out.println("this is the car type/brand/price constructor " + this.toString());
		this.type = type;
		this.brand = brand;
		this.price = price;
	}

	public Car(String type,String brand,String color, float price) 
	{
		System.out.println("this is the car type/brand/color/price constructor " + this.toString());
		this.type = type;
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public int getWeight()
	{
		System.out.println("this is the car weight getter");
		return weight;
	}
	public void setWeight(int weight)
	{
		System.out.println("this is the car weight setter  " + this.toString());
		this.weight = weight;
	}

	public void getCarInfo()
	{
		System.out.println("the car's type is " + type + this.toString());
		System.out.println("the car's brand is " + brand + this.toString());
		System.out.println("the car's weight is " + weight + "lbs " + this.toString());
		System.out.println("the car's color is " + color + this.toString() );
		System.out.println("the car's price is $" + price + this.toString() );
	}

}
// use setter or constructor to instantiate a class variable.
/*
if we have both constructor and setter in the class, both of them will be executed. The constructor
will always be executed before the setter no matter the order in this class and the order in xml file
in the class ===>so, the final value for "weight" is using the value from the setter!!!
 */