package shapes;

public class shapetest {

	public static void main(String[] args) {
		shape box = new square(34);
		box.computearea();
		box.computeperimeter();
		System.out.println(box.toString());
		
		shapedrawer sd = new shapedrawer();
		draw(sd, box);
		
		drawable d = new drawable() {
			@Override
			public void draw(shape s) {
				if(s instanceof square)
					System.out.println("Drawing square shape using my drawable");
				if(s instanceof square)
					System.out.println("drawing square shape using my drawable");
			}
			
		};
		// TODO Auto-generated method stub
		draw(d, box);
		
		
	}
	public static void draw(drawable d, shape s)
	{
		d.draw(s);
	}

}
