package SeleniumDemo;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SeleniumSreenShot extends ParentClass{
public static void main(String[] args) throws InterruptedException, IOException {

invokeBrowser("chrome");

driver.navigate().to("https://www.google.com/");

WebElement auto = driver.findElement(By.name("q"));
auto.click();
auto.sendKeys("Selenium");
Thread.sleep(2000);
auto.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);

Thread.sleep(4000);
screenShot();
closeBrowser();



}

}




