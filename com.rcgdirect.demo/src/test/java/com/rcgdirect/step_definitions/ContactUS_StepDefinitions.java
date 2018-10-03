package com.rcgdirect.step_definitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.rcgdirect.pages.ContactUsPage;
import com.rcgdirect.pages.HomePage;
import com.rcgdirect.utilities.ConfigReader;
import com.rcgdirect.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUS_StepDefinitions {
	HomePage homePage = new HomePage();
	ContactUsPage contactUs = new ContactUsPage();
	WebDriver driver = Driver.getDriver();
	
	@Given("^User at Contact US page$")
	public void user_at_Contact_US_page(){
		driver.get(ConfigReader.getProperty("url"));
		homePage.clickContactUs();
	}

	@When("^User enters market credentials$")
	public void user_enters_market_credentials() {
		contactUs.enterFirstName(ConfigReader.getProperty("firstname"));
		contactUs.enterLastName(ConfigReader.getProperty("lastname"));
		contactUs.enterEmail(ConfigReader.getProperty("email"));
		contactUs.enterPhoneNumber(ConfigReader.getProperty("phone"));
		contactUs.doYouHaveAccountWithRCG("no");
		contactUs.enterComment("Hello World");
	}

	@When("^click on Submit button without checking <I'm not robot'>$")
	public void click_on_Submit_button_without_checking_I_m_not_robot() {
		contactUs.clickSubmitButton();
	}

	@Then("^User should see \"([^\"]*)\" message$")
	public void user_should_see_message(String input) {
		assertEquals(contactUs.getErrorMessage().getText(), input);
	}

}
