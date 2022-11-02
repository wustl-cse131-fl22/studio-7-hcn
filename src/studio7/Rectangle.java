package studio7;
import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;
public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle (double initlength, double initwidth)
	{
		length = initlength;
		width = initwidth;
	}

	public double area (double length, double width) {
		
		return length* width;
	}
	
	public double perimeter (double length, double width) {
		
		return 2*(length + width);
	}

	
	public boolean compare(double otherRecArea, double selfArea) {
		return selfArea < otherRecArea;
	}
	
	public boolean square(double length, double width) {
		return length == width;
	}
	
	public void draw(double length, double width) {
		StdDraw.setCanvasSize();
		StdDraw.setScale(0, 800);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.rectangle(0.5, 0.5, width/2, length/2);
	}
	
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}
