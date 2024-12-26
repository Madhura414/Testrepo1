package Selenium;
import java.time.Duration;
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
import org.openqa.selenium.support.ui.Select;

import io.searchbox.action.Action;

public class HandlingSelectDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\BrowserDrivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com");
WebElement dropdownElement= driver.findElement(By.xpath("//span[text()='Mobiles']"));//Webelement 
Select dropdown= new  Select(dropdownElement);// create object for Select
//3 ways we can select class
dropdown.selectByVisibleText("Mobiles");
dropdown.selectByValue("Mobiles");
dropdown.selectByIndex(1);
	System.out.println(driver.getTitle());
	//capture options from dropdown
	List<WebElement>options= dropdown.getOptions();
	System.out.println("number of opetions:"+options.size());
	
	//printing options
	for(int i=0;i<options.size();i++)
	{
		System.out.println(options.get(i).getText());
	}
	
	
	
}

}
