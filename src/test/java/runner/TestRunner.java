package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-html-report",
                "json:target/cucumber.json"},
        features="src/test/resources",
        glue="step_definitions",
        tags={"@RegisterPage"}, // in selenium 4 -> @regression and not @wip
        dryRun = true,
        monochrome = true
)

public class TestRunner {


}
