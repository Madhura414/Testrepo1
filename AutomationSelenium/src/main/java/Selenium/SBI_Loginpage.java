package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class SBI_Loginpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\BrowserDrivers\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://www.flipkart.com");
try
{
	WebElement search =driver.findElement(By.name("q"));
	search.sendKeys("mobile 5g");
	Thread.sleep(2000);
	List <WebElement> list = driver.findElements(By.xpath("//form[@class='Hy6F9O header-form-search']"));
	int count = list.size();
	System.out.println(count);
	list.get(1).click();
	Thread.sleep(2000);
}

catch(ElementNotInteractableException e)
{
	System.out.println("element not found");
}
finally {
	driver.quit();
	
}
	}

}
