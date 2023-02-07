package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locator.LoginPageLocatorPageFactory;

public class LoginPageExePageFactory extends LoginPageLocatorPageFactory {

	public static void username () {
		BaseClass.typedata( new LoginPageLocatorPageFactory().getUsername(),BaseClass.excelreadreusable(0, 2));
	}
	
	public static void password () {
		BaseClass.typedata( new LoginPageLocatorPageFactory().getPassword(),BaseClass.excelreadreusable(1, 2));
	}
	
	public static void loginButton () {
		//BaseClass.TakeScreenshots();
		BaseClass.click(new LoginPageLocatorPageFactory().getLogin());

	}
}
