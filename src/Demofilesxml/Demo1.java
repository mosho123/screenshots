package Demofilesxml;

import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Demo1 
{
	
	@Test
	public void test1()
	{
		Reporter.log("i am method 1");
	}
	
	
	@Test
	public void test2()
	{
		Reporter.log("i am method 2");
	}
	
	@Test
	public void test3()
	{
		Reporter.log("i am method 3");
		throw new SkipException("skipped");
	}
	

}
