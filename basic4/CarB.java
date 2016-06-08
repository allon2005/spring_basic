package springBasic4;
/*
 * autowire by constructor
 */
public class CarB {

	private AutoStarterB autoStarterB; 

	public CarB(AutoStarterB autoStarterB) {
		super();
		this.autoStarterB = autoStarterB;
	}

	public AutoStarterB getAutoStarterB() {
		return autoStarterB;
	}

	public void getCarInfo()
	{
		getAutoStarterB().getRangeInfo();
	}







}
// use setter or constructor to instantiate a class variable.
/*
if we have both constructor and setter in the class, both of them will be executed. The constructor
will always be executed before the setter no matter the order in this class and the order in xml file
in the class ===>so, the final value for "weight" is using the value from the setter!!!
 */