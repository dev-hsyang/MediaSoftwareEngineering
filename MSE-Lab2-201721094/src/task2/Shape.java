package task2;
import java.awt.Point;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
	
	
	Point position;
	Color color;
	
	public abstract void draw(Graphics g);
		//Draws the shape on a canvas. ShapeCanvas' paintComponent() method calls this method.
		//The Graphics class has methods to draw basic shapes, like rectangles, lines and circles.
	
	
	public void move(Point newPosition) {
		//Moves the shape to the new position
		setPosition(newPosition);
	}

	
	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
