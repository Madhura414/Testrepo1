package Selenium;

import java.util.concurrent.TimeUnit;

import org.elasticsearch.indices.recovery.PeerRecoverySourceService.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.postgresql.Driver;

import io.searchbox.action.Action;


public class Launchbrowser {

	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//	System.setProperty("Webdeiver.driver.chrromedriver", "c.path");
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://www.google.com");
//	driver.manage().window().maximize();
//	driver.close();
//	WebElement username = driver.findElement(By.id("username" ));
//	username .sendKeys("madhura");
//WebElement link=  driver.findElement(By.linkText("sgsssh"));
//link.click();
//Thread.sleep(5000);
//try {
//
//link.click();
//
//	}
//catch(Exception e)
//{
//	WebElement link1=  driver.findElement(By.linkText("sgsssh"));
//	link1.click();
//	}
		System.setProperty("Webdriver.chrome.driver","c.path");
		try {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.close();
WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("madura");
		WebElement password = driver.findElement(By.name("password"));	
		password.sendKeys("123");
	//  BY Mouverhover 	
		//Actions act =new Actions();
		//WebElement element = driver.findElement(By.name("MoveToElement"));
//		Actions.moveToElement(element).perform();
//		
	}
		//BY DROPDOWN 
//		Select  element = driver.findElement(By.id("ghbhbf"));
//		Select select = new select(dropdown);
//		select.selectByIndex(0);
		catch (Exception e)
		{
			System.out.println(" an error occured ");
		}
	
	finally 
	{
		WebDriver driver = null;
		driver.close();
		
	}

	}

	private static void driver() {
		// TODO Auto-generated method stub
		
	}
}