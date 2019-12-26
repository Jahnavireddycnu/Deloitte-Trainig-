package shapes;

public class square extends shape{
	 public square(double side) {
		 super(side);
	 }
	@Override
	public void computearea() {
		System.out.println("area of the square is "+length*length);
		
	}
	@Override
	public void computeperimeter() {
		System.out.println("perimeter = "+4*length);
	}
	@Override
	public String toString() {
		return "This is a square";
	}
	
		

}
