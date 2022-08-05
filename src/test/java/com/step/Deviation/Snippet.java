package com.step.Deviation;

import org.openqa.selenium.WebDriver;

import com.Cucumber_Project.Page_Object_Manager;
import com.Cucumber_Project.Utility_Files;
import com.runner.Shopping_Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Snippet extends Utility_Files {

	public static WebDriver driver=Shopping_Runner.driver;
	public static Page_Object_Manager manager = new Page_Object_Manager(driver);
	
	
	
	@Given("user Launch the Shopping Site")
	public void user_launch_the_shopping_site() {
		get("http://automationpractice.com/index.php");
	  }
	
	@When("user click The Sign in")
	public void user_click_the_sign_in() throws Throwable {
		Thread.sleep(3000);
		click_On_Element(manager.getHome().getSignin());
	  }
	@When("user Enter The Username")
	public void user_enter_the_username() {
		send_Keys(manager.getLogin().getEmail(), "shoppingonline@gmail.com");
	}
	@When("user Enter The Password")
	public void user_enter_the_password() {
	send_Keys(manager.getLogin().getPassword(), "Ethan_Hunt932460@#&(&^$%");
	}
	@When("user Click The Signin")
	public void user_click_the_signin() {
		click_On_Element(manager.getLogin().getSignin());
	}
	
	@When("click_And_Hold Dresses")
	public void click_and_hold_dresses() {
		click_Hold(manager.getAccount().getDresses());
	}
		@When("click Evening Dresses")
	public void click_evening_dresses() {
			click_On_Element(manager.getAccount().getEvening_Dresses());
	}
		
	@When("click Quickview")
	public void click_quickview() throws InterruptedException {
		Thread.sleep(3000);

		click_On_Element(manager.getQuick().getQuickview());
		
		}
	
	
	@When("quantity_click")
	public void quantity_click() throws InterruptedException {
		driver.switchTo().frame(0);
		click_On_Element(manager.getDress().getQty());
		Thread.sleep(3000);
		
		
		}
	@When("size {string} {string}")
	public void size(String string, String string2) {
		
		dropdown(manager.getDress().getSize(), string, string2);
		
			}
	
	@When("click_Color")
	public void click_color() {
		click_On_Element(manager.getDress().getColor());
	}
	
	@When("add_To_Cart")
	public void add_to_cart() throws InterruptedException {
		Thread.sleep(3000);
click_On_Element(manager.getDress().getAddto_Cart());
		
		
		
	}
	@When("click_Proceed_Checkout")
	public void click_proceed_checkout() throws InterruptedException {
		
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		click_On_Element(manager.getCart().getCheckout());
		
	}
	@When("summary")
	public void summary() {
		click_On_Element(manager.getSumm().getCheckout());
	}
	@When("address")
	public void address() {
		click_On_Element(manager.getAddress().getaddress1());
	}
	@When("shipping")
	public void shipping() {
		click_On_Element(manager.getShip().getShip());
	}
	
	@When("closed")
	public void closed() {
		click_On_Element(manager.getClose().getClose());
	}

	@When("terms_Service")
	public void terms_service() throws InterruptedException {
		Thread.sleep(5000);
		click_On_Element(manager.getCheck().getCheck());
	}
	
	
	@When("shipping_next")
	public void shipping_next() {
click_On_Element(manager.getShip().getShip());
	}

	@When("payment")
	public void payment() {
		click_On_Element(manager.getPay().getPayment());
	}
	@When("pay_By_Bank")
	public void pay_by_bank() {
		
		click_On_Element(manager.getPay().getPayment());
	}
	@Then("confirm_Order")
	public void confirm_order() {
		
	}



	
}
