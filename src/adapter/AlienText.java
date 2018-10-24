package adapter;

/**
 * Brandon Nhem
 * Anthony Pham
 * October 24, 2018
 * Purpose: Class for AlienText allowing for Klingon and Vulcan messages to be passed through
 * 			the universal translator
 * Input: translateText(), sendMessage(), readMessage()
 * Output: translateText(), toString()
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AlienText implements AlienCellPhone {

	public AlienText() {}
	
	/**
	 * Reads a file and create new file with the new message
	 * @param fileName - The name of the file that is being copied
	 */
	
	@Override
	public void alienSendText(String fileName) {
        String dir = System.getProperty("user.dir");

		try
		{
			File file = new File(dir + "\\" + fileName);
			Scanner userInput = new Scanner(System.in);
			System.out.print("Enter output file name: ");
			String outputFile = userInput.nextLine();
	        PrintWriter printWriter = new PrintWriter(outputFile);
	        
//	        userInput.close();
	        
	        Scanner input = new Scanner(file);
			
			// Read data from a file        
			while(input.hasNextLine())
			{
				String readLine = input.nextLine();
	        	printWriter.println(readLine);
			}
			// Close the file
			printWriter.close();
			input.close();
		}
		catch(FileNotFoundException exception)
		{
			 System.out.println("File: " + fileName + " does not exist.");
		}
	}
	
	/**
	 * Takes a file and displays it to the console
	 * @param fileName - The name of the file to be read
	 */

	@Override
	public void alienReadText(String fileName) {
		String dir = System.getProperty("user.dir");

		try
		{
			File file = new File(dir + "\\" + fileName);
			// Create a Scanner for the file
			Scanner input = new Scanner(file);
			
			// Read data from a file        
			while(input.hasNextLine())
			{
				String readLine = input.nextLine();
				System.out.println(readLine);
			}
			// Close the file
			input.close();
		}
		 catch(FileNotFoundException exception)
		{
			 System.out.println("File: " + fileName + " does not exist.");
		}		
	}

	@Override
	public String translateText(String fileName) {
		
		return "Translated" + fileName;
	}
	
	/**
	 * Overrides toString method, just kinda says what it does
	 * @return string of what this class does
	 */
	
	public String toString()
	{
		return "Class that allows for Klingon or Vulcan to be passed through the Universal Translator";
	}

}
