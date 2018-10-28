package com.way2b1.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = {"pretty", 
				"html:target/cucumber-report",
				"json:target/cucumber.json"
		},
		tags = "@test",
		features = {"src/test/resources/Features/"},
		glue = {"com/way2b1/stepDefinitions/"},
		dryRun = false,
		monochrome = true
)
public class smokeRunner extends AbstractTestNGCucumberTests {
	
}
