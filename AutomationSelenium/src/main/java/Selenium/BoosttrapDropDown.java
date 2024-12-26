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
import org.postgresql.Driver;

import io.searchbox.action.Action;

public class BoosttrapDropDown {
	public static void main(String [] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@title='Become a Seller' and @class='_3RX0a- _3jeYYh']")).click();
	//Select single dropdown
	driver.findElement(By.xpath("//a[@title='Become a Seller' and @class='_3RX0a- _3jeYYh']"));
	//capture all the list opetiosn and find Size
			List<WebElement> options= driver.findElements(By.xpath("//a[@title='Become a Seller' and @class='_3RX0a- _3jeYYh']"));
			System.out.println("numberof options:"+options.size());
//		System.out.println("total number links:"+Headerlinks.size());
//		//tagname
//		List<WebElement> Images = driver.findElements(By.tagName("img"));
//		System.out.println("totalimages:"+Images.size());
//		List<WebElement>Nametaga= driver.findElements(By.tagName("a"));
//		System.out.println("taotalnames a:"+Nametaga.size());
//		System.out.println(driver.getTitle());
//		
//		
//		driver.close();
	}
	}



