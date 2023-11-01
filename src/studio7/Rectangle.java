package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double length;
	private double width;
	
	// constructor, takes length and width
	public Rectangle(double l, double w) {
		this.length = l; // only have to use this is instance variable and parameter have same name
		this.width = w;
	}
	
	// getter, returns area of Rectangle (l*w)
	public double area() {
		return length*width;
	}
	
	// getter, returns perimeter of Rectangle (l*w)
		public double perimeter() {
			return length*2+width*2;
		}
	
	// just another method, takes R1 and R2 rectangles, returns true if R1<R2
	public boolean compareArea(Rectangle R1, Rectangle R2) {
		if(R1.area() < R2.area()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// j another method, returns true if l=w (ie. square)
	public boolean isSquare() {
		if(length==width) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// another method, draws rectangle using StdDraw
	public void draw() {
		StdDraw.clear();
		StdDraw.setPenColor(StdDraw.PINK);
		StdDraw.filledRectangle(0.5, 0.5, width/2, length/2);
	}
	
	public static void main(String[] args) {
		Rectangle test = new Rectangle(0.2,0.4);
		Rectangle test2 = new Rectangle(0.3,0.3);
		System.out.println(test.area());
		System.out.println(test.perimeter());
		System.out.println(test.compareArea(test,test2));
		System.out.println(test.isSquare());
		System.out.println(test2.isSquare());
		test.draw();
		test2.draw();
	}

}
