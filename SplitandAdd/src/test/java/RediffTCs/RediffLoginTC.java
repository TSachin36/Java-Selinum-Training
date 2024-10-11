package RediffTCs;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import RediffPages.RediffHomePage;
import RediffPages.RediffLoginpage;
public class RediffLoginTC {
	WebDriver driver;
	RediffHomePage rhp;
	RediffLoginpage rlp;
	
	@Test
	public void rediffTC1() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		rlp = new RediffLoginpage(driver);
		rlp.userName().sendKeys("admin");
		rlp.password().sendKeys("admin123");
		Thread.sleep(2000);
		//navigate to home page
		rlp.rediffHome().click();//clicking the link > Home page
	
		//rediff home page
		rhp = new RediffHomePage(driver);
		Thread.sleep(2000);
		rhp.news().click();
		//Thread.sleep(2000);
		rhp.cricket().click();
	}
}