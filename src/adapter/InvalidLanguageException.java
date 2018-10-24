package adapter;

/**
 * Brandon Nhem
 * Anthony Pham
 * October 24, 2018
 * Purpose: Exception when invalid language is used
 * Input: n/a
 * Output: n/a
 */

@SuppressWarnings("serial")
public class InvalidLanguageException extends Exception
{	
	public InvalidLanguageException() {}
	
	public InvalidLanguageException(String message)
	{
		super(message);
	}

}
