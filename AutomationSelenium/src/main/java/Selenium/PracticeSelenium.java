package Selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class PracticeSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		try {
		WebElement Elemnt=	driver.findElement(By.id(""));
		Elemnt.sendKeys("madhura");
		List <WebElement> elemts  = driver.findElements(By.xpath("//input[@name='q']"));
		System.out.println("elemnts" +driver.getTitle());
		System.out.println("elemnts" +elemts.size());
		JavaScriptExecutor js=  (JavaScriptExecutor)driver;
		//js.executeScript("Window.scroolby(0,200)");
		//js.executeScript("window.scrollBy,(0,600)");
		Actions act = new Actions(driver);
		act.moveToElement(Elemnt).build().perform();
		act.dragAndDrop(Elemnt, Elemnt).perform();
		act.contextClick(Elemnt).perform();
		
		Select act1= new Select(Elemnt);
		act1.selectByVisibleText("dbvd");
		
		
			
			}
		catch(Exception e) {
			System.out.println("element is not seece");
			
		}
		finally {
			driver.quit();
			
			
		}
	}

}
