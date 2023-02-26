import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/Features",
        glue = "stepDefenation",
        plugin = {
                "json:target/cucumber.json"
        }
)

public class TestRunner extends AbstractTestNGCucumberTests {
}

