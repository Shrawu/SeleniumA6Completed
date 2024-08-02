package Basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchTheVBrowser {

	// It will work according to the ASCII Value 
		// TODO Auto-generated method stub

		@Test 
		//testng Annotation 
		
		public  void demo() {
			
			WebDriver Driver =new ChromeDriver();
			Driver.manage().window().maximize();
			Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			Driver.get("https://demowebshop.tricentis.com/");
			Driver.close();
			
			
		}
		
		@Test
public  void shopper() {
			
			WebDriver Driver =new ChromeDriver();
			Driver.manage().window().maximize();
			Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			Driver.get("https://www.shoppersstack.com/");
			Driver.close();
			
			
		}
		@Test
		
		
public  void flipcart() {
			
			WebDriver Driver =new ChromeDriver();
			Driver.manage().window().maximize();
			Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			Driver.get("https://www.flipkart.com/");
			Driver.close();
			
			
		}


}


	






