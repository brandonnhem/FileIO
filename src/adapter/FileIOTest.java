package adapter;

/**
 * Brandon Nhem
 * Anthony Pham
 * October 24, 2018
 * Purpose: Main class
 * Input: n/a
 * Output: n/a
 */

public class FileIOTest {

	public static void main(String[] args) throws InvalidLanguageException {
		
		try {
			EarthText et = new EarthText();
			EarthText et2 = new EarthText();
			et.sendMessage("Earth", "EarthText.txt");
			System.out.print("Earth text: ");
			et2.readMessage("txtmessage.txt");
			UniversalTranslator ut = new UniversalTranslator(new KlingonText());
			EarthCellPhone e3 = ut;
			e3.readMessage("KlingonTextMessage.txt");
			et.sendMessage("Vulcan", "VulcanTextMessage.txt");
			ut = new UniversalTranslator(new VulcanText());
			e3 = ut;
			e3.readMessage("VulcanTextMessage.txt");
			et.sendMessage("non-fed","nonFed.txt");
		}
		catch (InvalidLanguageException ile) {
			System.out.println(ile.getMessage());
		}
		System.out.println("Done.");

	}

}
