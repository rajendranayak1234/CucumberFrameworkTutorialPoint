package runner2;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/login1.feature",
glue= {"stepdifination2","hooks2"},
publish=true,
dryRun=false,
monochrome=true,
plugin={"pretty","html:target/HTMLreports/report.html"}
)

public class TestRunner2 {

}
