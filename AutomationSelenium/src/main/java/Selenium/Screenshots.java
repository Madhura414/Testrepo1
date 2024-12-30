package Selenium;
import java.io.File;
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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;

import io.searchbox.action.Action;
import org.openqa.selenium.TakesScreenshot;

public class Screenshots {
	public static void main(String [] args) throws InterruptedException {

 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\BrowserDrivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com");
Thread.sleep(2000);
//1 take full page screenshot
TakesScreenshot Screenshot = (TakesScreenshot)driver;

File sourcefile= Screenshot.getScreenshotAs(OutputType.FILE);

//File targetfile= new File("C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\Screenshot\\fullpage.png");

File targetfile= new File(System.getProperty("user.dir")+"Screenshot\\fullpage.png");

sourcefile.renameTo(targetfile);//cop source file to target file
driver.quit();
//2 specific Selection
WebElement Filesourcefile=driver.findElement(By.xpath("//span[text()='Mobiles']"));

File Fiourcefile= Filesourcefile.getScreenshotAs(OutputType.FILE);

//File targetfile= new File("C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\Screenshot\\fullpage.png");

File targetfiless= new File(System.getProperty("user.dir")+"Screenshot\\fullpage.png");

Fiourcefile.renameTo(targetfiless);//cop source file to target file
//DDESTINATIN


	
	}
}