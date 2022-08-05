package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
public WebDriver driver;
	
	@FindBy(xpath = " //input[@id='email']")
	private WebElement email;	
	
	@FindBy(xpath = " //input[@id='passwd']")
	private WebElement password;
	
	@FindBy(xpath = " //button[@id='SubmitLogin']/span")
	private WebElement signin;

	public Login_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignin() {
		return signin;
	}
	
	
}
