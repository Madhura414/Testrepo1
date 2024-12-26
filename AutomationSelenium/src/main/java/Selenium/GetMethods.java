package Selenium;
import org.openqa.selenium.WebDriver;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.elasticsearch.indices.recovery.PeerRecoverySourceService.Actions;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.postgresql.Driver;

import io.searchbox.action.Action;

public class GetMethods {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\BrowserDrivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
//geturl
driver.get("https://www.flipkart.com");
//getcurrenturl
//System.out.println(driver.getCurrentUrl());
////get title - retuen url page 

//System.out.println(driver.getTitle());
////get pagesource-  returns source code of the page

//System.out.println(driver.getPageSource());
////getWindowHandle() - retuen ID of the single Browser Window

//String Windowid= driver.getWindowHandle();
//System.out.println("Window Id "+Windowid);

////getWindow Hnadles- return ID's mutliple browser  windows 
//driver.findElement(By.linkText("Help Center")).click();

//Set<String>windowids =driver.getWindowHandles();
//System.out.println("windowids");

//Conditional Methods
//is displayed - boolean
WebElement logoimages= driver.findElement(By.xpath("//img[@alt='Mobiles']"));
System.out.println("logoimages"+logoimages.isDisplayed());

boolean statuss= driver.findElement(By.xpath("//img[@alt='Mobiles']")).isDisplayed();
System.out.println("logoimages"+statuss);

//isEnabled 
boolean status= driver.findElement(By.xpath("//img[@alt='Mobiles']")).isEnabled();
System.out.println("logoimages"+status);
//isSelected
WebElement staus1= driver.findElement(By.xpath("//img[@alt='Mobiles']"));
System.out.println("logoimages"+staus1.isSelected());

//

	}
	}


