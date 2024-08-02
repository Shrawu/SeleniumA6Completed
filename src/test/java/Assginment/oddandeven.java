package Assginment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class oddandeven {
	
	public void even() throws EncryptedDocumentException, IOException {
		
	//1 we need the path of xml file
	
	   File path = new File ("C:\\Users\\shraw\\Desktop\\new selemium\\Prime.xlsx");
		
	   FileInputStream fis = new FileInputStream(path);

	//2 workbook factory is from apachi poi and create is method with return type workbook
	   
	  Workbook wb = WorkbookFactory.create(fis);
	  
	  // sheet is to identify  sheet
	  
	  Sheet sheet = wb.getSheet("Sheet1");
	  
	  // logic for finding the prime number 
	  
	 
	 int row= sheet.getPhysicalNumberOfRows();
	 
	  int col=sheet.getRow(0).getPhysicalNumberOfCells();
	}

}
