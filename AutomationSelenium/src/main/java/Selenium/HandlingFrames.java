package Selenium;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.elasticsearch.indices.recovery.PeerRecoverySourceService.Actions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.postgresql.Driver;

public class HandlingFrames {

	public static void main(String[] args) {

	
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\BrowserDrivers\\chromedriver.exe");
  WebDriver driver= new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.flipkart.com");
  
  WebElement Frames1=driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']"));
driver.switchTo().frame(Frames1);//passed frames as a Webelement
 driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("bsds");
driver.switchTo().defaultContent(); //go back to page
//frame 2 
WebElement Frames2=driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']"));
driver.switchTo().frame(Frames2);//passed frames as a Webelement

//farme 3
WebElement Frames3=driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']"));
driver.switchTo().frame(Frames3);//passed frames as a Webelement

//inner farme
driver.switchTo().frame(0);//switching frame of index


 


		
		// TODO Auto-generated method stub

	}

}
