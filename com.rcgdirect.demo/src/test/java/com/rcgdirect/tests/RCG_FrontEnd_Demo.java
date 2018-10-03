package com.rcgdirect.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.rcgdirect.pages.ContactUsPage;
import com.rcgdirect.pages.HomePage;
import com.rcgdirect.utilities.ConfigReader;
import com.rcgdirect.utilities.Driver;

public class RCG_FrontEnd_Demo {
	HomePage homePage = new HomePage();
	ContactUsPage contactUs = new ContactUsPage();
	
	@Test
	public void rcgDirect_Demo() {
		Driver.getDriver().get(ConfigReader.getProperty("url"));
		homePage.clickContactUs();
		contactUs.enterFirstName(ConfigReader.getProperty("firstname"));
		contactUs.enterLastName(ConfigReader.getProperty("lastname"));
		contactUs.enterEmail(ConfigReader.getProperty("email"));
		contactUs.enterPhoneNumber(ConfigReader.getProperty("phone"));
		contactUs.doYouHaveAccountWithRCG("yes");
		contactUs.enterfirst3DigitOfAccountNumber(ConfigReader.getProperty("firstThreeDigit"));
		contactUs.enterComment("Hello World");
	}
	
	@AfterMethod(enabled = true)
	public void cleanUp() throws InterruptedException {
		Thread.sleep(7000);
		Driver.getDriver().quit();
	}
	
}
