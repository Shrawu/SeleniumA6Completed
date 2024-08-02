package com.crm.listernersCode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseDWS {

	public static WebDriver driver;
	public static void precondition(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			driver=new ChromeDriver();
			
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demowebshop.tricentis.com/");
			
		}
	public static void login() throws InterruptedException {
		
		
		driver.findElement(By.id("Email")).sendKeys("kritikachaf@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("kritika@01");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		
	}
public static void postCondition() {
		
		driver.findElement(By.className("ico-logout")).click();
		driver.quit();
	}
	
		
		
		
	}
		
	
	
	
	
	

