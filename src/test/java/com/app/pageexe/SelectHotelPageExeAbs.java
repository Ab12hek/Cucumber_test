package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locator.SelectHotelLocatorsAbs;

public class SelectHotelPageExeAbs extends SelectHotelLocatorsAbs {
	
	public static void select() {
		BaseClass.click(BaseClass.findElementBy(SelectHotelLocatorsAbs.select));
	}
	
	public static void continuebutton() {
		BaseClass.click(BaseClass.findElementBy(SelectHotelLocatorsAbs.continuebutton));
	}

}
