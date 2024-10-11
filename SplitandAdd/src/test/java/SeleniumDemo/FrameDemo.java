package SeleniumDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FrameDemo extends ParentClass{
	
	@Test
	public void frameTC1() throws InterruptedException
	{
		invokeBrowser("firefox");
		driver.get("file:///home/zadmin/Downloads/iframpage.html");
		WebElement t1 = driver.findElement(By.id("t1"));
		t1.sendKeys("text");
		//Get inside the iframe -> 0
		driver.switchTo().frame(0);
	//	Thread.sleep(2000);//forced delay of 2 secs
		driver.findElement(By.id("t2")).sendKeys("Testing");//run time error - exception
	//	Thread.sleep(2000);//forced delay of 2 secs
		driver.findElement(By.id("t3")).sendKeys("Automation");
	//	Thread.sleep(2000);//forced delay of 2 secs
		driver.switchTo().parentFrame();
		t1.clear();//clear the text on the box
		t1.sendKeys("We are on the parent frame");
		closeBrowser();
	}
}