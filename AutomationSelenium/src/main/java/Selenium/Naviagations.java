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

import com.framework.restAPI.URL;
	public class Naviagations {
	
	
public static void main(String [] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\BrowserDrivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("https://www.flipkart.com");
	
	//navigate.to.url()
	//driver.navigate().to("https://www.flipkart.com");
	
	//or it accepts object format
	//URL myurl= new URL("https://www.flipkart.com/");
	//driver.navigate().to(myurl);
	
	driver.navigate().to("https://www.flipkart.com");
	driver.navigate().to("https://www.amazon.in/");
	
	driver.navigate().forward();
	System.out.println(driver.getTitle());
    driver.navigate().back();
    System.out.println(driver.getTitle());
    driver.navigate().refresh();
    System.out.println(driver.getTitle());
    
	
	
	

	
	}

}
