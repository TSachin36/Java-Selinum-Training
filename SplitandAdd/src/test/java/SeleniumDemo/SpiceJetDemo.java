package SeleniumDemo;
import org.testng.annotations.Test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SpiceJetDemo extends ParentClass{
@Test (enabled=false)
public void spiceJetScenario() throws InterruptedException
{
invokeBrowser("edge");
driver.get("https://book.spicejet.com/");
//From city
driver.findElement(By.name("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
Thread.sleep(2000);
//click some city
driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
//Identify currency drop down & selecting values - success
WebElement currency = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
Select cur = new Select(currency);
Thread.sleep(2000);
cur.selectByIndex(10);
Thread.sleep(2000);
cur.selectByValue("INR");
Thread.sleep(2000);
cur.selectByVisibleText("USD");
//select passenger
driver.findElement(By.id("divpaxinfo")).click();
WebElement passenger = driver.findElement(By.name("ControlGroupSearchView$AvailabilitySearchInputSearchView$DropDownListPassengerType_ADT"));
Select passengerDropDown = new Select(passenger);
Thread.sleep(2000);
passengerDropDown.selectByValue("2");
//select from city
driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
Thread.sleep(2000);
//From city
driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
Thread.sleep(2000);
//Destination city
driver.findElement(By.xpath("(//a[@text='Mumbai (BOM)'])[2]")).click();
//Today's date selection
driver.findElement(By.xpath("(//a[contains(text(),'20')])[1]")).click();
}
@Test
public void DaysCount() throws InterruptedException
{
invokeBrowser("edge");
driver.get("https://book.spicejet.com/");
//checkbox - Radio - Senior citizen
driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen")).click();
//From city
driver.findElement(By.name("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
Thread.sleep(2000);
//click some city
driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
Thread.sleep(2000);
//To city
driver.findElement(By.xpath("(//a[@text= 'Hyderabad (HYD)'])[2]")).click();
Thread.sleep(2000);
//Click current date
//driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).click();
//driver.findElement(By.xpath("(//a[contains(.,'18')])[1]")).click();
//Day count
int count = driver.findElements(By.xpath("//a[@class='ui-state-default']")).size();
System.out.println(count);
//Month selection
// boolean month = driver.findElement(By.cssSelector("span[class='ui-datepicker-month']")).getText().contains("December");
//System.out.println(month);//false
while(!driver.findElement(By.cssSelector("span[class='ui-datepicker-month']")).getText().contains("December"))
{
//System.out.println(month);
driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
}
//Day selection
for(int i=0;i<count;i++)
{
String text = driver.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).getText();
if(text.equals("31")) //if (true)
{
driver.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).click();
break;
}
}
}
}
