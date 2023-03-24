package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/myntra.feature",
glue="steps",
plugin="html:cucumberreport/cucumbermyntrareport.html")
public class myntrarunner {
}
