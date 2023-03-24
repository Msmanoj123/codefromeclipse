package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/Demo.feature",
glue = "steps",
plugin = "html:report/cucumberreport/cucumberdemo.html",
monochrome = true,
tags = "@sortables")
public class runner1 {
}
