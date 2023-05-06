package Anotations;

import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anottion 
{
	
	@BeforeMethod
	public void test1()
	{
		Reporter.log("i am before test" , true);
	}
	
	
	@AfterMethod
	public void test2()
	{
		Reporter.log("i am after test" , true);
	}
	
	@Test
	public void test3()
	{
		Reporter.log("i am method " , true);
		
	}
	
	@BeforeClass
	public void test4()
	{
		Reporter.log("i am before class " , true);
		
	}
	
	@AfterClass
	public void test5()
	{
		Reporter.log("i am after class " , true);
		
	}

}
