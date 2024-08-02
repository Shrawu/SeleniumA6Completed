package newpack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShopperStackbaseclass {
	
      WebDriver driver ;
	@BeforeClass
	 public void ShopperBasicClass () {
		 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.shoppersstack.com/"); 
		
	 }
	
	@BeforeMethod
	public void logclick() throws InterruptedException {
	
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("morepooja7040@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Pooja@7040");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		
		
		
	}

	
            @Test

         public void move () throws InterruptedException {
	
	  WebElement move =driver.findElement(By.id("men"));
	
	//  Actions A = new Actions (driver);
	  JavascriptExecutor js = (JavascriptExecutor) driver ;
	//  A.moveToElement(move);
	  
	  js.executeScript("window.scrollTo(600,0);") ;
	
	  driver.findElement(By.xpath("//a[text()='T-shirts']")).click();
            Thread.sleep(2000) ;
          
            List<WebElement> addcart=driver.findElements(By.xpath("//button[text()='add to cart']"));
            	
            	for (WebElement web:addcart) {
            		
            		web.click();
					
				}
            		}
			}
          
            

 		
		
		
		
	
	
	
	
             
