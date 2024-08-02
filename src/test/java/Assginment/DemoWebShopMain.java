package Assginment;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoWebShopMain extends DemoWebShopUtility
	{
		@Test(dataProvider = "idpass")
		public void login(String email, String pass)
		{
			driver.findElement(By.className("ico-login")).click();
			driver.findElement(By.id("Email")).sendKeys(email);
			driver.findElement(By.id("Password")).sendKeys(pass);
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
		}
		
		@DataProvider(name="idpass")
		public Object[][] loginIdPass() throws EncryptedDocumentException, IOException
		{
			return DemoWebShopDataProvider.loginData();
		}
	}


