package com.rcgdirect.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.rcgdirect.pages.ContactUsPage;
import com.rcgdirect.pages.HomePage;
import com.rcgdirect.utilities.ConfigReader;
import com.rcgdirect.utilities.Driver;

public class FronEnd_Testing {
	HomePage homePage = new HomePage();
	ContactUsPage contactUs = new ContactUsPage();

	// without page object
	@Test(enabled = false)
	public void test1() throws InterruptedException {

		WebDriver driver = Driver.getDriver();

		driver.get("https://www.rcgdirect.com");
		driver.findElement(By.xpath("//span[.='ABOUT US']")).click();

		Thread.sleep(3000);

		driver.navigate().back();

		WebElement TechnologyButton = driver.findElement(By.xpath("//span[.='TECHNOLOGY']"));

		Actions action = new Actions(driver);

		action.moveToElement(TechnologyButton).perform();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[.='Server Hosting']")).click();

	}

	// with page object model

	@Test
	public void test2() {
		String expectedErrorMessage = "This field is required.";

		WebDriver driver = Driver.getDriver();
		driver.get(ConfigReader.getProperty("url"));
		homePage.clickContactUs();
		contactUs.enterFirstName(ConfigReader.getProperty("firstname"));
		contactUs.enterLastName(ConfigReader.getProperty("lastname"));
		contactUs.enterEmail(ConfigReader.getProperty("email"));
		contactUs.enterPhoneNumber(ConfigReader.getProperty("phone"));
		contactUs.doYouHaveAccountWithRCG("yes");
		contactUs.enterfirst3DigitOfAccountNumber(ConfigReader.getProperty("firstThreeDigit"));
		contactUs.enterComment("This is demo");
		contactUs.clickSubmitButton();

		assertEquals(contactUs.getErrorMessage().getText(), expectedErrorMessage);

	}
}
