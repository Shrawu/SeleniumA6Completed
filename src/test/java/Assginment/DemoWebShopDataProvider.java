package Assginment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DemoWebShopDataProvider 
{
	

	public static Object[][] loginData() throws EncryptedDocumentException, IOException {
		Object[][] obj=new Object[2][2];
		FileInputStream fis=new FileInputStream("C:\\Users\\shraw\\Desktop\\new selemium\\demoWebshop.xlsx");
		Workbook ws = WorkbookFactory.create(fis);
		Sheet sheet=ws.getSheet("Sheet1");
		int row=sheet.getPhysicalNumberOfRows();
		int col=sheet.getRow(0).getPhysicalNumberOfCells();
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				obj[i][j] = sheet.getRow(i).getCell(j).toString();
			}
		}
		

		return obj;
	}
}