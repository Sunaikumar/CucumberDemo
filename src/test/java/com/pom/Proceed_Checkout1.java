package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_Checkout1 {
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@class='btn btn-default button button-medium']/span")
	private WebElement Checkout;

	public Proceed_Checkout1(WebDriver driver) {
	this.driver= driver;
	PageFactory.initElements(driver, this);
	}

	public WebElement getCheckout() {
		return Checkout;
	}
	
	
}
