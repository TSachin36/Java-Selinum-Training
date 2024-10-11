package SeleniumDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class WebEnter {
public static void main(String[] args) {
// Invoke/open the browser
WebDriver driver = new EdgeDriver();
driver.navigate().to("https://www.google.com/");//enter the url

//Identify the search box first
WebElement search = driver.findElement(By.name("q"));

//perform action 2nd
search.sendKeys("testing",Keys.ENTER);//entering testing
//search.sendKeys(Keys.ENTER);//clicking enter from the keyboard
String expectedTitle = "testing - Google Search";//expected title
//capture the actual title
String actualTitle = driver.getTitle();

if(expectedTitle.equalsIgnoreCase(actualTitle))
{
System.out.println("Title matching");
}
else {
System.out.println("Title not matching");
}
try {
Thread.sleep(2000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
driver.close();

}
}

