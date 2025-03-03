package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="", features=".//Features/Login.feature",
glue= {"stepDefination"},
plugin= {"pretty", "html:target/htmlreport.html"}
		)

public class CucumberTestRunner extends AbstractTestNGCucumberTests {

}
