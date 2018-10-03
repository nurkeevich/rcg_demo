package com.rcgdirect.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	
	private static WebDriver driver;

	public static WebDriver getDriver() {

		if (driver != null) {
			return driver;
		}

		String browser = ConfigReader.getProperty("browser").toLowerCase();

		switch (browser) {
		case "chrome":

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			break;

		case "firefox":
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
			break;
			
		default:
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		}
		
		driver.manage().window().fullscreen();
		String timeImplicite = ConfigReader.getProperty("implicitWait");
		driver.manage().timeouts().implicitlyWait(Integer.valueOf(timeImplicite), TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(12, TimeUnit.SECONDS);
		
		return driver;
	}
	
	public static void closeDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
