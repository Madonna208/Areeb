package runners;

import io.cucumber.testng.CucumberOptions;
import tests.TestBase;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps"}
)
public class TestRunner extends TestBase {

}
