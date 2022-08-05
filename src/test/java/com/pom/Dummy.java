package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dummy {
public WebDriver driver;
	
	@FindBy(xpath = "//select[@id='fruits']")
	private WebElement fruits;

	public Dummy(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);
	}

	public WebElement getFruits() {
		return fruits;
	}
	
	
	
}
