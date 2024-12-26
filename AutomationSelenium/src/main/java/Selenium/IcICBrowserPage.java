package Selenium;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.elasticsearch.indices.recovery.PeerRecoverySourceService.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.postgresql.Driver;

import io.searchbox.action.Action;

public class IcICBrowserPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--headless=new");
		//
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\BrowserDrivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	try {
	driver.manage().window().maximize();
	driver.get("https://www.icicibank.com");
	System.out.println(driver.getTitle());
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
WebElement ele=driver.findElement(By.xpath("(//span[text()='Insurance'])[1]"));
ele.click();
//driver.findElement(By.xpath("(//ul[@class='subcategory-wrapper'])[5]/li[2]/a")).click();
List<WebElement> liste= driver.findElements(By.className("ul.subcategory-wrapper"));
System.out.println("elemts are:"+liste.size());
		System.out.println(driver.getTitle());
		
	}
	catch(Exception e)
	{
		System.out.println("element is not found");
	}
	finally {
		
	
	driver.quit();
		
	}
	}
}
