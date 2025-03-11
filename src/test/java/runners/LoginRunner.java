package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@Login",
        plugin = {"pretty", "json:target/cucumber-rep"}
)
public class LoginRunner extends AbstractTestNGCucumberTests {


}
