/**This project appends Hello World follow by a New Line to a text File.
 * 
 */
package com.ss.three.append;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Emilio_Benavente
 *
 */
public class AppendToFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileWriter fw = null; 
		BufferedWriter bw = null;
		PrintWriter pw = null;
		File f = new File("Append.txt");
		
		/*** @NOTE if file dosen't exist then File is created ***/
		if(!f.exists())
			try {
				f.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		
		
		try {
			 fw = new FileWriter("Append.txt", true);
			 bw = new BufferedWriter(fw);
			 pw = new PrintWriter(bw);
			 pw.println("Hello World\n"); //<- code that actually appends
		} 
		/*** @NOTE catch and finally are clean up ***/
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				pw.close();
				bw.close();
				fw.close();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
