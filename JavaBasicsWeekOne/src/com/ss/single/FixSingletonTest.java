/**This will test that the singleton class can only have one instance
 * 
 */
package com.ss.single;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Emilio_Benavente
 *
 */
public class FixSingletonTest {
	
	@Test
	public void testSingleton() {
		SampleSingleton a = SampleSingleton.getInstance();
		SampleSingleton b = SampleSingleton.getInstance();
		Assert.assertEquals(a,b);
	}

}
