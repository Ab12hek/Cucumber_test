package com.app.locator;

import org.openqa.selenium.By;

import com.app.pageexe.LoginPageExeAbs;

public class SearchHotelLocatorsAbs extends LoginPageExeAbs {
	
	public static By location =By.id("location");
	public static By hotels = By.id("hotels");
	public static By roomtype = By.id("room_type");
	public static By roomcount = By.id("room_nos");
	public static By checkindate = By.id("datepick_in");
	public static By checkoutdate = By.id("datepick_out");
	public static By adultcountperroom = By.id("adult_room");
	public static By childrencountperroom = By.id("child_room");
	public static By searchbutton = By.id("Submit");

}
