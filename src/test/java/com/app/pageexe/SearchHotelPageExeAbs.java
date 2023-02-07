package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locator.SearchHotelLocatorsAbs;

public class SearchHotelPageExeAbs extends SearchHotelLocatorsAbs {
	
	public static void location() {
		BaseClass.selectindex(BaseClass.findElementBy(SearchHotelLocatorsAbs.location), 2);
	}
	
	public static void hotels() {
		BaseClass.selectindex(BaseClass.findElementBy(SearchHotelLocatorsAbs.hotels), 2);
		
	}
	
	public static void roomtype() {
		BaseClass.selectindex(BaseClass.findElementBy(SearchHotelLocatorsAbs.roomtype), 2);
		
	}
	
	public static void roomcount() {
		BaseClass.selectindex(BaseClass.findElementBy(SearchHotelLocatorsAbs.roomcount), 2);
		
	}
	
	public static void checkindate() {
		BaseClass.clear(BaseClass.findElementBy(SearchHotelLocatorsAbs.checkindate));
		BaseClass.typedata(BaseClass.findElementBy(SearchHotelLocatorsAbs.checkindate), "24/12/2022");
	}
	
	public static void checkoutdate() {
		BaseClass.clear(BaseClass.findElementBy(SearchHotelLocatorsAbs.checkoutdate));
		BaseClass.typedata(BaseClass.findElementBy(SearchHotelLocatorsAbs.checkoutdate), "27/12/2022");
	}
	
	public static void adultcountperroom() {
		BaseClass.selectindex(BaseClass.findElementBy(SearchHotelLocatorsAbs.adultcountperroom), 2);
		
	}
	
	public static void childrencountperroom() {
		BaseClass.selectindex(BaseClass.findElementBy(SearchHotelLocatorsAbs.childrencountperroom), 0);
		
	}
	
	public static void searchbutton() {
		BaseClass.click(BaseClass.findElementBy(SearchHotelLocatorsAbs.searchbutton));
	}


}
