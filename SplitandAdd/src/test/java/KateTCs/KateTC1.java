package KateTCs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import KatePages.KateHome;
import KatePages.KateLogin;
import SeleniumDemo.ParentClass;

public class KateTC1 extends ParentClass {
    
    KateLogin kl;
    KateHome kh;
    String url; // Class variable to hold the URL

    @Parameters({"browser"})
    @BeforeClass
    public void setup(String browser) throws IOException {
        // Load properties file and get the URL only once
        FileInputStream fis = new FileInputStream("/home/zadmin/eclipse-workspace/SplitandAdd/Kate.properties");
        Properties prop = new Properties();
        prop.load(fis);
        
        url = prop.getProperty("url"); // Store URL in the class variable
        invokeBrowser(browser); // Open the browser once
    }
    
    //Test case for Sign In
    @Parameters({"browser"})
    @Test//(enabled=false)
    public void KateSpadeTC1() throws InterruptedException, IOException {
        String email = getProperty("email");
        String password = getProperty("password");

        driver.get(url); // Use the stored URL
        kl = new KateLogin(driver);
        kl.account().click();
        kl.email().sendKeys(email);
        System.out.println(email);
        kl.Continue().click();
        kl.password().sendKeys(password);
        System.out.println(password);
        kl.SignIn().click();
        screenShot();
        waitFor(2000);
    }
    
    //Test case for add to cart
    @Parameters({"browser"})
    @Test//(enabled=false)
    public void KateSpadeTC2() throws InterruptedException, IOException {
        driver.get(url); // Use the stored URL
        kh = new KateHome(driver);
        kh.gifts().click();
        screenShot();
        waitFor(2000);
        kh.giftCards().click();
        screenShot();
        waitFor(2000);
        kh.buycard().click();
        screenShot();
        waitFor(2000);
        kh.giftAmount().click();
        screenShot();
        waitFor(2000);
        kh.addBag().click();
        screenShot();
        waitFor(2000);
    }
    
    //Test case for the store locator
    @Parameters({"browser"})
    @Test//(enabled=false)
    public void KateSpadeTC3() throws InterruptedException, IOException {
        String location = getProperty("location");
        driver.get(url); // Use the stored URL
        kh = new KateHome(driver);

        kh.Store().click();
        screenShot();
        waitFor(2000);
        kh.searchLocator().click();
        screenShot();
        kh.searchLocator().sendKeys(location);
        waitFor(2000);
        kh.searchButton().click();
        screenShot();
        waitFor(2000);
    }

    @AfterClass
    public void teardown() throws InterruptedException {
        closeBrowser(); // Close the browser once after all tests
    }

    private String getProperty(String key) throws IOException {
        FileInputStream fis = new FileInputStream("/home/zadmin/eclipse-workspace/SplitandAdd/Kate.properties");
        Properties prop = new Properties();
        prop.load(fis);
        return prop.getProperty(key);
    }


}
