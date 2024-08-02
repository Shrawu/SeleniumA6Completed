package DataDriven;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogin {

	public static void main(String[] args) throws IOException, InterruptedException {
		//read the data from property file 
		
		
		String username = OrangeLoginUtility.LoginData("username");
		String Password=OrangeLoginUtility.LoginData("Password");
		
		
		// we are going to get inside the browser
	     
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(Password);
		Thread.sleep(2000);
		driver.findElement(By.xpath(" //button[@type='submit'] ")).click();
		Thread.sleep(2000);
		

	}

	
	
	
}
