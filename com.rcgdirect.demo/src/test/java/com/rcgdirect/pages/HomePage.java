package com.rcgdirect.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rcgdirect.utilities.Driver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage() {
		driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[.='ABOUT US']")
	private WebElement AboutUs;
	
	@FindBy(xpath = "//span[.='OUR CLIENTS']")
	private WebElement OurClients;
	
	@FindBy(xpath = "//span[.='OUR SERVICES']")
	private WebElement OurServices;
	
	@FindBy(xpath = "//span[.='TRADING PLATFORMS']")
	private WebElement TradingPlatforms;
	
	@FindBy(xpath = "//span[.='TECHNOLOGY']")
	private WebElement Technology;
	
	@FindBy(xpath = "//span[.='MARKET NEWS']")
	private WebElement MarketNews;
	
	@FindBy(xpath = "//span[.='RESOURCES']")
	private WebElement Resources;
	
	@FindBy(xpath = "//span[.='CONTACT US']")
	private WebElement ContactUs;
	
	public void clickAboutUs() {
		AboutUs.click();
	}
	
	public void clickOurClients() {
		OurClients.click();
	}
	
	public void clickOurServices() {
		OurServices.click();
	}
		
	public void clickTradingPlatforms() {
		TradingPlatforms.click();
	}
	
	public void clickTechnology() {
		Technology.click();
	}
	
	public void clickMarketNews() {
		MarketNews.click();
	}
	
	public void clickResources() {
		Resources.click();
	}
	
	public void clickContactUs() {
		ContactUs.click();
	}
	
}







