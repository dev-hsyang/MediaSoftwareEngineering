package task2;

import java.awt.Graphics;

public class Circle extends Shape{
	
	private int radius ;
	
	public Circle(int radius) {
		setRadius(radius);
	}
	
	@Override
	public void draw(Graphics g) {
		//Draws the shape on a canvas. ShapeCanvas' paintComponent() method calls this method.
		//The Graphics class has methods to draw basic shapes, like rectangles, lines and circles.
		
		g.setColor(color);
		g.drawOval(position.x, position.y, radius, radius);
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}
