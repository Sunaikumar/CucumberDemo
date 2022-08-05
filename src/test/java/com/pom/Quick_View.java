package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quick_View {
	public WebDriver driver;
	@FindBy(xpath = "//div[@id='center_column']/ul/li/div/div/div/a/img")
	private WebElement quickview;

	public Quick_View(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getQuickview() {
		return quickview;
	}
	
	
}
