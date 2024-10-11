package RediffPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import SeleniumDemo.ParentClass;

public class RediffLoginPageProp extends ParentClass{
    
    //WebDriver driver;
    
    By userNameField = By.xpath("//input[@id='login1']");
    By passwordField = By.cssSelector("input[id='password']");
    By signInButton = By.name("proceed");
    By rediffHomeLink = By.linkText("rediff.com");

    public WebElement getUserNameField() {
        return driver.findElement(userNameField);       
    }
    
    public WebElement getPasswordField() {
        return driver.findElement(passwordField);       
    }
    
    public WebElement getSignInButton() {
        return driver.findElement(signInButton);       
    }
    
    public WebElement getRediffHomeLink() {
        return driver.findElement(rediffHomeLink);       
    }
}

