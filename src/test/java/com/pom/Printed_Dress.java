package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Printed_Dress {
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@class='quick-view']/span")
	private WebElement printed_Dress;

	@FindBy(xpath = "//p[@id='quantity_wanted_p']//descendant::i[@class='icon-plus']")
	private WebElement qty;
	
	@FindBy(xpath = "//select[@id='group_1']")
	private WebElement size;
	
	@FindBy(xpath = "//a[@title='Pink']")
	private WebElement color;
	
	@FindBy(xpath = "//button[@type='submit']/span[.='Add to cart']")
	private WebElement Addto_Cart;
	
	public Printed_Dress(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getPrinted_Dress() {
		return printed_Dress;
	}
	public WebElement getQty() {
		return qty;
	}


	public WebElement getSize() {
		return size;
	}


	public WebElement getColor() {
		return color;
	}


	public WebElement getAddto_Cart() {
		return Addto_Cart;
	}

	
	
}
