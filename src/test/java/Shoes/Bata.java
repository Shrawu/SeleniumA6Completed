package Shoes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bata {

	@Test
	public void Bat(){
		
		
		
		WebDriver Driver =new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Driver.get("https://www.bata.com/in/new/");
		Driver.close();
		
		
		
	}

}
