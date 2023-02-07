package com.app.stepdefinition;

import org.junit.Assert;

import com.app.base.BaseClass;
import com.app.locator.LoginPageLocators;
import com.app.pageexe.LoginPageExe;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends LoginPageExe {
	
	@Given("Load the given URL {string}")
	public void load_the_given_url(String url) {
		
		BaseClass.browserLaunch();
		BaseClass.getUrl(url);
	   
	}

	@When("Enter the valid username {string}")
	public void enter_the_valid_username(String user) {
		username(user);
	    
	}

	@When("Enter the valid password {string}")
	public void enter_the_valid_password(String pass) {
		password(pass);
	    
	}

	@When("Click the login button")
	public void click_the_login_button() {
		
		loginButton();
	    
	}

	@Then("Validate the select hotel page")
	public void validate_the_select_hotel_page() {
		
		Assert.assertTrue(true);
	    
	}

}
