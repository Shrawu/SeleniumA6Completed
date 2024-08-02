package Shoes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class one8 {

	@Test
	public void one8() {
		
		

		WebDriver Driver =new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Driver.get("https://www.one8.com/");
		Driver.close();
		
		
		
	}
	
	
	
}
