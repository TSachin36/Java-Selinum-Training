package SeleniumDemo;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MultipleWindows extends ParentClass{
	
	@Test
	public void googleAccountPage() throws InterruptedException
	{
		invokeBrowser("chrome");//Opening the browser
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fwww.google.com%2F&ec=GAZAmgQ&hl=en&ifkv=ARpgrqcpaQ4P3LKhGm1kUIyRu_a-sBqCYBPDHjyud6ibrHpzPyWdsFPcoHcza2EbsItAcDijlMMSkg&passive=true&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1056329096%3A1726721103962941&ddm=0");
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Help")).click();//click Help link
		Set<String> ids = driver.getWindowHandles();//parent window and Help window
		Iterator<String> it = ids.iterator();
		String parent = it.next();//parent window
		String help = it.next();
		driver.switchTo().window(help);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());//child or parent window title ?
		
		//navigate back to main window
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.close(); //?
		//driver.quit();//all the browsers that are opened by Selenium
		
	}
}