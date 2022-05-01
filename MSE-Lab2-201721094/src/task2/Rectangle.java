package task2;

import java.awt.Graphics;

public class Rectangle extends Shape {
	
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		setWidth(width);
		setHeight(height);
	}	
	
	@Override
	public void draw(Graphics g) {
		//Draws the shape on a canvas. ShapeCanvas' paintComponent() method calls this method.
		//The Graphics class has methods to draw basic shapes, like rectangles, lines and circles.
		
		g.setColor(color);
		g.drawRect(position.x, position.y, width, height);
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}

	
}
