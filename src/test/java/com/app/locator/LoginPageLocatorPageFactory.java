package com.app.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.base.BaseClass;

public class LoginPageLocatorPageFactory extends BaseClass {
	
	// to initialize the webelement 
	public LoginPageLocatorPageFactory() {
		PageFactory.initElements(driver, this);
	}
	
	//@findBy 
	
	@FindBy (id = "username")
	private WebElement username;
	
	@FindBy (id ="password")
	private WebElement password;
	
	@FindBy (id ="login")
	private WebElement login;
	
	public WebElement getUsername() {
		return username;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLogin() {
		return login;
	}

}
