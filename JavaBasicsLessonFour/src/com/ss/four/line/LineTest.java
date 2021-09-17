/**This is a test for LineClass
 * 
 */
package com.ss.four.line;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

/**
 * @author Emilio_Benavente
 *
 */
public class LineTest {

	@Test
	public void slopeRegTest() {
		LineClass line = new LineClass(12.0, 8.0, 5.0, 2.0);
		Double num = line.getSlope();
		assertEquals(num, 0.857142, 0.0001);
	}
	
	@Test
	public void slopeNegTest() {
		LineClass line = new LineClass(-12.0, 8.0, 5.0, 2.0);
		assertEquals(line.getSlope(), -0.35294117, 0.0001);
	}
	
	@Test(expected = ArithmeticException.class)
	public void slopeExceptionTest() {
		LineClass line = new LineClass(5.0, 8.0, 5.0, 8.0);
		line.getSlope();
	}
	
	@Test(expected = ArithmeticException.class)
	public void slopeInfTest() {
		LineClass line = new LineClass(0.0, 10.0, 0.0, 8.0);
		line.getSlope();
	}
	
	@Test
	public void distanceRegTest() {
		LineClass line = new LineClass(-12.0, 8.0, 5.0, 2.0);
		assertEquals(line.getDistance(), 18.02776, 0.0001);
	}
	
	@Test
	public void distanceZeroTest() {
		LineClass line = new LineClass(5.0, 8.0, 5.0, 8.0);
		assertEquals(line.getDistance(), 0, 0.0001);
	}
	
	@Test
	public void distanceExceptionTest() {
		LineClass line = new LineClass(0.0, 0.0, 0.0, 0.0);
		assertEquals(line.getDistance(), 0, 0.0001);
	}
	
	@Test
	public void parallelTrueTest() {
		LineClass line = new LineClass(-12.0, 8.0, 5.0, 2.0);
		LineClass line2 = new LineClass(-12.0, 8.0, 5.0, 2.0);
		assertEquals(line.parallelTo(line2), true);
	}
	
	@Test
	public void parallelFalseTest() {
		LineClass line = new LineClass(-12.0, 8.0, 5.0, 2.0);
		LineClass line2 = new LineClass(-12.0, 3.0, 5.0, 2.0);
		assertEquals(line.parallelTo(line2), false);
	}
	
	@Test(expected = NullPointerException.class)
	public void parallelNullTest() {
		LineClass line = new LineClass(-12.0, 8.0, 5.0, 2.0);
		LineClass line2 = null;
		line.parallelTo(line2);
	}

	
}
