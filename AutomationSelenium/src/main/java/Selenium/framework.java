package Selenium;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import java.util.concurrent.TimeUnit;

import org.elasticsearch.indices.recovery.PeerRecoverySourceService.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.framework.restAPI.URL;

public class framework {

public static void main(String[] args) {
// TODO Auto-generated method stub
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\BrowserDrivers\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
//URL newUrl= new URL("https://www.kapruka.com/online/samedaydelivery");
//driver.navigate().to("newUrl");
driver.get("https://www.amazon.in");

try {
	//List<WebElement> elementslist= driver.findElements(By.id("//div[contains(@class,'carousel-itemkk style')]"));
	System.out.println(driver.getTitle());
	//iframes 
//	JavascriptExecutor js= (JavascriptExecutor)driver;
//	js.executeScript("window.scroolby,(0,499)");
//	Integer numberofFrames = Integer.parseInt(js.executeScript("returnwindow.length").toString());
//	System.out.println("numberof frmes"+numberofFrames);
	List<WebElement> iframeelements= driver.findElements(By.tagName("iframe"));
	System.out.println("ifarme numbers"+iframeelements.size());
	driver.switchTo().defaultContent();//main window
	
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click");
	JavascriptExecutor js1= (JavascriptExecutor)driver;
	js1.executeScript("window.scrollBy,(0,900)");
			}
catch(NoSuchElementException e){
	System.out.println("elent is not found ");
	
}
finally {
	driver.quit();
	
}
	}

}
