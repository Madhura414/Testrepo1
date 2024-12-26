package Selenium;
import java.util.concurrent.TimeUnit;	

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchchrome {

    public static void main(String[] args) throws InterruptedException {
        // Set the path for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
       
        // Navigate to Facebook login page
        driver.get("https://www.facebook.com/login/");
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        
        // Locate and input username
        WebElement username = driver.findElement(By.id("email"));
        username.sendKeys("7661820639");
        Thread.sleep(3000);
        WebElement username1= driver.findElement(By.className("hdchd"))  ;      // Locate and input password
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("Madhura99@");
        Thread.sleep(3000);
        
        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();
        Thread.sleep(3000);
        // Quit the driver
        driver.quit();
    }
}


//Screesnshot selenium
//Using Java:
//import java.io.IOException;
//import java.io.File;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//public class SeleniumScreen{
//    public static void main(String[] args) throws Exception {
//        //Specify the path to your chrome driver
//        System.setProperty("webdriver.chrome.driver", "Path_to_your_chrome_driver");
//        / Instantiate chrome driver object
//        WebDriver driver = new ChromeDriver();
//        // Navigate to the testim website
//        driver.get("https://www.testim.io/");
//        //Use TakesScreenshot method to capture screenshot
//TakeScreenshot screenshot=(TakeScreenshot)driver;
//File source = screenshot.getScreenshotAs(OutputType.FILE);
//        TakesScreenshot screenshot = (TakesScreenshot)driver;
//        //Saving the screenshot in desired location
//        File source = screenshot.getScreenshotAs(OutputType.FILE);
//        //Path to the location to save screenshot
//        FileUtils.copyFile(source, new File("./SeleniumScreenshots/Screen.png"));
//        System.out.println("Screenshot is captured");
//        driver.quit();
//    }

////Using Select class for selecting value from dropdown  

//Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));  
//dropdown.selectByVisibleText("Database Testing");  
//selectByValue(), or selectByIndex().
//Select dropdown = new Select (driver.findElement(By.id("ddddddddd")));
//// Close the Browser  
//  driver.close();  
//
//;
//}