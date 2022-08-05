package com.Cucumber_Project;

import org.openqa.selenium.WebDriver;

import com.pom.Address;
import com.pom.Proceed_Checkout1;
import com.pom.Checklist;
import com.pom.Close;
import com.pom.Home_Page;
import com.pom.Login_Page;
import com.pom.My_Account;
import com.pom.Payment;
import com.pom.Printed_Dress;
import com.pom.Quick_View;
import com.pom.Shipping;
import com.pom.Summary;

public class Page_Object_Manager {

public WebDriver driver;
private Home_Page home;
private Login_Page login;
private Address address;
private Proceed_Checkout1 cart;
private My_Account account;
private Printed_Dress dress;
private Quick_View quick;
private Summary summ;
private Shipping ship;
private Payment pay;
private Close close;
private Checklist check;

public Checklist getCheck() {
	if (check==null) {
		check = new Checklist(driver);
	}
	return check;
}






public Close getClose() {
	if (close == null) {
		close = new Close(driver);
	}
	return close;
}



public Page_Object_Manager(WebDriver driver) {
this.driver=driver;

}

public Home_Page getHome() {
	if (home==null) {
		home = new Home_Page(driver);
	}
	return home;
}
public Login_Page getLogin() {
	if(login == null) {
	login = new Login_Page(driver);
	}
	return login;
}
public Address getAddress() {
	if (address == null) {
		address= new Address(driver);
	}
	return address;
}
public Proceed_Checkout1 getCart() {
	if(cart==null) {
		cart = new Proceed_Checkout1(driver);
	}
	return cart;
}
public My_Account getAccount() {
	if (account == null) {
		account = new My_Account(driver);
	}
	return account;
}
public Printed_Dress getDress() {
	if (dress == null) {
		dress = new Printed_Dress(driver);
	}
	return dress;
}
public Quick_View getQuick() {
	if (quick==null) {
		quick = new Quick_View(driver);
	}
	return quick;
}
public Summary getSumm() {
	if (summ == null) {
		summ = new Summary(driver);
	}
	return summ;
}

public Shipping getShip() {
	if (ship==null) {
		ship = new Shipping(driver);
	}
	return ship;
}

public Payment getPay() {
	if (pay== null) {
		pay = new Payment();
	}
	return pay;
}



	


}
