package practical1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Class1 extends baseclass {
	
	@Test
	public void task() throws InterruptedException {
		
		Actions A=new Actions(driver);
		A.keyDown(Keys.PAGE_DOWN ).build().perform();
		A.keyDown(Keys.PAGE_DOWN ).build().perform();
		
	List<WebElement> follow = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
	for (WebElement Web : follow ) {
		String rss= "RSS";
		if(Web.getText().equalsIgnoreCase(rss)) {
			A.keyDown(Keys.CONTROL).build().perform();
			
		Web.click();
			//WebElement text=driver.findElement(By.xpath("//a[text()='RSS']"));
	}
		else {
		 Web.click();
	}
		Thread.sleep(2000);	
	}
	driver.quit();
	}
	
}


