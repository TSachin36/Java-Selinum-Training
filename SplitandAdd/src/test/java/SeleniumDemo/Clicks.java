package SeleniumDemo;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class Clicks extends ParentClass{
public static void main(String[] args) throws IOException, InterruptedException {

invokeBrowser("firefox");
driver.get("https://demoqa.com/buttons");

// Double click operation
//Actions act = new Actions(driver);
//WebElement btnEle1 = driver.findElement(By.id("doubleClickBtn"));
//act.doubleClick(btnEle1).perform();//perform double click on the object
//System.out.println("Double click done");
//Thread.sleep(4000);
//WebElement Rightbtn = driver.findElement(By.id("rightClickBtn"));
//act.contextClick(Rightbtn).perform();
//System.out.println("Right click done");
//Thread.sleep(4000);
//WebElement Clickbtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
//act.click(Clickbtn).perform();
//System.out.println("Click done");
//DoubleClick();
//RightClick();
Click();
Thread.sleep(4000);
screenShot();
closeBrowser();
}
}