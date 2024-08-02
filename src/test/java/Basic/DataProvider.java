package Basic;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {

	
	@Test
	public void resiver(String username,String password) {
		
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.findElement(By.xpath("//a[text()='Log in']")).click();
			driver.findElement(By.id("Email")).sendKeys(username);
			driver.findElement(By.id("Password")).sendKeys(password);
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
	
	}
	@org.testng.annotations.DataProvider
	public Object[][] sender() {

		
		Object[][] obj=new Object[2][2];
		obj[0][0]="admin01@gmail.com";
		obj[0][1]="admin01";
		obj[1][0]="admin02@gmail.com";
		obj[1][1]="admin02";
	return obj;
	

}

}
	
	
	
	
//	@DataProvider(name="login")
//
//	public Object[][] sender() {
//
//	{
//		return DataProvideUtility.dwsLogin();
////		Object[][] obj=new Object[2][2];
////		obj[0][0]="admin01@gmail.com";
////		obj[0][1]="admin01";
////		obj[1][0]="admin02@gmail.com";
////		obj[1][1]="admin02";
////		return obj;
//