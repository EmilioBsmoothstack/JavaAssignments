/**This class implements the Shape interface and represents a Triangle
 * 
 */
package com.ss.two.shape;

/**
 * @author Emilio Benavente
 *
 */
public class Triangle implements Shape{
	private float base = 0;
	private float height = 0;
	private float area = 0;
	public void setBase(float base) {
		this.base = base;
	}
	public float getBase() {
		return base;
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	public float getHeight() {
		return height;
	}

	public Triangle(float base, float height) {
		this.base = base;
		this.height = height;
		calculateArea();
	}
	
	public void calculateArea() {
		area = (base * height) / 2;
	}
	
	public void display() {
		System.out.println("The area is -> " + area);
	}
}
