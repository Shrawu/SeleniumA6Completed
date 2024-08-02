package Assertion2;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HardAssert {

	@Test
	public void main(){
		
		String Expected_url = "https://demowebshop.tricentis.com/";
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");	
		String actual_url = driver.getCurrentUrl();
		
		//AssertEqual
		
        //assertEquals(Expected_url, actual_url);
		
		
		//AssertNotEqual
		
		
		//assertNotEquals(Expected_url, actual_url,"url is not matching ");//it will stop the accplication
		
		
		//AssertTrue
	       //+(Expected_url, actual_url,"url is not matching ");
	 
		
	       
	       
       WebElement search=driver.findElement(By.id("small-searchterms"));
       search.sendKeys("mobile",Keys.ENTER);
       

       WebElement As=driver.findElement(By.id("As"));
       As.click();
       assertTrue(As.isSelected());
       
       driver.findElement(By.id("Isc")).click();
       driver.quit();
      
       
       
		
	}
	
	

	
}
