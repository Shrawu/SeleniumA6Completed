package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import java.time.Duration;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class shopperstack {
	
	@Parameter()
	@Test
	
	public void  main() throws InterruptedException, IOException {
		
		
		
		//open the Browser
		WebDriver driver=new ChromeDriver();
		//maximise window
		driver.manage().window().maximize();
		//waiting condition
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 
		// create the object of the propertis file. 
		
//
		Properties prop= new Properties();
		FileInputStream fis=new FileInputStream("./Configure/ShopperStack.properties");
		prop.load(fis);
		
		 String url = prop.getProperty("url");
		 String username = prop.getProperty("username");
		 String password = prop.getProperty("password");
	
	
		driver.get(url);
	    Thread.sleep(2000);
	    
	    
	    
	    WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(15));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn")));
	WebElement login_btn= driver.findElement(By.xpath("//button[@class='navbar_Loginbutton__O9-64']"));
	    
	    
	     if(login_btn.isEnabled()) {
	    	 
	    	 login_btn.click();
	    	 
	    	 driver.findElement(By.id("Email")).sendKeys(username);
	    	 
	    	 driver.findElement(By.id("Password")).sendKeys(password);
	    	 
	    	 driver.findElement(By.xpath("//span[text()='Login']")).click();
	     }
	     
	     else {
	    	 
	    	 JavascriptExecutor ja = (JavascriptExecutor)driver;
	    	 ja.executeScript("argument[0].click()",login_btn );
	     }
		
		
	}
		

}
