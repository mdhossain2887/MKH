package com.bit.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.HomePage;

public class BaseTest {
	WebDriver driver;
	public HomePage navigateToUrl() {
		driver=new FirefoxDriver();
		driver.get("https://www.express.com");
		return new HomePage(driver);
	}

}
