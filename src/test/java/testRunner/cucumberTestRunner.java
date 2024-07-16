package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/resources/features",
	    glue = {"stepDefinitions"},
	    plugin = {"pretty", "html:target/cucumber-report.html"}
	)

public class cucumberTestRunner extends AbstractTestNGCucumberTests {

}
