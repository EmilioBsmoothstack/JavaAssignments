/**This class implements the Shape interface and represents a Circle
 * 
 * 
 */
package com.ss.two.shape;

/**
 * @author Emilio Benavente
 *
 */
public class Circle implements Shape{
	
	private float radius = 0;
	private float area = 0;
	
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public float getRadius() {
		return radius;
	}
	
	public Circle(float radius) {
		this.radius = radius;
		calculateArea();
	}
	
	public void calculateArea() {
		area = (float) (Math.PI * radius * radius);
	}
	
	public void display() {
		System.out.println("The area is -> " + area);
	}
}
