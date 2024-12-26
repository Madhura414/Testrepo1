package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.opera.OperaDriver;

public class HeadlessBrowser {
    public static void main(String[] args) throws InterruptedException {
        // Set Chrome options for headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\BrowserDrivers\\chromedriver.exe");
//		WebDriver driver= new ChromeDriver();

        // Initialize WebDriver with the specified options
        WebDriver driver = new ChromeDriver(options);

        // Maximize the browser window
        driver.manage().window().maximize();

        // Open Flipkart's website
        driver.get("https://www.flipkart.com");

        // Wait for the page to load
        Thread.sleep(2000);

        // Get the actual title of the page
        String act_title = driver.getTitle();

        // Validate the page title
        if (act_title.contains("Flipkart")) {  // Corrected the expected title check
            System.out.println("Test Failed");
        } else {
            System.out.println("Test passed");
            System.out.println("Actual Title: " + act_title); // Debugging help
        }

        // Close the browser
        driver.quit();
    }
}
