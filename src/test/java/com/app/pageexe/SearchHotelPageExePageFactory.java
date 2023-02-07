package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locator.SearchHotelPageLocatorPageFactory;

public class SearchHotelPageExePageFactory extends SearchHotelPageLocatorPageFactory {
	
	public static void location() {
		BaseClass.selectbyvalue(new SearchHotelPageLocatorPageFactory().getLocation(), BaseClass.excelreadreusable(3, 2));
	}
	
	public static void hotels() {
		BaseClass.selectbyvalue(new SearchHotelPageLocatorPageFactory().getHotelName(), BaseClass.excelreadreusable(4, 2));
		
	}
	
	public static void roomtype() {
		BaseClass.selectbyvalue(new SearchHotelPageLocatorPageFactory().getRoomType(), BaseClass.excelreadreusable(5, 2));
		
	}
	
	public static void roomcount() {
		BaseClass.selectbyvalue(new SearchHotelPageLocatorPageFactory().getRoomCount(), BaseClass.excelreadreusable(6, 2));
		
	}
	
	public static void checkindate() {
		BaseClass.clear(new SearchHotelPageLocatorPageFactory().getCheckInDate());
		BaseClass.typedata(new SearchHotelPageLocatorPageFactory().getCheckInDate(), BaseClass.excelreadreusable(7, 2));
	}
	
	public static void checkoutdate() {
		BaseClass.clear(new SearchHotelPageLocatorPageFactory().getCheckoutDate());
		BaseClass.typedata(new SearchHotelPageLocatorPageFactory().getCheckoutDate(), BaseClass.excelreadreusable(8, 2));
	}
	
	public static void adultcountperroom() {
		BaseClass.selectbyvalue(new SearchHotelPageLocatorPageFactory().getAdultCount(), BaseClass.excelreadreusable(9, 2));
		
	}
	
	public static void childrencountperroom() {
		BaseClass.selectbyvalue(new SearchHotelPageLocatorPageFactory().getChildCount(), BaseClass.excelreadreusable(10,2));
		
	}
	
	public static void searchbutton() {
		//BaseClass.TakeScreenshots();
		BaseClass.click(new SearchHotelPageLocatorPageFactory().getSearch());
	}

}
