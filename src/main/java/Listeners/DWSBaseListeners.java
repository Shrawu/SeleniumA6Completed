package Listeners;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.crm.listernersCode.JavaUtility;

public class DWSBaseListeners {
	
	public static WebDriver driver;
	@BeforeClass
	public void precondition () throws IOException, InterruptedException {
		
		String browser = JavaUtility.LoginData("browser");

		String url = JavaUtility.LoginData("url");
		
		if (browser.equalsIgnoreCase("chrome")) {
			
			driver= new ChromeDriver();
			
		
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			
			driver= new FirefoxDriver();
		}
		
		else if (browser.equalsIgnoreCase("Edge")) {
			
			driver = new EdgeDriver();
		}
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
	}

	@BeforeMethod
	public static void login() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("admin01");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}

	@AfterMethod
	public static void postcondition() {
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}

	@AfterClass
	public void postCondition() {
		driver.quit();
	}

		
	}
	
	


