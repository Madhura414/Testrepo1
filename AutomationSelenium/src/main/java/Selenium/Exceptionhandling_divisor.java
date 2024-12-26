package Selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Exceptionhandling_divisor {
	public static void main(String [] args)
	{
//		int a= 20, b= 10;
//		try {
//			System.out.println(a/b);			
//			}
//		
//		catch(Exception e) {
//			System.out.println ("divided zero cnnot be possible in");
//			}
	
		
//divided by zero in selenium
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		try {
			driver.navigate().to("https://www.amazon.in");
			System.out.println("Website loaded sucessfully");
			
			int a= 40;
			int b= 20;
			System.out.println("Website loaded sucessfully:"+a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divisiob by zero not allowed");
			Assert.assertTrue(false, driver.getTitle());
			
		}
		finally {
			driver.quit();		
			}
	}
	
	
}

