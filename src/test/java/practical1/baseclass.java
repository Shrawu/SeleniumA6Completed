package practical1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class baseclass {
   WebDriver driver;
   
	@Test
	@BeforeSuite
	public void bs() {
		 System.out.print("connecting to data base ");
	
	}
     @BeforeTest
     public void bt() {
    	 
    	 
     }
     @Parameters("url")
     @BeforeClass
     public void bcc(String url) {
    	 
    	 driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	 driver.get(url);
     }
     @Parameters({"username","password"})
     @BeforeMethod 
     public void bm(String username,String password) {
    	
      driver.findElement(By.className("ico-login")).click();
      driver.findElement(By.id("Email")).sendKeys(username);
      driver.findElement(By.id("Password")).sendKeys(password);
      driver.findElement(By.xpath("//input[@value='Log in']")).click();
     }
     
     @AfterMethod
     public void Am() throws InterruptedException {
    	 Thread.sleep(2000);
    	 Actions A=new Actions(driver);
    	A.keyDown(Keys.PAGE_UP ).build().perform();
 		A.keyDown(Keys.PAGE_UP).build().perform();
    	 driver.findElement(By.className("ico-logout")).click();;
     }

    @AfterClass 
    public void Ac() {
    	 
    }
    	@AfterTest()
    	public void At() {
    		
   
    	}
    	@AfterSuite
    	public void AS() {
    		
    		
    	}
    	
    }