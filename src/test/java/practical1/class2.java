package practical1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class class2 extends baseclass{

	@Test
	public void Task2() throws EncryptedDocumentException, IOException, InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
		
		WebElement card= driver.findElement(By.xpath("//input[@value='Add to cart']"));
		
		card.click();
		FileInputStream fis = new FileInputStream("C:\\Users\\shraw\\Desktop\\new selemium\\DemoWEb1.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet st = wb.getSheet("Sheet1");
		Thread.sleep(2000);
		driver.findElement(By.id("giftcard_1_RecipientName")).sendKeys(st.getRow(0).getCell(0).toString());
		Thread.sleep(2000);
		driver.findElement(By.id("giftcard_1_RecipientEmail")).sendKeys(st.getRow(0).getCell(1).toString());
		Thread.sleep(2000);
//		driver.findElement(By.id("giftcard_2_SenderName")).sendKeys(st.getRow(1).getCell(0).toString());
//		Thread.sleep(2000);
//		driver.findElement(By.id("giftcard_2_SenderEmail")).sendKeys(st.getRow(1).getCell(1).toString());
		
		
		driver.findElement(By.id("giftcard_1_Message")).sendKeys(st.getRow(2).getCell(0).toString());
		
		driver.findElement(By.id("addtocart_1_EnteredQuantity")).clear();
		
         driver.findElement(By.id("addtocart_1q_EnteredQuantity")).sendKeys(st.getRow(2).getCell(1).toString());
		
		
		
	}
}


