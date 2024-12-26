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


public class HandlingAlerts {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\BrowserDrivers\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com");
//1.Noraml Alert with ok button
driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).click();
Alert a= driver.switchTo().alert();
System.out.println(a.getText());
a.accept();
//2.confirm  Alert ok and cancel
driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).click();
 driver.switchTo().alert().accept();//Close alert using with OK button
 driver.switchTo().alert().dismiss();//close alert using cancel button
 
 //prompt alert - Input box
 driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).click();
 Alert a1= driver.switchTo().alert();
 a1.sendKeys("welcome");

driver.close();

	}

}
