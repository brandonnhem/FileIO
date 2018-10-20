package adapter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class UniversalTranslator implements EarthCellPhone{
	
	private AlienCellPhone text;
	public UniversalTranslator(AlienCellPhone message)
	{
		text = message;
	}
	@Override
	public void sendMessage(String languageType, String fileName) throws InvalidLanguageException {
		
		String dir = System.getProperty("user.dir");
		if (!languageType.equals("Earth") && !languageType.equals("Klingon") && !languageType.equals("Vulcan"))
		{
			throw new InvalidLanguageException("This language type is not supported.");
		}
		try
		{
			File file = new File(dir + "\\" + fileName);
			Scanner userInput = new Scanner(System.in);
			System.out.print("Enter output file name: ");
			String outputFile = userInput.nextLine();
	        PrintWriter printWriter = new PrintWriter(outputFile);
	        
	        userInput.close();
	        
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
	
	@Override
	public void readMessage(String fileName) {
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
		System.out.print("Message Above Translated to Earth -> ");
	 	text.alienReadText(text.translateText(fileName));
	}
	
	
}
