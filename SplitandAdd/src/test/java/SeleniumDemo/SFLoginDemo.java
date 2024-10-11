package SeleniumDemo;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class SFLoginDemo extends ParentClass{
public static void main(String[] args) throws InterruptedException, IOException {
// TODO Auto-generated method stub
invokeBrowser("Chrome");
driver.get("https://login.salesforce.com/");
driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.id("password")).sendKeys("hello123");
driver.findElement(By.id("Login")).click();
Thread.sleep(2000);
screenShot();
WebElement Error= driver.findElement(By.id("error"));
System.out.println("Login Error Message: "+Error.getText());

closeBrowser();


}
}