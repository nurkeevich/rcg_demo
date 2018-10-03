package com.rcgdirect.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rcgdirect.utilities.Driver;

public class ContactUsPage {
	private WebDriver driver;
	
	public ContactUsPage() {
		driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "First Name")
	private WebElement FirstName;
	
	@FindBy(id = "Last Name")
	private WebElement LastName;
	
	@FindBy(id = "Email")
	private WebElement Email;
	
	@FindBy(id = "Phone")
	private WebElement Phone;
	
	@FindBy(xpath = "//option[.='Yes']")
	private WebElement Yes;
	
	@FindBy(xpath = "//option[.='No']")
	private WebElement No;
	
	@FindBy(id = "Account number")
	private WebElement AccountNumber;
	
	@FindBy(id = "Comments")
	private WebElement Comments;
	
	@FindBy(name = "submit")
	private WebElement submitButton;
	
	@FindBy(id = "hiddenRecaptcha-error")
	private WebElement ErrorMessage;
	
	public WebElement getErrorMessage() {
		return ErrorMessage;
	}

	public void enterFirstName(String firstName) {
		FirstName.sendKeys(firstName);
	}
	
	public void enterLastName(String lastName) {
		LastName.sendKeys(lastName);
	}
	
	public void enterEmail(String email) {
		Email.sendKeys(email);
	}
	
	public void enterPhoneNumber(String phoneNumber) {
		Phone.sendKeys(phoneNumber);
	}
	
	public void doYouHaveAccountWithRCG(String input) {
		if (input.toLowerCase().equals("yes")) {
			Yes.click();
		}else {
			No.click();
		}
	}
	
	public void enterfirst3DigitOfAccountNumber(String ThreeDigit) {
		AccountNumber.sendKeys(ThreeDigit);
	}
	
	public void enterComment(String comments) {
		Comments.sendKeys(comments);
	}
	
	public void clickSubmitButton() {
		submitButton.click();
	}
	
}
