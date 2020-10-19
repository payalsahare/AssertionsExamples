package myTest;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//soft validation--> if soft assertion getting failed will not be marked as failed as wel as next line will be executed
//SoftAssert and assertAll() to mark a test case as failed if any soft assertion getting failed

public class SoftAssertionTestCases {
	
	 SoftAssert softAssert = new SoftAssert();  //soft assertion
	
	@Test
	public void test1()
	{
		//Hard Assertion--> If any test case is failed then rest of test cases not executed--->all marks as failed
		System.out.println("Open Browser");
		Assert.assertEquals(true, true);  //right to write hard
	
		
		System.out.println("Enter Username");
		System.out.println("Enter password");
		System.out.println("Click On Sign In Button");
		
		Assert.assertEquals(true, true);     // right to write hard assertion
		
		System.out.println("Validate Home Page");
		softAssert.assertEquals(true, false,"Not going to home page");      //soft assertion 
		
		System.out.println("Go to deals Page");
		System.out.println("Create a deal");
		softAssert.assertEquals(true, false,"Not able to create deal");    //soft assertion
		
		System.out.println("Go to contact page");
		System.out.println("Create a contact");
		softAssert.assertEquals(true, false,"Not able to create contact");   //soft assertion
		
		softAssert.assertAll();  //compulsary to write at last of test cases
		
			
		}
	
	@Test
	public void test2()
	{
		System.out.println("Logout");
		softAssert.assertEquals(true, false);
		softAssert.assertAll();
	}
	
	@AfterClass
	public void tearDown()
	{
		softAssert.assertAll();
	}
	}


