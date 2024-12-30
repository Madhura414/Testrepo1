package Selenium;

import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.Assert.assertTrue;

import org.apache.tools.ant.types.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Vissibility_Validtions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\BrowserDrivers\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			//verify if element is Displayed
			boolean isElementDispalyed= driver.findElement(By.cssSelector("input#email")).isDisplayed();
			Assert.assertTrue(isElementDispalyed,"element is not displayes in signup page");
			Thread.sleep(2000);
			
			boolean isElementenabled = driver.findElement(By.xpath("(//font[text()='Log in'])[1]")).isEnabled();
			Assert.assertFalse(isElementenabled,"element is not displayes in signup page");
			Thread.sleep(2000);
			
			boolean isElementselected = driver.findElement(By.tagName("Forgot your password?")).isSelected();
			Assert.assertFalse(isElementselected,"element is not displayes in signup page");
			Thread.sleep(2000);
			driver.quit();

	}

}
