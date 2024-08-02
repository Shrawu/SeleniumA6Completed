package helperMethos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MethodPrivority {
	
	@Test(priority = 1)
	public void Zomato() {
		
		WebDriver Driver =new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Driver.get("https://www.zomato.com/");
		Driver.close();
		
		
		
	}
	@Test (priority = 2)
	
	public void pizzaHut () {
		
		WebDriver Driver =new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Driver.get("https://www.pizzahut.co.in/");
		Driver.close();
		
		
		
	}
	@Test(priority = 3)
	
	public void Dome () {
		
		WebDriver Driver =new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Driver.get("https://www.dominos.co.in/");
		Driver.close();
		
		
		
	}
	@Test(priority =0)
	
	public void swigge() {
		WebDriver Driver =new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Driver.get("https://www.swiggy.com/");
		Driver.close();
		
		
	}

}
