package Assertions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import practical1.baseclass;

public class AssertEqual {

	@Test
	public void hardAssert() {
		
		
		
		String expected_result = "https://demowebshop.tricentis.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demowebshop.tricentis.com/");
		//String a = "shrawani";
		//String b = null;
		String actual_result= driver.getCurrentUrl();
		
		assertEquals(expected_result,actual_result);
		
		driver.findElement(By.id("small-searchterms")).sendKeys( "shrawani");
		
		driver.findElement(By.xpath("//input [@type='submit']")).click();
		
	         
	}

		
	}

