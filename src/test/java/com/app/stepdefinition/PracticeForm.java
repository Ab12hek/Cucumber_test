package com.app.stepdefinition;

import java.util.List;

import org.junit.Assert;

import com.app.pageexe.PracticeFormExe;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PracticeForm extends PracticeFormExe  {
	
	@Given("Load the URL {string}")
	public void load_the_url(String url) {
		browserLaunch();
		getUrl(url);
	}
	@When("Enter first name {string}")
	public void enter_first_name(String first) {
	    firstname(first);
	}
	@When("Enter last name {string}")
	public void enter_last_name(String last) {
		lastname(last);
	}
	@When("Enter email address {string}")
	public void enter_email_address(String email) {
	    email(email);
	    Assert.assertTrue(email.contains("@"));
	}
	@When("Select gender")
	public void select_gender() {
	    genderM();
	    genderF();
	    genderO();
	}	
	@When("Enter mobile number {string}")
	public void enter_mobile_number(String mob) {
		mobilenumber(mob);
	}
	
//	@When("Enter DOB {string}")
//	public void enter_dob(String dob) {
//	    DoB(dob);
//	}
	
	@When("Enter Subjects")
	public void enter_subjects(DataTable dataTable) {
		List<String> asList = dataTable.asList();
		Subject(asList.get(0));
	}
	@When("Select Hobbies")
	public void select_hobbies() {
	    Sports();
	    Reading();
	    Music();
	}
	@When("Enter current address {string}")
	public void enter_current_address(String ca) {
	    CurrentAddress(ca);
	}
	@When("Select State {string}")
	public void select_state(String state) {
	    SelectState(state);
	}
	@When("Select City {string}")
	public void select_city(String city) {
	    SelectCity(city);
	}
	@When("Click submit")
	public void click_submit() {
		SubmitButton();
	}
	@Then("Validate the outcomes")
	public void validate_the_outcomes() {
	    Assert.assertTrue(true);
	}


}
