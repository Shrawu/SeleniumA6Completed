package NewPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.listernersCode.JavaUtility;

public class NewBaseDWS {
	
	public static WebDriver driver;
	public static void precondition(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			driver=new ChromeDriver();
			
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demowebshop.tricentis.com/");
			
		}
	public static void login() throws InterruptedException, IOException {
		
		String username = JavaUtilityGift.LoginData("username");
		String password = JavaUtilityGift.LoginData("password");
		
		driver.findElement(By.id("Email")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		
	}
      public static void postCondition() {
		
		driver.findElement(By.className("ico-logout")).click();
		driver.quit();
	}
	
	
	
	
}
