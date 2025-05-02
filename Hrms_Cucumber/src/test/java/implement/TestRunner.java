package implement;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java", glue = "stepDefinations", monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests {
	//

}
