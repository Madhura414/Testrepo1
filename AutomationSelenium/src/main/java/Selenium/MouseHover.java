package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	Thread.sleep(2000);
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//Mousehover
	WebElement Mobiles = driver.findElement(By.xpath("//a[@title='Become a Seller']"));
	Actions actions= new Actions(driver);
	//System.out.println(driver.getTitle());
	 actions.moveToElement(Mobiles).moveToElement(Mobiles).click().perform();////Mousehover
	 
	 //2. rightclick
	 WebElement Mobiles2 = driver.findElement(By.xpath("//a[@title='Become a Seller']"));
		Actions actionsright= new Actions(driver);
		actionsright.contextClick(Mobiles2).perform();//rightclick
		 //3doubleclick
		 
		 WebElement Mobiles3 = driver.findElement(By.xpath("//a[@title='Become a Seller']"));
			Actions actionsdoubleclick= new Actions(driver);
			actionsdoubleclick.doubleClick(Mobiles3).perform();//3doubleclick
			
			//drapanddrop
			Actions act= new Actions(driver);
			
			WebElement Mobiles4 = driver.findElement(By.xpath("//a[@title='Become a Seller']"));
			WebElement Mobiles5 = driver.findElement(By.xpath("//a[@title='Fashion']"));
			//drapanddrop
			act.dragAndDrop(Mobiles4, Mobiles5).perform();
			
			//action vs actions
			
			WebElement button = driver.findElement(By.xpath("//a[@title='Become a Seller']"));	
				Actions actt= new Actions(driver);
				Action Myaction=actt.contextClick(button).build();////creating an action and storing into variable
				Myaction.perform();//performing complete action
	driver.quit();
	    }
	
	}


