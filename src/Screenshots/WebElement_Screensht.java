package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElement_Screensht {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement elmnt = driver.findElement(By.xpath("//img[1]"));
		
		
		File src = elmnt.getScreenshotAs(OutputType.FILE);
		File trgt = new File ("C:\\Users\\mohsinp\\eclipse-workspace\\MySeleniumProjectApril\\src\\oneelemntscreensht.png");
		FileHandler.copy(src, trgt);
        
	}

}
