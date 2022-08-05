package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary {
	public WebDriver driver;
	
@FindBy(xpath = "//p[@class='cart_navigation clearfix']/a/span")
private WebElement Checkout;

public Summary(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

public WebElement getCheckout() {
	return Checkout;
}

}
