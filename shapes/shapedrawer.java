package shapes;

public class shapedrawer implements drawable {
	@Override
	public void draw(shape s) {
		if(s instanceof square) {
			System.out.println("drawing a square....");
		
		}
		else if(s instanceof square) {
			System.out.println("Drawing a sq");
		}
	}

}
