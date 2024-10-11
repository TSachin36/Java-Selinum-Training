package SeleniumDemo;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class LoginTest {
    // Define DataProvider
    @DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][] {
            {"user1", "pass1"},
            {"user2", "pass2"},
            {"user3", "pass3"},
            {"user4", "pass4"}
        };
    }
    // Test method that uses DataProvider
    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password) {
        System.out.println("Logging in with: " + username + " / " + password);
        // Code to perform login using username and password
    }
}
