package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VtigerPom {
	
	 public VtigerPom(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
		
	 public @FindBy(className= "User Name") 
	 WebElement Username;

	public @FindBy(className ="Password")
	WebElement Password;
	
	public @FindBy(id="submitButton")
	WebElement Login ;
	
   
}
