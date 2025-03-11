package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions", // This should match the package where LoginSteps is defined
        tags = "@Login",
        plugin = {"pretty", "json:target/cucumber-reports/cucumber2.json"}
)
public class LoginRunner extends AbstractTestNGCucumberTests {
}

