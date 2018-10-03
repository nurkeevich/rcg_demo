package com.rcgdirect.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = {"pretty", 
				"html:target/cucumber-report",
				"json:target/cucumber.json"
		},
		tags = "@CukesRunner",
		features = {"src/test/resources/features/"},
		glue = {"com/rcgdirect/step_definitions/"},
		dryRun = false,
		monochrome = true
)
public class CukesRunner extends AbstractTestNGCucumberTests {
	

}
