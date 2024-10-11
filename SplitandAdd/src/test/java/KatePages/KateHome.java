package KatePages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class KateHome {
	
	WebDriver driver;
	public KateHome(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By gifts = By.xpath("/html/body/div[1]/header/div[2]/div/div/div[2]/div/div[2]/div/div[9]/a/p");
	By giftCards = By.xpath("//div[@class='plp-filter-card-title' and contains(text(), 'Gift Cards')]");
	By buycard = By.linkText("BUY GIFT CARD");
	By giftAmount=By.cssSelector("button[data-qa='pdp_btn_giftcard_amount_500.0']");
	By addBag=By.xpath("/html/body/div[1]/div[2]/div[1]/div[3]/div[2]/div[2]/div[3]/form/div[3]/div[3]/div/div/div/div/button");
	By Store=By.xpath("//p[text()='Stores']");
	By searchLocator=By.id("q");
	By searchButton=By.xpath("//button[@class='search-button Locator-button Locator-button--search']");
	
	//Create methods
	public WebElement gifts()
	{
		return driver.findElement(gifts);
	}
	
	public WebElement giftCards()
	{
		
		return driver.findElement(giftCards);
	}
	
	public WebElement buycard()
	{
		
		return driver.findElement(buycard);
	}
	public WebElement giftAmount()
	{
		
		return driver.findElement(giftAmount);
	}
	public WebElement addBag()
	{
		
		return driver.findElement(addBag);
	}
	public WebElement Store()
	{
		
		return driver.findElement(Store);
	}
	
	public WebElement searchLocator()
	{
		
		return driver.findElement(searchLocator);
	}
	public WebElement searchButton()
	{
		
		return driver.findElement(searchButton);
	}
	
	
}