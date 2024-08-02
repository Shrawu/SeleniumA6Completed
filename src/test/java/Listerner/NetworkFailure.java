package Listerner;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NetworkFailure {

	@Test(retryAnalyzer=com.crm.listernersCode.Retrynetwork.class)
	public void executeonemorTime() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		String expected_url = "https://demowebshop.tricentis.com";
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String actual_url=driver.getCurrentUrl();
		
		assertEquals(expected_url,actual_url);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String ref1= "mobile";
//		
//		String ref2= "mobile1"; // making test case as fail
//		assertEquals(ref1, ref2,"both are not same");
//		
		
	}
	
	
	
}
