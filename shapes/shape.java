package shapes;

public abstract class shape{
	protected static double length;
	protected static double width;
	private double height;
	

	
	public shape(double length) {
		this.length=length;
	}
	public shape(double length, double width) {
		this(length);
		this.width=width;
	}
public abstract void computeperimeter();

@Override
public String toString()
{
	return "Some Shape....";
}

public abstract void computearea();
}
