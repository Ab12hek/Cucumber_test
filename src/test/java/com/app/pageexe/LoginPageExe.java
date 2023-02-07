package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locator.LoginPageLocators;
import com.app.locator.SearchHotelLocators;

public class LoginPageExe extends SearchHotelLocators{
	
	public static void username(String user) {
		BaseClass.typedata(BaseClass.findElementById(LoginPageLocators.username), user);
	}
	
	public static void password(String pass) {
		BaseClass.typedata(BaseClass.findElementById(LoginPageLocators.password), pass);		
	}
	
	public static void loginButton() {
		BaseClass.click(BaseClass.findElementById(LoginPageLocators.login));
	}

}
