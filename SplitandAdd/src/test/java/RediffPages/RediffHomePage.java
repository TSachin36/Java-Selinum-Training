package RediffPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class RediffHomePage {
	
	WebDriver driver;
	public RediffHomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By news = By.linkText("NEWS");
	By sports = By.linkText("SPORTS");
	By cricket = By.linkText("CRICKET");
	
	//Create methods
	public WebElement news()
	{
		return driver.findElement(news);
	}
	
	public WebElement sports()
	{
		//driver.findElement(By.linkText("SPORTS"))
		return driver.findElement(sports);
	}
	
	public WebElement cricket()
	{
		//driver.findElement(By.linkText("CRICKET"))
		return driver.findElement(cricket);
	}
	
	
}