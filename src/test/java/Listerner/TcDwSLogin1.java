package Listerner;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TcDwSLogin1 {

	@Test
	public void login() {
		WebDriver driver= new ChromeDriver(); 
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.className("ico-login")).click();
	
	
	
	}
	
	
	
	
}
