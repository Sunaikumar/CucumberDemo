package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {
	
	public WebDriver driver;
	
@FindBy(xpath = "//p[@class='cart_navigation clearfix']/button/span")
private WebElement ship;

public Shipping(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public WebElement getShip() {
	return ship;
}

}
