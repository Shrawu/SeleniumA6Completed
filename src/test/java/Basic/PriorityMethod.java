package Basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityMethod {

	
		// TODO Auto-generated method stub


		@Test (priority = 2)
		//testng Annotation 
		
		public  void demo( ) {
	
			WebDriver Driver =new ChromeDriver();
			Driver.manage().window().maximize();
			Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			Driver.get("https://demowebshop.tricentis.com/");
			Driver.close();
			
			// we can take the char also it will take ASCII value 
			// According to the prority it will execute 
		}
		
		@Test(priority = 0)
public  void shopper() {
			
			WebDriver Driver =new ChromeDriver();
			Driver.manage().window().maximize();
			Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			Driver.get("https://www.shoppersstack.com/");
			Driver.close();
			
			
		}
		@Test (priority = 1)
		
		
public  void flipcart() {
			
			WebDriver Driver =new ChromeDriver();
			Driver.manage().window().maximize();
			Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			Driver.get("https://www.flipkart.com/");
			Driver.close();
			
			
		}
	
	
	







	







	}


