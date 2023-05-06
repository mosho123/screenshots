package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Portion_OR_Session_Page_Screensht {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement section =driver.findElement(By.xpath("//div[@class=\"oxd-sheet oxd-sheet--rounded oxd-sheet--gutters oxd-sheet--gray-lighten-2 orangehrm-demo-credentials\"]"));
		
		
		File src = section.getScreenshotAs(OutputType.FILE);
		File trgt = new File ("C:\\Users\\mohsinp\\eclipse-workspace\\MySeleniumProjectApril\\src\\sectionpagescrenshot.png");
	    FileHandler.copy(src, trgt);
		
		

	}

}
