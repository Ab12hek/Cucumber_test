package com.app.locator;

import org.openqa.selenium.By;

import com.app.pageexe.SelectHotelPageExeAbs;

public class BookHotelLocatorsAbs extends SelectHotelPageExeAbs {
	
	public static By firstname = By.id("first_name");
	public static By lastname = By.id("last_name");
	public static By address = By.id("address");
	public static By ccnumber = By.id("cc_num");
	public static By cctype = By.id("cc_type");
	public static By expirymonth = By.id("cc_exp_month");
	public static By expiryyear = By.id("cc_exp_year");
	public static By cvv = By.id("cc_cvv");
	public static By booknow = By.id("book_now");
	public static By orderno = By.id("order_no");

}
