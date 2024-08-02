package Basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDatabyusingForLoop {

	@Test
	
	public void readData() throws EncryptedDocumentException, IOException {
		
		//1 we need the path of xml file
			
			File path = new File ("C:\\Users\\shraw\\Desktop\\new selemium\\Data.xlsx");
		   FileInputStream fis = new FileInputStream(path);

		//2 workbook factory is from apachi poi and create is method with return type workbook
		   
		  Workbook wb = WorkbookFactory.create(fis);
		  
		  // sheet is to identify  sheet
		  
		  Sheet sheet = wb.getSheet("Sheet1");
		  
		  
		  // to make the code more good 
		  // we will add the data 
		  int row= sheet.getPhysicalNumberOfRows();
		  int col=sheet.getRow(1).getPhysicalNumberOfCells();
		  
		  // TO avoid more code we use for loop here 
		  
		 // int row = 6;
		 // int col= 2;
		  
		  for (int i = 1; i < row; i++) {
			  for (int j = 0; j < col; j++) {
				  
				  String s = sheet.getRow(i).getCell(j).toString();
				  System.out.println(s);
				
			}
			
		}
		  
		  
		  
		  
	}
}
