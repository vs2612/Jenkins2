package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions", 
        tags = "@Login",
        plugin = {"pretty", "json:target/cucumber-reports/cucumber4.json"}
)
public class LoginRunner extends AbstractTestNGCucumberTests {
}

