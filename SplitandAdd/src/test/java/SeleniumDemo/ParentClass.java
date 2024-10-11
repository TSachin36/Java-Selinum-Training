package SeleniumDemo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import com.google.common.io.Files;

public class ParentClass {
    public static WebDriver driver;
    static Actions act;

    // Method to invoke the browser
    public static void invokeBrowser(String browser) {
        if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("None of the browsers are matching");
            return;
        }

        // Set implicit wait and maximize window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // Initialize the Actions object after driver is set
        act = new Actions(driver);
    }

    // Method to take a screenshot
    public static void screenShot() throws IOException {
        // Take screenshot
        File src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(src2, new File("./screenshot/"+"page-"+System.currentTimeMillis()+".png"));
    }

    // Method to perform double-click action
    public static void DoubleClick() throws IOException {
        WebElement btnEle1 = driver.findElement(By.id("doubleClickBtn"));
        act.doubleClick(btnEle1).perform(); // Perform double click on the object
        System.out.println("Double click done");
    }
    
    public static void RightClick() throws IOException {
    	WebElement Rightbtn = driver.findElement(By.id("rightClickBtn"));
    	act.contextClick(Rightbtn).perform(); 
        System.out.println("Right click done");
    }
    
    public static void Click() throws IOException {
    	WebElement Clickbtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
    	act.click(Clickbtn).perform(); 
        System.out.println("Click done");
    }
    
    public static void waitFor(long milliseconds) throws InterruptedException {
        Thread.sleep(milliseconds); // Custom wait method
    }
    
    

    // Method to close the browser
    public static void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}
