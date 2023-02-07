package com.app.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.pageexe.SearchHotelPageExePageFactory;

public class SelectHotelPageLocatorPageFactory extends SearchHotelPageExePageFactory {
	
	public SelectHotelPageLocatorPageFactory() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id ="radiobutton_0")
	private WebElement selecthotel;
	
	public WebElement getSelect() {
		return selecthotel;
	}
	
	@FindBy (id ="continue")
	private WebElement continuebutton;
	
	public WebElement getContinue() {
		return continuebutton;
	}

}
