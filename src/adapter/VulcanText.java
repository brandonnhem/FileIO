package adapter;

/**
 * Brandon Nhem
 * Anthony Pham
 * October 24, 2018
 * Purpose: A class that is reserved only for files that are written in Klingon
 * Input: sendMessage(), readMessage()
 * Output: translateText()
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class VulcanText implements AlienCellPhone {
	
	/**
	 * Constructor class that is only meant for files that are written in Vulcan
	 */
	
	public VulcanText()
	{
		
	}
	
	/**
	 * Reads a file and create new file with the new message
	 * @param fileName - The name of the file that is being copied
	 */
	
	@Override
	public void alienSendText(String fileName) 
	{
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
	public void alienReadText(String fileName) 
	{
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
	
	/**
	 * Returns the file name of the file that is translated to EarthText
	 * @return translatedText - The file name with the text that has been translated to EarthText
	 */

	@Override
	public String translateText(String fileName) {
		String translatedText = "Translated" + fileName;
		return translatedText;
	}
}