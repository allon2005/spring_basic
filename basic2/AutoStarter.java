package springBasic2;

class AutoStarter {
	private int range; //the range (meters) in which the car can be autostarted.

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}
	
	public void getRangeInfo()
	{
		System.out.println("the range of the autoStarter is [" + getRange() + " meters]");
	}

}
