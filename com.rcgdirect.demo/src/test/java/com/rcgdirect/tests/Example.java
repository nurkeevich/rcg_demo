package com.rcgdirect.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		
		driver.get("https://www.udemy.com");
		driver.findElement(By.cssSelector("#header-search-field")).sendKeys("selenium");
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
	}
}
