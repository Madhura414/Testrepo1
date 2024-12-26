package Selenium;
	import java.util.ArrayList;
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
	public class HandleBrowserWindows {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//span[text()='Appliances']")).click();
		//Get all the window handles 
		Set<String>WindowIds= driver.getWindowHandles();
		
		//approcah 1
		List<String> WindowList= new ArrayList(WindowIds);
	    String parentID= WindowList.get(0);
	    String ChildID= WindowList.get(1);
	    
	    //Switch to CHild Window
	    driver.switchTo().window(ChildID);
	    System.out.println(driver.getTitle());
		//Switch to parent Window
	    
	    driver.switchTo().window(parentID);
	    System.out.println(driver.getTitle());
	    
	    //set<string >windows= driver.windowhandles();
	    //driver.switchTo.window.windowid
	    List<WebElement> linkele= driver.findElements(By.id(""));
	    linkele.clear();
	    
			}

	}


	

