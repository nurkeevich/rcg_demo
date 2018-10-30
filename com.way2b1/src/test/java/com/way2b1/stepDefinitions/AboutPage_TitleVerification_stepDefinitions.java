package com.way2b1.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.way2b1.pages.HomePage;
import com.way2b1.utilities.Driver;

import cucumber.api.java.en.Then;

public class AboutPage_TitleVerification_stepDefinitions {
	private WebDriver driver = Driver.getDriver();
	private HomePage homePage = new HomePage();
	
	@Then("^Clicks on About on Home Page$")
	public void clicks_on_About_on_Home_Page() {
		homePage.clickAbout();
	}

	@Then("^Verifies the title of About Page \"([^\"]*)\"$")
	public void verifies_the_title_of_About_Page(String titleOfPage) {
		System.out.println("Title of Page: "+driver.getTitle());
	}
}
