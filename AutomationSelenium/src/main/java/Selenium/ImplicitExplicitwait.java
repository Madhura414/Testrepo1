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
public class ImplicitExplicitwait 
{

		public static void main(String [] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\BrowserDrivers\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com");
Thread.sleep(2000);
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.findElement(By.xpath("//span[text()='Appliances']"));
System.out.println(driver.getTitle());
		
//Explicitly wait
//WebDriverWait wait = new WebDriverWait(driver,30);
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));

//wait.until(expectedcodition.visiblityofelement)
//fluent wait
//Wait wait = new FluentWait(WebDriver reference)
//.withTimeout(timeout, SECONDS)
//.pollingEvery(timeout, SECONDS)
//.ignoring(Exception.class);
//
//WebElement foo=wait.until(new Function<WebDriver, WebElement>() {
//public WebElement applyy(WebDriver driver) {
//return driver.findElement(By.id("foo"));
}


}