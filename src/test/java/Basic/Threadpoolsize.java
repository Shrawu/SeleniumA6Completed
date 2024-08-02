package Basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Threadpoolsize {
	
	@Test(priority=2)
	public  void demo() {
		
		WebDriver Driver =new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Driver.get("https://demowebshop.tricentis.com/");
		Driver.close();
		
		// we can take the char also it will take ASCII value 
	}
	
	@Test(priority = 1,invocationCount = 3,threadPoolSize = 2)
public  void shopper() {
		
		WebDriver Driver =new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.shoppersstack.com/");
		Driver.close();
		
		
	}
	@Test (priority = 0)
	
	
public  void flipcart() {
		
		WebDriver Driver =new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.flipkart.com/");
		Driver.close();
		
		
	}


	
	
	
	
}


