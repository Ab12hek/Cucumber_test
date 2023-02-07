package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locator.LoginPageLocatorAbs;

public class LoginPageExeAbs extends LoginPageLocatorAbs {

	public static void username() {
		BaseClass.typedata(BaseClass.findElementBy(LoginPageLocatorAbs.username),
				"daisyrubycatharine");
	}

	public static void password() {
		BaseClass.typedata(BaseClass.findElementBy(LoginPageLocatorAbs.password),
				"RP65IQ");
	}

	public static void loginButton() {
		BaseClass.click(BaseClass.findElementBy(LoginPageLocatorAbs.login));

	}
}
