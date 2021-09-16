/**The purpose of this class is to count a number of times a char is counted from a given file
 * 
 */
package com.ss.three.count;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Emilio_Benavente
 *
 */
public class CharCount {

	/**
	 * @param args
	 */
	private static int count = 0;
	
	public static void main(String[] args) {
		/*** @NOTE if a character is not passed as an argument, program closes ***/
		if(args.length != 1 || args[0].length() != 1) {
			System.out.println("Please enter a valid char!");
			return;
		}
		
		
		/*** @NOTE setting up program data ***/
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a file path.");
		String path = sc.nextLine();
		sc.close();
		FileReader fr = null; 
		BufferedReader br = null;
		
		/*** @NOTE if file dosen't exist or is a directory program closes ***/
		File f = new File(path);
		if(!f.exists() && !f.isFile()) {
			System.out.println("File does not exist!");
			return;
		}

		try {
			 fr = new FileReader(path);
			 br = new BufferedReader(fr);
			 String str = null;
			 
			 /*** @NOTE Read every char in file until break is hit ***/
			 while(true) {
				 str = br.readLine();
				 if(str == null) break;
				 
				 for(char c: str.toLowerCase().toCharArray()) {
					 if(c == args[0].toLowerCase().toCharArray()[0])
						 count++;
				 }
			 }
		} 
		/*** @NOTE catch and finally are clean up ***/
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
				fr.close();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		System.out.println("The total count of the Character '" + args[0].toCharArray()[0] + "'\nin File " + path + " is -> " + count);

	}

}
