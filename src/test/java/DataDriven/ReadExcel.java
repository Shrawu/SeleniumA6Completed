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
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		
          // create a connection between the eclipe and excel
		
		FileInputStream excel= new FileInputStream("C:\\Users\\shraw\\Desktop\\ReadExcel.xlsx");
		Workbook Wb = WorkbookFactory.create(excel);
		
		   Sheet sheet = Wb.getSheet("Sheet1");
		  
		    String email = sheet.getRow(0).getCell(0).toString();
		    
		      String password = sheet.getRow(0).getCell(1).toString();
		      
		      System.out.println(email);
		      
		      System.out.println(password);
		 
		      WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.get("https://demowebshop.tricentis.com/login");
				Thread.sleep(2000);
				driver.findElement(By.id("Email")).sendKeys(email);
				Thread.sleep(2000);
				driver.findElement(By.id("Password")).sendKeys(password);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@value='Log in']")).click();
				Thread.sleep(2000);
		 
		
		
	}

}
