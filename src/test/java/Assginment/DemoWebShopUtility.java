
package Assginment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class DemoWebShopUtility 
{
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@BeforeMethod
	public void loginClick()
	{
		driver.findElement(By.className("ico-login")).click();
	}
	
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}
	
	@AfterClass
	public void quit() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}