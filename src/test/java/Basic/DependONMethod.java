package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependONMethod {

	@Test(priority = 3)
	public void createAccount() {
		
	WebDriver Driver = new ChromeDriver();
	Driver.manage().window().maximize();
	
	Driver.get("");
	System.out.print("accountCreate");
		
	}
	
	@Test(priority = 0,dependsOnMethods = "createAccount")
	
	public void ModifyAccount() {
		
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		
		Driver.get("");
		System.out.print("accountAccount has been modified");
		
		
		
	}
	
	@Test 
	
	public void Delet() {
		
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		
		Driver.get("");
		System.out.print("accountCreate has been deleted");
		
	}
	
	
	
}
