package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/allfeature/createObject.feature",  // Path to your .feature files
    glue = "steps",     // Package for step definitions
    plugin = {
        "pretty",                             // Console output
        "html:reports/cucumber-reports.html",  // HTML report
        "json:reports/cucumber-reports.json"   // JSON report for CI/CD
    },
    monochrome = true,                        // Readable console output
    dryRun = false                            // Set to true to check for missing steps without running
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
