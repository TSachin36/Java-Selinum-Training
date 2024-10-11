package SeleniumDemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BaseClass {
static WebDriver driver;
//static String browser = "firefox";
//user defined method
public static void invokeBrowser(String browser)
{
if (browser.equalsIgnoreCase("edge"))
{
driver = new EdgeDriver();
}
else if (browser.equalsIgnoreCase("chrome"))
{
driver = new ChromeDriver();
}
else if (browser.equalsIgnoreCase("firefox"))
{
driver = new FirefoxDriver();
}
else
System.out.println("None of the browsers are matching");
}
}
