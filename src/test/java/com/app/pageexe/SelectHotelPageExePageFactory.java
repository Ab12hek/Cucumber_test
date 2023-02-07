package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locator.SelectHotelPageLocatorPageFactory;

public class SelectHotelPageExePageFactory extends SelectHotelPageLocatorPageFactory {
	
	public static void selectbutton() {
		BaseClass.click(new SelectHotelPageLocatorPageFactory().getSelect());
	}
	
	public static void continueButton() {
		//BaseClass.TakeScreenshots();
		BaseClass.click(new SelectHotelPageLocatorPageFactory().getContinue());
	}

}
