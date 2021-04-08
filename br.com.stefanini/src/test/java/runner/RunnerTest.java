package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\features\\login.feature",
		glue = "steps",
		snippets = SnippetType.CAMELCASE,
		tags = "@testeLogin",
		plugin = {"pretty", "json:target/reports/CucumberReports.json"},
		monochrome = true,
		dryRun = false
		)

public class RunnerTest {

}
