package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment {
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement payment;

	public WebElement getPayment() {
		return payment;
	}
	
	
	
}
