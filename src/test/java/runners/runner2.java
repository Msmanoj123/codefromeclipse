package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/luma.feature",
        glue = "steps",
        plugin = "html:report/cucumberreport/cucumberdemo.html",
        monochrome = true,
        tags = "@order")
public class runner2 {
}
