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
public class DynamicPaginationpage {

	
	    public static void main(String[] args) {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\BrowserDrivers\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        

	        driver.get("https://demo.opencart.com/admin/index.php");
	        driver.manage().window().maximize();

	        // Locate username field, clear it, and input "demo"
	        WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
	        username.clear();
	        username.sendKeys("demo");

	        // Locate password field, clear it, and input "demo"
	        WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
	        password.clear();
	        password.sendKeys("demo");

	        // Locate and click the login button
	        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

	        // Check if a close button is displayed and click it if present
	        if (driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed()) {
	            driver.findElement(By.xpath("//button[@class='btn-close']")).click();
	        }
	    }
	}


