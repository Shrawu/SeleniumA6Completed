package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStack {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		
		
		FileInputStream excel= new FileInputStream("C:\\Users\\shraw\\Desktop\\Selenium\\Shopper.xlsx");
		Workbook Wb = WorkbookFactory.create(excel);
		
		   Sheet sheet = Wb.getSheet("Sheet1");
		  
//		    String  FN= sheet.getRow(0).getCell(0).toString();
//		    
//		      String LN= sheet.getRow(1).getCell(0).toString();
//		  	
//		      String PN= sheet.getRow(2).getCell(0).toString();
//		      
//		      String Email = sheet.getRow(3).getCell(0).toString();
//		  	
//		      String PW = sheet.getRow(4).getCell(0).toString();
//		  	
//		      String CP= sheet.getRow(5).getCell(0).toString();
//		  	
		
		
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.get("https://www.shoppersstack.com/user-signin");
				Thread.sleep(2000);
				
							
				
//				driver.findElement(By.xpath("//span[text()='Create Account']")).click();
//				driver.findElement(By.id("First Name")).sendKeys(FN);
//				
//				driver.findElement(By.id("Last Name")).sendKeys(LN);
//				
//				driver.findElement(By.id("Female")).click();
//				
//				
//				driver.findElement(By.id("Phone Number")).sendKeys(PN);
//				
//				driver.findElement(By.id("Email Address")).sendKeys(Email);
//				
//				driver.findElement(By.id("Password")).sendKeys(PW);
//				
//				driver.findElement(By.id("Confirm Password")).sendKeys(CP);
//				
//				driver.findElement(By.id("Terms and Conditions")).click();
//				
//			    driver.findElement(By.xpath("//button[text()='Register']"));
				
	}

}
