package Demofilesxml;

import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Demo 
{
	
	@Test
	public void test4()
	{
		Reporter.log("i am method 4");
	}
	
	
	@Test
	public void test5()
	{
		Reporter.log("i am method 5");
	}
	
	@Test
	public void test6()
	{
		Reporter.log("i am method 6");
		throw new SkipException("skipped");
	}
	

}
