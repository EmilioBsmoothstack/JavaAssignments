/**This class is designed to print all files, directories and sub-directories from a given path.
 * 
 */
package com.ss.three.dir;

import java.io.File;
import java.util.Scanner;

/**
 * @author Emilio_Benavente
 *
 */
public class DisplayDirFiles {

	/**
	 * @param args
	 */
	private String pipe = "|";
	private String line = "-----";
	private String endLine = "*****";
	
	public static void main(String[] args) {
		/*** @NOTE This is mostly setting up data and getting path from user ***/
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a directory");
		String path = sc.nextLine();
		sc.close();
		DisplayDirFiles d = new DisplayDirFiles();
		d.displayDirFiles(path, 1);
	}	
	
	/*** @NOTE This prints a str depending on how deep the sub-directory is ***/
	private void printFormat(String str, int depth) {
		for(int i = 0; i < depth; ++i)
			System.out.print(str);
	}
	
	/*** @NOTE Printing with a tab without having to type \t ***/
	private void printFileName(String str) {
		System.out.println("\t" + str);
	}

	/*** @NOTE Majority of this function is printing symbols not actual file names 
	 * 	 printFileNames are the instances of Files and/or Directories
	 *   Also note that this function is recursive
	 * ***/
	public void displayDirFiles(String path, Integer depth) {
		File f = new File(path);
		if(!f.exists())
			return;
		
		printFormat(pipe + "\n", 1);
		/*** @NOTE We are in directory ***/
		if(f.isDirectory()) {
			printFormat(pipe, 1);
			printFormat(line, depth);
			printFormat(pipe, 1);
			printFileName(f.getName());
			
			File[] fList = f.listFiles();
			/*** @NOTE Directory is empty ***/
			if(fList == null ||fList.length < 1) {
				printFormat(pipe, 1);
				printFormat(endLine, depth);
				printFormat(pipe, 1);
				printFileName("^Empty Dir.^");
				return;
			}
			/*** @NOTE Else print files ***/
			for(int i = 0; i < fList.length; ++i) {
				displayDirFiles(fList[i].toString(), depth + 1);
			}
		} 
		/*** @NOTE We are pointing to a file so print the name ***/
		else if(f.isFile()) {
			printFormat(pipe, 1);
			printFormat(line, depth);
			printFileName(f.getName());
		}
	}

}
