package BatchExecutionTravel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RebBus {
	
	@Test(groups="Regression")
	public void RB()  {

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.navigate().to("https://www.redbus.in/");
	
	//Thread.sleep(1000);
	}

}
