package RediffPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class RediffLoginpage {
	
	WebDriver driver;
	
	public RediffLoginpage(WebDriver driver) //constructor
	{
		this.driver=driver;//getting ?
	}
	//Identifying the objects -> Login page of Rediff
	By UserName = By.xpath("//input[@id='login1']");
	By password = By.cssSelector("input[id='password']");
	By SignIn = By.name("proceed");
	By rediffHome = By.linkText("rediff.com");
	
	//Create user defined methods for the respective objects
	public WebElement userName()
	{
		return driver.findElement(UserName);		
	}
	public WebElement password()
	{
		return driver.findElement(password);		
	}
	public WebElement SignIn()
	{
		return driver.findElement(SignIn);		
	}
	public WebElement rediffHome()
	{
		return driver.findElement(rediffHome);		
	}
	
}