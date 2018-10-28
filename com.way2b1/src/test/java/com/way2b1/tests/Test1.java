package com.way2b1.tests;

import org.openqa.selenium.WebDriver;

import com.way2b1.utilities.ConfigReader;
import com.way2b1.utilities.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = Driver.getDriver();
		driver.get(ConfigReader.getProperty("url"));
	}
}
