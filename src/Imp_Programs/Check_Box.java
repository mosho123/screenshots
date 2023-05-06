package Imp_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Box {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/mohsinp/Desktop/Talent%20Pool/Applications%20for%20testing/checkbox_example%20(1).html");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("(//input[@class=\"form-check-input\"])[1]")).click();
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("(//input[@class=\"form-check-input\"])[2]")).click();
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("(//input[@class=\"form-check-input\"])[3]")).click();
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("(//input[@class=\"form-check-input\"])[4]")).click();
		Thread.sleep(1000);
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("(//input[@class=\"form-check-input\"])"));
		
		for (WebElement clk :checkboxes)
		{
			clk.click();
		}
		
		Thread.sleep(3000);
		
		for(int i=checkboxes.size()-1;i>=0;i--)
		{
			//checkboxes.get(i).click();
		}
		
		
		

	}

}
