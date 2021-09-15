/**This tests all class cases of the implemenation of Shape
 * 
 */
package com.ss.two.shape;

/**
 * @author Emilio Benavente
 *
 */
public class TestShapes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(5,4);
		Circle c = new Circle(5);
		Triangle t = new Triangle(5,4);
		
		rect.display();
		c.display();
		t.display();
		
	}

}
