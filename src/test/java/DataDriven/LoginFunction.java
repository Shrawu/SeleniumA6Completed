package DataDriven;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunction {

	public static void main(String[] args) throws IOException, InterruptedException {
		//read the data from property file 
		
		
		String email = JavaUtility.LoginData("email");
		String password=JavaUtility.LoginData("password");
		
		
		// we are going to get inside the browser
	     
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		

	}

}
