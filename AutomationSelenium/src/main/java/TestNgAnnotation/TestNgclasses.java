package TestNgAnnotation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgclasses {


	WebDriver driver;
	  @Test(priority=1)
	  
	  void openapp()
	 {
	try {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\BrowserDrivers\\chromedriver.exe");
	 driver= new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	 
	 
	  catch (Exception e)
	  {
		  System.out.println ("Element not found");
	  }
	
}
	  @Test(priority=2)
	  void login() throws InterruptedException 
	  {
		
	 WebElement name = driver.findElement(By.cssSelector("input#user-name"));
	 name.sendKeys("standard_user");
	 Thread.sleep(2000);
	 WebElement Password= driver.findElement(By.cssSelector("input#password"));
	 Password.sendKeys("secret_sauce");
	 Thread.sleep(2000);
	 
	 WebElement login= driver.findElement(By.cssSelector("input#login-button"));
	 login.click();
	}
	 
	@Test(priority=3)	 
 void logout()
	  {
		driver.quit();
		  
		  
	  }
	}


