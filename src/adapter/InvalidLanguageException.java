package adapter;

@SuppressWarnings("serial")
public class InvalidLanguageException extends Exception
{	
	public InvalidLanguageException() {}
	
	public InvalidLanguageException(String message)
	{
		super(message);
	}

}
