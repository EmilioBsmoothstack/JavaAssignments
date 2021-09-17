/**The purpose of this class is to ensure a thread safe instance of this class
 * 
 */
package com.ss.four.sing;

/**
 * @author Emilio_Benavente
 *
 */
public class SingletonClass {

	private static volatile SingletonClass instance = null;
	
	private SingletonClass() {
		
	}
	
	public static SingletonClass getSingletonClass() {
		System.out.println("Inside Singleton..");
		if(instance == null) {
			synchronized(SingletonClass.class){
				if(instance == null) {
					instance = new SingletonClass();
				}
			}
		}
		System.out.println("Leaving Singleton..");
		return instance;
	}
	
}
