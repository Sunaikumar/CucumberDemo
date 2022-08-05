package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
public  WebDriver driver;

	
	@FindBy(xpath = " //a[@class='login']")
	private WebElement signin;

	// Abstraction
	
	public Home_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	// Encapsulation
	public WebElement getSignin() {
		return signin;
	}

	
	
	
	
}
