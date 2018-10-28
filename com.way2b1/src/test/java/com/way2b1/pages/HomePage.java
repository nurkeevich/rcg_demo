package com.way2b1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.way2b1.utilities.Driver;

public class HomePage {
	private WebDriver driver;

	public HomePage() {
		driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[.='Home']")
	public WebElement Home;

	@FindBy(xpath = "//span[.='Products']")
	public WebElement Products;

	@FindBy(xpath = "//span[.='Jobs']")
	public WebElement Jobs;

	@FindBy(xpath = "//span[.='About']")
	public WebElement About;

	@FindBy(xpath = "//a[.='Terms of Use']")
	public WebElement TermsOfUse;

	@FindBy(xpath = "//a[.='Privacy Policy']")
	public WebElement PrivacyPolicy;
	
	public void clickHome() {
		Home.click();
	}

	public void clickProducts() {
		Products.click();
	}

	public void clickJobs() {
		Jobs.click();
	}

	public void clickAbout() {
		About.click();
	}

	public void clickTermsOfUse() {
		TermsOfUse.click();
	}

	public void clickProvicyPolicy() {
		PrivacyPolicy.click();
	}

}
