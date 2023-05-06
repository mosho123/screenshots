package Imp_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Button_Handel {

	public static void main(String[] args) throws InterruptedException
	{
		
		// Radio button we can select one at one time 
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/mohsinp/Desktop/Talent%20Pool/Applications%20for%20testing/radios_example%20(1).html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.name("age-group-radio")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class=\"form-check-input\"])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class=\"form-check-input\"])[3]")).click();
		Thread.sleep(1000);
		
		driver.close();
		
		

	}

}
