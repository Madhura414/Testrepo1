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
import org.openqa.selenium.JavascriptExecutor;
	import io.searchbox.action.Action;

	public class JavaScriptExecutor {
		public static void main(String [] args) throws InterruptedException {
	
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			try {
			driver.findElement(By.xpath("//input[@id='name']"));
			JavascriptExecutor js= (JavascriptExecutor)driver;//JavascriptExecutor js=  driver;
			 js.executeScript("arguments[0].click");
			 driver.findElement(By.xpath("//input[@id='name']"));
			 Actions act = new Actions();
			// Actions actions= new Actions(driver);
			// act.selectbyvis
			}
			catch(Exception e) {
				System.out.println("Elements not interrectable");
				
			}
			finally{
				driver.quit();
				System.out.println("close browser");
			}
			
			System.out.println(driver.getTitle());

}
	}
