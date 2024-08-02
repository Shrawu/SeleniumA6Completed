package Basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronologicalOrder {
	@ BeforeSuite
	
	public void BeforeSiut() {
		
		 System.out.println("BeforeSuit");
		    
			
	}
	
	@ BeforeTest
	
	public void BeforeTest() {
	
		 System.out.println("BeforeTest");
		    

                              }
	@BeforeClass
	
	public void BeforeClass() {
		
		 System.out.println("BeforeClass");
		    
	}

    @BeforeMethod
    public void beforeMethod () {
    	
    	 System.out.println("BeforeMethod");
    
    }
    
    
    
    
    @Test
    
    public void Test() {
    	 System.out.println("Test");
    
    }
    
 @Test
    
    public void Test2() {
    	 System.out.println("Test2");
    
    }
    
    @AfterMethod
    public void AfterMethod() {
    	 System.out.println("AfterMethod");
    
    }
    
    
@AfterClass

public void AfterClass() {
	
	 System.out.println("AfterClass");
	
}


  @AfterTest

public void AfterTest() {
	
	 System.out.println("AfterTest");
	 
}
    
    @AfterSuite
    public void AfterSuit()
    {
    	
    
   System.out.println("AfterSuit");
    
    }    
    }
