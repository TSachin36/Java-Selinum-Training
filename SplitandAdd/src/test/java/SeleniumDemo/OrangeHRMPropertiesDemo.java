package SeleniumDemo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OrangeHRMPropertiesDemo extends ParentClass{
	
	@Test
	public void OrangeTC1() throws FileNotFoundException, InterruptedException
	{
		FileInputStream fis = new FileInputStream("/home/zadmin/eclipse-workspace/SplitandAdd/Orange.properties");
		Properties prop=new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//it is pointing to data.properties file
		String name=prop.getProperty("userName");
		String password=prop.getProperty("password");
		
		invokeBrowser("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		//syncrhonise
		WebDriverWait wd = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement pname = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
		wd.until(ExpectedConditions.elementToBeClickable(pname));
		pname.click();
		
		//logout click
		driver.findElement(By.linkText("Logout")).click();
		
		//close
		closeBrowser();
	}
}