package SeleniumDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumProgram1 {
public static void main(String[] args) throws InterruptedException {
// invoke the browser and enter the URL (AUT)
WebDriver driver = new ChromeDriver();//invoke/open the chrome browser
driver.get("https://www.google.com/");//enter the url on the browser
System.out.println("Google URL has been entered on the browser");
String title = driver.getTitle();
System.out.println("Title of the page is: "+driver.getTitle());
Thread.sleep(2000);//sleep for 2 seconds -> 1000 milli second is 1 second
driver.close();//to close the browser
}
}
