package com.app.pageexe;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.app.base.BaseClass;
import com.app.locator.PracticeFormLocators;

public class PracticeFormExe extends PracticeFormLocators {

	public static void firstname(String first) {
		BaseClass.typedata(BaseClass.findElementById(PracticeFormLocators.firstname), first);
	}
	
	public static void lastname(String last) {
		BaseClass.typedata(BaseClass.findElementById(PracticeFormLocators.lastname), last);		
	}
	
	public static void email(String email) {
		BaseClass.typedata(BaseClass.findElementById(PracticeFormLocators.email), email);
	}
	
	public static void genderM() {
		BaseClass.click(BaseClass.findElementBy(By.xpath(PracticeFormLocators.genderM)));
	}
	
	public static void genderF() {
		BaseClass.click(BaseClass.findElementBy(By.xpath(PracticeFormLocators.genderF)));
	}
	
	public static void genderO() {
		BaseClass.click(BaseClass.findElementBy(By.xpath(PracticeFormLocators.genderO)));
	}
	
	public static void mobilenumber(String mobno) {
		BaseClass.typedata(BaseClass.findElementById(PracticeFormLocators.mobno), mobno);
	}
	
	public static void DoB(String birthdate) {
		//BaseClass.click(BaseClass.findElementById(PracticeFormLocators.dob));
		BaseClass.clear(BaseClass.findElementById(PracticeFormLocators.dob));
		//BaseClass.typedata(BaseClass.findElementById(PracticeFormLocators.dob), birthdate);
	}
	
	public static void Subject(String subj) {
		//BaseClass.wait(20, subj);
		BaseClass.typedata(BaseClass.findElementBy(By.xpath(PracticeFormLocators.sub)), subj);
		BaseClass.findElementBy(By.xpath(PracticeFormLocators.sub)).sendKeys(Keys.ENTER);
	}
	
	public static void Sports() {
		BaseClass.click(BaseClass.findElementBy(By.xpath(PracticeFormLocators.HobbyS)));
	}
	public static void Reading() {
		BaseClass.click(BaseClass.findElementBy(By.xpath(PracticeFormLocators.HobbyR)));
	}
	public static void Music() {
		BaseClass.click(BaseClass.findElementBy(By.xpath(PracticeFormLocators.HobbyM)));
	}
	public static void CurrentAddress(String ca) {
		BaseClass.typedata(BaseClass.findElementById(PracticeFormLocators.currentaddress), ca);
	}
	public static void SelectState(String state) {
		BaseClass.selectbyvisibletext(BaseClass.findElementBy(By.xpath(PracticeFormLocators.selectstate)), state);
	}
	public static void SelectCity(String city) {
		BaseClass.selectbyvisibletext(BaseClass.findElementBy(By.xpath(PracticeFormLocators.selectcity)), city);
	}
	public static void SubmitButton() {
		BaseClass.click(BaseClass.findElementBy(By.xpath(PracticeFormLocators.submitbutton)));
	}
	
}
