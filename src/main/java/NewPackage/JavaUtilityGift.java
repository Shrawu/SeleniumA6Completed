package NewPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JavaUtilityGift {
	public static String  LoginData(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\ NewSelenium\\com.crm.Advanced\\Confi\\gift.properties");
		
		prop.load(file);
		
		String data = prop.getProperty(key);
		return data;
	}

}
