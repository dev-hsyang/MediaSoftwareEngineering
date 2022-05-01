package task2;

import java.util.ArrayList;
import java.awt.Point;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class ShapeCanvas extends JComponent {
	
	private static ArrayList<Shape> shapes = new ArrayList<Shape>();
	private static ArrayList<Point> positions = new ArrayList<Point>();
	//shapes that will be drawn on the screen.
	
	private Color red = new Color(255, 0, 0, 255);
	private Color blue = new Color(0, 0, 255, 255);
	private Color green = new Color(0, 255, 0, 255);
	private Color black = new Color(0, 0, 0, 255);

	@Override
	public void paintComponent(Graphics g) {
		//Call the draw() method for each shape in the shapes list.
		
		for(int i=0; i<shapes.size(); i++) {
			shapes.get(i).setColor(blue);
			shapes.get(i).setPosition(positions.get(i));
			shapes.get(i).draw(g);
		}
	}

	
	public ArrayList<Shape> getShapes() {
		//return shapes.get(index);
		return shapes;
	}

	public void setShapes(ArrayList<Shape> shapes) {
		this.shapes = shapes;
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(500, 500);
	}
	
	public Dimension getMinimumSize() {
	    return getPreferredSize();
	}
	
	
	public static void main(String[] args) {
		//Create and draw shapes so that the result is a drawing
		//like a face, a car, or something else
		
		//Use each shape type at least once.
		//Feel free to change the drawing color
		
		shapes.add(new Line(170, 370, 250, 390));
		shapes.add(new Line(250, 390, 330, 370));
		shapes.add(new Circle(400));
		shapes.add(new Rectangle(80, 40));
		shapes.add(new Rectangle(80, 40));
		shapes.add(new Triangle(220, 330, 280, 330, 250, 250));
		
		positions.add(null);
		positions.add(null);
		positions.add(new Point(50, 50));
		positions.add(new Point(140, 180));
		positions.add(new Point(280, 180));
		positions.add(null);
	
		JFrame mainFrame = new JFrame("task2");
		mainFrame.getContentPane().add(new ShapeCanvas());
		mainFrame.pack();
		mainFrame.setVisible(true);
		
	}
}
