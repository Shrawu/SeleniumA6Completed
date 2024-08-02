package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ShopperLogin {

	public static String  LoginData(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(".\\Confi\\Shopper.properties");
		
		prop.load(file);
		
		String data = prop.getProperty(key);
		return data;
	}



		
		
		
		
		
		
		
		
	
}
