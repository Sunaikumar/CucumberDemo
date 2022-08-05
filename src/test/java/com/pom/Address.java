package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {
	public WebDriver driver;
	
@FindBy(xpath = "//p[@class='cart_navigation clearfix']/button/span")
private WebElement address1;


public Address(WebDriver driver) {
this.driver = driver;
PageFactory.initElements(driver, this);
}


public WebElement getaddress1() {
	return address1;
}


}
