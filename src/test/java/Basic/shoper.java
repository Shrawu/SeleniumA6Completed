package Basic;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class shoper {
	
	@DataProvider(name="Credential")
	public Object[][] sender() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\shraw\\Desktop\\Shopper.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("SLogin");
		int row = sh.getPhysicalNumberOfRows();
		int col = sh.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] obj = new Object[row][col];
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				obj[i][j] = sh.getRow(i).getCell(j).toString();
			}
		}
		
		return obj;
	}
	
	@Test(dataProvider = "Credential")
	public void sLogin(String email,String password) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.shoppersstack.com/");
		
		WebDriverWait eWait = new WebDriverWait(driver, Duration.ofSeconds(20));
		eWait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
		driver.findElement(By.id("loginBtn")).click();
		
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		driver.findElement(By.xpath("(//button[@type='button'])[1]/span[1]/span")).click();
		driver.findElement(By.xpath("//li[text()='Logout']")).click();
		driver.quit();
	}
	

}
