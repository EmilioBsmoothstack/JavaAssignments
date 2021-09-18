/**This is the singleton class used for FixSingltonDemo
 * 
 */
package com.ss.single;

/**
 * @author Emilio_Benavente
 *
 */
//import java.math.BigDecimal;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;


public class SampleSingleton {

	private SampleSingleton() {}
	
//	private static Connection conn = null;

	private static volatile SampleSingleton instance = null;

	public static SampleSingleton getInstance() {
		if(instance == null) {
			synchronized(SampleSingleton.class){
				if(instance == null)
					instance = new SampleSingleton();
			}
		}
		return instance;
	}

}
