package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChromeDemo2 extends BaseClass {
    
    @BeforeClass
    public void setUp() {
        invokeBrowser("chrome");
        driver.navigate().to("https://www.google.com/");
    }
    
    @Test
    public void testSearch() throws InterruptedException {
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("testing", Keys.ENTER);
        Thread.sleep(2000);
        
        String expectedTitle = "testing - Google Search";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        
        Assert.assertEquals(actualTitle, expectedTitle, "Title not matching..Hence Test case failed");
        System.out.println("Title matching..Hence TC passed");
    }
    
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
