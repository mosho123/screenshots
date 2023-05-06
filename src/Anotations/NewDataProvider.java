package Anotations;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewDataProvider 
{
  @Test(dataProvider = "dp")
  public void f(Integer emplid, String emplnme , float prcent) 
  {
	  // this below line only we have to add and as per required argument we can make changes
	  System.out.println(emplid + "----" + emplnme + "---" + prcent);
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 101, "mohsin" , 70.7f},
      new Object[] { 201, "tofik" , 85.8f},
    };
  }
}
