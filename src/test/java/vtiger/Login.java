package vtiger;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.VtigerPom;

public class Login {

	@Test
	
	public void Login() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("http://localhost:8888/");
		VtigerPom  ref = new VtigerPom(driver);
		
		ref.Username.sendKeys("admin");
		ref.Password.sendKeys("root");
		ref.Login.click();
	
	}
	
	
}
