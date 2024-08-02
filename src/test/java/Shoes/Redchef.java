package Shoes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Redchef {
 
	@Test
     public void redchef() {
    	 
    	 
    	 WebDriver Driver =new ChromeDriver();
 		Driver.manage().window().maximize();
 		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
 		Driver.get("https://redchefhome.com/");
 		Driver.close();
 		
    	 
    	 
     }
}
