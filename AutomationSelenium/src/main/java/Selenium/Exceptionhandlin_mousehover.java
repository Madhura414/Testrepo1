package Selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

import io.searchbox.action.Action;
public class Exceptionhandlin_mousehover 
{
public static void main(String[] args) 
{

System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\BrowserDrivers\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

driver.get("https://www.amazon.in");
System.out.println(driver.getTitle());
try{
//mousehover element	
WebElement element =driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
Actions actions= new Actions(driver);
actions.moveToElement(element).perform();//moveToElement
System.out.println("elemts are" );

//javascripexecutor 
//Creating the JavascriptExecutor interface object by Type casting
JavascriptExecutor js = (JavascriptExecutor)driver;
//Vertical scroll down by 600  pixels	
js.executeScript("window.scrollBy,(0,600)");
//dropdown
WebElement dropdwonele= driver.findElement(By.linkText("/span[text()='Account & Lists']"));
Select dropdwon = new Select(dropdwonele);
dropdwon.selectByVisibleText("Account & Lists");

}
catch(Exception e)
{
	System.out.println("elemets are not interrupted  ");
}
finally
{
	driver.quit();
	System.out.println("close browser");
}

}

}
