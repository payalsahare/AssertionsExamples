package myTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionTestCases 

//hard validation -->if a test assertion getting failed-->immediatle test case will be marked as failed and test case will be terminated
{
	@Test
	public void test1()
	{
	System.out.println("Open Browser");
	Assert.assertEquals(true, true);  //right to write hard

	
	System.out.println("Enter Username");
	System.out.println("Enter password");
	System.out.println("Click On Sign In Button");
	
	Assert.assertEquals(true, true);     // right to write hard assertion
	
	System.out.println("Validate Home Page");
	Assert.assertEquals(true, false,"Not going to home page");      //soft assertion 
	
	System.out.println("Go to deals Page");
	System.out.println("Create a deal");
	Assert.assertEquals(true, false,"Not able to create deal");    //soft assertion
	
	System.out.println("Go to contact page");
	System.out.println("Create a contact");
	Assert.assertEquals(true, false,"Not able to create contact");   //soft assertion
	}

}
