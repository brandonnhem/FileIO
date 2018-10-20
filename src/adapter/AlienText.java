package adapter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AlienText implements AlienCellPhone {

	public AlienText() {}
	
	@Override
	public void alienSendText(String fileName) {
		//TODO: Create method
	}

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
		
		return null;
	}

}
