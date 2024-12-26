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

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\BrowserDrivers\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	  Thread.sleep(2000);
	 
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  //select one checkbox
	driver.findElement(By.xpath("(//div[@class='zlQd20 _1eDlvI'])[1]")).click();
	//select all checkboxes
List<WebElement> elementcheckbox= driver.findElements(By.xpath("YBLJE4"));
List<WebElement> elementcheckbox1= driver.findElements(By.xpath("a[@class='_1ch8e_' and @aria-label='Mobiles']"));
 for(int i=0;i<elementcheckbox1.size();i++)
 {
	 elementcheckbox1.get(i).click();
 }
		System.out.println(driver.getTitle());
		driver.quit();
		
		//Selcet first 3 checkboxes
		for(int i=0;i<3;i++)
		{
			elementcheckbox1.get(i).click();
			
	}
		//unselect if checkboxes are selected 
		for(int i=0;i<3;i++)
		{
			elementcheckbox1.get(i).click();
			}
		for(int i=0;i<3;i++)
		{
			elementcheckbox1.get(i).click();

		}
		
}
}