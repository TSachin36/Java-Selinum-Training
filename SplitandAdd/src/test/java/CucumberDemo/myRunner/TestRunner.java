package CucumberDemo.myRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="/src/test/java/CucumberDemo/feature",
		glue= {"CucumberDemo.stepDef"}, plugin= {"pretty"}, monochrome=true
	)
public class TestRunner {
}