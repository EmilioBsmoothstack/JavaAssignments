/**This will ensure main dosen't fail during execution, hard to test since mainly print statements
 * 
 */
package com.ss.five.time;

import org.junit.Test;


/**
 * @author Emilio_Benavente
 *
 */
public class DateTimeTest {

	@Test(expected = Test.None.class)
	public void mainTest() {
		DateTimeDemo.main(null);
	}
	
}
