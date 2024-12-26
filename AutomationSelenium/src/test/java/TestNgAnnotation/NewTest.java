package TestNgAnnotation;

import org.testng.annotations.Test;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.elasticsearch.indices.recovery.PeerRecoverySourceService.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.postgresql.Driver;

public class NewTest
{
	WebDriver driver;
  @Test(priority=1)
  void openapp()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\BrowserDrivers\\chromedriver.exe");
 driver= new ChromeDriver();
	driver.manage().window().maximize();
driver.get("https://www.flipkart.com");
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
 }
	  
  @Test(priority=2)
  void login() 
  {
	  
 WebElement name = driver.findElement(By.cssSelector("input#user-name"));
 name.sendKeys("standard_user");
}
  @Test
  void logout()
  {
	  
  }
}
