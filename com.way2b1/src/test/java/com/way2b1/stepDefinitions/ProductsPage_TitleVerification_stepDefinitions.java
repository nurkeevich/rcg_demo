package com.way2b1.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.way2b1.pages.HomePage;
import com.way2b1.utilities.ConfigReader;
import com.way2b1.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ProductsPage_TitleVerification_stepDefinitions {
	private WebDriver driver = Driver.getDriver();
	private HomePage homePage = new HomePage();
	
	@Given("^User at Home Page$")
	public void user_at_Home_Page() {
		driver.get(ConfigReader.getProperty("url"));
	}

	@Then("^Clicks on Products button on Home Page$")
	public void clicks_on_Products_button_on_Home_Page() {
		homePage.clickProducts();
	}

	@Then("^Verifies the Title of Page \"([^\"]*)\"$")
	public void verifies_the_Title_of_Page(String titleOfPage) {
		System.out.println("title of page: "+driver.getTitle());
	}
}
