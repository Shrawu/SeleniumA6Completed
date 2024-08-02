package Assginment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShopperStack {
	
	@Test
	public void login() throws IOException {
	
	Properties prop = new Properties();
	
	FileInputStream fis = new FileInputStream("./configuratrion/shoppersta.properties");
		

	prop.load(fis);
	
	// call the method and featch data into it 
	
	String  URL=prop.getProperty("url");
	System.out.println(URL);
	String username = prop.getProperty("username");
	System.out.println(username); 
	String password = prop.getProperty("password");
	System.out.println(password);
		
		
		
		
	WebDriver Driver = new ChromeDriver ();
	Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Driver.get("https://www.shoppersstack.com/");
		
		Driver.findElement(By.id("loginBtn")).click();
		Driver.findElement(By.id("Email")).sendKeys("vishal007@gmail.com");
		Driver.findElement(By.id("Password")).sendKeys("Sarkar@07");
		
		Driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		
		
		
		
	}
	
	
	
	
	
	

}
