package adapter;

public class FileIOTest {

	public static void main(String[] args) throws InvalidLanguageException {
		EarthText et = new EarthText();
		et.readMessage("txtmessage.txt");
		et.sendMessage("Earth", "txtmessage.txt");

	}

}
