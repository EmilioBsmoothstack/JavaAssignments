/**This class implements the Shape interface and represents a Rectangle
 * 
 */
package com.ss.two.shape;

/**
 * @author Emilio Benavente
 *
 */
public class Rectangle implements Shape{
	private float width = 0;
	private float height = 0;
	private float area = 0;
	
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}

	
	public Rectangle(float width, float height) {
		this.width = width;
		this.height = height;
		calculateArea();
	}
	public void calculateArea() {
		area = width * height;
	}
	
	public void display() {
		System.out.println("The area is -> " + area);
	}
}
