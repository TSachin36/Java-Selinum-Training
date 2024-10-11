package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Goibibo {
	@Test
	public void goibibo()
	{
		//interface
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		WebElement btn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/span/span"));
		btn.click();
		WebElement btn2 = driver.findElement(By.xpath("/html/body/div/div[4]/div/div/div[2]/div[3]/div/span"));
		btn2.click();
		WebElement Arrow = driver.findElement(By.xpath("/html/body/div/div[4]/div/div/div[2]/div[3]/div[2]/div[2]/div/div/div[1]/span[2]"));
		Arrow.click();
		Arrow.click();
		driver.findElement(By.xpath("/html/body/div/div[4]/div/div/div[2]/div[3]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[3]/div[3]/p")).click();
		String month = driver.findElement(By.xpath("/html/body/div/div[4]/div/div/div[2]/div[3]/div[2]/div[1]/div[1]/p[1]")).getText();
		System.out.println(month);
		Assert.assertTrue(month.contains("17 Dec"));
		
		driver.close();
	}
		
		
		
		
}