package Basic;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Store {
	@DataProvider(name="data")
	
	public Object [][]sender(){
		 Object [][] obj= new Object [2][2];
		 obj [0][0]="admin01@gmail.com";
		 obj [0][1]="admin01";
		 obj [1][0]="admin02@";
		 obj [1][1]="Gauri";
		
		return obj;
		
		
		
	}
	@Test (dataProvider ="data")
	public void reciver(String data1,String data2) {
		
		
		System.out.println(data1);
		System.out.println(data2);
	}
}
