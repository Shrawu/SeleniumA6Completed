package BatchExecutionTravel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Makemytip {

	@Test(groups="Regression")
	
	public void MT() {
	
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.navigate().to("https://www.makemytrip.com/");
	}
}
