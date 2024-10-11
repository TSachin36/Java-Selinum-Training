package SeleniumDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ChromeDemo extends BaseClass{
//class level variables
// static WebDriver driver;
// static String browser = "firefox";
public static void main(String[] args) throws InterruptedException {

invokeBrowser("chrome");

driver.navigate().to("https://www.google.com/");//enter the url

//Identify the search box first
WebElement search = driver.findElement(By.name("q"));

//perform action 2nd
search.sendKeys("testing",Keys.ENTER);//entering testing
//search.sendKeys(Keys.ENTER);//clicking enter from the keyboard
String expectedTitle = "testing - Google Search";//expected title
//capture the actual title
Thread.sleep(2000);
String actualTitle = driver.getTitle();
System.out.println(actualTitle);

if(expectedTitle.equalsIgnoreCase(actualTitle))//condition -> true
{
System.out.println("Title matching..Hence TC passed");
}
else
System.out.println("Title not matching..Hence Test case failed");

}

}