/**This test to ensure no exceptions occur on LambdaDemo when main is run.
 * The class is for a very specific purpose and thus has only one test condition
 * which is tested in the class itself, thus only main will be tested here.
 * 
 */
package com.ss.lambda;

import org.junit.Test;


/**
 * @author Emilio_Benavente
 *
 */
public class LambdaTest {

	@Test(expected = Test.None.class)
	public void mainTest() {
		LambdaDemo.main(null);
	}
}
