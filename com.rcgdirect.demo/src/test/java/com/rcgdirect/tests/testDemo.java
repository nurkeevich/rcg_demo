package com.rcgdirect.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import com.rcgdirect.pages.ContactUsPage;
import com.rcgdirect.pages.HomePage;
import com.rcgdirect.utilities.ConfigReader;
import com.rcgdirect.utilities.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testDemo {
	
	HomePage HomePage = new HomePage();
	ContactUsPage contactUS = new ContactUsPage();
	
	@Test(enabled = false)
	public void test1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.rcgdirect.com");
		driver.findElement(By.xpath("//span[.='TECHNOLOGY']")).click();
		Thread.sleep(3000);
//		driver.navigate().back();

		driver.findElement(By.xpath("//a[@title='Server Hosting']")).click();
		
		WebElement AboutUS = driver.findElement(By.xpath("//span[.='ABOUT US']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(AboutUS).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[.='Financials']")).click();
		
	}
	
	@Test
	public void test2() {
		WebDriver driver = Driver.getDriver();
		driver.get(ConfigReader.getProperty("url"));
		
		HomePage.clickContactUs();
		contactUS.enterFirstName(ConfigReader.getProperty("firstname"));
		contactUS.enterLastName(ConfigReader.getProperty("lastname"));
		contactUS.enterEmail(ConfigReader.getProperty("email"));
		contactUS.enterPhoneNumber(ConfigReader.getProperty("phone"));
		contactUS.doYouHaveAccountWithRCG("yes");
		contactUS.enterfirst3DigitOfAccountNumber(ConfigReader.getProperty("firstThreeDigit"));
		contactUS.enterComment("This is Demo");
		contactUS.clickSubmitButton();
		
	}
	
}








