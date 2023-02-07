package com.app.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.pageexe.LoginPageExePageFactory;

public class SearchHotelPageLocatorPageFactory extends LoginPageExePageFactory {
	
	public SearchHotelPageLocatorPageFactory() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id ="location")
	private WebElement location;
	
	public WebElement getLocation() {
		return location;
	}
	
	@FindBy (id ="hotels")
	private WebElement hotels;
	
	public WebElement getHotelName() {
		return hotels;
	}
	
	@FindBy (id ="room_type")
	private WebElement roomtype;
	
	public WebElement getRoomType() {
		return roomtype;
	}
	
	@FindBy (id ="room_nos")
	private WebElement roomcount;
	
	public WebElement getRoomCount() {
		return roomcount;
	}
	
	@FindBy (id ="datepick_in")
	private WebElement checkindate;
	
	public WebElement getCheckInDate() {
		return checkindate;
	}
	
	@FindBy (id ="datepick_out")
	private WebElement checkoutdate;
	
	public WebElement getCheckoutDate() {
		return checkoutdate;
	}
	
	@FindBy (id ="adult_room")
	private WebElement adultcountperroom;
	
	public WebElement getAdultCount() {
		return adultcountperroom;
	}
	
	@FindBy (id ="child_room")
	private WebElement childrencountperroom;
	
	public WebElement getChildCount() {
		return childrencountperroom;
	}
	
	@FindBy (id ="Submit")
	private WebElement searchbutton;
	
	public WebElement getSearch() {
		return searchbutton;
	}

}
