package SeleniumDemo;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;
public class PropertiesDemo {
	
	@Test
	public void readData() throws IOException
	{
		FileInputStream fis = new FileInputStream("/home/zadmin/eclipse-workspace/SplitandAdd/application.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String company = prop.getProperty("company");
		System.out.println(company);
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		String url = prop.getProperty("url");
		System.out.println(url);
	}
}