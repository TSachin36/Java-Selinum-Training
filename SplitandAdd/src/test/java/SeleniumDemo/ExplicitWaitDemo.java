package SeleniumDemo;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class ExplicitWaitDemo extends ParentClass{
	
	@Test 
	public void hotelApp() 
	{
		invokeBrowser("chrome");
		driver.get("https://adactin.com/HotelApp/index.php");
		driver.findElement(By.id("username")).sendKeys("Sachin");
		driver.findElement(By.id("password")).sendKeys("Sa@123");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement login = driver.findElement(By.id("login"));
		wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();		
	}


@Test (enabled=false)
public void dynamicTC2() 
{
	invokeBrowser("chrome");
	driver.get("https://demoqa.com/dynamic-properties");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(By.id("visibleAfter")));
	String btnText = driver.findElement(By.id("visibleAfter")).getText();
	System.out.println(btnText);
}
}
