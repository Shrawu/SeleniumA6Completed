package Assertion2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import Assertions.SoftAssert;

public class softAssert {

	public void dws() {
	
		String expected_url= "https://demowebshop.tricentis.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		String actual_url = driver.getCurrentUrl();
		
		SoftAssert soft = new SoftAssert();
		soft.assertNotEquals(expected_url, actual_url,"url is not matching");
		Reporter.log("i am in dws page", false);
		
		WebElement search_field = driver.findElement(By.id("small-searchterms"));
		search_field.sendKeys("mobile",Keys.ENTER);
		
		
		WebElement advance_search =driver.findElement(By.id("As"));
	
		soft.assertTrue(advance_search.isSelected(),"element is not selected");
		soft.assertAll();
		
		driver.findElement(By.id("Isc")).click();
		
		
	
}
}