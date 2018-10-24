package adapter;

/**
 * Brandon Nhem
 * Anthony Pham
 * October 24, 2018
 * Purpose: Interface for AlienText, built for Adapter Design Pattern 
 * Input: n/a
 * Output: n/a
 */

public interface AlienCellPhone {
   public void alienSendText(String fileName);
   public void alienReadText(String fileName);
   //translateText returns the name of the output file
   //that has the translated message
   public String translateText(String fileName);
}

