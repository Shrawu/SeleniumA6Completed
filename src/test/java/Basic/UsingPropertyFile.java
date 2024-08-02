package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UsingPropertyFile {

	
	@Test
	
	public void Readdata() throws IOException {
		
		// 1] create a object property file
		
		Properties  prop = new 	Properties ();
		
		// 2] create a object of 
		
		FileInputStream fis = new FileInputStream("./configuratrion/DWs.properties");
		
		// 3] load  the property file
		
		prop.load(fis);
		
		// call the method and featch data into it 
		
		String  URL=prop.getProperty("URL");
		System.out.println(URL);
		String username = prop.getProperty("Username");
		System.out.println(username); 
		String password = prop.getProperty("Password");
		System.out.println(password);
		
		// call the web driver and  create a object of chrome
		
		WebDriver Driver = new ChromeDriver ();
		
		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Driver.get(URL);
		
		Driver.findElement(By.className("ico-login")).click();
		
		Driver.findElement(By.id("Email")).sendKeys(username);
		
		Driver.findElement(By.id("Password")).sendKeys(password);
		
		Driver.findElement(By.cssSelector("input[value='Log in']")).click();
	
		//http://localhost:8888/index.php
		
	}
}
