package ParallelTesting;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelClass {
WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void login( String br) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\BrowserDrivers\\chromedriver.exe");
		switch (br.toLowerCase())
		{
		case "chrome":driver= new ChromeDriver();break;
		case "edge":driver= new EdgeDriver();break;
		case "firefox":driver= new FirefoxDriver();break;
		default:System.out.println("browser invalid");
		
		}
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\BrowserDrivers\\chromedriver.exe");
//driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}
	@Test(dataProvider = "dp")
	void mainpage(String standard_user,String secret_sauce ) throws InterruptedException
	{
		try {
		driver.get("https://www.saucedemo.com");
		 WebElement name = driver.findElement(By.cssSelector("input#user-name"));
		 name.sendKeys("standard_user");
		 Thread.sleep(2000);
		 WebElement Password= driver.findElement(By.cssSelector("input#password"));
		 Password.sendKeys("secret_sauce");
		 Thread.sleep(2000);
		 WebElement login= driver.findElement(By.cssSelector("input#login-button"));
		 login.click();
	boolean Status = driver.findElement(By.xpath("//button[text()='Add to cart']")).isDisplayed();
	Thread.sleep(2000);
	driver.getTitle();
	if(Status==true)
	{
		driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']")).click();
		Assert.assertTrue(true);
	}
	else
	{
		Assert.fail();
	}
	}
	catch(NoSuchElementException e) {
		System.out.println("Element not found");
		
	}
	}
	@AfterClass
	void logout()
	{
		driver.quit();
	}
	@DataProvider(name = "dp")
	Object[][] loginData()
	{
		Object data[][]= {
				{"madhura.com","tet99"},
				{"madhurwwwa.com","tet9ee9"},
				
		};
		return data;
	}

}
