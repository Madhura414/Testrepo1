package Selenium;
import java.util.List;
import java.util.Set;

import java.util.concurrent.TimeUnit;

import org.elasticsearch.indices.recovery.PeerRecoverySourceService.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Css {
	public static void main(String [] args) throws InterruptedException {
		
				 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\BrowserDrivers\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
				driver.get("https://www.flipkart.com");
				Thread.sleep(2000);
				//1.tag#id
			//	driver.findElement(By.cssSelector("input#Search for Products, Brands and More")).sendKeys("laptop");
				//2.tag.className
			//driver.findElement(By.cssSelector("input.Pke_EE")).sendKeys("laptop");
			//3.tag[attribute='value'] or tag.classname[attribute='value']
			driver.findElement(By.cssSelector("input[placeholder='Search for Products, Brands and More']")).sendKeys("laptop");
			System.out.println(driver.getTitle());
			//Xpath
			//List<WebElement> xpathname = driver.findElements(By.xpath("//input[@name='q']"));
			//System.out.println("elementsxpath:"+xpathname.size());
			//List<WebElement> xpathname1 = driver.findElements(By.xpath("//*[@name='q']"));
			//System.out.println("elementsxpath:"+xpathname1.size());
			WebElement text = driver.findElements(By.xpath("//input[@name='q']")).getFirst();
			System.out.println("elementsxpath:"+text);
			
			
			
			
			driver.close();
	}	
	
}
