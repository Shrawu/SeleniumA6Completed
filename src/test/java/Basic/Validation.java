package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver  Driver = new ChromeDriver ();
		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Driver.navigate().to("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		
		Driver.findElement(By.xpath("//section[text()='FormValidation']")).click();
		
		Driver.findElement(By.name("requiredfield")).sendKeys("heloo");
		
		Driver.findElement(By.name("minLength")).sendKeys("2");
		
		Driver.findElement(By.name("password")).sendKeys("shrawani");
		Driver.findElement(By.name("confirmpass")).sendKeys("shrawani");
		
		Driver.findElement(By.name("email")).sendKeys("shrawaniwagh06@gmail.com");
		
	
		Driver.findElement(By.name("maxLength")).sendKeys("4");
		
		Driver.findElement(By.name("minValue")).sendKeys("7");
		

		Driver.findElement(By.name("maxValue")).sendKeys("10");
		
		
		Driver.findElement(By.name("url")).sendKeys("https://www.ajio.com/");
	
		
		Driver.findElement(By.name("digits")).sendKeys("30");
	
	    Driver.findElement(By.name("rangeValue")).sendKeys("700");
	    
	    Driver.findElement(By.name("number")).sendKeys("19");
	    
	    Driver.findElement(By.name("alphanum")).sendKeys("abc");
		
		
		
		
		
		
	}

}
