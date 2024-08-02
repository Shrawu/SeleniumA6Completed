package com.crm.listernersCode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver ;
		@BeforeClass
		
		public void Beforeclass() {
			
	driver=new ChromeDriver();
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
			
			
			
		}
		
		@BeforeMethod
		
		public void BeforeMethod() {
		
			driver.findElement(By.className("ico-login")).click();
			driver.findElement(By.id("Email")).sendKeys("admin012gmail.com");
			driver.findElement(By.id("Password")).sendKeys("admin01");
			driver.findElement(By.xpath("//input[@value='Log in'")).click();
			
			    

	                              }
		@AfterMethod
		
		public void BeforeClass() {
			
			
			    driver.findElement(By.className("ico-logout")).click();
		}

	   @AfterClass
	   public void postCondition () {
		   
		   driver.quit();
		   
	   }
	 	    }

