package adapter;

/**
 * Brandon Nhem
 * Anthony Pham
 * October 24, 2018
 * Purpose: Interface for EarthText, built for Adapter Design Pattern
 * Input: n/a
 * Output: n/a
 */

public interface EarthCellPhone {
	   public void sendMessage(String languageType, String fileName) throws InvalidLanguageException;
	   public void readMessage(String fileName);
	}
