package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locator.SearchHotelLocators;

public class SearchHotelPageExe extends LoginPageExe {
	
	public static void location() {
		BaseClass.selectindex(BaseClass.findElementById(SearchHotelLocators.location), 2);
	}
	
	public static void hotels() {
		BaseClass.selectindex(BaseClass.findElementById(SearchHotelLocators.hotels), 2);
		
	}
	
	public static void roomtype() {
		BaseClass.selectindex(BaseClass.findElementById(SearchHotelLocators.roomtype), 2);
		
	}
	
	public static void roomcount() {
		BaseClass.selectindex(BaseClass.findElementById(SearchHotelLocators.roomcount), 2);
		
	}
	
	public static void checkindate() {
		BaseClass.clear(BaseClass.findElementById(SearchHotelLocators.checkindate));
		BaseClass.typedata(BaseClass.findElementById(SearchHotelLocators.checkindate), "24/12/2022");
	}
	
	public static void checkoutdate() {
		BaseClass.clear(BaseClass.findElementById(SearchHotelLocators.checkoutdate));
		BaseClass.typedata(BaseClass.findElementById(SearchHotelLocators.checkoutdate), "27/12/2022");
	}
	
	public static void adultcountperroom() {
		BaseClass.selectindex(BaseClass.findElementById(SearchHotelLocators.adultcountperroom), 2);
		
	}
	
	public static void childrencountperroom() {
		BaseClass.selectindex(BaseClass.findElementById(SearchHotelLocators.childrencountperroom), 0);
		
	}
	
	public static void searchbutton() {
		BaseClass.click(BaseClass.findElementById(SearchHotelLocators.searchbutton));
	}

}
