package Watch;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fossil {

	@Test
	public void foss() {
		
		WebDriver Driver =new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Driver.get("https://www.fossil.com/en-in");
		Driver.close();
		
		
		
	}
	
	
	
}
