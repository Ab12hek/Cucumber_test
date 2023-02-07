package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locator.SelectHotelLocators;

public class SelectHotelPageExe extends SelectHotelLocators {
	
	public static void select() {
		BaseClass.click(BaseClass.findElementById(SelectHotelLocators.select));
	}
	
	public static void continuebutton() {
		BaseClass.click(BaseClass.findElementById(SelectHotelLocators.continuebutton));
	}

}
