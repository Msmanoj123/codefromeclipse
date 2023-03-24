package practicerunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features/practice.feature",
        glue = "practice",
        plugin = "html:cucumbereport/cucumberdragabble.html",
        tags = "@sortable"
)
public class runner1 {
}
