package RediffTCs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import RediffPages.RediffHomePage;
import RediffPages.RediffLoginPageProp;
import SeleniumDemo.ParentClass;

public class RediffLoginProperties extends ParentClass {
    
    RediffHomePage rhp;
    RediffLoginPageProp rlp;

    @Parameters({"browser"})
    @Test
    public void rediffTC1(String browser) throws InterruptedException, IOException {
        // Load properties file
        FileInputStream fis = new FileInputStream("/home/zadmin/eclipse-workspace/SplitandAdd/Rediff.properties");
        Properties prop = new Properties();
        prop.load(fis);
        
        String url = prop.getProperty("url");
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");

        invokeBrowser(browser);
        driver.get(url);
        Thread.sleep(2000); 

        rlp = new RediffLoginPageProp();
        rlp.getUserNameField().sendKeys(username);
        rlp.getPasswordField().sendKeys(password);
        rlp.getSignInButton().click(); 
        
        screenShot();
        
        closeBrowser();

       
//        rlp.getRediffHomeLink().click(); 
//        rhp = new RediffHomePage(driver);
//        Thread.sleep(2000); 
//        rhp.news().click();
//        Thread.sleep(2000); 
//        rhp.cricket().click();
    }
}
