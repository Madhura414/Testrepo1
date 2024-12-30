package Selenium;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.By;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Practice {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\BrowserDrivers\\chromedriver.exe");	
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in");

//id
driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
//name 
//driver.findElement(By.name("crid")).click();

//classname 
//driver.findElement(By.className("nav-input nav-progressive-attribute")).click();


//tagname 
List<WebElement> Bestcellerlist = driver.findElements(By.tagName("Best Sellers"));
System.out.println("lists:"+Bestcellerlist.size());

//linktext and partial linktext

//css selector
//tag#id
driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
//tag.classname
driver.findElement(By.cssSelector("input.nav-progressive-attribute"));
//tag [attribute='value']
driver.findElement(By.cssSelector("input[aria-controls=sac-autocomplete-results-container]"));
//xapth
//relatve Xapth
driver.findElement(By.xpath("(//span[text()='Sign in'])[3]"));
driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]"));

//absolute xapth
driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/div/input"));
System.out.println("pagetitle:"+driver.getTitle());
driver.quit();
	}

}
