package SeleniumDemo;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
public class PracticePageDemo extends ParentClass{
public static void main(String[] args) throws InterruptedException, IOException {
// TODO Auto-generated method stub
invokeBrowser("firefox");
// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
WebElement radio3 = driver.findElement(By.xpath("//input[@value='radio3']"));
radio3.click();

//To find the total no of radio buttons on the practice page
List<WebElement> radiBtns = driver.findElements(By.xpath("//input[@name='radioButton']"));
System.out.println("Total Radio Buttons: "+radiBtns.size());//total no of radio buttons
for(int i=0;i<=radiBtns.size()-1;i++) {
	System.out.println(radiBtns.get(i).getAttribute("value"));
}
List<WebElement> checkBoxs = driver.findElements(By.xpath("//input[@type='checkbox']"));
System.out.println("Total Check Boxes: "+checkBoxs.size());
for(int i=0;i<=checkBoxs.size()-1;i++) {
	System.out.println(checkBoxs.get(i).getAttribute("value"));
}
WebElement  auto = driver.findElement(By.id("autocomplete"));
auto.click();
auto.sendKeys("india");
Thread.sleep(2000);
auto.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
screenShot();
//System.out.println(radiBtns.get(0).getAttribute("value"));//?->
//System.out.println(radiBtns.get(1).getAttribute("value"));//?->
//System.out.println(radiBtns.get(2).getAttribute("value"));//?->
	Thread.sleep(4000);//forced sleep for 4 secs
	driver.close();
}
}
