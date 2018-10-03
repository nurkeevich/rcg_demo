$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("contactUs.feature");
formatter.feature({
  "line": 2,
  "name": "Contact US",
  "description": "",
  "id": "contact-us",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CukesRunner"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Click Submit button without checking \u003cI\u0027m not robot\u0027\u003e",
  "description": "",
  "id": "contact-us;click-submit-button-without-checking-\u003ci\u0027m-not-robot\u0027\u003e",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User at Contact US page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters market credentials",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on Submit button without checking \u003cI\u0027m not robot\u0027\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User should see \"This field is required.\" message",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactUS_StepDefinitions.user_at_Contact_US_page()"
});
formatter.result({
  "duration": 4757027269,
  "status": "passed"
});
formatter.match({
  "location": "ContactUS_StepDefinitions.user_enters_market_credentials()"
});
formatter.result({
  "duration": 426319192,
  "status": "passed"
});
formatter.match({
  "location": "ContactUS_StepDefinitions.click_on_Submit_button_without_checking_I_m_not_robot()"
});
formatter.result({
  "duration": 73158225,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "This field is required.",
      "offset": 17
    }
  ],
  "location": "ContactUS_StepDefinitions.user_should_see_message(String)"
});
formatter.result({
  "duration": 32083968,
  "status": "passed"
});
});