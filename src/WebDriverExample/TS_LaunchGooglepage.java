package WebDriverExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TS_LaunchGooglepage {

	public static void main(String[] args) throws InterruptedException 
	{
	    System.setProperty("WebDriver.chrome.driver", "C:\\\\Chrom file\\\\chromedriver.exe\\\\");
	    // without this set property also program will run  // above 4.8.5 we dont need above line or code
	    
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.google.com/search?q=selenium+ide+chrome&rlz=1C1GCEA_enIN1001IN1001&oq=&aqs=chrome.1.35i39i362l3j46i39i199i362i465j35i39i362l4.2933157j0j7&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		driver.close();
	}

}
