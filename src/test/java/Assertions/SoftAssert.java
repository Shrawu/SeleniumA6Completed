package Assertions;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SoftAssert {
	@Test
	public void SA() {
		
		String expected_result = "https://demowebshop.tricentis.com/";
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String a ="satya";
		String b=null;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//String actual_result= driver.getCurrentUrl();
		driver.get("https://demowebshop.tricentis.com/");
		String actual_result= driver.getCurrentUrl();
		assertEquals(expected_result,actual_result);
	
		driver.findElement(By.id("small-searchterms")).sendKeys( "shrawani");
		
		driver.findElement(By.xpath("//input [@type='submit']")).click();
		
		
		
	}

}
