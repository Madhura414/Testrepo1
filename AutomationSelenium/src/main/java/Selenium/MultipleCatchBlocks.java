package Selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCatchBlocks {

    public static void main(String[] args) {
        // Declare the driver outside the try block
        WebDriver driver = null;

        try {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\AutomationSelenium\\BrowserDrivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.amazon.in");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.findElement(By.xpath("//div[@id='nav-xshop-container']/div/a[4]")).click();

        } catch (TimeoutException e) {
            System.out.println("Timeout occurred while waiting for the page or element.");
        } catch (NoSuchElementException e) {
            System.out.println("Element is not found on the page.");
        } catch (WebDriverException e) {
            System.out.println("WebDriver-related error occurred.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        } finally {
             {
                driver.close(); // Ensure the driver is closed
                System.out.println("Browser closed.");
            }
        }
    }
}
