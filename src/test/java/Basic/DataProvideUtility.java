package Basic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataProvideUtility {

	
	public static Object [] []dwsLogin() throws EncryptedDocumentException, IOException {
	
	Object [][]obj = new Object[2][2];
	
	FileInputStream fis = new FileInputStream("C:\\Users\\shraw\\Desktop\\new selemium\\Data.xlsx");
	
	Workbook wb= WorkbookFactory.create(fis);
	
	Sheet sheet = wb.getSheet("Sheet2");
	   
	  // we need to pass row no and column no an d convert into stream
	  
	 obj [0][0]= sheet.getRow(0).getCell(0).toString();
	 obj [0][1]= sheet.getRow(0).getCell(1).toString();
	 obj [1][0]= sheet.getRow(1).getCell(0).toString();
	 obj[1][1]= sheet.getRow(1).getCell(1).toString();
	 
		return obj;                       
                                                                            
	}}
  




