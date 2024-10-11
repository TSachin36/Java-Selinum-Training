package SeleniumDemo;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HotelProperties extends ParentClass{

    

    @Test
    public void hotelApp() throws IOException {
        // Load browser and URL from properties
    	FileInputStream fis = new FileInputStream("/home/zadmin/eclipse-workspace/SplitandAdd/hotel.properties");
    	Properties prop = new Properties();
    	prop.load(fis);
        String url = prop.getProperty("url");
        System.out.println(url);
        String username = prop.getProperty("username");
        System.out.println(username);
        String password = prop.getProperty("password");
        System.out.println(password);

        invokeBrowser("chrome");
        driver.get(url);

        // Find and fill in the username and password
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);

        // Wait for the login button to be clickable and then click it
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement login = driver.findElement(By.id("login"));
        wait.until(ExpectedConditions.elementToBeClickable(login));
        login.click();
    }
}

