import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"/Users/angelamukherjee/Documents/automation-workspace/orbtiz/src/main/java/featureFiles"},
        glue = {"stepDefinitions"},
        plugin = {"pretty"}
)
public class CukesTestRunner {
}
