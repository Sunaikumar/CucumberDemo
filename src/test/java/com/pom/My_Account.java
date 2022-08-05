package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Account {
	public WebDriver driver;
	@FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/child::li/following-sibling::li/a[.='Dresses']")
	private WebElement dresses;
	
	@FindBy(xpath = "//ul[@class='submenu-container clearfix first-in-line-xs']/li/child::a[@title='Evening Dresses']")
	private WebElement evening_Dresses;

	public My_Account(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getEvening_Dresses() {
		return evening_Dresses;
	}
	
	
}
