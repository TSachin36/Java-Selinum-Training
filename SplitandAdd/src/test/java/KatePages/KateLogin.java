package KatePages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class KateLogin {
	
	WebDriver driver;
	
	public KateLogin(WebDriver driver) //constructor
	{
		this.driver=driver;//getting ?
	}
	//Identifying the objects -> Login page of Rediff
	By account = By.cssSelector("a[data-qa=\"d_hdr_icon_signin\"]");
	By email=By.id("login-form-email");
	By password = By.id("login-form-password");
	By Continue = By.xpath("//*[@id=\"login\"]/div/form[1]/div[2]/button");
	By SignIn = By.xpath("/html/body/div[1]/div[2]/div[2]/form/div/div/div/div/div[4]/button");
	
	//Create user defined methods for the respective objects
	public WebElement account()
	{
		return driver.findElement(account);		
	}
	public WebElement email()
	{
		return driver.findElement(email);
	}
	public WebElement password()
	{
		return driver.findElement(password);		
	}
	public WebElement Continue()
	{
		return driver.findElement(Continue);		
	}
	public WebElement SignIn()
	{
		return driver.findElement(SignIn);		
	}
	
}
