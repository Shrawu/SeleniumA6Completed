package Basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataFromExcel {
	

	@Test
	
	public void readData() throws EncryptedDocumentException, IOException {
	
	//1 we need the path of xml file
		
		File path = new File ("C:\\Users\\shraw\\Desktop\\new selemium\\Data.xlsx");
	   FileInputStream fis = new FileInputStream(path);

	//2 workbook factory is from apachi poi and create is method with return type workbook
	   
	  Workbook wb = WorkbookFactory.create(fis);
	  
	  // sheet is to identify  sheet
	  
	  Sheet sheet = wb.getSheet("Sheet1");
	   
	  // we need to pass row no and column no an d convert into stream
	  
	 String s1= sheet.getRow(1).getCell(0).toString();
	 String s2= sheet.getRow(2).getCell(0).toString();
	 String s3= sheet.getRow(3).getCell(0).toString();
	 String s4= sheet.getRow(4).getCell(0).toString();
	 String s5= sheet.getRow(5).getCell(0).toString();
	 String s6= sheet.getRow(6).getCell(0).toString();
	
	 
	 System.out.println(s1);
	 System.out.println(s2);
	 System.out.println(s3);
	 System.out.println(s4);
	 System.out.println(s5);
	 System.out.println(s6);
	 
	 
}
}