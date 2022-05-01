package task2;

import java.awt.Graphics;

public class Triangle extends Shape{
	
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int x3;
	private int y3;
	
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		setX1(x1);
		setY1(y1);
		setX2(x2);
		setY2(y2);
		setX3(x3);
		setY3(y3);
	}
	
	@Override
	public void draw(Graphics g) {
		//Draws the shape on a canvas. ShapeCanvas' paintComponent() method calls this method.
		//The Graphics class has methods to draw basic shapes, like rectangles, lines and circles.
		g.setColor(color);
		g.drawPolygon(new int[] {x1, x2, x3}, new int[] {y1, y2, y3}, 3);
	}


	public void setX1(int x1) {
		this.x1 = x1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}


	public void setX2(int x2) {
		this.x2 = x2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}


	public void setX3(int x3) {
		this.x3 = x3;
	}

	public void setY3(int y3) {
		this.y3 = y3;
	}

	
}
