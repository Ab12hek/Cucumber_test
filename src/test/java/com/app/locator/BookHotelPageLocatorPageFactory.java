package com.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.pageexe.SelectHotelPageExePageFactory;

public class BookHotelPageLocatorPageFactory extends SelectHotelPageExePageFactory {
	
	public BookHotelPageLocatorPageFactory() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id ="first_name")
	private WebElement firstname;
	
	public WebElement getFirstName() {
		return firstname;
	}
	
	@FindBy (id ="last_name")
	private WebElement lastname;
	
	public WebElement getLastName() {
		return lastname;
	}
	
	@FindBy (id ="address")
	private WebElement address;
	
	public WebElement getAddress() {
		return address;
	}
	
	@FindBy (id ="cc_num")
	private WebElement ccnumber;
	
	public WebElement getCcNumber() {
		return ccnumber;
	}
	
	@FindBy (id ="cc_type")
	private WebElement cctype;
	
	public WebElement getCcType() {
		return cctype;
	}
	
	@FindBy (id ="cc_exp_month")
	private WebElement expirymonth;
	
	public WebElement getCcExpiryMonth() {
		return expirymonth;
	}
	
	@FindBy (id ="cc_exp_year")
	private WebElement expiryyear;
	
	public WebElement getCcExpiryYear() {
		return expiryyear;
	}
	
	@FindBy (id ="cc_cvv")
	private WebElement cvv;
	
	public WebElement getCcCvv() {
		return cvv;
	}
	
	@FindBy (id ="book_now")
	private WebElement booknow;
	
	public WebElement getBookNow() {
		return booknow;
	}
	
	@FindBy (id ="order_no")
	private WebElement orderno;
	
	public WebElement getOrderNumber() {
		return orderno;
	}
	
}
