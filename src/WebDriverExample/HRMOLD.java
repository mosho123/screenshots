package WebDriverExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMOLD {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@class=\"oxd-userdropdown-img\"]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//a[@class=\"oxd-userdropdown-link\"])[4]")).click();
		driver.findElement(By.partialLinkText("Logo")).click();   // Logout hai so Logo use kiyaa maine....
		
		driver.close();

	}

}
