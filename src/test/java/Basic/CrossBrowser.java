package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CrossBrowser {
	public WebDriver driver;
	@Parameters("browers")
	@Test
	public void CrossBrower (String browers) {
		
	if(browers.equalsIgnoreCase("chrome"))
    {
    	 driver = new ChromeDriver();
    }
    else if (browers.equalsIgnoreCase("edge"))
	
	{
	driver=new EdgeDriver() ;
	}

    else if (browers.equalsIgnoreCase("firefox")) {
    	driver=new FirefoxDriver();
    }
	
	driver.manage().window().maximize();
	
	driver.get("https://www.ajio.com/");
    	}
	

         }
    
	
	
    		
