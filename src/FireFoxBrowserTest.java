import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserTest {
    public static void main(String[] args) {
        String url = "https://demo.nopcommerce.com/login?returnUrl=%2F";

        //Set Chrome driver path
        System.setProperty("webdriver.gheko.driver", "drivers/geckodriver.exe");

        //Start Chrome browser
        WebDriver driver = new FirefoxDriver();

        //Open url
        driver.get(url);

        //Get title of loaded page
        System.out.println("Page Title is: " + driver.getTitle());

        //Get current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        //Get web elements or page source
        System.out.println("Page Source is: " + driver.getPageSource());

        //Find and enter email in email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("test123@gmail.com");

        //Find and enter password in password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("test123");

        //Close browser
        driver.quit();
    }
}
