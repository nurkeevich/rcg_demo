@CukesRunner
Feature: Contact US

	Scenario: Click Submit button without checking <I'm not robot'>
		Given User at Contact US page
		When User enters market credentials
		And click on Submit button without checking <I'm not robot'>
		Then User should see "This field is required." message
