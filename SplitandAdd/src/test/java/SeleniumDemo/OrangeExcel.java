package SeleniumDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OrangeExcel extends ParentClass {
    
    @Test
    public void OrangeTC1() throws InterruptedException, IOException {
        FileInputStream fis = new FileInputStream("//home/zadmin/Downloads/OrangeData.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("UserData");
        
        invokeBrowser("chrome");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        int rows = sheet.getPhysicalNumberOfRows(); 
        System.out.println(rows); 
        
        int columns = sheet.getRow(1).getPhysicalNumberOfCells(); // Total no of columns
        System.out.println(columns);
        
        for (int i = 1; i < rows; i++) {
            String name = "";
            String password = "";
            
            // Inner loop to get username and password
            for (int j = 0; j < columns; j++) {
                if (j == 0) {
                    name = sheet.getRow(i).getCell(j).getStringCellValue(); // Get username
                    System.out.println("Username: " + name);
                } else if (j == 1) {
                    password = sheet.getRow(i).getCell(j).getStringCellValue(); // Get password
                    System.out.println("Password: " + password);
                }
            }
            
          
        
            driver.findElement(By.name("username")).sendKeys(name);
            driver.findElement(By.name("password")).sendKeys(password);
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            
          
            WebDriverWait wd = new WebDriverWait(driver, Duration.ofSeconds(10));
            try {
                WebElement pname = wd.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@class='oxd-userdropdown-name']")));
                pname.click();
                
                
                driver.findElement(By.linkText("Logout")).click();
            } catch (Exception e) {
                System.out.println("Login failed for user: " + name);
            }
        }
        
        
        closeBrowser();
    }
}
